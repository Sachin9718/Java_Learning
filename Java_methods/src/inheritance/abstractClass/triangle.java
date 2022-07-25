package inheritance.abstractClass;

public class triangle extends figure{
    triangle(double a, double b){
        super(a, b);
    }


    // override the abstract method of superclass figure
    double area(){
        return (dim1*dim2)/2;
    }
}
