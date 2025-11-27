public class TestPerson {
    public static void main(String[] args){
        Person[] ds = new Person[5];

        ds[0] = new SinhVien("Nguyen Van A", "Ha Noi", 2003, "SV001", 8.5);
        ds[1] = new SinhVien("Huynh Thi Huong", "Quang Nam", 2007, "25CEB023", 9.0);
        ds[2] = new SinhVien("Le Van C", "Ho Chi Minh", 2003, "SV003", 7.8);

        ds[3] = new GiangVien("Pham Thi D", "Ha Noi", 1985, "GV001", 15000000);
        ds[4] = new GiangVien("Hoang Van E", "Hai Phong", 1980, "GV002", 18000000);

        System.out.println("==== DANH SACH THONG TIN====");
        for (int i = 0; i < ds.length; i++){
            ds[i].inThongtin();
            System.out.println("--------------------------------");
        }
    }

}
