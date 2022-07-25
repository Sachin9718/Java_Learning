package inheritance.Super2;

public class B extends A{
    public int i;  // this subclass [ i ] will hide super class [ i ]  
    
    B(int a, int b){
        super.i = a;    // here a will pass to super class [ i ] 
        i = b;          // here b will pass to sub class  [ i ]
    }

    void showB(){
        System.out.println("The sub class i wil be  just   i  -> " + i);
    }
    
}
