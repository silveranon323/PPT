package OOPS;

public class Ass6 {
    public static void main(String[] args) {
        Student student = new Student();
        
        
        student.setData("John Doe");
        
        student.display();
    }
}

interface DetailInfo {
    void display();

    int count();
}

class Student implements DetailInfo {
    static int maxCount;
    String name;

    void setData(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("The name of the student is : " + this.name);
        System.out.println("The number of characters present inside the name  : " + count());
    }

    @Override
    public int count() {
        // TODO Auto-generated method stub
        int count = (this.name).length();
        return count;
    }

}