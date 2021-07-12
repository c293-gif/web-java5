import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("nhập kích thước mảng: ");
        // int size = scanner.nextInt();
        // int[] arrNumber = new int[size];
        // for (int i = 0; i < arrNumber.length; i++) {
        //     System.out.printf("nhập phần tử thứ %d: ", i);
        //     arrNumber[i] = scanner.nextInt();
        // }

        // // arrNumber[0] = 1;
        // // arrNumber[1] = 3;
        // // arrNumber[2] = 5;
        // // arrNumber[3] = 7;
        // // arrNumber[4] = 6;
        // // arrNumber[5] = 9;

        // // for (int i = 0; i < arrNumber.length; i++) {
        // //     System.out.println(arrNumber[i]);
        // // }
        // show(arrNumber);
        // for (int i = 0; i < arrNumber.length; i++) {
        //     for (int j = i + 1; j < arrNumber.length; j++) {
        //         if (arrNumber[i] < arrNumber[j]) {
        //             int temp = arrNumber[i];
        //             arrNumber[i] = arrNumber[j];
        //             arrNumber[j] = temp;
        //         }
        //     }
        // }
        // System.out.println("mảng sau khi sắp xếp là: ");
        // // for (int i = 0; i < arrNumber.length; i++) {
        // //     System.out.println(arrNumber[i]);
        // // }
        // show(arrNumber);

        // int sum = 0;
        // for (int i = 0; i < arrNumber.length; i++) {
        //     sum += arrNumber[i];
        // }
        // System.out.println("tổng của phần tử của mảng là: " + sum);

        //  int sum1 = 0;
        // for (int i = 0; i < arrNumber.length; i++) {
        //     if (arrNumber[i] % 2 == 0) {
        //         System.out.println("các số chẵn trong mảng là:"+ arrNumber[i]);
        //         sum1 += arrNumber[i];
        //     }
        // }
        // System.out.println("tổng của các phần tử chẵn của mảng là: " + sum1);

        // arrNumber[2] = 2;
        // System.out.println("mảng sau khi sửa");
        // for (int i = 0; i < arrNumber.length; i++) {
        //     System.out.println(arrNumber[i]);
        // }
        // System.out.println("phần tử ở vị trí đầu tiên " + arrNumber[0]);
        // String[] arrString = new String[5];
        // arrString[0] = "java";
        // arrString[1] = "HTML";
        // arrString[2] = "Python";
        // arrString[3] = "RUby";
        // arrString[4] = "PHP";

        // for (int i = 0; i < arrString.length; i++) {
        //     System.out.print(arrString[i] + "\t");
        // }
        // System.out.println();
        // String name = "Trịnh Anh Cương";
        // String[] arrName = name.split("\s+");// tách chuỗi
        // for (int i = 0; i < arrName.length; i++) {
        //     System.out.printf("Phần tử ở vị trí %d: %s", i, arrName[i] + "\n");

        // }
        Person[] arraypPerson = new Person[3];//khởi tạo mảng

        for (int i = 0; i <arraypPerson.length; i++) {
            Person person = new Person();//tạo đối tượng
            person.input();//nhâj thông tin
            arraypPerson[i] = person; 
        }

        // Person person1 = new Person("A", 20, "HN"); //tạo đối tượng
        // person1.name = "a";
        // person1.age = 20;
        // person1.address = "HN";


        // Person person2 = new Person("b",100,"qn"); //tạo đối tượng
        // person2.name = "B";
        // person2.age = 90;
        // person2.address = "QN";
        
        // arraypPerson[0]= person1;
        // arraypPerson[1] = person2;
        
        for (int i = 0; i < arraypPerson.length; i++) {
            System.out.println(arraypPerson[i]);
        }
        
    }

    public static void show(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

} 

