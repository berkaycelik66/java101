import java.util.Scanner;

public class ArmstrongSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        int basamakSayisi = 0;
        int copySayi;
        int sonuc = 0;
        System.out.print("Sayi Giriniz: ");
        sayi = input.nextInt();

        //Basamak Sayisi Bulma
        copySayi = sayi;
        while (copySayi != 0) {
            copySayi = copySayi / 10;
            basamakSayisi++;
        }

        //Basamakların n'inci Üssünü Hesaplama ve Sonuca Ekleme
        copySayi = sayi;
        while (copySayi != 0) {
            int flag = 1;
            for (int i = 1; i <= basamakSayisi; i++) {
                flag *= copySayi % 10;
            }
            sonuc = sonuc + flag;
            copySayi = copySayi / 10;
        }

        if (sonuc == sayi) {
            System.out.println(sayi + " Sayisi Bir Armstrong Sayısıdır.");
        } else {
            System.out.println(sayi + " Sayisi Bir Armstrong Sayısı Değildir.");
        }
    }
}
