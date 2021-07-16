import java.text.DecimalFormat;
import java.util.Scanner;

public class NhanVien {
    private String maNv, hoTen, email, sdt;
    private int tuoi;
    private long luongCB;


    public String getMaNv() {
        return maNv;
    }
    public void setMaNv(String maNv) {
        this.maNv = maNv;
    }
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSdt() {
        return sdt;
    }
    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    public int getTuoi() {
        return tuoi;
    }
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    public long getLuongCB() {
        return luongCB;
    }

    public void setLuongCB(long luongCB) {
        this.luongCB = luongCB;
    }

    public static String formatMoney(long money) {
        DecimalFormat formatter = new DecimalFormat("###,###,##0.00");
        //100000->100,000.00
        return formatter.format(money);

    }
    

    
    

    public NhanVien() {
    }


    public NhanVien(String maNv, String hoTen, int tuoi, String sdt, String email, long luongCB) {
        this.maNv = maNv;
        this.hoTen = hoTen;
        this.email = email;
        this.sdt = sdt;
        this.tuoi = tuoi;
        this.luongCB = luongCB;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập mã nhân viên: ");
        maNv = sc.nextLine();
        System.out.println("nhập họ tên nhân viên: ");
        hoTen = sc.nextLine();
        System.out.println("nhập tuổi của nhân viên: ");
        tuoi = Integer.valueOf(sc.nextLine());
        System.out.println("nhập số điện thoại của nhân viên: ");
        sdt = sc.nextLine();
        System.out.println("nhập email của nhân viên: ");
        email = sc.nextLine();
        System.out.println("nhập lương cơ bản của nhân viên: ");
        luongCB = Long.valueOf(sc.nextLine());

    }
    
    
    public void show() {
        System.out.println("Mã nhân viên: " + maNv);
        System.out.println("Họ Tên: " + hoTen);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Số điện thoại: " + sdt);
        System.out.println("email :" + email);
        System.out.println("Lương cơ bản: " + formatMoney(luongCB));
    }
}
