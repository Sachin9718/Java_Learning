package Threading.UsingRunnable;


// Here we have a problem, In java mulitple Inheritace is not possible so we can't do this
// public class A extends B,thread  -> this will throw an error

//  so for threading we have a interface which helps us for threading in child class to 
//  Runnable    -> is a interface for threading
public class child extends father  implements Runnable{
    @Override
    public void run() {
        for(int i = 0 ; i< 10 ;  i++){
            System.out.println("* * * " + i);
        }
        
    }
}
