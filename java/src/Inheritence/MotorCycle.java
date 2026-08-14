package Inheritence;

public class MotorCycle extends Vehicle {
    public String handleBarStyle;
    public String suspensionType;

    MotorCycle(String name, String model, int numOfTyre, String handleBarStyle, String suspensionType){
        super(name, model, numOfTyre);
        this.suspensionType = suspensionType;
        this.handleBarStyle = handleBarStyle;
    }

    public void wheelie(){
        System.out.println("Motorcycle doing wheelie .... ");
    }
}
