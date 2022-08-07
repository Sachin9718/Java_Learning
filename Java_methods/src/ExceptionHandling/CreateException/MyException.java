package ExceptionHandling.CreateException;


//This is a exceptin named as MyException
// It will return detail as exception 
public class MyException extends Exception{
    private int detail;
    
    MyException(int a){
        detail  = a;
    }

    public String toString(){
        return "My exception[" + detail + "]";
    }
}
