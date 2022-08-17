package Ch_14_Generics.GenricEx;

public class GenClass<T> {
    T ob;  // object of type T  -> T can be of any type

    // constructor
    GenClass(T o){
        ob = o;
    }

    // return object value
    T getobj(){
        return ob;
    }

    // Type of T
    void showTtype(){
        System.out.println("Type of T: " + ob.getClass().getName());
    }
}
