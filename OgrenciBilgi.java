/*
 * Ad Soyad: Şevval Ekmen
 * Ogrenci No: 250541080
 * Tarih: 05.11.2025
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 */

import java.util.Scanner;

public class OgrenciBilgi {
    public static void main(String[] args) {
        final double BASARI_ESIGI = 2.50;
        Scanner input = new Scanner(System.in);

        String ad, soyad;
        int ogrenciNo = 0, yas = 0;
        double gpa = 0.0;

        System.out.println("=== OGRENCI BILGI SISTEMI ===");

        System.out.print("Adinizi girin: ");
        ad = input.nextLine().trim();

        System.out.print("Soyadinizi girin: ");
        soyad = input.nextLine().trim();

        boolean valid = false;
        while (!valid) {
            try {
                System.out.print("Ogrenci numaraniz: ");
                ogrenciNo = Integer.parseInt(input.nextLine().trim());
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("Lutfen sadece rakam girin!");
            }
        }

        valid = false;
        while (!valid) {
            try {
                System.out.print("Yasiniz: ");
                yas = Integer.parseInt(input.nextLine().trim());
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("Lutfen sadece rakam girin!");
            }
        }

        valid = false;
        while (!valid) {
            try {
                System.out.print("GPA (0.00-4.00): ");
                gpa = Double.parseDouble(input.nextLine().trim());
                if (gpa < 0 || gpa > 4) {
                    System.out.println("0.00 ile 4.00 arasinda bir deger girin!");
                } else {
                    valid = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Lutfen ondalikli sayi girin (ornegin 3.25)!");
            }
        }

        System.out.println("\n=== OGRENCI BILGI SISTEMI ===");
        System.out.printf("Ad Soyad: %s %s%n", ad, soyad);
        System.out.printf("Ogrenci No: %d%n", ogrenciNo);
        System.out.printf("Yas: %d%n", yas);
        System.out.printf("GPA: %.2f%n", gpa);

        if (gpa >= BASARI_ESIGI) {
            System.out.println("Durum: Basarili Ogrenci");
        } else {
            System.out.println("Durum: Gelistirilebilir Ogrenci");
        }

        input.close();
    }
}
