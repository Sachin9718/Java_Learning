package AutoBoxing;

public class Wraper {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(100);
        Character ch = Character.valueOf('S');
        Boolean bool = Boolean.valueOf(true);
        Double d = Double.valueOf(99.99);
        
        System.out.println(i+ " " + ch + " " + bool + " " + d);

        // Autoboxing

        Integer i2 = 200;  // Autoboxing
        System.out.println(i2);

    }
}
