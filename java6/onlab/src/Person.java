import java.util.Scanner;

public class Person {
    String name;
    int age;
    String address;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tên: " );
        name = sc.nextLine();
        System.out.println("nhập tuổi: ");
        age = Integer.valueOf(sc.nextInt());
        System.out.println("Nhập địa chỉ: ");
        address =sc.nextLine();
    }

    // static school= "techmaster";

    // static void setSchool() {
    //     school= "techmaster"
    // }

    public Person() {
        
    }
    public void study(String subject) {
        System.out.println(name + " study " + subject);
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
