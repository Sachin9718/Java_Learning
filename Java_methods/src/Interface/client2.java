package Interface;
public class client2 implements Callback{
    // implements callback's method
    @Override
    public void Interface_Meth(int num) {
        System.out.println("Another version of Callback");
        System.out.println("multiple of num in client2 is " + num*num );
    }
}