package model;
import java.util.Scanner;

public class Student extends Person {
    private int id;
    private double theoryPoint;
    private double practicePoint;

    
    public Student(String name, int age, Address address, int id, double theoryPoint, double practicePoint) {
        super(name, age, address);
        this.id = id;
        this.theoryPoint = theoryPoint;
        this.practicePoint = practicePoint;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public double getTheoryPoint() {
        return theoryPoint;
    }


    public void setTheoryPoint(double theoryPoint) {
        this.theoryPoint = theoryPoint;
    }


    public double getPracticePoint() {
        return practicePoint;
    }


    public void setPracticePoint(double practicePoint) {
        this.practicePoint = practicePoint;
    }


    public double gpa() { 
        return (theoryPoint + practicePoint) / 2;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+ " - " + id + " - " + theoryPoint + " - " + practicePoint + " - " + gpa();
    }


    // public int getId() {
    //     return id;
    // }

    // public void setId(int id) {
    //     this.id = id;
    // }

    // public String getName() {
    //     return name;
    // }

    // public void setName(String name) {
    //     this.name = name;
    // }

    // public double getTheoryPoint() {
    //     return theoryPoint;
    // }

    // public void setTheoryPoint(double theoryPoint) {
    //     this.theoryPoint = theoryPoint;
    // }

    // public double getPracticePoint() {
    //     return practicePoint;
    // }

    // public void setPracticePoint(double practicePoint) {
    //     this.practicePoint = practicePoint;
    // }

    // public Student(int id, String name, double theoryPoint, double practicePoint) {
    //     this.id = id;
    //     this.name = name;
    //     this.theoryPoint = theoryPoint;
    //     this.practicePoint = practicePoint;
    // }

    // public Student() {
    // }

    // public void input() {
    //     Scanner scanner = new Scanner(System.in);
    //     System.out.println("nhập id: ");
    //     id = Integer.valueOf(scanner.nextLine());
    //     System.out.println("nhập tên: ");
    //     name = scanner.nextLine();
    //     System.out.println("Điểm lí thuyết: ");
    //     theoryPoint = scanner.nextDouble();
    //     System.out.println("Điểm thực hành: ");
    //     practicePoint = scanner.nextDouble();

    // }

    // public double gpa() { 
    //     return (theoryPoint + practicePoint) / 2;
    // }


    // @Override
    // public String toString() {
    //     return "Student [id=" + id + ", name=" + name + ", practicePoint=" + practicePoint + ", theoryPoint="
    //             + theoryPoint + ", GPA=" + gpa() + ", school="+ school + "]";
    // }

    
    
}
