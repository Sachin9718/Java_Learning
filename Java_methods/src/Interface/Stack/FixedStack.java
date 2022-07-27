package Interface.Stack;

class FixedStack implements IntStack {
    private int stck[];
    private int top;

    FixedStack(int size) {
        stck = new int[size];
        top = -1;
    }

    @Override
    public void push(int item) {
        if (top == stck.length) {
            System.out.println("Stack is full");
        } else {
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
