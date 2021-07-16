public class SchoolBook extends Library {
    private int soTrang, soLuongMuon;
    private String tinhTrang;




    public SchoolBook(int maSach, String tenSach, String nhaXuatBan, int namXuatBan, int soLuong, Vitri vitri,
            int soTrang, int soLuongMuon, String tinhTrang) {
        super(maSach, tenSach, nhaXuatBan, namXuatBan, soLuong, vitri);
        this.soTrang = soTrang;
        this.soLuongMuon = soLuongMuon;
        this.tinhTrang = tinhTrang;
    }




    public int getSoTrang() {
        return soTrang;
    }




    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }




    public int getSoLuongMuon() {
        return soLuongMuon;
    }




    public void setSoLuongMuon(int soLuongMuon) {
        this.soLuongMuon = soLuongMuon;
    }




    public String getTinhTrang() {
        return tinhTrang;
    }




    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public int tinhtonkho() {
        return getSoLuong() - soLuongMuon;
    }

    

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + ", số trang " + soTrang + ", tình trạng " + tinhTrang + ", soluongmuon " + soLuongMuon + ", tồn kho " + tinhtonkho();
    }
    
}
