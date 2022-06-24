import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ürün Fiyatını Giriniz: ");
        double urunFiyat = input.nextDouble();
        double kdvOran;

        double kdvliFiyat = ((urunFiyat < 1000) && (urunFiyat > 0)) ? (kdvOran = 0.18) : (kdvOran = 0.08);

        System.out.println("KDV'siz Fiyat: " + urunFiyat);
        System.out.println("KDV Oranı: " + kdvOran);
        System.out.println("KDV Tutarı: " + (urunFiyat * kdvOran));
        System.out.println("KDV'li Fiyat: " + kdvliFiyat);
    }
}
