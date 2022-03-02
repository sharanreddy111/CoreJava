/**
 * @author JALA Academy
 * @author K.Sharan Simha Reddy
 *
 * 15.Write a program to generate NullPointerException
 */
package com.jala.exceptions;

public class NullPointer {
    //we are trying to perform the length() operation on str which is null
    static void simpleNullCheck(String str) {
        System.out.println(str.length());
    }

    public static void main(String args[]) {

        String input = null;
        try {
            simpleNullCheck(input);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught!");
            e.printStackTrace();
        }
    }
}
