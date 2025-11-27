public class GiangVien extends Person{
    private String maGV;
    private double luongThang;

    public GiangVien(String hoTen, String diaChi, int namSinh, String maGV, double luongThang) {
        super(hoTen, diaChi, namSinh);
        this.maGV = maGV;
        this.luongThang = luongThang;
    }

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public double getLuongThang() {
        return luongThang;
    }

    public void setLuongThang(double luongThang) {
        this.luongThang = luongThang;
    }
    @Override
    public String getLoai(){
        return "Giang vien";
    }
    @Override
    public void inThongtin(){
        super.inThongtin();
        System.out.println("Ma giang vien: " + maGV);
        System.out.println("Luong thang: " + luongThang);
    }
}
