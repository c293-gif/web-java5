import java.text.DecimalFormat;
import java.util.Scanner;

public class LapTrinhVien extends NhanVien {
    private int overtime;

    


    public LapTrinhVien() {
    }


    public LapTrinhVien(String maNv, String hoTen, int tuoi, String sdt, String email, long luongCB, int overtime) {
        super(maNv, hoTen, tuoi, sdt, email, luongCB);
        this.overtime = overtime;
    }


    public int getOvertime() {
        return overtime;
    }


    public void setOvertime(int overtime) {
        this.overtime = overtime;
    }

    public long luongLT() {
        return getLuongCB() + (overtime * 200000);
    }
    

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("nhập số giờ tăng ca: ");
        overtime = sc.nextInt();
    }

    @Override
    public void show() {
        super.show();
        System.out.println("số giờ overtime:" + overtime);
        System.out.println("tổng lương: " + formatMoney(luongLT()));
        System.out.println("---------------------------------");
    }

}
