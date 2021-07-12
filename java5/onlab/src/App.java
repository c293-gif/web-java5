import java.time.LocalDate;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("nhập tên:");
        // String str = sc.nextLine();

        // str = str.trim();
        // str = str.replaceAll("\\s+", " ");
        // str = str.toLowerCase();
        // String[] arrName = str.split("\s+");
        // for (int i = 0; i < arrName.length; i++) {

        // }

        // System.out.println("tên sau khi chuẩn hóa: " +"\n"+str);
        // Scanner sc = new Scanner(System.in);
        // System.out.println("nhập chiều dài cạnh A");
        // int A = sc.nextInt();

        // System.out.println("nhập chiều dài cạnh B");
        // int B = sc.nextInt();

        // System.out.println("nhập chiều dài cạnh C");
        // int C = sc.nextInt();

        // if (A + B > C && B + C > A && A + C > B) {
        //     if (A == B && B==C) {
        //         System.out.println("tạo thành tam giác đều");
        //     }else if (A == B || A == C || B == C) {
        //         System.out.println("tạo thành tam giác cân");
        //     }else {
        //         System.out.println("tạo thành tam giác");
        //     }
        // } else {
        //     System.out.println("không tạo thành tam giác");
        // }
        // Lottery lottery = new Lottery();
        // System.out.println("ngày hôm nay: " + lottery.date);
        // System.out.println("kết quả sổ xố hôm nay: " + lottery.number);

        // System.out.println("ngày mai là: " + lottery.date.plusDays(1));
        // System.out.println("kết quả sổ xố ngày mai: " + lottery.number1);

        // System.out.println("ngày kia là: " + lottery.date.plusDays(2));
        // System.out.println("kết quả sổ xố ngày kia: " + lottery.number2);

        // System.out.println("ngày kìa là: " + lottery.date.plusDays(3));
        // System.out.println("kết quả sổ xố ngày kìa: " + lottery.number3);

        // System.out.println("ngày xyz là: " + lottery.date.plusDays(4));
        // System.out.println("kết quả sổ xố ngày xyz: " + lottery.number4);
        LocalDate arrayDate[] = new LocalDate[5];
        LocalDate date = LocalDate.of(2021, 7, 1);

        for (int i = 0; i < arrayDate.length; i++) {
            arrayDate[i] = date.plusDays(i);
        }
        for (int i = 0; i < arrayDate.length; i++) {
            System.out.println(arrayDate[i]);
        }


        Scanner sc = new Scanner(System.in);
        System.out.println("nhập kích thước mảng arrA: ");
        int sizeA = sc.nextInt();
        int[] arrA = new int[sizeA];
        for (int i = 0; i < arrA.length; i++) {
            System.out.printf("nhập phần tử thứ %d: ", i);
            arrA[i]=sc.nextInt();
        }

        System.out.println("nhập kích thước mảng arrB: ");
        int sizeB = sc.nextInt();
        int[] arrB = new int[sizeB];
        for (int j = 0; j < arrB.length; j++) {
            System.out.printf("nhập phần tử thứ %d: ", j);
            arrB[j]=sc.nextInt();
        }
        // int[] arrA= { 1, 7, 8, 12 ,4 };
        // int[] arrB = { 3, 7, 9, 4, 0, 10, 11 };

        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arrB.length; j++) {
                if (arrA[i] == arrB[j]){
                    System.out.println(arrB[i]);
                } 
            }
        }   
        


    }

        
        
        
}

   