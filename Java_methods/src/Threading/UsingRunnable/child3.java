package Threading.UsingRunnable;

public class child3 implements Runnable{
    @Override
    public void run(){
        for (int j = 0; j < 10; j++) {
            System.out.println("$ $ $ " + j);
        }
    }
}