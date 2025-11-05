/*
 * Ad Soyad: Şevval Ekmen
 * Ogrenci No: 250541080
 * Tarih: 05.11.2025
 * Aciklama: Gorev 3 - Maas Bordrosu Hesaplayici
 * 
 * Bu program kullanicidan calisan bilgilerini alir ve 
 * gelir, kesinti ve net maas hesaplamalarini yaparak 
 * detayli bir maas bordrosu olusturur.
 */

import java.util.Scanner;

public class MaasHesap {
    public static void main(String[] args) {
        final double SGK_ORANI = 0.14;
        final double GELIR_VERGISI_ORANI = 0.15;
        final double DAMGA_VERGISI_ORANI = 0.00759;

        Scanner input = new Scanner(System.in);

        String adSoyad;
        double brutMaas;
        int haftalikSaat, mesaiSaat;

        System.out.println("====================================");
        System.out.println("           MAAS BORDROSU");
        System.out.println("====================================");

        System.out.print("Calisanin ad soyadini giriniz: ");
        adSoyad = input.nextLine();

        System.out.print("Aylik brut maas (TL): ");
        brutMaas = input.nextDouble();

        System.out.print("Haftalik calisma saati: ");
        haftalikSaat = input.nextInt();

        System.out.print("Mesai saati sayisi: ");
        mesaiSaat = input.nextInt();

        // Hesaplamalar
        double mesaiUcreti = (brutMaas / 160) * mesaiSaat * 1.5;
        double toplamGelir = brutMaas + mesaiUcreti;

        double sgkKesinti = toplamGelir * SGK_ORANI;
        double gelirVergisi = toplamGelir * GELIR_VERGISI_ORANI;
        double damgaVergisi = toplamGelir * DAMGA_VERGISI_ORANI;
        double toplamKesinti = sgkKesinti + gelirVergisi + damgaVergisi;

        double netMaas = toplamGelir - toplamKesinti;

        // Ek istatistikler
        double kesintiOrani = (toplamKesinti / toplamGelir) * 100;
        double saatlikNetKazanc = netMaas / 176;
        double gunlukNetKazanc = netMaas / 22;

        // Cikti
        System.out.println("\n====================================");
        System.out.println("MAAS BORDROSU");
        System.out.println("====================================");
        System.out.printf("Calisan: %s%n", adSoyad);

        System.out.println("\nGELIRLER:");
        System.out.printf("Brut Maas              : %.2f TL%n", brutMaas);
        System.out.printf("Mesai Ucreti (%d saat) : %.2f TL%n", mesaiSaat, mesaiUcreti);
        System.out.println("------------------------");
        System.out.printf("TOPLAM GELIR           : %.2f TL%n", toplamGelir);

        System.out.println("\nKESINTILER:");
        System.out.printf("SGK Kesintisi (%.1f%%)     : %.2f TL%n", SGK_ORANI * 100, sgkKesinti);
        System.out.printf("Gelir Vergisi (%.1f%%)    : %.2f TL%n", GELIR_VERGISI_ORANI * 100, gelirVergisi);
        System.out.printf("Damga Vergisi (%.1f%%)    : %.2f TL%n", DAMGA_VERGISI_ORANI * 100, damgaVergisi);
        System.out.println("------------------------");
        System.out.printf("TOPLAM KESINTI         : %.2f TL%n", toplamKesinti);

        System.out.println("\nNET MAAS               : " + String.format("%.2f TL", netMaas));

        System.out.println("\nISTATISTIKLER:");
        System.out.printf("Kesinti Orani          : %.1f%%%n", kesintiOrani);
        System.out.printf("Saatlik Net Kazanc     : %.2f TL%n", saatlikNetKazanc);
        System.out.printf("Gunluk Net Kazanc      : %.2f TL%n", gunlukNetKazanc);
        System.out.println("====================================");

        input.close();
    }
}

