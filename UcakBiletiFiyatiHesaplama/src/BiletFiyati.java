import java.util.Scanner;

public class BiletFiyati {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int km, yas, yolculukTipi;
        double perKm = 0.10;
        double tutar;
        boolean isHata = false;

        System.out.print("Kilometreyi Giriniz: ");
        km = input.nextInt();

        System.out.print("Yaşınızı Giriniz: ");
        yas = input.nextInt();

        System.out.println("1-Tek Yön\n2-Gidiş-Dönüş");
        System.out.print("Yolculuk Tipini Seçiniz: ");
        yolculukTipi = input.nextInt();

        tutar = km * perKm;

        if (km <= 0 || yas < 0 || ((yolculukTipi != 1) && (yolculukTipi != 2))) {
            isHata = true;
        } else {
            if (yas < 12) {
                tutar = tutar * 0.5;
            } else if (yas >= 12 && yas <= 24) {
                tutar = tutar * 0.9;
            } else if (yas >= 65) {
                tutar = tutar * 0.7;
            }

            switch (yolculukTipi) {
                case 1:
                    break;
                case 2:
                    tutar = tutar * 0.8;
                    tutar = tutar * 2;
                    break;
            }
        }

        if (!(isHata)) {
            System.out.println("Toplam Tutar: " + tutar);
        } else {
            System.out.println("Hatali Veri Girişi Yaptiniz...");
        }

    }
}
