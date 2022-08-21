package Ch_15_Lambda;

interface reverseSTR<T> {
    T func(T t);
}

public class GenericLambdaInterface {
    public static void main(String[] args) {
        // Creating a object of generic interface lambda
        reverseSTR<String> obj = (str) -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };

        System.out.println("Reverse of Lambda: " + obj.func("Lambda"));
        System.out.println("Revesr of Sachin Yadav: " + obj.func("Sachin Yadav"));
    }
}
