/**
 * @author JALA Academy
 * @author K.Sharan Simha Reddy
 *
 * 3.Read text from a .txt file using BufferedInputStream
 */
package com.jala.javaIO;

import java.io.*;

//reading bytes is faster using BufferedInputStream
public class ReadUsingBufferedInputStream {
    public static void main(String[] args) {

        try {
            // Creates a FileInputStream
            FileInputStream fis = new FileInputStream("bos.txt");
            // Creates a BufferedInputStream
            BufferedInputStream bis = new BufferedInputStream(fis);

            int i;
            while ((i = bis.read()) != -1) {
                System.out.print((char) i);
            }
            //closing Streams
            bis.close();
            fis.close();

        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
