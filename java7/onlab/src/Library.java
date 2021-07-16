public class Library {
    private int maSach, soLuong, namXuatBan;
    private String tenSach, nhaXuatBan;
    private Vitri vitri;
    public Library(int maSach, String tenSach, String nhaXuatBan, int namXuatBan, int soLuong, Vitri vitri) {
        this.maSach = maSach;
        this.soLuong = soLuong;
        this.namXuatBan = namXuatBan;
        this.tenSach = tenSach;
        this.nhaXuatBan = nhaXuatBan;
        this.vitri = vitri;
    }
    public int getMaSach() {
        return maSach;
    }
    public void setMaSach(int maSach) {
        this.maSach = maSach;
    }
    public int getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public int getNamXuatBan() {
        return namXuatBan;
    }
    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }
    public String getTenSach() {
        return tenSach;
    }
    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }
    public String getNhaXuatBan() {
        return nhaXuatBan;
    }
    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }
    public Vitri getVitri() {
        return vitri;
    }

    public void setVitri(Vitri vitri) {
        this.vitri = vitri;
    }
    

    @Override
    public String toString() {
        return "mã sách " + maSach + ", tên sách " + tenSach + ", nhà xuất bản " + nhaXuatBan + ", năm xuất bản " + namXuatBan + ", số lượng " + soLuong + ", vị trí " + vitri ;
    }


    
}
