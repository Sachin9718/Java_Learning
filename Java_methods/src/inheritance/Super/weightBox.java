package inheritance.Super;

// super keyword is used to pass all args to the superClass constuctor from subclass constructor

//  ** NOTE ! ->  if a class is accessig from another package then the constructor of that class should be public

public class weightBox extends Box{
    double weight;

    // constructor for object cloning 
    public weightBox(weightBox ob){
        super(ob);            
        weight = ob.weight;
    }

    // constructor for all agruments passing
    public weightBox(double h, double w, double d, double weight){
        super(h,w,d);
        this.weight = weight;
    }

    // constructor for no argument
    public weightBox(){
        super();
        weight = -1;
    }

    // constructor for cube argument
    public weightBox(double len, double weight){
        super(len);
        this.weight = weight;
    }

    public double boxHeavy(){
        return weight;
    }

}
