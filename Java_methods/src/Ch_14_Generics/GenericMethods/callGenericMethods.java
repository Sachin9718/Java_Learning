package Ch_14_Generics.GenericMethods;

public class callGenericMethods extends GenericMethods {
    public static void main(String[] args) {
        // Use isIn on Integers
        Integer nums[] = { 1, 2, 3, 4, 5, 6 };
        // calling isIn generic method
        if (isIn(4, nums)) {
            System.out.println("Yes, 4 is in Nums");
        }

        // Use isIn String array

        String str[] = { "Sachin", "Sinnis", "Yadav" };
        if (isIn("Sachin", str)) {
            System.out.println("Yes, Sachin is in str");
        }

        if (!isIn("Mummy", str)) {
            System.out.println("No,Mummy is not in str");
        }
    }
}
