package Ques_1.Interfaces;

public interface SteerableCar extends AcEnabledCars,ElectricVehicleFunctions {
    public void steerLEFT();
    public void steerRIGHT();
    public void goSLOW();
    public void goFAST();

}
