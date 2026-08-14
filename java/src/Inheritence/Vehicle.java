package Inheritence;

public class Vehicle {
    public String name;
    public String model;
    public int numOfTyre;

    Vehicle(){
        this.name = "";
        this.model = "";
        this.numOfTyre = 0;
    }

    Vehicle(String name, String model, int numOfTyre){
        this.name = name;
        this.model = model;
        this.numOfTyre = numOfTyre;
    }

    void startEngine(){
        System.out.printf("Engine is starting of %s : %s \n", name,model);
    }
    void stopEngine(){
        System.out.printf("Engine is stoping of %s : %s \n", name,model);
    }
}


