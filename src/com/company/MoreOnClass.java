package com.company;

// Inheritance
public class MoreOnClass extends MyClass {
    // Lets assume that MoreOnClass is a person
    // He would have some properties and abilities



    // Encapsulation
    private String name, hobby;
    private int age;
    private double weight, height;
    private boolean isMatured;


    public MoreOnClass(String name, String hobby, int age, double weight,
                       double height, boolean isMatured) {
        this.name = name;
        this.hobby = hobby;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.isMatured = isMatured;
    }

    public MoreOnClass(String name, String hobby, int age) {
        this.name = name;
        this.hobby = hobby;
        this.age = age;
    }

    public MoreOnClass() {}


    public String getName() {
        return name;
    }

    @Override
    public void sayHello() {
        if (!this.name.isEmpty()) {
            System.out.println("Hello world " + this.name);
        } else {
            System.out.println("Try to set name and call this function again");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean getMatured() {
        return this.isMatured;
    }

    public void setMatured(boolean matured) {
        isMatured = matured;
    }

}
