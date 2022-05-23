package quyHoachDong.file_BaiTap;

import java.util.Scanner;

public class Bai2 {

          private static final int MAX = 100;
          private static int[] fac = new int[MAX];
          public static void main(String[] args) {
                    Scanner scan = new Scanner(System.in);
                    System.out.print("Nhap so tu nhien n ( n >= 0 & n <= 20): = ");
                    int n = scan.nextInt();
                    System.out.printf("%d! = %d\n", n, factorial(n));
                    System.out.printf("%d! = %d", n, Factorial(n));
                    scan.close();
          }

          // Top - down
          private static int factorial(int n) {
                    if (n == 0) {
                              return fac[0] = 1;
                    } else {
                              if (fac[n] == 0) {
                                        fac[n] = factorial(n-1)*n;
                              }
                    }
                    return fac[n];
          }

          // Bottom - up

          private static int Factorial(int n) {
                    int sum = 1;
                    int i = 1;
                    while (i <= n) {
                              sum *= i;
                              i++;
                    }
                    return sum;
          }
}
