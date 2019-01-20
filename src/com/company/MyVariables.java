package com.company;
/*
 * This is demonstration of what a variable is and how to declare and instatiate a variable
 */
public class MyVariables {


    /* A varible is the name given to the memory address of a value in memory
     * create a variable, you the the datatype of the variable followed by the
     * the name of the variable, an equal to sign and then the value and a
     * semicolon
     */

    // create a variable to hold the age of a person
    int age = 23;

    //this could have been create this way
    /*int myAge;
    myAge = 12;*/  // this will give you an error because we are in a class


    /*
     * Assuming that these variables are properties of these class then we'd create the
     * differently and we'd use getters and setters for these variables (properties)
     * Setters allows you to create or initialize these properties and getters helps
     * you to return them
     */

    private int anInt;
    private String string;
    private double aDouble;

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public double getaDouble() {
        return aDouble;
    }

    public void setaDouble(double aDouble) {
        this.aDouble = aDouble;
    }

    /*
     * To make use of these properties, you have to instantiate the MyVariables class
     * There is even an easy way to initialize these properties
     * By using a constructor
     */

    public MyVariables(int anInt, String string, double aDouble ) {
        this.anInt = anInt;
        this.string = string;
        this.aDouble = aDouble;
    }

    public MyVariables() {}
}
