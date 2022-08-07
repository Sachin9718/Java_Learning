package Threading.MultiThreading;

public class printer {
    // synchronized -> it will lock the method for one thread until thread works done
    // synchronized public void print(int num, String doc) {
        
    public void print(int num, String doc) {
        for (int i = 0; i < num; i++) {
            System.out.println("Doucument " + doc + " num " + i);
        }
    }
}
