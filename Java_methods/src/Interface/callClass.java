package Interface;
public class callClass {
    public static void main(String[] args) {
        // obj is a reference of interface and instance/object of client class.
        Callback obj = new client1(); 

        //  obj is reference variable of interface  callback, so it will call interface_method directly
        obj.Interface_Meth(55);


        // because obj is ref. var of interface, it will not call clinets methods
        // even obj is client object actually, but it refer to interface

        // obj.client1Method();         -> this will throw an error.


        // ** create the object of client not the refe. var of interface callback
        client1 obj2 = new client1();

        // obj2 will call the methods from client not from interface
        obj2.Interface_Meth(99);

        // obj2 is client object only so now it can access client1method() tooo...
        obj2.client1Method();
    }
}
