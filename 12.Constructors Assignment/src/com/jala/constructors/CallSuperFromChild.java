/**
 * @author JALA Academy
 * @author K.Sharan Simha Reddy
 *
 * 02. Call the constructors(both default and argument constructors) of super class from a child
 * class
 */
package com.jala.constructors;

//child subclass extending superclass
class ChildClass_02 extends ParentClass_01 {

    String clg;
    String city;

    //calling Parent class constructor using super() keyword
    ChildClass_02() {
        super();
    }
    //calling Parent class argument constructor using super() keyword
    ChildClass_02(int rollNo) {
        super(rollNo);
    }
    //calling Parent class argument constructor using super() keyword
    ChildClass_02(String name, String branch, String clg, String city) {
        super(name, branch);
        this.clg = clg;
        this.city = city;
        System.out.println("College : " + this.clg);
    }
}

public class CallSuperFromChild {
    public static void main(String... args) {
        //creating objects and passing values
        new ChildClass_02();
        new ChildClass_02(317);
        new ChildClass_02("Sharan", "CSE", "ICFAI","Hyderabad");
    }
}
