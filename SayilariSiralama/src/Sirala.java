import java.util.Scanner;

public class Sirala {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("1. Sayı: ");
        int sayi1 = input.nextInt();

        System.out.print("2. Sayı: ");
        int sayi2 = input.nextInt();

        System.out.print("3. Sayı: ");
        int sayi3 = input.nextInt();

        System.out.println("\nSayıların Küçükten Büyüğe Sıralanışı: ");

        if (sayi1 < sayi2 && sayi1 < sayi3) {
            if (sayi2 < sayi3) {
                System.out.println(sayi1 + " " + sayi2 + " " + sayi3);
            } else {
                System.out.println(sayi1 + " " + sayi3 + " " + sayi2);
            }
        } else if (sayi2 < sayi1 && sayi2 < sayi3) {
            if (sayi1 < sayi3) {
                System.out.println(sayi2 + " " + sayi1 + " " + sayi3);
            } else {
                System.out.println(sayi2 + " " + sayi3 + " " + sayi1);
            }
        } else {
            if (sayi1 < sayi2) {
                System.out.println(sayi3 + " " + sayi1 + " " + sayi2);
            } else {
                System.out.println(sayi3 + " " + sayi2 + " " + sayi1);
            }
        }
    }
}
