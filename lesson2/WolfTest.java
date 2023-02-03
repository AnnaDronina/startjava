public class WolfTest {

    public static void main(String[] args) {
        Wolf vasya = new Wolf();
        vasya.setNickname("Вася");
        vasya.setAge(3);
        vasya.setGender("мужской");
        vasya.setWeight(50.5f);
        vasya.setColor("серый");

        System.out.println("Кличка волка " + vasya.getNickname() + ", возраст " + vasya.getAge() 
                + " года, пол " + vasya.getGender() + ", вес " + vasya.getWeight() + " кг, окрас " 
                + vasya.getColor());

        vasya.go();
        vasya.sit();
        vasya.run();
        vasya.howl();
        vasya.hunt();
    }
}