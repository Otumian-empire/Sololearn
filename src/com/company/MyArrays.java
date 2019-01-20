package com.company;

public class MyArrays {


    private  int[][] mInts;
    private String[][] mStrings;

    private int[] ints;
    private String[] strings;


    public MyArrays() {}

    public MyArrays(int[] ints, String[] strings) {
        this.ints = ints;
        this.strings = strings;
    }

    public MyArrays(int[][] mInts, String[][] mStrings) {
        this.mInts = mInts;
        this.mStrings = mStrings;
    }


    public int[][] getmInts() {
        return mInts;
    }

    public void setmInts(int[][] mInts) {
        this.mInts = mInts;
    }

    public String[][] getmStrings() {
        return mStrings;
    }

    public void setmStrings(String[][] mStrings) {
        this.mStrings = mStrings;
    }


    public int[] getInts() {
        return ints;
    }

    public void setInts(int[] ints) {
        this.ints = ints;
    }

    public String[] getStrings() {
        return strings;
    }

    public void setStrings(String[] strings) {
        this.strings = strings;
    }


    public void loopArray(int[] x) {
        for(int i: x) {
            System.out.println(i);
        }
    }

    public void loopArray(String[] x) {
        for(String i: x) {
            if (i != null) {
                System.out.println(i);
            }
        }
    }


    public void loopArray(int[][] x) {
        for(int[] i: x) {
            for(int p: i) {
                System.out.println(p);
            }
        }
    }

    public void loopArray(String[][] x) {
        for(String[] i: x) {
            for(String p: i) {
                System.out.println(p);
            }
        }
    }

}
