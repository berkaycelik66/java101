import java.util.Scanner;

public class HipotenusHesapla {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dikKenar1, dikKenar2;
        double hipotenus;
        double cevre, alan;

        System.out.print("1. Dik Kenar Uzunluğunu Giriniz: ");
        dikKenar1 = input.nextInt();

        System.out.print("2. Dik Kenar Uzunluğunu Giriniz: ");
        dikKenar2 = input.nextInt();

        hipotenus = Math.sqrt((dikKenar1 * dikKenar1) + (dikKenar2 * dikKenar2));
        System.out.println("\nHipotenus: " + hipotenus);

        cevre = dikKenar1 + dikKenar2 + hipotenus;
        System.out.println("Dik Üçgenin Cevresi: " + cevre);

        alan = dikKenar1 * dikKenar2 / 2.0;
        System.out.println("Dik Üçgenin Alanı: " + alan);
    }
}
