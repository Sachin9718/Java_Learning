package Threading.MultiThreading;


public class MyThread2 extends Thread{
    // take the reference of printer method
    printer ref;

    MyThread2(printer obj){     // object of printer
        ref = obj;
    }

    @Override
    public void run(){
        synchronized(ref){
            ref.print(10, "Rishabh's Profile: ");

        }
    }
}
