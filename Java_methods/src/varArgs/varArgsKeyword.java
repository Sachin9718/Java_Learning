package varArgs;

public class varArgsKeyword {
    public void arrArgs(int ...arr) {
        System.out.print("The length of argument array is -> " + arr.length + " contents -> ");

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
