import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int a = 11;
        int b = 6;

        if (a < b) {
            int c = a + b;
            System.out.println("c= " + c);

        } else {
            int d = a - b;
            System.out.println("d= " + d);
        }
        if (a == b) {
            System.out.println("a bằng b");
        }
        if (a % 2 == 0) {
            System.out.println("a là số chẵn");
        } else {
            System.out.println("a là số lẻ");
        }

        /* Scanner sc = new Scanner(System.in);
         
         int n = scanner.nextin();
        
          int h=scanner.nextin();
        
         double bmi= n/h;
          if(bmi<18.5);
         {
         
          }*/
        /* Scanner ab = new Scanner(System.in);
        System.out.println("nhập tháng :");
        int number = ab.nextInt();
        
        switch (number) {
            case 1, 3, 7, 9, 11:
                System.out.println("tháng có 31 ngày");
                break;
            case 4, 6, 8, 10, 12:
                System.out.println("tháng có 30 ngày");
            case 2:
                System.out.println("tháng có 28 hoặc 29 ngày");
        }*/
        /* for (int i = 0; i < 10; i++) {
          if (i%2==0)
              System.out.println(i);
        }*/
        /* for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzbuzz");
            }else
        
            if (i % 3 == 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } 
             else {
                System.out.println(i);
            }
        
        }*/
        String str = "hello";
        // for (int i = str.length()-1; i >= 0; i--) {
        //     System.out.println(str.charAt(i));
        // }
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'l') {
                count++;
            }

        }
         System.out.println("số lần chữ l xuất hiện =" + count);
    }
    
    
}
