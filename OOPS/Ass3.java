package OOPS;

class Deposit {
    long Principal;
    int Time;
    double Rate, TotalAmt;

    Deposit() {
        this.Principal = 0;
        this.Time = 0;
        this.Rate = 0;
        this.TotalAmt = 0;

    }

    Deposit(long principal, int time, double rate) {
        this.Principal = principal;
        this.Time = time;
        this.Rate = rate;
    }

    Deposit(long principal, int time) {
        this.Principal = principal;
        this.Time = time;
        this.Rate = 0.5;
    }

    Deposit(long principal, double rate) {
        this.Principal = principal;
        this.Time = 1;
        this.Rate = rate;
    }

    void calcAmnt() {
        this.TotalAmt = this.Principal + (this.Principal * this.Rate * this.Time) / 100;
        System.out.println("The Total Amount is " + TotalAmt);
    }

    void display() {
        System.out.println("Principal: " + this.Principal);
        System.out.println("Time: " + this.Time + " years");
        System.out.println("Rate: " + this.Rate + "%");
        System.out.println("Total Amount: " + this.TotalAmt);
        System.out.println("----------------------------");
    }
}

public class Ass3 {
    public static void main(String[] args) {
        Deposit d1 = new Deposit(50000,5,0.5);
        d1.calcAmnt();
        d1.display();
    }
}
