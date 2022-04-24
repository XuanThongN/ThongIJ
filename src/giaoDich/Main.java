package giaoDich;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        QuanLyGiaoDich ql = new QuanLyGiaoDich();
        ql.nhap();
        ql.xuat();
        ql.inGiaoDichTienTe();
        System.out.printf("Trung bình thành tiền của giao dịch tiền tệ: %.3f %n",ql.TBthanhTienGiaoDichTienTe());
    }
}
