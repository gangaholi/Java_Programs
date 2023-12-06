class Stack {
    private int maxSize;
    private int top;
    private int[] stackArray;

    Stack(int size) {
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

    public static void main(String[] args) {
        Stack stack = new Stack(10);

        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.display();

        stack.pop();
        stack.display();

        stack.pop();
        stack.pop(); // Trying to pop from an empty stack
        stack.display();
    }
}