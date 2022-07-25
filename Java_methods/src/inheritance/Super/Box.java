package inheritance.Super;

public class Box {
    private double height;
    private double width;
    private double depth;

    // constructor for object clone or object passing
    Box(Box ob) {
        height = ob.height;
        width = ob.width;
        depth = ob.depth;
    }

    // constructor for passing all arguments
    Box(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    // constructor for not passing any argrument
    Box() {
        height = -1;
        width = -1;
        depth = -1;
    }

    // constuctore for cube or every dimension is equal
    Box(double len) {
        height = width = depth = len;
    }

    // method for computing volulme
    public double volume() {
        return height * depth * width;
    }
}
