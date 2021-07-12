import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập một chuỗi bất kỳ: ");
        String str = scanner.nextLine();
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);

        }
        if (str.equals(rev)) {
            System.out.println("chuỗi palindom");
        } else {
            System.out.println("không phải chuỗi palindom");
        }
    }
}