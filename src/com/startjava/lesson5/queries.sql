-- Вывод содержимого таблицы Jaegers
SELECT *
  FROM jaegers;

-- Вывод не уничтоженных роботов
SELECT *
  FROM jaegers
 WHERE status = 'Active';

-- Вывод роботов нескольких серий: Mark-1 и Mark-4
SELECT *
  FROM jaegers
 WHERE mark IN ('Mark-1', 'Mark-4');

-- Вывод всех роботов, кроме Mark-1 и Mark-4
SELECT *
  FROM jaegers
 WHERE mark NOT IN ('Mark-1', 'Mark-4');

-- Сортировка таблицы по убыванию по столбцу mark
  SELECT *
    FROM jaegers
ORDER BY mark DESC;

-- Вывод информации о самом старом роботе
SELECT *
  FROM jaegers
 WHERE launch =
       (SELECT MIN(launch)
          FROM jaegers);

-- Вывод роботов, которые уничтожили больше всех kaiju
SELECT *
  FROM jaegers
 WHERE kaijukill =
       (SELECT MAX(kaijukill)
       FROM jaegers);


-- Вывод среднего веса роботов
SELECT AVG(weight)
  FROM jaegers;


-- Увеличение на единицу количество уничтоженных kaiju у роботов, которые до сих пор не разрушены
UPDATE jaegers
   SET kaijukill = kaijukill + 1
 WHERE status = 'Active';

-- Удаление уничтоженных роботов
DELETE
  FROM jaegers
 WHERE status = 'Destroyed';