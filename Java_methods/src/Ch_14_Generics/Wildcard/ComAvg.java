package Ch_14_Generics.Wildcard;

public class ComAvg {
    public static void main(String[] args) {

        Integer Iarr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        WildcardGeneric<Integer> ob1 = new WildcardGeneric<Integer>(Iarr);
        System.out.println("Average of integer array: " + ob1.average());

        System.out.println();

        Double Darr[] = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.10 };
        WildcardGeneric<Double> ob2 = new WildcardGeneric<Double>(Darr);
        System.out.println("Average of Double array: " + ob2.average());

        System.out.println();

        Float Farr[] = { 1.0F, 2.0F, 3.0F, 4.0F, 5.0F, 6.0F, 7.0F, 8.0F, 9.0F, 10.0F };
        WildcardGeneric<Float> ob3 = new WildcardGeneric<Float>(Farr);
        System.out.println("Average of Float array: " + ob3.average());

        System.out.println("\n\nLet's compare three averages in wildcard genrics: ");
        if (ob1.sameAvg(ob2)) {
            System.out.println("Average in ob1 and Ob2 is same");
        } else {
            System.out.println("Average in ob1 and Ob2 is differ");
        }

        System.out.println();

        if (ob1.sameAvg(ob3)) {
            System.out.println("Average in ob1 and Ob3 is same");
        } else {
            System.out.println("Average in ob1 and Ob3 is differ");
        }

    }
}
