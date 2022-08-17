package Ch_14_Generics.GenricEx;

public class TwoGenClass<T, V> {
    T ob1;
    V ob2;

    TwoGenClass(T t, V v) {
        ob1 = t;
        ob2 = v;
    }

    T gett() {
        return ob1;
    }

    V getv() {
        return ob2;
    }

    void show() {
        System.out.println("Type of T: " + ob1.getClass().getName());
        System.out.println("Type of V: " + ob2.getClass().getName());
    }
}
