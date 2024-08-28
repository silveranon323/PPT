package OOPS;

class Room {
    int length;
    int breadth;

    Room(int x, int y) {
        length = x;
        breadth = y;

    }

    int area() {
        int result = length * breadth;
        return result;
    }
}

class Bedroom extends Room {
    int height;

    Bedroom(int x, int y, int z) {
        super(x, y);
        height = z;
    }

    int volume() {
        return (length * breadth * height);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Bedroom room1 = new Bedroom(10, 20, 40);
        System.out.println("Area " + room1.area()); // super class method
        System.out.println("Volume " + room1.volume()); // base class method
    }
}
