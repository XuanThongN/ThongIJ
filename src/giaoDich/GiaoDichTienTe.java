package giaoDich;

import java.text.ParseException;
import java.util.Scanner;

import static java.lang.System.*;

public class GiaoDichTienTe extends GiaoDich {
    private double tyGia;
    protected String loaiTienTe;

    public GiaoDichTienTe() {
    }

    public GiaoDichTienTe(double tyGia, String loaiTienTe) {
        super();
        this.tyGia = tyGia;
        this.loaiTienTe = loaiTienTe;
    }

    public String getLoaiTienTe() {
        return loaiTienTe;
    }

    public double getTyGia() {
        return tyGia;
    }

    @Override
    public void nhap() throws ParseException {
        Scanner sc = new Scanner(in);
        super.nhap();
        out.print("--Tỷ giá: ");
        tyGia = Double.parseDouble(sc.nextLine());
        out.print("--Loại tiền tệ (1-VN, 2-USD, 3-EURO): ");
        int chon = Integer.parseInt(sc.nextLine());
        switch (chon) {
            case 1: loaiTienTe = "VN"; break;
            case 2: loaiTienTe = "USD"; break;
            case 3: loaiTienTe = "EURO"; break;
            default:
                out.println("Loại tiền tệ đã chọn không hợp lệ!!!");
        }
    }

    @Override
    public void xuat() {
        super.xuat();
        out.printf("--Tỷ giá: %.3f %n--Loại tiền tệ: %s %n",tyGia,loaiTienTe);
    }

    @Override
    public double thanhTien() {
        double thanhTien = 0;
        if(getLoaiTienTe().equalsIgnoreCase("VN")) {
            thanhTien =  getSoLuong()*getDonGia();
        }else {
            thanhTien =  getSoLuong()*getDonGia()*getTyGia();
        }

        return thanhTien;
    }
}
