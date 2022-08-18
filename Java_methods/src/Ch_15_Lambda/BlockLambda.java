package Ch_15_Lambda;

interface factoral {
    int func(int n);
}

public class BlockLambda {
    public static void main(String[] args) {

        factoral fact = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = i * result;
            }
            return result;
        };

        System.out.println("Facotorail of 3 is: " + fact.func(5));
        System.out.println("Facotorail of 6 is: " + fact.func(6));
    }
}