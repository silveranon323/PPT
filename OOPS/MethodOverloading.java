package OOPS;

class Room {
    float length;
    float breadth;

    Room(float x, float y) {
        length = x;
        breadth = y;
    }

    Room(float x) {
        length = breadth = x;
    }

    float area() {
        return length * breadth;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Room r1 = new Room(10, 20);
        Room r2 = new Room(30);
        System.out.println(r1.area());
        System.out.println(r2.area());

    }
}
