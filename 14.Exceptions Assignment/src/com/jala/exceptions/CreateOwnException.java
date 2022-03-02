/**
 * @author JALA Academy
 * @author K.Sharan Simha Reddy
 *
 * 6. Write a program to create your own exception
 */
package com.jala.exceptions;

//custom exception class always extends directly from the Exception class
class InvalidExamException extends Exception {
    InvalidExamException(String msg) {
        System.out.println(msg);
    }
}

public class CreateOwnException {

    static void exam(int marks) throws InvalidExamException {
        // throws exception if marks are less than 40
        if (marks < 40) {
            throw new InvalidExamException("Failed in exam");
        } else {
            System.out.println("Passed in exam");
        }
    }

    public static void main(String[] args) {
        try {
            exam(39);
        } catch (Exception i) {
            i.printStackTrace();
        }
    }
}
