package Threading.InterThreadCommunication.Incorrect;

public class Producer extends  Queue implements Runnable{
    Queue  q;           // reference of class queue
    Thread t;           // reference of class thread

    // constructor
    Producer(Queue q){
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
