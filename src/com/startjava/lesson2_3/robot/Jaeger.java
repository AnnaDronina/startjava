package com.startjava.lesson2_3.robot;

public class Jaeger {

    private String modelName;
    private String mark;
    private String origin;
    private int strength;
    private int armor;

    public Jaeger() {}

    public Jaeger(String modelName, String mark, String origin, int strength, int armor) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.strength = strength;
        this.armor = armor;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void introduce() {
        System.out.println("Модель " + modelName + ", поколение " + mark + 
                ", страна производитель " + origin + ", силовой показатель " + strength + 
                ", устойчивость брони " + armor);
    }

    public boolean drift() {
        return true;
    }

    public void move() {
        System.out.println(modelName + " Передвигается");
    }

    public void damageArmor() {
        armor--;
    }

    public void applyWeapon() {
        System.out.println(modelName + " Применил оружие");
    }
}