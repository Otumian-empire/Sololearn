package com.company;

import java.util.Scanner;

public class MyExceptions {

    private String name;

    public String getName() {
        return name;
    }

    public void setName() {
        // Instead of giving it a parameter, i rather use the scanner
        try (Scanner sc = new Scanner(System.in)) {
            // There won't be any error even without the try and catch
            // If you love error, change the sc.nextLine to nextInt
            System.out.print("Please enter your name: ");
            this.name = sc.nextLine();
            System.out.println("The name is " + getName());
        } catch (Exception e) {
            System.out.println("There seems to be a problem, " + e);
        } finally {
            System.out.println("The try and catch block has ended");
        }

    }

    public MyExceptions() {}

}
