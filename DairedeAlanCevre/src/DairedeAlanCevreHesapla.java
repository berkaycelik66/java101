import java.util.Scanner;

public class DairedeAlanCevreHesapla {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double yaricap, aci;
        double pi = 3.14;
        double alan, cevre;

        System.out.print("Dairenin Yarıçap Degerini Giriniz: ");
        yaricap = input.nextDouble();
        System.out.print("Merkez Açının Ölçüsünü Giriniz: ");
        aci = input.nextDouble();

        cevre = 2 * pi * yaricap;
        alan = (pi * yaricap * yaricap * aci) / 360;

        System.out.println("Çevre: " + cevre);
        System.out.println("Alan: " + alan);
    }
}
