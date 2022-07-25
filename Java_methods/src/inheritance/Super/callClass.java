package inheritance.Super;

public class callClass {
    public static void main(String[] args) {
        System.out.println("**  Creating object for sub class   **");
        // passing all parameters
        weightBox obj1 = new weightBox(20,30,40,22.2);
        System.out.println("Volume of obj1 is -> " + obj1.volume() + " Weight is " + obj1.boxHeavy());
        
        // passing old object
        var obj2 = new weightBox(obj1);   // here [ var ] -> will act as weightBox() because that is how it initialize
        System.out.println("Volume of obj2 is -> " + obj2.volume() + " Weight is " + obj2.boxHeavy());
        
        
        // passing no parameter
        var obj3 = new weightBox();
        System.out.println("Volume of obj3 is -> " + obj3.volume() + " Weight is " + obj3.boxHeavy());
        
        
        // passing one parameter as for cube
        var obj4 = new weightBox(33.3,22.2);
        System.out.println("Volume of obj4 is -> " + obj4.volume() + " Weight is " + obj4.boxHeavy());
        
        
        System.out.println("\n\n$$  Creating object of super class  $$");
        // creating object of parent or super class 
        // passing all args
        var superobject1 = new Box(20,30,40);
        System.out.println("Volume of superobject1 is -> " + superobject1.volume());
        
        // Passing pervious object in super class
        var superobject2 = new Box(superobject1);
        System.out.println("Volume of superobject2 is -> " + superobject2.volume());
        
        // Passing no args
        var superobject3 = new Box();
        System.out.println("Volume of superobject3 is -> " + superobject3.volume());
        
        // passing cube args
        var superobject4 = new Box(33.3);
        System.out.println("Volume of superobject4 is -> " + superobject4.volume());




    }
}
