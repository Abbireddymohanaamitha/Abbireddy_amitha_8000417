package com.practice.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 23. File Reading
 * Reads the contents of a file and prints them to the console.
 */
public class FileReaderDemo {
    public static void main(String[] args) {
        String fileName = "output.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
