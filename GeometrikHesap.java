/*
 * Ad Soyad: Şevval Ekmen
 * Ogrenci No: 250541080
 * Tarih: 05.11.2025
 * Aciklama: Gorev 2 - Geometrik Hesaplayici
 * 
 * Bu program kullanicidan dairenin yaricapini alir ve
 * daire ile kureye ait temel geometrik hesaplamalari yapar.
 */

import java.util.Scanner;

public class GeometrikHesap {
    public static void main(String[] args) {
        final double PI = 3.14159;

        Scanner input = new Scanner(System.in);

        double yaricap;
        double daireAlani, daireCevresi, daireCapi;
        double kureHacmi, kureYuzeyAlani;

        System.out.println("=== GEOMETRIK HESAPLAYICI ===");
        System.out.print("Dairenin yaricapini girin (cm): ");
        yaricap = input.nextDouble();

        // Hesaplamalar
        daireAlani = PI * Math.pow(yaricap, 2);
        daireCevresi = 2 * PI * yaricap;
        daireCapi = 2 * yaricap;
        kureHacmi = (4.0 / 3.0) * PI * Math.pow(yaricap, 3);
        kureYuzeyAlani = 4 * PI * Math.pow(yaricap, 2);

        // Sonuçlari yazdirma
        System.out.println("SONUCLAR:");
        System.out.println("----------");
        System.out.printf("Daire Alani        : %.2f cm^2%n", daireAlani);
        System.out.printf("Daire Cevresi      : %.2f cm%n", daireCevresi);
        System.out.printf("Daire Capi         : %.2f cm%n", daireCapi);
        System.out.printf("Kure Hacmi         : %.2f cm^3%n", kureHacmi);
        System.out.printf("Kure Yuzey Alani   : %.2f cm^2%n", kureYuzeyAlani);

        input.close();
    }
}

