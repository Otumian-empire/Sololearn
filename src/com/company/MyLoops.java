package com.company;

public class MyLoops {


    /*
     * There is if and else and switch
     * There is for loop
     * There is while loop and do-while loop
     */

    // If and else
    /*
     * Use if and else if you want to execute some part of the code based on a
     * particular condition
     */

    private int x = 0;
    private String y;

    public MyLoops(int x, String y) {
        this.x = x;
        this.y = y;
    }

    public boolean ismMoreThan10() {
        if (x > 10) {
            return true;
        } else {
            return false;
        }
    }

    // to just return a boolean, the body will be, return x > 10


    public boolean isLengthy() {
        if (y.length() > x) {
            return true;
        } else {
            return false;
        }
    }
    // Also this body can written as return y.length() > x;


    //switch - use switch if the is more if and else statements

    public void whatIsX() {
        switch (x) {
            case 3:
                System.out.println("x is " + x);
                break;
            case 4:
                System.out.println("x is " + x);
                break;
            default:
                System.out.println("I couldn't guess x");
                System.out.println("x is " + x);
                break;
        }
    }

    // for loop

    public void getXOP() {
        for (this.x = 10; this.y.length() < this.x; this.x--) {
            System.out.println("When there is night there is day " +
                    "and from the night comes light");
        }
    }

    // while loop

    public void whileLoop() {
        while(true) {
            if (this.x > 50) {
                System.out.println("The while loop calculated a sum of " + this.x);
                break;
            }
            this.x += this.y.length();
        }
    }


    public void doWhileLoop() {
        do {
            if (this.y.length() > 75) {
                System.out.println("Now y is " + this.y + " of length " + this.y.length());
                break;
            }
            this.y += "hello";
        } while (true);
    }

}


