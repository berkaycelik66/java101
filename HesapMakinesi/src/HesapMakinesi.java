import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi1, sayi2, secim;

        System.out.print("1. Sayıyı Giriniz: ");
        sayi1 = input.nextInt();

        System.out.print("2. Sayıyı Giriniz: ");
        sayi2 = input.nextInt();

        System.out.println("\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Yapmak İstediğiniz İşlemi Seçiniz: ");
        secim = input.nextInt();

        switch (secim) {
            case 1:
                System.out.println(sayi1 + " + " + sayi2 + " = " + (sayi1 + sayi2));
                break;
            case 2:
                System.out.println(sayi1 + " - " + sayi2 + " = " + (sayi1 - sayi2));
                break;
            case 3:
                System.out.println(sayi1 + " * " + sayi2 + " = " + (sayi1 * sayi2));
                break;
            case 4:
                if (sayi2 == 0) {
                    System.out.println("Tanımsız İfade... (Bir sayı 0'a bölünemez)");
                } else {
                    System.out.println(sayi1 + " / " + sayi2 + " = " + ((double) sayi1 / sayi2));
                }
                break;
            default:
                System.out.println("Geçersiz Seçim...");
        }
    }
}
