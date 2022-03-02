/**
 * @author JALA Academy
 * @author K.Sharan Simha Reddy
 *
 * 1. Write a program to generate Arithmetic Exception without exception handling
 * 2. Handle the Arithmetic exception using try-catch block
 */
package com.jala.exceptions;

public class ArithmeticExceptionTryCatch {

    public static void main(String[] args) {
        int a = 10, b = 0, c;
        try {
            System.out.println("Inside try block");
            //below code throws divide by zero exception
            c = a / b;
            System.out.println("c = " + c);
        }
        //2. handles the Arithmetic Exception
        catch (java.lang.ArithmeticException e) {
            System.out.println("Handling the Arithmetic exception using try-catch block");
        }

        //1. generate Arithmetic Exception without exception handling
        c = a / b;
        System.out.println("without exception handling");
    }
}
