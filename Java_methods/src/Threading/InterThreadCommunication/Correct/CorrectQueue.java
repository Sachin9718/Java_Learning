package Threading.InterThreadCommunication.Correct;

public class CorrectQueue {
    int n;
    boolean valueset = false;

    synchronized int get() {
        while (!valueset) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException Caught ");
            }
        }
        System.out.println("Got: " + n);
        valueset = false;
        notify();
        return n;
    }

    synchronized void put(int n) {
        while (valueset) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException Caught");
            }
        }
        this.n = n;
        valueset = true;
        System.out.println("Put: " + n);
        notify();
    }
}
