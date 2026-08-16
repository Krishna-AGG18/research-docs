package Abstraction;


interface Bird{
    void fly();
    void eat();
}


class Sparrow implements Bird{
    @Override
    public void fly(){
        System.out.println("Sparrow is flying...." );
    }

    @Override
    public void eat(){
        System.out.println("Sparrow is eating....");
    }
}
class Crow implements Bird{
    @Override
    public void fly(){
        System.out.println("Crow is flying...." );
    }

    @Override
    public void eat(){
        System.out.println("Crow is eating....");
    }
}

public class Main{
    public static void birdStuff(Bird b){
        b.eat();
        b.fly();
    }

    static void main() {
        birdStuff(new Sparrow());
        birdStuff(new Crow());
    }
}