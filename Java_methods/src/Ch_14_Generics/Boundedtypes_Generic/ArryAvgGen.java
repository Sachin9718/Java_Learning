package Ch_14_Generics.Boundedtypes_Generic;

public class ArryAvgGen {
    public static void main(String[] args) {
        Integer arr[] = {1,2,3,4,5,60,7,8,9,10};
        genStats<Integer> ob = new genStats<Integer>(arr);

        System.out.println("Average in Generic is: " + ob.average());
    }
}
