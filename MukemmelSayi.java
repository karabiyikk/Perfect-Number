package Donguler;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi, toplam = 0;
        System.out.print("Sayı Giriniz : ");
        sayi = input.nextInt();

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }
        if (toplam == sayi) {
            System.out.println("Girilen Sayı Mükemmeldir");
        } else {
            System.out.println("Girilen Sayı Mükemmel Değildir");
        }
    }
}
