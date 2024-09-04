import java.util.Scanner;
class Stack {
    private int maxSize;
    private int top;
    private int s[];

    Stack(int size) {
        maxSize = size;
        s = new int[maxSize];
        top = -1;
    }

    void push(int value) 
    {
        if (top == maxSize - 1) 
        {   System.out.println("Stack is full. Cannot push " + value);
        } 
        else 
        {   s[++top] = value;
            System.out.println("Pushed: " + value);
        }
    }

    int pop() 
    {   if (top == -1) 
        {   System.out.println("Stack is empty. Cannot pop.");
            return -1; // Assuming -1 is not a valid element in the stack
        } 
        else 
            return s[top--];
    }
    
    void display() 
    {
        if (top == - 1) 
        { System.out.println("Stack is empty.");
        }
        else 
        {   System.out.println("Stack elements: "+top);
            for (int i = 0; i <= top; i++) 
            {
                System.out.print(s[i] + " ");
            }
            System.out.println();
        }
    }
}
public class program2_2
{    public static void main(String[] args) 
     {  
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the soze of the stacck n =");
        int n= input.nextInt();
        
        Stack stack = new Stack(n);
        System.out.println(" Stack size is ="+n);
        System.out.println("Menu driven Stack operations");
        System.out.println("Push");
        System.out.println("Pop");
        System.out.println("Display");
        System.out.println("Exit \n ");
        
        while(true)
        {      
          System.out.println("Enter Choice=");
          int choice=input.nextInt();
          switch(choice)
          {   case 1 :   System.out.println("Enter Element=");
                         int item=input.nextInt();
                         stack.push(item);
                         break;
              case 2 :   int ele = stack.pop();
                         if( ele !=-1) 
                              System.out.println("Poped element is "+ele);
                         break;
              case 3 :   System.out.println("Displaying stack elemnts");
                         stack.display();
                         break ;
              case 4 :   return ;
              default :  System.out.println("Enter valid choice ....");
            } // end of switch
         }  // end of while
    }  // end of main
}  // end of class