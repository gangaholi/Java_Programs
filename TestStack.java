class Stack {
    int top=-1;
    int stack[]=new int[10];

    void push(int item) {
      if (top==9) {
          System.out.println("Stack is full. Cannot push " + item);
      } 
      else{
          stack[++top] = item;
          }
    }

    int pop() 
    {
       if (top<0) 
       {   System.out.println("Stack underflow. Cannot pop.");
           return -1; // Assuming -1 is not a valid element in the stack
        } 
        else 
        {   return stack[top--];
        }
    }
    void display() 
    {   if (top < 0) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }
}

public class TestStack
{
    public static void main(String[] args) 
    {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();
        for(int i=0;i<10;i++) mystack1.push(i);
        for(int i=0;i<10;i++) mystack2.push(i); 
        mystack1.display();
        mystack2.display();
        
        System.out.println("\n");
        
        for(int i=0;i<10;i++)
        	System.out.print(mystack1.pop()+"  ");
        
        System.out.println("\n");
        for(int i=0;i<10;i++) 
            System.out.print(mystack2.pop()+"  "); 
     }
}

