package giaoDich;

import java.text.ParseException;
import java.util.Scanner;

public class GiaoDichVang extends GiaoDich{
        private String loaiVang;
        public GiaoDichVang(){};
        public GiaoDichVang(String loaiVang) {
            this.loaiVang = loaiVang;
        }
    @Override
    public void nhap() throws ParseException {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("--Loại vàng: ");
        loaiVang = sc.nextLine();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.printf("--Loại vàng: %s %n",loaiVang);
    }
    @Override
    public double thanhTien() {
         return getDonGia()*getSoLuong();
    }


}
