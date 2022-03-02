/**
 * @author JALA Academy
 * @author K.Sharan Simha Reddy
 *
 * 9. Write a program to generate ArrayIndexOutOfBoundException
 */
package com.jala.exceptions;

public class ArrayIndexOutOfBound {
    public static void main(String[] args) {

        //Declaring 4 elements in the String array
        String[] arr = {"Sharan", "Rahul", "Leo", "Arun"};
        //ArrayIndexOutOfBoundException because there is no 5th index
        try {
            System.out.println(arr[5]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.err.println("ArrayIndexOutOfBoundsException caught");
            e.printStackTrace();
        }
    }
}
