package Enumerations.EnumDemo;

public class mainClass {
    public static void main(String[] args) {
        EnumDemo E;
        E = EnumDemo.apple;
        // Output an Enum value
        System.out.println("Value of E: " + E);


        E = EnumDemo.mango;

        // Compare two enumvalues
        if(E == EnumDemo.pineapple){
            System.out.println("E contains Pineapple");
        }
        else{
            System.out.println("E does not contain Pineapple");
        }

        // Switch case with Enum
        switch (E) {
            case apple:
                System.out.println("E is apple");
            case mango:
                System.out.println("E is mango");
            case pineapple:
                System.out.println("E is pineapple");
            case grapes:
                System.out.println("E is Grapes");        
            default:
                System.out.println("E is somethig else");
                break;
        }

        // Values create a array of enum constants
        EnumDemo allEnums[] = EnumDemo.values();
        for(EnumDemo ED : allEnums){
            System.out.println(ED);
        }
        System.out.println();

        EnumDemo ap;
        ap = EnumDemo.valueOf("mango");
        System.out.println(ap);
    }
}
