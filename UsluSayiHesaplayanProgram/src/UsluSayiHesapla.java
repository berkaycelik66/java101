import java.util.Scanner;

public class UsluSayiHesapla {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sonuc = 1;

        System.out.print("Üslü Sayının Taban Değerini Giriniz: ");
        int taban = input.nextInt();

        System.out.print("Üslü Sayının Üs Değerini Giriniz: ");
        int us = input.nextInt();

        for (int i = 1; i <= us; i++) {
            sonuc = sonuc * taban;
        }

        System.out.println(taban + " üzeri " + us + " = " + sonuc);
    }
}
