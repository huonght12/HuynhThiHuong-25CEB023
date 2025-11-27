
 abstract class Person {
    private String hoTen;
    private String diaChi;
    private int namSing;

    public Person(){

    }
    public Person(String hoTen, String diaChi, int namSinh) {
        this.hoTen=hoTen;
        this.diaChi=diaChi;
        this.namSing=namSinh;
    }

     public Person(String diaChi) {
         this.diaChi = diaChi;
     }

     public String getHoTen(){
        return hoTen;
    }

     public int getNamSing() {
         return namSing;
     }

     public void setHoTen(String hoTen) {
         this.hoTen = hoTen;
     }

     public void setDiaChi(String diaChi) {
         this.diaChi = diaChi;
     }

     public void setNamSing(int namSing) {
         this.namSing = namSing;
     }

     public abstract String getLoai();

    public void inThongtin(){
        System.out.println("Loai: " + getLoai());
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Dia chi: " + diaChi);
        System.out.println("Nam sinh: " + namSing);
    }


 }

