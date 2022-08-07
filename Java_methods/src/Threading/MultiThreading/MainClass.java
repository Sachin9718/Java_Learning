package Threading.MultiThreading;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("== Main Thread Starting ==");

        printer obj = new printer();


        // printing will happen in MyThread 
        MyThread t = new MyThread(obj);
        t.start();
        

        // // By using join the one thread will execute first 
        // try {
        //     t.join();
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }




        // Printing will happen in MyThread2
        MyThread2 t2 = new MyThread2(obj);
        t2.start();


        // so, both the threads working simultaneously wihout disturbing main thread
        // the class printer and method print will shared by both the Threads
        // Printer will be swithing in between both threads



        System.out.println("== Main Thread Finishing ==");
    }
}
