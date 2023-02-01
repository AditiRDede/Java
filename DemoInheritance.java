/*Can static method get inherited */


class DemoParent
{
    public String name;
    public int age;

    public static void fun()
    {
        System.out.println("Inside Base class static method..");
    }
}
class DemoInheritance extends DemoParent
{

    public static void main(String [] args)
    {
        System.out.println("Inside main....");
        DemoInheritance cobj= new DemoInheritance();
        cobj.fun();
        //
        DemoParent.fun();
       
    
    }
    public  static void fun()
    {
        System.out.println("child class static fun");
        
    }
}