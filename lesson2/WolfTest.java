public class WolfTest {

    public static void main(String[] args) {
        Wolf vasya = new Wolf();
        vasya.nickname = "Вася";
        vasya.age = 3;
        vasya.gender = "мужской";
        vasya.weight = 50.5f;
        vasya.color = "серый";

        System.out.println("Кличка волка " + vasya.nickname + ", возраст " + vasya.age 
                + " года, пол " + vasya.gender + ", вес " + vasya.weight + " кг, окрас " 
                + vasya.color);

        vasya.go();
        vasya.sit();
        vasya.run();
        vasya.howl();
        vasya.hunt();
    }
}