import java.util.Scanner;

public class Multiarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số hàng và số cột");
        int n = sc.nextInt();
        
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("nhập phần tử thứ [%d][%d]", i, j);
                arr[i][j] = sc.nextInt();

            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[j][i] + "\t");
            }
            System.out.println();
        }
    }
}
