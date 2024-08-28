package OOPS;

class Employee {
    String name;
    int age;

    // Constructor to initialize name and age
    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
}


class HR extends Employee {
    int Eid;
    double salary;

    // Constructor to initialize name, age, Eid, and salary
    HR(String name, int age, int Eid, double salary) {
        super(name, age);  // Calling the Employee constructor to initialize name and age
        this.Eid = Eid;
        this.salary = salary;
    }

    // Method to display HR details
    void DisplayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + Eid);
        System.out.println("Salary: " + salary);
    }
}


public class Ass4 {
    public static void main(String[] args) {
        // Creating an HR object
        HR hr1 = new HR("Hem Kishore", 22, 1001, 80000.0);
        
        // Displaying the details of the HR object
        hr1.DisplayDetails();
    }
}

