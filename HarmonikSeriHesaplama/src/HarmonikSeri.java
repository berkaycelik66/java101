import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi Giriniz: ");
        int sayi = input.nextInt();
        double toplam = 0;

        for (int i = 1; i <= sayi; i++) {
            toplam = toplam + (1.0 / i);
        }
        System.out.println("Harmonik Seri Toplamı: " + toplam);
    }
}
