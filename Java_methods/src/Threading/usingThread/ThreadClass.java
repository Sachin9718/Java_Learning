package Threading.usingThread;

public class ThreadClass extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("@ @Printer 2 : " + i);
        }
    }
}
