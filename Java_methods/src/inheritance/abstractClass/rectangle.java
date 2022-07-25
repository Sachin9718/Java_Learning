package inheritance.abstractClass;

public class rectangle extends figure{
    rectangle(double a, double b){
        super(a, b);  // passing and b variable into super class
    }

    // override the figure abstract method
    double area(){
        return dim1*dim2;
    }
}
