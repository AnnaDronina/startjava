package com.startjava.lesson2_3_4.animal;

public class Wolf {

    private String nickname;
    private int age;
    private String gender;
    private float weight;
    private String color;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) { 
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void go() {
        System.out.println("Идти");
    }

    public void sit() {
        System.out.println("Сидеть");
    }

    public void run() {
        System.out.println("Бежать");
    }

    public void howl() {
        System.out.println("Выть");
    }

    public void hunt() {
        System.out.println("Охотиться");
    }

}