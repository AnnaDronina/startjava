\C 'Вывод содержимого таблицы Jaegers'
SELECT *
  FROM jaegers;

\C 'Вывод не уничтоженных роботов'
SELECT *
  FROM jaegers
 WHERE status = 'Active';

\C 'Вывод роботов нескольких серий: Mark-1 и Mark-4'
SELECT *
  FROM jaegers
 WHERE mark IN ('Mark-1', 'Mark-4');

\C 'Вывод всех роботов, кроме Mark-1 и Mark-4'
SELECT *
  FROM jaegers
 WHERE mark NOT IN ('Mark-1', 'Mark-4');

\C 'Сортировка таблицы по убыванию по столбцу mark'
  SELECT *
    FROM jaegers
ORDER BY mark DESC;

\C 'Вывод информации о самом старом роботе'
SELECT *
  FROM jaegers
 WHERE launch =
       (SELECT MIN(launch)
          FROM jaegers);

\C 'Вывод роботов, которые уничтожили больше всех kaiju'
SELECT *
  FROM jaegers
 WHERE kaijukill =
       (SELECT MAX(kaijukill)
       FROM jaegers);

\C 'Вывод среднего веса роботов'
SELECT AVG(weight)
  FROM jaegers;

\C 'Увеличение на единицу количество уничтоженных kaiju у роботов, которые до сих пор не разрушены'
UPDATE jaegers
   SET kaijukill = kaijukill + 1
 WHERE status = 'Active';

\C 'Удаление уничтоженных роботов'
DELETE
  FROM jaegers
 WHERE status = 'Destroyed';