package nestedClass;

// Outer class
public class outer {
    int outer_x = 100;

    // object of Inner class can only created in outer class
    // outer class can access the methods of inner class
    void temp() {
        inner objinner = new inner(); // this is calling inner class
        objinner.display();
    }
    



    // outer class can not access the variables of Inner Class
    void temp2(){
        // System.out.println("The variable of inner class from outer class " + inner_y);    -> This will throw error
    }




    // Inner Class can access all the data members and methods of outer class
    public class inner {
        int inner_y = 200;
        void display() {
            System.out.println("The element from outer class is " + outer_x);  // this will call outer class object
        }
    }
};
// So outer class can access inner class methods but not data variables
// Inner classs can accces outer class methods and data variables
