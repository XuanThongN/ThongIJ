package giaoDich;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class GiaoDich {
        private String maGiaoDich;
        private Date ngayGiaoDich;
        private double donGia;
        private int soLuong;
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        public GiaoDich(){};
        public GiaoDich(String maGiaoDich, Date ngayGiaoDich, double donGia, int soLuong) {
            this.maGiaoDich = maGiaoDich;
            this.ngayGiaoDich = ngayGiaoDich;
            this.donGia = donGia;
            this.soLuong = soLuong;
        }

    public double getDonGia() {
        return donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public  void nhap() throws ParseException {
            Scanner sc = new Scanner(System.in);
            System.out.print("--Mã giao dịch: ");
            maGiaoDich = sc.nextLine();
            System.out.print("--Ngày giao dịch: ");
            ngayGiaoDich = f.parse(sc.nextLine());
            System.out.print("--Đơn giá: ");
            donGia = Double.parseDouble(sc.nextLine());
            System.out.print("--Số lương: ");
            soLuong = Integer.parseInt(sc.nextLine());

        }
        public void xuat() {
            System.out.printf("--Mã giao dịch: %s %n--Ngày giao dịch: %s %n--Đơn giá: %.3f %n--Số lương: %d %n",maGiaoDich,f.format(ngayGiaoDich),donGia,soLuong);
        }
        public double thanhTien(){
            return 0;
        }


}
