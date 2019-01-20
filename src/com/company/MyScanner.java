package com.company;


import java.util.Scanner;

public class MyScanner{

    /*
     * Taking input from the user with the Scanner class
     */
    Scanner scanner = new Scanner(System.in);

    private int anInt;
    private String string;

    public void setAnInt() {
        System.out.print("Enter int: ");
        anInt = scanner.nextInt();
    }

    public void setString() {
        System.out.print("Enter String: ");
        string = scanner.next();
    }

    public int getAnInt() {
        return anInt;
    }

    public String getString() {
        return string;
    }

    public MyScanner() {}
}
