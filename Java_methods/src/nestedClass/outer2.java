package nestedClass;

public class outer2 {
    int outer_temp = 200;

    // inner class in loop
    void outer_meth() {

        for (int i = 0; i < 5; i++) {
            // declaring inner class
            class innerClass {

                // method of inner class
                void innerMethod() {
                    System.out.println("The element from outer class from inner Class in 10 times loop -> " + outer_temp);
                }

            }
            // creating inner class objects
            innerClass innerOj = new innerClass();
            innerOj.innerMethod();
        }
    }
}
