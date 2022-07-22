import java.util.Scanner;

public class BasamakSayiToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;

        System.out.print("Bir Sayi Giriniz: ");
        int sayi = input.nextInt();

        while (sayi != 0) {
            total = total + sayi % 10;
            sayi = sayi / 10;
        }
        System.out.println("Basamaklar Toplamı: " + total);
    }
}
