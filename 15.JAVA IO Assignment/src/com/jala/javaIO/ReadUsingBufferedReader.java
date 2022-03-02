/**
 * @author JALA Academy
 * @author K.Sharan Simha Reddy
 *
 * 7.Read text from a .txt file using BufferedReader
 */
package com.jala.javaIO;

import java.io.BufferedReader;
import java.io.FileReader;

//BufferedReader class is used to read the text from a character-based input stream.
public class ReadUsingBufferedReader {
    public static void main(String args[]) {

        try {
            // Creates a FileReader
            FileReader fr = new FileReader("bw.txt");
            // Creates a BufferedReader
            BufferedReader br = new BufferedReader(fr);

            int i;
            while ((i = br.read()) != -1) {
                System.out.print((char) i);
            }
            //closing FileWriter and BufferedWriter
            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
