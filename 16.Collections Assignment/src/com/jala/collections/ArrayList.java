/**
 * @author JALA Academy
 * @author K.Sharan Simha Reddy
 *
 * 1.Create an ArrayList of type String with 10 string elements. Add 10 string elements to
 * ArrayList and perform the below operations
 * - a. Add an element to the ArrayList
 * - b. Iterate through the ArrayList by using Iterator object
 * - c. Add an element at a specific index
 * - d. Remove an element from the ArrayList, Remove at an index
 * - e. Update the element at a specific index
 * - f. Check the element is present at a particular index
 * - g. Get an element at a particular index
 * - h. Find out the size of the ArrayList
 * - i. Check the given element is present in the ArrayList
 * - j. Remove all elements of the ArrayList
 */
package com.jala.collections;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayList {

    public static void main(String[] args) {

        //passing an Array converted to List using the asList() method
        java.util.ArrayList<String> myList = new java.util.ArrayList<>(
                Arrays.asList("zero", "one", "two", "three", "four", "five"));
        System.out.println("\nmyList = " + myList);

        //a. adding elements to the ArrayList using add method using add() method
        myList.add("six");
        myList.add("seven");
        myList.add("eight");
        myList.add("nine");
        System.out.println("\nAfter adding elements :");
        System.out.println("myList = " + myList);


        //b. Iterating through the ArrayList by using Iterator object
        Iterator<String> itr = myList.iterator();
        System.out.println("\nIterating through the ArrayList : ");
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println(" ");

        //c. Adding an element at a specific index using add() method
        myList.add(1, "AtIndex1");
        System.out.println("\nAfter adding an element at index 1 :");
        System.out.println("myList = " + myList);

        //d. Removing an element at a specific index using remove() method
        myList.remove(1);
        System.out.println("\nAfter removing an element at index 1 :");
        System.out.println("myList = " + myList);

        //e. Updating the element at a specific index using set() method
        myList.set(1, "ONE");
        System.out.println("\nAfter updating the element at index 1 :");
        System.out.println("myList = " + myList);

        //f. Checking the element is present at a particular index using indexOf() method
        System.out.println("\nThe element is present at index :");
        System.out.println(myList.indexOf("three"));

        //g. Getting an element at a particular index using get() method
        System.out.println("\nThe element at index 3 :");
        System.out.println(myList.get(3));

        //h. Finding the size of the ArrayList using size() method
        System.out.println("\nSize of the ArrayList : ");
        System.out.println(myList.size());

        //i. Checking the element is present in the ArrayList using contains() method
        System.out.println("\n'two' is present in the ArrayList : ");
        System.out.println(myList.contains("two")); //returns boolean value

        //j. Removing all elements of the ArrayList using clear() method
        System.out.println("\nAfter removing all elements of the ArrayList :");
        myList.clear();
        System.out.println("myList = " + myList);
    }
}
