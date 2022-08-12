package Threading.InterThreadCommunication.Incorrect;

import Threading.InterThreadCommunication.Correct.CorrectQueue;

public class Consumer extends CorrectQueue implements Runnable{
    Queue q;        // reference of queue class
    Thread t;       // reference of thread class


    // constructor
    Consumer(Queue q){
        this.q = q;
        t = new Thread(this,"Consumer");
    }

    @Override
    public void run(){
        while(true){
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            q.get();
        }
    }
}
