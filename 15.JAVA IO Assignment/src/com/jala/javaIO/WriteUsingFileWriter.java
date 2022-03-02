/**
 * @author JALA Academy
 * @author K.Sharan Simha Reddy
 *
 * 6.Write a program to write text to .txt file using FileWriter
 */
package com.jala.javaIO;

import java.io.FileWriter;

// FileWriter class is used to write character-oriented data to a file.
public class WriteUsingFileWriter {
    public static void main(String[] args) {

        String s = "This text is written using FileWriter.";

        try {
            // Creates a FileWriter
            FileWriter fw = new FileWriter("fw.txt");

            //provides method to write string directly.
            fw.write(s);
            //closing FileWriter
            fw.close();
            System.out.println("Data is written to the file.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
