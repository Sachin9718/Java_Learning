package Ques_1.P_moving.P_LMV;

import Ques_1.Interfaces.GearEnabled;

public class Cars extends LMV implements GearEnabled {

    @Override
    public void IsGear(int desission) {
        System.out.println("Cars do have Gears");
    }

    @Override
    public int reverseGear(int GearNum) {
        if (GearNum == -1) {
            System.out.println("Car is in Reverse Gear now!");
        }
        return 0;
    }

    @Override
    public int GearUP(int GearNum) {
        if (GearNum <= 6) {
            System.out.println("Car only have 6 gears");
            return 0;
        } else {
            System.out.println("Gear is increased");
            return GearNum++;
        }
    }

    @Override
    public int GearDOWN(int GearNum) {
        if (GearNum >= 0) {
            System.out.println("Car is in Neutral Now!");
            return GearNum;
        } else {
            System.out.println("Gear is Down");
            return GearNum--;
        }
    }

}
