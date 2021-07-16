import java.util.Scanner;

public class KiemChungVien extends NhanVien {
    private int loi;


    


    
    public KiemChungVien() {
    }



    public KiemChungVien(String maNv, String hoTen, int tuoi, String sdt, String email, long luongCB, int loi) {
        super(maNv, hoTen, tuoi, sdt, email, luongCB);
        this.loi = loi;
    }



    public int getLoi() {
        return loi;
    }



    public void setLoi(int loi) {
        this.loi = loi;
    }


    
    public long luongKC() {
        return getLuongCB() + (loi * 50000);
    }


    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("nhập số lỗi phát hiện:");
        loi = sc.nextInt();
    }

    @Override
    public void show() {
        super.show();
        System.out.println("số lỗi phát hiện:" + loi);
        System.out.println("tổng lương: " + formatMoney(luongKC()));
        System.out.println("---------------------------------");
    }

}
