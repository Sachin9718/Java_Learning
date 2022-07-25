package inheritance.Multilevel;
import inheritance.Super.weightBox;

public class shipment extends weightBox{
    public double cost;

    
    shipment(double h, double w, double d, double weight, double cost) {
        super(h, w, d, weight);
        this.cost = cost;
    }
    
    shipment(shipment obj){
        super(obj);
        cost = obj.cost;
    }

    shipment(){
        super();
        cost = -1;
    }

    shipment(double len , double weight, double cost){
        super(len, weight);
        this.cost = cost;
    }

    public double price(){
        return cost;
    }
    
}
