package Inheritence;

public class Car extends Vehicle{
    public int numOfDoors;
    public String transmissionType;

    Car(String name, String model, int numOfTyre, int numOfDoors, String transmissionType){
        super(name, model, numOfTyre);
        this.numOfDoors = numOfDoors;
        this.transmissionType = transmissionType;
    }

    void startAc(){
        System.out.println("Ac Started of " + name);
    }
}
