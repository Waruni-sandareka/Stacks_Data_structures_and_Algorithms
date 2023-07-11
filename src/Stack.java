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

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push();
    }
}
