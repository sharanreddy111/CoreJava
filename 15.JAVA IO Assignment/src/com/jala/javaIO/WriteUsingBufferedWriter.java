/**
 * @author JALA Academy
 * @author K.Sharan Simha Reddy
 *
 * 8.Write text to a .txt file using BufferedWriter
 */
package com.jala.javaIO;

import java.io.BufferedWriter;
import java.io.FileWriter;

//BufferedWriter class is used to write the text from a character-based input stream.
public class WriteUsingBufferedWriter {
    public static void main(String[] args) {

        String s = "This text is written using BufferedWriter.";

        try {
            // Creates a FileWriter
            FileWriter fw = new FileWriter("bw.txt");
            // Creates a BufferedWriter
            BufferedWriter bw = new BufferedWriter(fw);

            //provides method to write string directly.
            bw.write(s);
            //closing FileWriter and BufferedWriter
            bw.close();
            fw.close();
            System.out.println("Data is written to the file.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
