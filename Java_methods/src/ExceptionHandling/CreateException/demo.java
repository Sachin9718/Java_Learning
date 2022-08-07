package ExceptionHandling.CreateException;

public class demo {
    public static void compute(int a) throws MyException{
        System.out.println("Called compute ("+ a + ")");
        if(a>10){
            throw new MyException(a);
        }
        System.out.println("Normal Exist");
    }

    public static void main(String[] args) {
        try{
            compute(5);
            compute(25);
        }catch(MyException e){
            System.out.println("caught " + e);
        }
    }
}
