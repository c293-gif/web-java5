import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số Lập Trình Viên cần quản lí: ");
        int ltv = sc.nextInt();
        ArrayList<LapTrinhVien> listLTV = new ArrayList<>();
        for (int i = 0; i < ltv; i++) {
            LapTrinhVien laptrinhvien = new LapTrinhVien();
            System.out.println("Lập trình viên " + (i + 1));
            laptrinhvien.input();
            listLTV.add(laptrinhvien);
        }
        
        

        System.out.println("nhập số Kiểm Chứng Viên cần quản lí: ");
        int kcv = sc.nextInt();
        ArrayList<KiemChungVien> listKCV = new ArrayList<>();
        for (int i = 0; i < kcv; i++) {
            KiemChungVien kiemchungvien = new KiemChungVien();
            System.out.println("kiểm chứng viên " + (i + 1));
            kiemchungvien.input();
            listKCV.add(kiemchungvien);
        }


        System.out.println("danh sách nhân viên: ");
        System.out.println("danh sách lập trình viên: ");
        for (LapTrinhVien laptrinhvien : listLTV) {
            laptrinhvien.show();
        }
        System.out.println("dánh sách Kiểm Chứng Viên: ");
        for (KiemChungVien kiemChungVien : listKCV) {
            kiemChungVien.show();
        }
    }
}
