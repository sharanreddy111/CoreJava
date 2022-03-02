/**
 * @author JALA Academy
 * @author K.Sharan Simha Reddy
 *
 * 1.Write a program to read text from .txt file using InputStream
 */
package com.jala.javaIO;

import java.io.FileInputStream;
import java.io.InputStream;

//FileInputStream class obtains input bytes from a file. It is used for reading byte-oriented data
public class ReadUsingInputStream {

    public static void main(String[] args) {

        try {
            // Creates a FileInputStream
            InputStream fis = new FileInputStream("os.txt");
            int i;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
            // Closes the input stream
            fis.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
