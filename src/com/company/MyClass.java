package com.company;

public class MyClass {

    private String name;
    private int age;
    public static final double MYCLASSPI = 3.213;


    public MyClass(String name, int age) {
        this.name  = name;
        this.age = age;
    }

    public MyClass() {}

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public void sayHello() {
        if (!this.name.isEmpty()) {
            System.out.println("Hello world " + this.name);
        } else {
            System.out.println("Try to set name and call this function again");
        }

    }

    public int returnAnInt(int param) {
        return param + 2;
    }

    public double returnADouble(double param) {
        return param + 5.0;
    }

    public String returnString(String param) {
        return param + " My class";
    }

    public boolean returnABoolean(Boolean param) {
        if (this.name.isEmpty()) {
            System.out.print("you didn't enter a name so ");

            return false;
        } else {
            System.out.print("Name entered.. " + "Name=" + this.name + ". so ");

            return true;
        }
    }
}
