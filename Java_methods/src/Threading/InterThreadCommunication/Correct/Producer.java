package Threading.InterThreadCommunication.Correct;

public class Producer extends  CorrectQueue implements Runnable{
    CorrectQueue  q;           // reference of class queue
    Thread t;           // reference of class thread

    // constructor
    Producer(CorrectQueue q){
        this.q = q;
        t = new Thread(this,"Producer");
    }

    @Override
    public void run(){
        int i = 0;
        while(true){
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            q.put(i++);
        }
    }
}
