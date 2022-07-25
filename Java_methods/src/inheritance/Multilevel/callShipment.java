package inheritance.Multilevel;

public class callShipment {
    public static void main(String[] args) {
        var obj1 = new shipment(10,20,30,40,50);
        System.out.println("The weight of box is " + obj1.boxHeavy() + " shipment price: " + obj1.price() + " volume: " + obj1.volume());
    }
}
