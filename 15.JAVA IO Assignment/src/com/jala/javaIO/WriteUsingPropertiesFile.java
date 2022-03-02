/**
 * @author JALA Academy
 * @author K.Sharan Simha Reddy
 *
 * 10.Write a program to write data to properties file
 */
package com.jala.javaIO;

import java.io.FileOutputStream;
import java.util.Properties;

public class WriteUsingPropertiesFile {
    public static void main(String args[]) {

        try {
            //Instantiating the properties file
            Properties props = new Properties();
            //Populating the properties file
            props.put("Name", "Sharan");
            props.put("E.no", "317");
            props.put("College", "ICFAI Tech");

            //Instantiating the FileInputStream for output file
            FileOutputStream outputStrem = new FileOutputStream("pf.txt");
            //Storing the properties file
            props.store(outputStrem, "This is a sample properties file");
            System.out.println("Properties file created");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}