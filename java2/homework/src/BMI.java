import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập cân nặng(đơn vị kg): ");
        double kg = sc.nextDouble();
        System.out.println("nhập chiều cao(đơn vị m): ");
        double m = sc.nextDouble();
        
        double c = kg / (Math.pow(m, 2));
        
        System.out.println("chỉ số IBM: " + c);
        System.out.println("(*_^)");
    }
}