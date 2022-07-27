package Interface.Stack;
// Dynamic stack's size will increase every time when the size is full
public class DynamicStack implements IntStack {
    private int stck[];
    private int top;

    DynamicStack(int size) {
        stck = new int[size];
        top = -1;
    }

    @Override
    public void push(int item) {
        if (top == stck.length - 1) {
            int temp[] = new int[stck.length * 2]; // temporary stack of double size
            for (int i = 0; i < stck.length; i++) {
                temp[i] = stck[i]; // copying stack values into temporay stack
            }

            stck = temp;
            // making temp stack into normal stack (size and values too)
            System.out.println("top"+top);
            stck[++top] = item;
        }
        else{
            stck[++top] = item;
        }
    }

    @Override
    public int pop() {
        if (top < 0) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            return stck[top--];
        }
    }
}
