import java.util.Scanner;

public class Person {
    String name;
    int age;
    String address;
    
    

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }



    @Override
    public String toString() {
        return name + "-" + age + "-" + address;
    }



    public Person() {
    }
    

    public void input(){
            Scanner sc = new Scanner(System.in);
            System.out.println("nhập tên: ");
            name = sc.nextLine();

            System.out.println("nhập tuổi: ");
            age = Integer.valueOf(sc.nextLine());//cách sử lí trôi lệnh

            System.out.println("địa chỉ: ");
            address = sc.nextLine();
        }
}
