package varArgs;

public class diffArgu {
    public static void diffVarArgs(String s1, int i1, int ...arr) {
        System.out.print("String -> " + s1 + " integer  -> " + i1 + " array args -> ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
