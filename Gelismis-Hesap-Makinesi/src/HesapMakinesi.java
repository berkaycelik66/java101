import java.util.Scanner;

public class HesapMakinesi {
    public static void toplama() {
        Scanner scan = new Scanner(System.in);
        int sayi;
        int sonuc = 0;

        do {
            System.out.print("Sayi Giriniz(0:Cıkış): ");
            sayi = scan.nextInt();
            sonuc = sonuc + sayi;
        } while (sayi != 0);

        System.out.println("Girdiğiniz Sayıların Toplamı: " + sonuc);
    }

    public static void cikarma() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz: ");
        int adet = scan.nextInt();
        int sayi;
        int sonuc = 0;

        for (int i = 1; i <= adet; i++) {
            System.out.print("Sayı Giriniz: ");
            sayi = scan.nextInt();

            if (i == 1) {
                sonuc = sonuc + sayi;
            } else {
                sonuc = sonuc - sayi;
            }
        }

        System.out.println("Sonuc: " + sonuc);
    }

    public static void carpma() {
        Scanner scan = new Scanner(System.in);
        int sayi, sonuc = 1;

        while (true) {
            System.out.print("Sayı Giriniz: ");
            sayi = scan.nextInt();

            if (sayi == 1)
                break;

            if (sayi == 0) {
                sonuc = 0;
                break;
            }
            sonuc *= sayi;
        }

        System.out.println("Sonuç : " + sonuc);
    }

    public static void bolme() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz: ");
        int adet = scan.nextInt();
        double sayi, sonuc = 0.0;

        for (int i = 1; i <= adet; i++) {
            System.out.print(i + ". sayı :");
            sayi = scan.nextDouble();
            if (i != 1 && sayi == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                sonuc = sayi;
                continue;
            }
            sonuc /= sayi;
        }

        System.out.println("Sonuç : " + sonuc);
    }

    public static void usHesapla() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban Değerini Giriniz: ");
        int taban = scan.nextInt();

        System.out.print("Üs Değerini Giriniz: ");
        int us = scan.nextInt();

        int sonuc = 1;

        for (int i = 1; i <= us; i++) {
            sonuc = sonuc * taban;
        }
        System.out.println(taban + " üssü " + us + " = " + sonuc);
    }

    public static void faktoriyel() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Faktöriyelini almak Istediğiniz Sayıyı Giriniz: ");
        int sayi = scan.nextInt();
        int sonuc = 1;

        for (int i = sayi; i > 0; i--) {
            sonuc = sonuc * i;
        }

        System.out.println("Sonuç: " + sonuc);
    }

    public static void modAl() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Modu Alınacak Sayıyı Giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.print("Modu Giriniz: ");
        int mod = scan.nextInt();

        System.out.println("Sonuc: " + (sayi1 % mod));
    }

    public static void dikdortgen() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kısa Kenarı Giriniz: ");
        int kisaKenar = scan.nextInt();
        System.out.print("Uzun Kenarı Giriniz: ");
        int uzunKenar = scan.nextInt();

        System.out.println("Dikdörtgenin Çevresi: " + 2 * (uzunKenar + kisaKenar));
        System.out.println("Dikdörtgenin Alanı: " + (uzunKenar * kisaKenar));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secim;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        System.out.println(menu);
        do {
            System.out.println();
            System.out.print("Seçiminizi Yapın: ");
            secim = input.nextInt();

            switch (secim) {
                case 1:
                    toplama();
                    break;
                case 2:
                    cikarma();
                    break;
                case 3:
                    carpma();
                    break;
                case 4:
                    bolme();
                    break;
                case 5:
                    usHesapla();
                    break;
                case 6:
                    faktoriyel();
                    break;
                case 7:
                    modAl();
                    break;
                case 8:
                    dikdortgen();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Hatali Giris Yaptınız...");
            }

        } while (secim != 0);
    }
}
