import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Chính Vũ", 20,"Hà Nội"));
        students.add(new Student("Trần Thị Thu Hoa", 21,"Hồ Chí Minh"));
        students.add(new Student("Mai Duy Hưng Thành", 23,"Quang Ninh"));
        students.add(new Student("Đinh Thế Vũ", 22,"Bắc Ninh"));
        students.add(new Student("Đào Ngọc Tùng", 23,"Ninh Bình"));
        students.add(new Student("Nguyễn Hòa Khiêm", 24,"Nghệ An"));
        students.add(new Student("Nguyễn Tuấn Sơn", 20,"Thái Bình"));
        students.add(new Student("Trịnh Công Mạnh", 25,"Điện Biên"));
        students.add(new Student("Lê Vũ Anh", 23,"Hải Phòng"));
        students.add(new Student("Tr", 21,"Thanh Hóa"));
        students.add(new Student("Mai Văn Phán", 24, "Hải Dương"));
        

        System.out.println("danh sách học viên:");
        for (Student student : students) {
            System.out.println(student);
        }

    }
}
