import java.util.Stack;

public class labActivity4 {
    public static Stack<Integer> sortStackDescending(Stack<Integer> inputStack) {
        Stack<Integer> tempStack = new Stack<>();

        while (!inputStack.isEmpty()) {
            int temp = inputStack.pop();

            while (!tempStack.isEmpty() && tempStack.peek() < temp) {
                inputStack.push(tempStack.pop());
            }

            tempStack.push(temp);
        }

        Stack<Integer> sortedStack = new Stack<>();
        while (!tempStack.isEmpty()) {
            sortedStack.push(tempStack.pop());
        }

        return sortedStack;
    }

    public static void main(String[] args) {
        Stack<Integer> inputStack = new Stack<>();
        inputStack.push(4);
        inputStack.push(8);
        inputStack.push(2);
        inputStack.push(6);

        Stack<Integer> sortedStack = sortStackDescending(inputStack);

        while (!sortedStack.isEmpty()) {
            System.out.println(sortedStack.pop() + " ");
        }
    }
}
