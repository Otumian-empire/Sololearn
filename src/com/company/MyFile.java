package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class MyFile {


    private String filename;
    private int lineCounter;


    /**
     * create or open a file using the constructor of the class
     * MyFile myFile = new MyFile(fileName);
     * If file doesn't exist, file is created,
     * else, "File: " + filename + " already exist and now opened"
     * is displayed
     * */
    public MyFile(String filename) {
        File file = new File(filename);
        this.filename = filename;
        if (file.exists()) {
            System.out.println("File: " + this.filename + " already exist and now opened");
        } else {
            System.out.println("New file: " + this.filename + " created");
        }

    }

    /**
     * returns filename*/
    public String getFilename() {
        return this.filename;
    }

    /**
     * returns the number of lines in the file*/
    public int getLineCounter() {
        return this.lineCounter;
    }


    /**
     * prints the reads the content of the file line by line*/
    public void printMyFile() {
        try {
            // reader iterates the file and reads it content
            Scanner reader = new Scanner(new File(this.filename));

            while(reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }

            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Error: " + e);
        }
    }


    /**
     * Writes into the file on the command line interface
     * Type exit on the next line to exit
     * */
    public void writeMyFile() {
        try (
                Formatter writer = new Formatter(this.filename);
                Scanner scanner = new Scanner(System.in)
        ) {
            this.lineCounter = 0;

            // checks if there is a newline using the scanner
            // The use the writer (Formatter) to write it into the file
            System.out.println("Please write into the file");
            while (scanner.hasNextLine()) {
                if (!scanner.hasNext("exit")) {
                    writer.format("%s%n", scanner.nextLine());

                    this.lineCounter += 1;
                } else {
                    // to return the file stats
                    myFileStats();

                    break;
                }
            }

        } catch (Exception e) {
            System.out.println("File Error: " + e);
        }
    }

    /**
     * prints the stats of the file open
     * FILE STATS:
     * filename, number of lines
     * */
    public void myFileStats() {
        System.out.println("Filename: " + this.getFilename());
        System.out.println("Number Of Line(s): " + this.getLineCounter());
    }
}
