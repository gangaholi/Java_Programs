abstract class A
{
    {
        System.out.println("AAA");
    }
}
 
abstract class B extends A
{
    {
        System.out.println("BBB");
    }
}
 
class C extends B
{
    {
        System.out.println("CCC");
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        C c = new C();
    }
}