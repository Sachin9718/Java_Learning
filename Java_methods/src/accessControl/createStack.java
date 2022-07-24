package accessControl;

public class createStack {
    public static void main(String[] args) {
        Stack obj1 = new Stack();

        for (int i = 0; i < 10; i++) {
            obj1.push(i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Popped element is -> " + obj1.pop());
        }
    }
}
