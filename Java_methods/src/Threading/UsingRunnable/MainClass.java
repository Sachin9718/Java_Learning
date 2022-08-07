package Threading.UsingRunnable;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Staring Main Class");

        // Job 2
        Runnable r = new child(); // r is reference of interface runnable and object of child
        Thread t = new Thread(r); // t is obj of thread which has reference of r or say object of child
        t.start(); // now thread t will start the child which has referenc of runnable





        // job 3 a new thead
        // Runnable l = new child2();
        // Thread y = new Thread(l); 
        // y.start();
        new Thread(new child2()).start();


        // job 4 a new daemon thread -> a daemon thread is run by JVM parallely to main Thread
        // so the daemon thead does not depend on Main thread 
        Thread t2 = new Thread(new child3());
        t2.setDaemon(true);
        t2.start();
        



        // job 4 a thread
        for (int i = 0; i < 10; i++) {
            System.out.println("@ @ @ " + i);
        }


        System.out.println("Finishing Main Class");
    }
}
