import java.util.Scanner;

class Stack1 {
    private int maxSize;
    private int top;
    private int[] stackArray;

    Stack1(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
        } else {
            stackArray[++top] = value;
            System.out.println("Pushed: " + value);
        }
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; // Assuming -1 is not a valid element in the stack
        } else {
            int poppedValue = stackArray[top--];
            System.out.println("Popped: " + poppedValue);
            return poppedValue;
        }
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == maxSize - 1;
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }
}
class TestStack1{
    public static void main(String[] args) {
        Stack1 stack = new Stack1(10);
        Scanner in=new Scanner(System.in);
        int choice;
        do  
	     { System.out.println("\n");
          System.out.println(" 1. Push"); 
		    System.out.println(" 2. Pop"); 
		    System.out.println(" 3. Display"); 
          System.out.println(" 4. exit"); 
		    System.out.println("Enter Choice from 1 to 4:");
          choice=in.nextInt(); 
		    switch(choice)
	       {
		      case 1 :	System.out.println("Enter number to push:");
		      	      int number = in.nextInt(); 	
                     stack.push(number);
                     break;
		      case 2 :	stack.pop();
                     break;
		      case 3:	stack.display();
               		break;
   	      case 4 :	return;
            default : System.out.println("Choice out of range;");
		 } // end of Switch 
	 }while( choice >=1 && choice <=4); 
 }
}