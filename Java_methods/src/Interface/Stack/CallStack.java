package Interface.Stack;

public class CallStack {
    public static void main(String[] args) {

        // Fixed stack
        System.out.println("Calling fixed size stack");
        IntStack obj = new FixedStack(5);
        for (int i = 0; i < 5; i++) {
            obj.push(i);
            System.out.println("pused item in stack is " + i);
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.println("poped item in stack is " + obj.pop());
        }


        // dynamic stack
        System.out.println("\n\nCalling Dynamic size stack");
        IntStack obj2 = new DynamicStack(2);
        for (int i = 0; i < 15; i++) {
            obj2.push(i);
            System.out.println("pused item in stack is " + i);
        }
        System.out.println();
        for (int i = 0; i < 15; i++) {
            System.out.println("poped item in stack is " + obj2.pop());
        }

    }

}
