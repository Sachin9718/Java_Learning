package Ch_14_Generics.BounderWildcard;

public class cordsGen<T extends TwoD> {
    T[] cords;

    cordsGen(T[] o) {
        cords = o;
    }

    // cordsGen object will contain objects of type TwoD or one of its subclasses
    // because of upperbound TwoD

    void showXY(cordsGen<?> c) {
        System.out.println("X and Y cordinates ");
        for (int i = 0; i < cords.length; i++) {
            System.out.println(c.cords[i].x + " " + c.cords[i].y);
        }
    }

    void showxyz(cordsGen<? extends ThreeD> c) {
        System.out.println("X Y and Z cordinates ");
        for (int i = 0; i < cords.length; i++) {
            System.out.println(c.cords[i].x + " " + c.cords[i].y + " " + c.cords[i].z);
        }
    }

    void showxyzf(cordsGen<? extends FourD> c) {
        System.out.println("X Y and Z cordinates ");
        for (int i = 0; i < cords.length; i++) {
            System.out.println(c.cords[i].x + " " + c.cords[i].y + " " + c.cords[i].z + " " + c.cords[i].f);
        }
    }
}
