import java.util.ArrayList;
import java.util.Scanner;
import model.*;

public class App {
    public static void main(String[] args) throws Exception {

        // ArrayList<Teacher> list = new ArrayList<>();
        // list.add(new Teacher("Ngọc", 25, "HG", 5000000));

        // for (Teacher teacher : list) {
        //     System.out.println(teacher); 
        // }
        Address address = new Address("Hà Đông", "Hà Nội", "Việt Nam");
        Teacher teacher = new Teacher("huy", 30, address, 6000000);
        
        System.out.println(teacher.toString());
        // teacher.study();

        // ArrayList<Student> students = new ArrayList<>();
        // students.add(new Student("cuong", 20, "th", 3, 7.0, 9.8));

        // for (Student student : students) {
        //     System.out.println(student);
        // }

        // Student student1 = new Student();
        // student1.input();

        // System.out.println(student1.toString());

        // Student[] arrStudents = new Student[3];
        // for (int i = 0; i < arrStudents.length; i++) {
        //     Student student = new Student();
        //     System.out.println("nhập thông tin học viên thứ "+ (i+1));
        //     student.input();
        //     arrStudents[i] = student;
        // }

        // for (Student student : arrStudents) {
        //     System.out.println(student);
        // }

        // ArrayList<String> listName = new ArrayList<>();
        // listName.add("Ngọc");
        // listName.add("hung");
        // listName.add("Hoa");
        // listName.add("Tuấn");

        // for (String s : args) {
        //     System.out.println(s);
        // }

        // System.out.println("dánh sách sau khi thêm: ");
        // listName.add("loan");
        // for (String s : listName) {
        //     System.out.println(s);
        // }

        // listName.add(1, "mai");

        // System.out.println("dánh sách sau khi chèn");
        // for (String string : listName) {
        //     System.out.println(string);
        // }

        // listName.set(1, "son");
        // System.out.println("danh sách sau khi sửa");
        // for (String string : listName) {
        //     System.out.println(string);
        // }

        // System.out.println("số phần tử trong danh sách là: " + listName.size());

        // boolean ischeck = listName.contains("ngọc");
        // System.out.println("trong dánh sách có ngọc không: " + ischeck);
        // System.out.println("Ngọc nằm ở index: " + listName.indexOf("Ngọc"));
        // listName.add("Ngọc");
        // System.out.println("Ngọc nằm ở index: " + listName.lastIndexOf("Ngọc"));

        // System.out.println("Phần tử có index=3 là " + listName.get(3));

        // listName.remove("Ngọc");
        // System.out.println("danh sách sau khi xóa ");
        // for (String string : listName) {
        //     System.out.println(string);
        // }
        // listName.clear();

        // Scanner sc1 = new Scanner(System.in);
        // System.out.println("nhập số học sinh: ");
        // int size = sc1.nextInt();

        // ArrayList<Student> listStudents = new ArrayList<>();
        // for (int i = 0; i < size; i++) {
        //     Student student = new Student();
        //     System.out.println("nhập thông tin học viên thứ " + (i + 1));
        //     student.input();

        //     listStudents.add(student);
        // }

        // for (Student student : listStudents) {
        //     System.out.println(student);
        // }

        // sc1.nextLine();

        // System.out.println("Nhập tên muốn tìm kiếm: ");
        // String name = sc1.nextLine();

        // for (int i = 0; i < size; i++) {
        //     if (listStudents.get(i).getName().equalsIgnoreCase(name)) {
        //         System.out.println(listStudents.get(i));
        //         listStudents.remove(i);
        //     }
        // }

        // System.out.println("danh sách sau khi xóa: ");
        // for (Student student : listStudents) {
        //     System.out.println(student);
        // }

        // Person person1 = new Person();//taoj persen 1
        // // person1.name = "john";
        // // person1.age = 22;
        // // person1.address = "england";
        // person1.setName("john");
        // person1.setAge(20);
        // person1.setAddress("england");
        // // System.out.println(person1.toString());

        // System.out.println("name: " + person1.getName());
        // System.out.println("age: " + person1.getAge());
        // System.out.println("address: " + person1.getAddress());

        // person1.study("math");
        // Person.setSchool(); 

        // Person person2 = new Person();//taoj persen 2
        // person2.name = "lily";

        // person2.study("english");

        // Person person3 = new Person("jane", 25, "england");//taoj persen 3
        // System.out.println(person3.age);

        // // person1.show();

        // System.out.println(person1.toString());
        // System.out.println(person2.toString());
        // System.out.println(person3.toString());

        // Dog dog1 = new Dog();//tạo đối tượng Dog1\
        // dog1.breed = "Bulldog";
        // dog1.size = "large";
        // dog1.color = "Light Grey";
        // dog1.age = 5;

        // System.out.println(dog1);

        // dog1.eat("sit");

    }
}
