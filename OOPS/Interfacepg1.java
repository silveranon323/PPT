package OOPS;

public class Interfacepg1 {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}

interface ChessPlayer {
    void moves();

}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("Up down left right diagonal in all directions");
    }

}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("Up down left right in all directions");
    }
}