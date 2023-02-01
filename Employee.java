/*
    1.super() 
    2.this constructopr chaining
*/

class Person
{
    public String name;
    public int age;

    Person(String name,int age)
    {   
        this();
        System.out.println("Inside base class parameterized constructor..");
        this.name=name;
        this.age=age;
        System.out.println("base Class data ::"+"name ::"+this.name+" age ::"+this.age);
    }
    Person()
    {
        System.out.println("Inside Base class non arg constructor...");
    }
}
class Employee extends Person
{
    public int empid;
    public float empsal;
    Employee()
    {
        super("Aditi",26);
        
        this.empid=11;
        this.empsal=111100000;
        System.out.println("Inside Child class parameterized constructor..");
       
        System.out.println("Child Class data ::"+"empid ::"+this.empid+" sal ::"+this.empsal);
    }
  

    public static void main(String [] args)
    {
        System.out.println("Inside main");
        Employee emp=new Employee();
       // Employee emp2=new Employee(11,110000000.00);

    }
}