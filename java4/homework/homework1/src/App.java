import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập kích thước mảng: ");
        int n = Integer.valueOf(scanner.nextLine());
        String[] arr = new String[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("nhập thông tin phần tử %d: ", i);
            arr[i] = scanner.nextLine();
        }

        System.out.println();

        System.out.println("các phần tử đã nhập");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("phần tử %d: %s", i, arr[i] + "\n");
        }

        String a = "Java";
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(a)) {
                count++;
            }
        }
        System.out.println("Số lần java xuất hiện trong mảng là: " + count);

        System.out.println("nhập chuỗi bất kỳ:");
        String s1 = scanner.nextLine();
        for (int i = 0; i < arr.length; i++) {
            if (s1.equalsIgnoreCase(arr[i])) {
                System.out.printf("chuỗi ở vị trí : " + i);

            } //else {
            //     System.out.printf("không có trong chuỗi");

            // } // chỗ này e không làm được ạ, có cách nào để không cần phải tạo 2 vòng lặp k ạ
        }
        for (int i = 0; i < arr.length; i++) {
            if (s1.equalsIgnoreCase(arr[i])) {
                System.out.println();

            } else {
                System.out.println("chuỗi vừa nhập không có trong mảng");
                break;
            }
        }
    }
}
