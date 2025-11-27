public class SinhVien extends Person{
    private String maSV;
    private double diemTB;

    public SinhVien() {
        this.maSV = maSV;
        this.diemTB = diemTB;
    }

    public SinhVien(String hoTen, String diaChi, int namSinh, String maSV, double diemTB) {
        super(hoTen, diaChi, namSinh);
        this.maSV = maSV;
        this.diemTB = diemTB;
    }

    public SinhVien(String diaChi, String maSV, double diemTB) {
        super(diaChi);
        this.maSV = maSV;
        this.diemTB = diemTB;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }
    @Override
    public String getLoai(){
        return "Sinh vien";
    }
    @Override
    public void inThongtin(){
        super.inThongtin();
        System.out.println("ma Sinh vien: " + maSV);
        System.out.println("Diem trung binh: " + diemTB);
    }
}
