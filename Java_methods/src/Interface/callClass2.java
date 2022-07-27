package Interface;
public class callClass2 {
    public static void main(String[] args) {
        // c is refer var of Callback interface and object of client1
        Callback c = new client1();
        c.Interface_Meth(123);

        // c2 is object of client2
        client2 c2 = new client2();
        c = c2;
        c.Interface_Meth(987);
    }
}