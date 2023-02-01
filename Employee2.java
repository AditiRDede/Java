class Person2
{
    public String name;
    public int age;

    Person2(int a)
    {
        System.out.println("Base class constructor...");
    }
   Person2()
    {
        System.out.println("Base class constructor...");
    }
}
class Employee2 extends Person2
{
    public int empid;
    public float sal;

    Employee2()
    {
      //super(11);
      super();
        System.out.println("Child class Constructor");
    }
    public static void main(String []args)
    {
        System.out.println("Inside main...");
        Employee2 emp=new Employee2();
    }
}
