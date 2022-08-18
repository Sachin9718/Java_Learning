package Ch_15_Lambda;

public class Lambda2 {
    public static void main(String[] args) {
        FuncInterface2 isEven = (n) -> (n % 2) == 0;
        System.out.println("Is even or not: " + isEven.test(45) );
        System.out.println("Is even or not: " + isEven.test(61) );
        System.out.println("Is even or not: " + isEven.test(24) );
    }
}
