package Threading.InterThreadCommunication.Incorrect;

public class PC_mainClass {
    public static void main(String[] args) {
        Queue q = new Queue();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);

        // start the threads

        p.t.start();
        c.t.start();


        System.out.println("Press control + c to stop. ");
    }
}
