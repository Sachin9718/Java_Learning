package varArgs;

public class overloadVaraArgs {
    public static void arrVarOverl(int ...num) {
        System.out.print("Integer array arguments " + num.length + " contents: ");
        for (int i : num) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


    public static void arrVarOverl(Double ...deci) {
        System.out.print("\nFloat array arguments " + deci.length + " contents: ");
        for (double d : deci) {
            System.out.print(d + " ");
        }
        System.out.println();
    }

    public static void arrVarOverl(boolean ...bool) {
        System.out.print("\nBoolean array arguments contents: ");
        for (boolean b : bool) {
            System.out.print(b + " ");
        }
        System.out.println();
    }
}
