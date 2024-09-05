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
            return;
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
                System.out.println(s[i] + " ");
            }
            System.out.println();
        }
    }
}
public class program2
{    public static void main(String[] args) 
     {    
        Stack stack = new Stack(10);
        for(int i=1;i<=10;i++)  
            stack.push(i*2);
        stack.display();
        System.out.println("poping all the elements");
        for(int i=1;i<=10;i++) 
        {  int ele = stack.pop();
           System.out.println(ele +" \t");
        }
        stack.display();
    }
}