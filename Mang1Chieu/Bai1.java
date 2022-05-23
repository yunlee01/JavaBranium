package Mang1Chieu;

import java.util.Scanner;

class Bai1 {
         
          private static short inputNumberFriends(Scanner scan) {
                    short n;
                    do {
                              n = Short.parseShort(scan.nextLine());
                    } while (n <= 0);
                    return n;
          }

          private static String[] inputNameFriends(Scanner scan, short n) {
                    String[] listFriends = new String[n];
                    
                    for (int i = 0; i < listFriends.length; i++) {
                              System.out.print("Nhap ten nguoi ban thu " + (i + 1) + ": ");
                              listFriends[i] = scan.nextLine();
                    }
                    return listFriends;
          }

          private static int findMaxLenghtName(String[] listFriends) {
                    int maxLenght = 0;
                    for (String name : listFriends) {
                              if (name.length() > maxLenght) {
                                        maxLenght = name.length();
                              }
                    }
                    return maxLenght;
          }

          private static void outputName(String[] listFriends, int maxLenght) {
                    for (String name : listFriends) {
                              if (name.length() == maxLenght) {
                                        System.out.print(name + " ");
                              }
                    }
          }

          public static void main(String[] args) {
                    Scanner scan = new Scanner(System.in);
                    System.out.print("Nhap so nguoi ban cua ban: n = ");
                    short n = inputNumberFriends(scan);
                    String[] listFriends = inputNameFriends(scan, n);
                    int maxLenght = findMaxLenghtName(listFriends);
                    System.out.print("Nguoi ban co ten dai nhat la: ");
                    outputName(listFriends, maxLenght);
          }

}