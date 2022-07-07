import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matematik, fizik, turkce, kimya, muzik;
        int dersSayi = 5;
        double ortalama;

        System.out.print("Matematik Notunuzu Giriniz: ");
        matematik = input.nextInt();
        System.out.print("Fizik Notunuzu Giriniz: ");
        fizik = input.nextInt();
        System.out.print("Türkçe Notunuzu Giriniz: ");
        turkce = input.nextInt();
        System.out.print("Kimya Notunuzu Giriniz: ");
        kimya = input.nextInt();
        System.out.print("Müzik Notunuzu Giriniz: ");
        muzik = input.nextInt();

        if (matematik < 0 || matematik > 100) {
            matematik = 0;
        }
        if (fizik < 0 || fizik > 100) {
            fizik = 0;
        }
        if (turkce < 0 || turkce > 100) {
            turkce = 0;
        }
        if (kimya < 0 || kimya > 100) {
            kimya = 0;
        }
        if (muzik < 0 || muzik > 100) {
            muzik = 0;
        }

        ortalama = (matematik + fizik + turkce + kimya + muzik) / (double) dersSayi;

        if (ortalama >= 55) {
            System.out.println("Tebrikler, Sınıfı Geçtiniz.");
        } else {
            System.out.println("Maalesef, Sınıfta Kaldınız.");
        }
        System.out.println("Ortalamaniz: " + ortalama);
    }
}
