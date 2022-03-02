/**
 * @author JALA Academy
 * @author K.Sharan Simha Reddy
 *
 * 1. Write a program to print “Bright IT Career” ten times using for loop
 */
package com.jala.loops;

public class PrintTenTimesForLoop {
    public static void main(String[] args) {
        //If the number of iteration is fixed then use for loop
        // Syntax : for(initialization ; condition ; increment/decrement)
        //loop Executes from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + ".Bright IT Career");
        }
    }
}
