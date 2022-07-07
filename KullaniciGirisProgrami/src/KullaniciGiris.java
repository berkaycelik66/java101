import java.util.Scanner;

public class KullaniciGiris {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kullaniciAd, sifre, sifreKontrol,eskiSifre, secim;

        System.out.print("Kullanici Adiniz: ");
        kullaniciAd = input.nextLine();

        System.out.print("Sifreniz: ");
        sifre = input.nextLine();

        do {
            System.out.print("Sifrenizi Tekrar Giriniz: ");
            sifreKontrol = input.nextLine();

            if (!(sifre.equals(sifreKontrol))) {
                System.out.println("Girdiğiniz Şifreler Uyuşmamaktadır.");
                System.out.print("\nSifrenizi Değiştirmek İstiyor Musunuz?(E/H): ");
                secim = input.nextLine();

                switch (secim) {
                    case "e":
                    case "E":
                        eskiSifre = sifre;
                        System.out.print("Yeni Sifrenizi Giriniz: ");
                        sifre = input.nextLine();

                        if(eskiSifre.equals(sifre)){
                            System.out.println("Yeni Sifreniz Eskisi ile Aynı Olamaz...");
                        } else {
                            System.out.println("Şifreniz Başarıyla Değiştirildi...");
                        }
                        break;
                    case "h":
                    case "H":
                        break;
                }
            } else {
                System.out.println("\nGiris Basarili...");
            }
        } while (!(sifre.equals(sifreKontrol)));


    }
}
