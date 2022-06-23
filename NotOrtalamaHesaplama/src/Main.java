import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mat, fiz, kim, tur, tar, muz;
        int toplam;
        double ortalama;

        System.out.print("Matematik Notunuzu Giriniz: ");
        mat = input.nextInt();

        System.out.print("Fizik Notunuzu Giriniz: ");
        fiz = input.nextInt();

        System.out.print("Kimya Notunuzu Giriniz: ");
        kim = input.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz: ");
        tur = input.nextInt();

        System.out.print("Tarih Notunuzu Giriniz: ");
        tar = input.nextInt();

        System.out.print("Müzik Notunuzu Giriniz: ");
        muz = input.nextInt();

        System.out.println("\n");
        toplam = mat + fiz + kim + tur + tar + muz;
        ortalama = toplam / 6.0;

        String gectiMi = (ortalama>=60) ? "Sınıfı Gectiniz" : "Sınıfta Kaldınız";
        
        System.out.println("Ortalamanız: "+ortalama);
        System.out.println(gectiMi);
    }
}
