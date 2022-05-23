package quyHoachDong.file_BaiTap;

import java.util.Scanner;

public class Bai1 {
          private static final int MAX = 100;
          private static final int[] fibo = new int[MAX];
          public static void main(String[] args) {
               Scanner scan = new Scanner(System.in);
               System.out.print("Nhap so tu nhien n = ");
               int n = scan.nextInt();
               System.out.printf("fibonacci(%d) = %d\n", n, fibonacci(n));
               System.out.printf("fibonacci(%d) = %d", n, Fibonacci(n));
               scan.close();     
          }

          // Top-down

          private static int fibonacci(int n) {
                    if (n < 2) {
                              fibo [n] = n;
                    } else {
                              if (fibo[n] == 0) {
                                        fibo[n] = fibonacci(n - 1) + fibonacci(n - 2);
                              }
                    }
                    return fibo[n];
          }

          // Bottom - up

          private static int Fibonacci(int n) {
                    int f0 = 0;
                    int f1 = 1;
                    int fn = 0;
                    for (int i = 2; i <= n; i++) {
                              fn = f1 + f0;
                              f0 = f1;
                              f1 = fn;
                    }
                    return fn;
          }
}
