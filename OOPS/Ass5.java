package OOPS;

public class Ass5 {
    public static void main(String[] args) {
        Cse cseStudent = new Cse(85, 90, 88);
        cseStudent.getPercentage();

        NonCse nonCseStudent = new NonCse(75, 80, 78);
        nonCseStudent.getPercentage();
    }
}

abstract class Marks {
    int markIcp, markDsa;
    double percentage;

    abstract void getPercentage();
}

class Cse extends Marks {
    int algoDesign;

    Cse(int markICP,
            int markDSA, int algoDesign) {
        this.markDsa = markDSA;
        this.algoDesign = algoDesign;

    }

    void getPercentage() {
        int totalMarks = markIcp + markDsa + algoDesign;
         this.percentage = (totalMarks / 300.00) * 100.0;
        System.out.println("The Percentage is " + this.percentage);
    }
}

class NonCse extends Marks {
    int enggMechanics;

    NonCse(int markICP, int markDsa,
            int enggMechanics) {
        this.markIcp = markICP;
        this.markDsa = markDsa;
        this.enggMechanics = enggMechanics;
    }

    void getPercentage() {
        int totalMarks = markIcp + markDsa + enggMechanics;
         this.percentage = (totalMarks / 300.00) * 100.00;
        System.out.println("The Percentage is " + this.percentage);
    }
}