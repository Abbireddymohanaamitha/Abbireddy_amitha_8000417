package com.practice.files;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 22. File Writing
 * Writes sample text to a local file using try-with-resources.
 */
public class FileWriterDemo {
    public static void main(String[] args) {
        String fileName = "output.txt";
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName, false))) {
            writer.println("Java Master Practice Project output file.");
            writer.println("This file is created by FileWriterDemo.");
            System.out.println("File written successfully to " + fileName);
        } catch (IOException e) {
            System.err.println("Error writing file: " + e.getMessage());
        }
    }
}
