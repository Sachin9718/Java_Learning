package Threading.MultiThreading;

public class MyThread extends Thread{
    // take the reference of printer method
    printer ref;

    MyThread(printer obj){     // objec of printer
        ref = obj;
    }

    @Override
    public void run(){
        synchronized(ref){
            ref.print(10, "Sachin's Profile: ");
        }
    }
}
