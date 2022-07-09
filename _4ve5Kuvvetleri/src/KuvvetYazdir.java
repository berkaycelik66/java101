import java.util.Scanner;

public class KuvvetYazdir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sınır Sayısını Giriniz: ");
        int sayi = input.nextInt();

        System.out.println("4'ün Kuvvetleri: ");
        for (int i = 1; i <= sayi; i *= 4) {
            System.out.print(i + " ");
        }

        System.out.println("\n");

        System.out.println("5'in Kuvvetleri: ");
        for (int i = 1; i <= sayi; i *= 5) {
            System.out.print(i + " ");
        }
    }
}
