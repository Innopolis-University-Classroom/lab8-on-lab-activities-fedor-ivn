package com.muwaffaq.innopolis.solid.homework;

import java.util.List;

// lab work
// This Class violates all SOLID Principles, fix it in a Logical way
public class Human implements Marriable, Prayer, Sportsman, Employee, Businessman {
    private String name;
    private String nickname;
    private double salary;
    private List<String> hobbies;

    String sayHello(Language language) {
        return language.sayHello();
    }

    void calculateTax(int percentage) {
        salary = salary * percentage;
    }

    int addHobby(String hobby) {
        hobbies.add(hobby);
        return hobbies.size();
    }

    void creatNickName(String postFix) {
        nickname = name.concat(postFix);
    }

    @Override
    public void pray() {
    }

    @Override
    public void playSports() {
        // i am too lazy to implement it
    }

    @Override
    public void getMarried() {
        // i am too lazy to implement it
    }

    @Override
    public void ownCompany() {
        // i am too lazy to implement it
    }

    @Override
    public void becomeEmployee() {
        // i am too lazy to implement it
    }

    public static void main(String[] args) {
        Human human = new Human();
        human.sayHello(Languages.Arabic);
    }

}
