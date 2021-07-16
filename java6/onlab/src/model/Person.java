package model;
import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private Address address;
    static String school = "cntt";

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    static void setSchool() {
        school = "techmaster";
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tên: ");
        name = sc.nextLine();
        System.out.println("nhập tuổi: ");
        age = Integer.valueOf(sc.nextLine());
    //     System.out.println("nhập đại chỉ: ");
    //     address = sc.nextLine();
     }

    public Person() {
        System.out.println("Đây là constructor mặc định");
    }

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void study(String subject) {
        System.out.println(name + " study " + subject);
    }

    @Override
    public String toString() {
        return "Person [address=" + address + ", age=" + age + ", name=" + name + ", school="+ school + "]";
    }

    public void show() {
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("address: " + address);
        System.out.println("school: " + school);
    }

    public void study() {
        System.out.println("learning english");
    }

}
    

