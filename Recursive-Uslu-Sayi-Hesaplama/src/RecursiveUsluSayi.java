import java.util.Scanner;

public class RecursiveUsluSayi {
    static int sonuc = 1;

    static int usHesapla(int a, int b) {
        if (b == 0) {
            return 1;
        } else if (a == 0) {
            return 0;
        }

        sonuc *= a;
        usHesapla(a, b - 1);
        return sonuc;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Taban Degerini Giriniz: ");
        int taban = input.nextInt();

        System.out.print("Us Degerini Giriniz: ");
        int us = input.nextInt();

        System.out.println("Sonuc: " + usHesapla(taban, us));
    }
}
