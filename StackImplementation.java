import java.util.EmptyStackException;

public class StackExample {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public StackExample(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value;
            System.out.println("Pushed: " + value);
        } else {
            System.out.println("Stack is full. Cannot push " + value);
        }
    }

    public int pop() {
        if (top >= 0) {
            int poppedValue = stackArray[top--];
            System.out.println("Popped: " + poppedValue);
            return poppedValue;
        } else {
            throw new EmptyStackException();
        }
    }

    public int peek() {
        if (top >= 0) {
            return stackArray[top];
        } else {
            throw new EmptyStackException();
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public static void main(String[] args) {
        StackExample stack = new StackExample(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Stack Size: " + stack.size());
        System.out.println("Top Element: " + stack.peek());

        stack.pop();
        System.out.println("Stack Size after pop: " + stack.size());
    }
}
