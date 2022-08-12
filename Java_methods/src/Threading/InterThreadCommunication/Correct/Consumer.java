package Threading.InterThreadCommunication.Correct;

public class Consumer extends CorrectQueue implements Runnable{
    CorrectQueue q;        // reference of queue class
    Thread t;       // reference of thread class


    // constructor
    Consumer(CorrectQueue q){
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
