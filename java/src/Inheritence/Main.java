package Inheritence;

public class Main {
    static void main() {
        Car A = new Car("BMW","X7",4,5,"AUTO");
        A.startEngine();
        A.startAc();
        A.stopEngine();

        MotorCycle B = new MotorCycle("Royal Enfield", "Bullet",2,"U type","Soft");
        B.startEngine();
        B.wheelie();
        B.stopEngine();
    }
}
