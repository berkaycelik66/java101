import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double boy, kilo;
        double indeks;

        System.out.print("Boyunuzu Giriniz (metre cinsinden): ");
        boy = input.nextDouble();

        System.out.print("Kilonuzu Giriniz: ");
        kilo = input.nextDouble();

        indeks = kilo / (boy * boy);
        System.out.println("Vücut Kitle Indeksiniz: " + indeks);
    }
}
