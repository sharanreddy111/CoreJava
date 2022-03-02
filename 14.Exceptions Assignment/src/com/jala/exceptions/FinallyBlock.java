/**
 * @author JALA Academy
 * @author K.Sharan Simha Reddy
 *
 * 7.Write a program with finally block
 */
package com.jala.exceptions;

public class FinallyBlock {

    public static void main(String args[]) {

        try {
            //below code throws divide by zero exception
            int data = 10 / 0;
            System.out.println(data);
        }
        //handles the Arithmetic Exception / Divide by zero exception
        catch (ArithmeticException e) {
            System.out.println("Exception handled");
            e.printStackTrace();
        }
        //executes regardless of exception occured or not
        finally {
            System.out.println("finally block is always executed");
        }
        System.out.println("Main method ended");
    }
}
