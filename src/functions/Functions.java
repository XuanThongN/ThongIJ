package functions;

import java.util.Scanner;

public class Functions {
    public boolean isPrime(int n,int i) {
        if(n<=2) return (n==2) ? true : false;
        if(n % i == 0) return false;
        if(i*i>n) return true;
        return isPrime(n, i+1);
    }

    public double giaiThua(int n) {
        if(n<=1) return (n==1 || n==0) ? 1 : 0;
        else return giaiThua(n-1)*n;
    }

    public void tinhTong() {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[100];
        System.out.println("Nhập số lượng phần tử: ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ "+i+": ");
            A[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Tổng của mảng: "+sum(A,A.length));

    }
    public int sum(int A[],int n) {
        if(n<=0) return 0;
        return sum(A,n-1) + A[n-1];
    }
    public static void main(String[] args) {
        Functions fn = new Functions();
        for (int i = 0; i < 10; i++) {
        if (fn.isPrime(i,2)) System.out.printf("%d, ",i);
        }
//        System.out.println();
//        System.out.printf("Giai thừa của %d = %.1f%n",6,fn.giaiThua(6));
//            fn.tinhTong();
        }


}
