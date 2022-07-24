package accessControl;

public class Stack {
    // here both array and variable is private which means other classes cannot
    // access it
    // so both the variables are now safe from outside alteration and misuse.
    private int stck[] = new int[10];
    private int top;

    Stack() {
        top = -1;
    }

    void push(int item) {
        if (top == 9) {
            System.out.println("Cannot push more item in Stack");
        } else {
            stck[++top] = item;
        }
    }

    int pop() {
        if (top == -1) {
            System.out.println("Cannot pop more itme form Stack");
            return 0;
        } else {
            return stck[top--];
        }
    }

}
