package Ch_15_Lambda;

public class LambdaDemo {
    public static void main(String[] args) {
        FunctionalInterface num;  // Reference of interface

        // assingning value in funtional interface
        num = () -> 12.45;        // -> Lambda Expression
        System.out.println(num.getvalue());


        num = () -> Math.random()*100;
        System.out.println(num.getvalue());
        System.out.println(num.getvalue());
    }
}
