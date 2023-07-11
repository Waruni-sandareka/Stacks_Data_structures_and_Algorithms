import java.util.Scanner;

public class Stack {
    private static final int N = 5;
    private int[] stack = new int[N];
    private int top = -1;

    public void push() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter data (-1 to exit): ");
        int x = scanner.nextInt();

        while (x != -1) {
            if (top == N - 1) {
                System.out.println("Overflow");
                break;
            } else {
                top++;
                stack[top] = x;
                System.out.println("Element " + x + " pushed onto the stack.");
            }

            System.out.println("Enter data (-1 to exit): ");
            x = scanner.nextInt();
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Underflow");
        } else {
            int poppedElement = stack[top];
            top--;
            System.out.println("Element " + poppedElement + " popped from the stack.");
        }
    }

    public void peek(){
        if(top==-1){
            System.out.println("Underflow");
        }
        else{
            int topElement = stack[top];
            System.out.println("peek element = " + topElement );
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push();

        System.out.println("Removing the first element from the stack:");
        stack.pop();

        System.out.println("Returning Peek Element");
        stack.peek();

    }
}
