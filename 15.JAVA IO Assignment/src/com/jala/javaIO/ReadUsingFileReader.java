/**
 * @author JALA Academy
 * @author K.Sharan Simha Reddy
 *
 * 5.Write a program to read text from .txt file using FileReader
 */
package com.jala.javaIO;

import java.io.FileReader;

// FileReader class is used to write character-oriented data to a file.
public class ReadUsingFileReader {
    public static void main(String[] args) {

        try {
            // Creates a FileReader
            FileReader fr = new FileReader("fw.txt");

            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
            //closing FileReader
            fr.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
