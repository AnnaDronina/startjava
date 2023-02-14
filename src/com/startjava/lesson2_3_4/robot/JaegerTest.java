package com.startjava.lesson2_3_4.robot;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger gipsyDanger = new Jaeger();
        gipsyDanger.setModelName("Gipsy Danger");
        gipsyDanger.setMark("Mark-3");
        gipsyDanger.setOrigin("United States of America");
        gipsyDanger.setStrength(8);
        gipsyDanger.setArmor(6);

        Jaeger strikerEureka = new Jaeger("Striker Eureka", "Mark-5", "Australia", 10, 9);

        System.out.println("Егерь 1:");
        gipsyDanger.introduce();

        System.out.println("Егерь 2:");
        strikerEureka.introduce();

        gipsyDanger.drift();
        strikerEureka.drift();
        gipsyDanger.move();
        strikerEureka.move();
        strikerEureka.applyWeapon();
        gipsyDanger.damageArmor();

        System.out.println(gipsyDanger.getModelName() + " устойчивость брони " + 
                gipsyDanger.getArmor());
    }
}