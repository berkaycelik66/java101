import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;

        System.out.print("Bir Sayi Giriniz: ");
        int sayi = input.nextInt();

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                total = total + i;
            }
        }

        if (sayi == total) {
            System.out.println(sayi + " sayisi mukemmel sayidir.");
        } else {
            System.out.println(sayi + " sayisi mukemmel sayi degildir.");
        }
    }
}
