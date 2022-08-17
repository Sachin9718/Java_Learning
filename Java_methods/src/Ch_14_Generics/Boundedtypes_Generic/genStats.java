package Ch_14_Generics.Boundedtypes_Generic;

public class genStats<T extends Number> {
    T[] arr;

    genStats(T[] o) {
        arr = o;
    }

    // average of nums
    double average(){
        double sum = 0.0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].doubleValue();       
            // We UpperBound the T with Number super class by which doubleValue will know that 
            // T will be only Number and its subclass Types
            // T Cannot be now any String and char array type because of upperbound
        }
        return sum;
    }
}
