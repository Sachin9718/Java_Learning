package Threading.InterThreadCommunication.Incorrect;

public class Queue {
    int n;
    synchronized int get(){
        System.out.println("Got: " + n );
        return n;
    }
    synchronized void put(int n){
        this.n = n;
        System.out.println("Put: " + n);
    }
}
