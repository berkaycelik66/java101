import java.util.Scanner;

public class TaksimetreTutarHesapla {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int acilisUcreti = 10;
        int km;
        double tutar;

        System.out.print("Gidilen Mesafeyi Kilometre Cinsinden Giriniz: ");
        km = input.nextInt();

        tutar = acilisUcreti + (km * 2.2);
        tutar = tutar < 20 ? 20 : tutar;

        System.out.println("Ödemeniz Gereken Tutar: " + tutar + " TL");

    }
}
