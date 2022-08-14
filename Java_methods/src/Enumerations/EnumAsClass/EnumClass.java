package Enumerations.EnumAsClass;

public class EnumClass {
    public static void main(String[] args) {
        // Enum1 obj; // -> enum constants can be accessed as static way

        System.out.println(Enum1.apple.getPrice());

        System.out.println("All values of Enum1: ");
        for (Enum1 objEnum1 : Enum1.values()) {
            System.out.println("Value of " + objEnum1 + " is " + objEnum1.getPrice());
        }
        System.out.println("\n\n\n");

        Enum1 obj1, obj2, obj4;

        // obtaining all oridianal values or postions of Enum1 constants
        for (Enum1 aEnum1 : Enum1.values()) {
            System.out.println("Positon of " + aEnum1 + " is " + aEnum1.ordinal());
        }
        System.out.println("\n\n");

        obj1 = Enum1.apple;
        obj2 = Enum1.mango;
        obj4 = Enum1.apple;

        // Demostrating compareTo()
        System.out.println("Understanding ordinal(): ");
        if (obj1.compareTo(obj2) > 0) {
            System.out.println(obj2 + " Comes before " + obj1);
        }
        if (obj1.compareTo(obj2) < 0) {
            System.out.println(obj1 + " Comes before " + obj2);
        }
        System.out.println("\n\n");

        // Demonstrating equals()
        System.out.println("Understanding equals(): ");
        if (obj1.equals(obj2)) {
            System.out.println("yes both are same constants");
        }
        if (obj1.equals(obj4)) {
            System.out.println("yes both are same constants");
        }
        if(obj1 == obj4){
            System.out.println("yes both are same constants with == method");
        }
    }
}

enum Enum1 {
    apple(5), mango(4), banana(3), pineapple(2), grapes(1);

    private int price;

    // Constructor
    Enum1(int p) {
        price = p;
    }

    int getPrice() {
        return price;
    }

}
