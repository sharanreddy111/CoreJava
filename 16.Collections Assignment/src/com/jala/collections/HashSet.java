/**
 * @author JALA Academy
 * @author K.Sharan Simha Reddy
 *
 * 3.Create a HashSet with at least 10 elements of type String
 * - Write program covering all the operations of HashSet
 */
package com.jala.collections;

import java.util.Iterator;

public class HashSet {
    public static void main(String[] args) {

        java.util.HashSet<String> mySet = new java.util.HashSet<>();

        //a. adding elements to the HashSet using add() method
        mySet.add("zero");
        mySet.add("one");
        mySet.add("two");
        mySet.add("three");
        mySet.add("four");
        mySet.add("five");
        mySet.add("six");
        mySet.add("seven");
        mySet.add("eight");
        mySet.add("nine");
        mySet.add("ten");
        //does not allow duplicate elements, Set contains unique elements only.
        mySet.add("nine");
        System.out.println("\nAfter adding elements to HashSet :");
        //HashSet doesn't maintain the insertion order
        System.out.println("mySet = " + mySet);


        //b. Iterating through the HashSet by using Iterator object
        Iterator<String> itr = mySet.iterator();
        System.out.println("\nIterating through the HashSet : ");
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println(" ");

        //c. Create a clone/copy of HashSet using clone() method
        System.out.println("\nclone/copy of HashSet : ");
        System.out.println(mySet.clone());

        //c. Removing a specific element using remove() method
        mySet.remove("zero");
        System.out.println("\nAfter removing element 'zero' :");
        System.out.println("mySet = " + mySet);

        //f. Checking if the set is empty using isEmpty() method
        System.out.println("\nChecking if the set is empty :");
        System.out.println(mySet.isEmpty());


        //h. Finding the size of the HashSet using size() method
        System.out.println("\nSize of the HashSet : ");
        System.out.println(mySet.size());

        //d. Checking if element is present in the HashSet using contains() method
        System.out.println("\nElement 'one' is present in the HashSet : ");
        System.out.println(mySet.contains("one")); //returns boolean value

        //j. Removing all elements of the HashSet using clear() method
        System.out.println("\nAfter removing all elements of the HashSet :");
        mySet.clear();
        System.out.println("mySet = " + mySet);
    }
}
