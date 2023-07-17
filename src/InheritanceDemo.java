import java.util.SortedMap;

public class InheritanceDemo {

    public static void main(String[] args) {
        Dogs d1 = new Dogs();
        d1.move();

    }
}
class Animal{
    String type;

    void breathe(){
        System.out.println("Animal is breathing");
    }

    void eat(){
        System.out.println("Animal is eating");
    }

    void sleep(){
        System.out.println("Animal is sleeping");
    }

    void move(){
        System.out.println("Animal is moving");
    }
}

class Dogs extends Animal{
    @Override
    void move() {
        System.out.println("Dog is moving");
        //Objects of other non parent class can only be created using inside function
        //It concludes in a has-a relationship
        Human f1 = new Human();
        f1.play();
    }

    @Override
    void breathe(){
        System.out.println("Dog is breathing");
    }

    @Override
    void eat(){
        System.out.println("Dog is eating");
    }

    @Override
    void sleep(){
        System.out.println("Dog is sleeping");
    }


}

class Human{
    void play(){
        System.out.println("Human Playing");
    }
}