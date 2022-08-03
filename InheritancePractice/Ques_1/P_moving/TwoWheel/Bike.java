package Ques_1.P_moving.TwoWheel;

import Ques_1.Interfaces.GearEnabled;

public class Bike extends TwoWheeler implements GearEnabled{

    @Override
    public void IsGear(int desission) {
        System.out.println("Bike do have Gears");
    }

    @Override
    public int reverseGear(int GearNum) {
        System.out.println("Bikes don't have Reverse Gear");
        return 0;
    }

    @Override
    public int GearUP(int GearNum) {
        if(GearNum <= 4){
            System.out.println("Bike only have 4 gears");
            return 0;
        }
        else{
            System.out.println("Gear is increased");
            return GearNum++;
        }
    }

    @Override
    public int GearDOWN(int GearNum) {
        if(GearNum>=0){
            System.out.println("No response, There is no -1 gear");
            return GearNum;
        }
        else{
            System.out.println("Gear is Down");
            return GearNum--;
        }
    }
    
}
