package Interface;
public class client1 implements Callback {
    // implementing interface methods
    // mehthods inherited from interface should be public
    @Override
    public void Interface_Meth(int x){
        System.out.println("Callback called with " + x );
    }
    
    // The class can hace methods other than interface's methods
    public void client1Method() {
        System.out.println("Classes that impleted interface can have there own methods");
    }       
}