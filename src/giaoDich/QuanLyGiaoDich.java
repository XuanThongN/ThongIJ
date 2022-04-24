package giaoDich;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyGiaoDich {
    ArrayList<GiaoDich> arrGiaoDich = new ArrayList<>();
    GiaoDich giaoDich;
    String loaiGiaoDich;
    int soGiaoDich;

    public void setLoaiGiaoDich(String loaiGiaoDich) {
        this.loaiGiaoDich = loaiGiaoDich;
    }

    public void nhap() throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng giao dịch : ");
        soGiaoDich = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < soGiaoDich; i++) {
            System.out.println("Nhập thông tin giao dịch thứ " + (i + 1) + " : ");
            System.out.print("--Chọn loại giao dịch(1-Tiền tệ, 2-Vàng): ");
            int chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    setLoaiGiaoDich("Giao dịch tiền tệ");
                    giaoDich = new GiaoDichTienTe();
                    giaoDich.nhap();
                    arrGiaoDich.add(giaoDich);
                    break;
                case 2:
                    setLoaiGiaoDich("Giao dịch vàng");
                    giaoDich = new GiaoDichVang();
                    giaoDich.nhap();
                    arrGiaoDich.add(giaoDich);
                    break;
                default:
                    System.out.println("Loại giao dịch đã chọn không hợp lệ!!!");
            }
        }
    }

    public void xuat() {
        System.out.println("Danh sách các giao dịch");
        for (GiaoDich a : arrGiaoDich) {
            a.xuat();
            System.out.printf("--Loại giao dịch: %s %n--Thành tiền: %.3f %n",loaiGiaoDich, a.thanhTien());
            System.out.println("--------------------------");
        }
    }

    public void inGiaoDichTienTe() {
        System.out.println("In ra giao dịch tiền tệ");
        int num =0;
        for (GiaoDich a : arrGiaoDich) {
            if (a.getClass() == GiaoDichTienTe.class) {
                num++;
                a.xuat();
                System.out.printf("--Thành tiền: %.3f %n",a.thanhTien());
                System.out.printf("-------------%d------------%n",num);
            }
        }
        System.out.printf("Danh sách này gồm %d giao dịch %n",num);

    }

    public double TBthanhTienGiaoDichTienTe() {
        double tongThanhTien = 0, tbThanhTien;
        int count =0;
        for (GiaoDich a : arrGiaoDich) {
            if (a.getClass() == GiaoDichTienTe.class) {
                count++;
                tongThanhTien += a.thanhTien();
            }
        }
        tbThanhTien = tongThanhTien / count ;
        return tbThanhTien;

    }

}
