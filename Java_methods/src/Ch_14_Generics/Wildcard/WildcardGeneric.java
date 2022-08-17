package Ch_14_Generics.Wildcard;

public class WildcardGeneric<T extends Number> {
    T[] arr;

    WildcardGeneric(T[] o) {
        arr = o;
    }

    double average() {
        double sum = 0.0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].doubleValue();
        }
        return sum;
    }

    // checking two averages are same or not
    boolean sameAvg(WildcardGeneric<?> ob) {
        if (average() == ob.average()) {
            return true;
        }
        return false;
    }

}
