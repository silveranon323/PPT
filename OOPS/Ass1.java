package OOPS;

import java.util.Scanner;

class Employee {
    String name;
    int age;
    double salary;

    void setData(String name, double salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    void displayData() {
        System.out.println(name);
        System.out.println(salary);
        System.out.println(age);
    }
}

public class Ass1 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Scanner sc = new Scanner(System.in);
        e1.setData("Joseph", 65784.50, 22);
        System.out.println("Enter Your name : ");
        e2.name = sc.nextLine();
        System.out.println("Enter Your Salary : ");
        e2.salary = sc.nextDouble();
        System.out.println("Enter Your Age :");
        e2.age = sc.nextInt();
        e2.setData(e2.name, e2.salary, e2.age);
        e1.displayData();
        e2.displayData();
        String message = (e1.age > e2.age) ? e1.name + " is older" : e2.name + " is older";
        System.out.println(message);
    }
}
