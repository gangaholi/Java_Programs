public class VarInference {
    int i=10;
    // This is not allowed
    //var classLevelVariable = 10; 
//
    static void myMethod() {
        var x = 10; // The compiler infers that x is an int
        var message = "Hello"; // The compiler infers that message is a String
        System.out.println("x="+x+"  Message="+message);
    }
    
    public static void main(String args[])
    {
        myMethod();
        var num = 199;
        var num2=300;
        num=num+num2 ;// The compiler infers that message is a int
        var name="KSIT";
        System.out.println("num="+num+" College name is  "+name);
        
    }
    
}