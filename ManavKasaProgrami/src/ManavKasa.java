import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //KG başına fiyatlarını tanımlıyoruz.
        double kgArmut = 2.14;
        double kgElma = 3.67;
        double kgDomates = 1.11;
        double kgMuz = 0.95;
        double kgPatlican = 5.0;
        double tutar;

        System.out.print("Kaç KG Armut Aldığınızı Giriniz: ");
        double armutMiktar = input.nextDouble();
        System.out.print("Kaç KG Elma Aldığınızı Giriniz: ");
        double elmaMiktar = input.nextDouble();
        System.out.print("Kaç KG Domates Aldığınızı Giriniz: ");
        double domatesMiktar = input.nextDouble();
        System.out.print("Kaç KG Muz Aldığınızı Giriniz: ");
        double muzMiktar = input.nextDouble();
        System.out.print("Kaç KG Patlıcan Aldığınızı Giriniz: ");
        double patlicanMiktar = input.nextDouble();

        tutar = (kgArmut * armutMiktar) + (kgElma * elmaMiktar) + (kgDomates * domatesMiktar) + (kgMuz * muzMiktar) + (kgPatlican * patlicanMiktar);

        System.out.println("Ödemeniz Gereken Toplam Tutar: " + tutar);

    }
}
