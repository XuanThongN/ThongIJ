package stdioHueExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise_1 {
    Scanner sc = new Scanner(System.in);
    public void mang2Chieu() {
        int n=0,m=0,sum = 0;
        System.out.print("Nhập số hàng n: ");
        n = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập số cột m: ");
        m = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập dữ liệu mảng: ");
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("arr[%d][%d]= ",i,j);
                arr[i][j] = Integer.parseInt(sc.nextLine());
                sum += arr[i][j];
            }
        }
        System.out.println("Tổng mảng = "+sum);
        List<Integer> soNguyenToList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int a = arr[i][j];
                for (int k = 2; k <= Math.sqrt(arr[i][j]); k++) {
                    if(a>=2&&a%k!=0) soNguyenToList.add(a); break;
                }

            }

        }
        do {
        System.out.print("Số các số nguyên tố đầu tiên muốn hiển thị: ");
        n = Integer.parseInt(sc.nextLine());
        if(n>soNguyenToList.size()) System.out.printf("Không được vượt quá %d . Nhập lại! %n", soNguyenToList.size());
        } while(n>soNguyenToList.size());
        for (int i = 0; i < n; i++) {
            System.out.print(soNguyenToList.get(i)+", ");
        }
    }
    public void timChuoiTrongChuoi() {
        System.out.print("Nhập chuỗi s1: ");
        String s1 = sc.nextLine();
        System.out.print("Nhập chuỗi s2: ");
        String s2 = sc.nextLine();
        boolean found = false;
        int i = s1.toUpperCase().indexOf(s2.toUpperCase(),0);
        if (i>=0) System.out.printf("s2 xuất hiện đầu tiên trong s1 tại vị trí %d %n",i);
        else System.out.println("Không tìm thấy s2 trong s1");
    }
    public void daoNguocChuoi() {
        System.out.print("Nhập chuỗi s: ");
        String s = sc.nextLine();
//        System.out.println("Chuỗi sau khi đảo ngược: "+new StringBuilder(s).reverse().toString());
        char[] subS = s.toCharArray();
        int j = 0;
        System.out.println("Chuỗi sau khi đảo ngươc: ");
        for (int i = subS.length-1; i >= 0 ; i--) {
//            System.out.print(subS[i]);
            subS[i] = s.charAt(j);
            j++;
        }
        s = String.copyValueOf(subS);
        System.out.println(s);
//        int begin = 0, end = subS.length-1;
//        char temp;
//        for (int i = 0; i <= end ; i++) {
//            temp = subS[begin];
//            subS[begin] = subS[end];
//            subS[end] = temp;
//            begin++;end--;
//        }
//        System.out.println(new String(subS));
    }

    public static void main(String[] args) {
        Exercise_1 ex = new Exercise_1();
//        ex.mang2Chieu();
//        ex.timChuoiTrongChuoi();
        ex.daoNguocChuoi();
    }
}
