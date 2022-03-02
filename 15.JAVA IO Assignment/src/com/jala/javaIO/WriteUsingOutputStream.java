/**
 * @author JALA Academy
 * @author K.Sharan Simha Reddy
 *
 * 2.Write a program to write text to .txt file using OutputStream
 */
package com.jala.javaIO;

import java.io.FileOutputStream;
import java.io.OutputStream;

// FileOutputStream is an output stream used for writing data to a file.
public class WriteUsingOutputStream {

    public static void main(String args[]) {

        String data = "This text is written using OutputStream.";

        try {
            // Creates a FileOutputStream
            OutputStream fos = new FileOutputStream("os.txt");

            // Converts the string into bytes
            byte[] db = data.getBytes();

            // Writes data to the output stream
            fos.write(db);
            System.out.println("Data is written to the file.");

            // Closes the output stream
            fos.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
