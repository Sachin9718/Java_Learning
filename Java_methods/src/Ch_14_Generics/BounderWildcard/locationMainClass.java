package Ch_14_Generics.BounderWildcard;

public class locationMainClass {
    public static void main(String[] args) {
        // creating twod genric
        TwoD td[] = {
            new TwoD(5, 6),
            new TwoD(7, 8),
            new TwoD(90,10)
        };

        cordsGen<TwoD> tdlocks = new cordsGen<TwoD>(td);
        System.out.println("Cordinates of twoD");
        
        tdlocks.showXY(tdlocks);
        // tdlocks.showXYZ(tdlocks);      // cannot call because of its TwoD


        FourD fd[] = {
            new FourD(10, 15, 20, 25),
            new FourD(20, 25, 20, 25),
            new FourD(30, 35, 30, 35)
        };

        cordsGen<FourD> tdlocks2 = new cordsGen<FourD>(fd);
        System.out.println("Cordinates of FourD");

        tdlocks2.showxyzf(tdlocks2);

    }
} 
