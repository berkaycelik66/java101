import java.util.Scanner;

public class PalindromSayi {
    public static boolean isPalindrom(int sayi) {
        int gecici = sayi;
        int sayiTersi = 0;
        int sonHane;

        while (gecici != 0) {
            sonHane = gecici % 10;
            sayiTersi = (sayiTersi * 10) + sonHane;
            gecici = gecici / 10;
        }

        if (sayi == sayiTersi) {
            System.out.println(sayi + " Palindrom Sayıdır.");
            return true;
        } else {
            System.out.println(sayi + " Palindrom Sayı Değildir.");
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz: ");
        int sayi = input.nextInt();

        System.out.println(isPalindrom(sayi));
    }
}
