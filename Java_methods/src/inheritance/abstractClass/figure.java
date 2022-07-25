package inheritance.abstractClass;

// abstract class does not have any object
public abstract class figure {
    double dim1;
    double dim2;

    figure(double a, double b){
        dim1 = a;
        dim2 = b;
    }

    // abstract method -> it should be overriden by all subclasses
    abstract double area(); 
}
