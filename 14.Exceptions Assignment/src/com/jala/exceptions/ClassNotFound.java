/**
 * @author JALA Academy
 * @author K.Sharan Simha Reddy
 *
 * 10.Write a program to generate ClassNotFoundException
 */
package com.jala.exceptions;

/* Java ClassNotFoundException occurs when the application tries to load
   a class but Classloader is not able to find it in the classpath.*/
public class ClassNotFound {

    public static void main(String[] args) {

        try {
            Class.forName("com.exceptions.jala");
            ClassLoader.getSystemClassLoader().loadClass("com.exceptions.jala");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
