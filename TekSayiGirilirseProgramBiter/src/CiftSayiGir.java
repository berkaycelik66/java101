import java.util.Scanner;

public class CiftSayiGir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi;
        int toplam = 0;

        do {
            System.out.print("Sayı Giriniz: ");
            sayi = input.nextInt();

            if (sayi % 4 == 0) {
                toplam = toplam + sayi;
            }
        } while (sayi % 2 == 0);

        System.out.println("Toplam: " + toplam);
    }
}
