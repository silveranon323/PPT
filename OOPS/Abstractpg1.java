package OOPS;

public class Abstractpg1 {
    public static void main(String[] args) {
        Horse H1 = new Horse();
        H1.eat();
        H1.walk();
        Chicken c1 = new Chicken();
        c1.eat();
        c1.walk();
        H1.changeColor();
        c1.changeColor();
        System.out.println(H1.color);
        System.out.println(c1.color);
    }
}

abstract class Animal {
    String color;
    Animal(){
        color="brown";
    }
    void eat() {
        System.out.println("Animal eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    void walk() {
        System.out.println("Walks on four legs");
    }
    void changeColor(){
        color="Black";
    }
}

class Chicken extends Animal {
    void walk() {
        System.out.println("Walks on two legs");
    }
    void changeColor(){
        color="White";
    }
}