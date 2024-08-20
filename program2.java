class Stack {
    private int maxSize;
    private int top;
    private int s[];

    Stack(int size) {
        maxSize = size;
        s = new int[maxSize];
        top = -1;
    }

    void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
        } else {
            s[++top] = value;
            System.out.println("Pushed: " + value);
        }
    }

    int pop() 
    {
        if (isEmpty()) 
        {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; // Assuming -1 is not a valid element in the stack
        } else 
          return s[top--];
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
                System.out.print(s[i] + " ");
            }
            System.out.println();
        }
    }
}
public class program2
{    public static void main(String[] args) {    
        Stack stack = new Stack(10);
        for(int i=1;i<=10;i++)  stack.push(i);
        stack.display();
        System.out.println("poping all the elements");
        for(int i=1;i<=10;i++) 
        {  int ele = stack.pop();
           System.out.print(ele +" \t");
        }
        stack.display();
    }
}