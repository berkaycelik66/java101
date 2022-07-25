import java.util.Scanner;

public class ATM_Projesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kullaniciAdi, parola;
        int hak = 3;
        int bakiye = 1500;
        int secim;

        while (hak != 0) {
            System.out.print("\nKullanıcı Adı: ");
            kullaniciAdi = input.nextLine();
            System.out.print("Parola: ");
            parola = input.nextLine();

            if (kullaniciAdi.equals("patika") && parola.equals("dev123")) {
                System.out.println("\n******Hoşgeldiniz******");
                do {
                    System.out.println("\n1- Para Çek" +
                            "\n2- Para Yatır" +
                            "\n3- Bakiye Sorgula" +
                            "\n0- Çıkış Yap");
                    System.out.print("Lütfen Yapmak Istediğiniz Işlemi Seçiniz: ");
                    secim = input.nextInt();

                    switch (secim) {
                        case 1:
                            System.out.print("Çekmek Istediginiz Tutarı Giriniz: ");
                            int tutar1 = input.nextInt();
                            if (tutar1 > bakiye) {
                                System.out.println("Yetersiz Bakiye...");
                            } else {
                                bakiye = bakiye - tutar1;
                            }
                            break;
                        case 2:
                            System.out.print("Yatırmak Istediginiz Tutarı Giriniz: ");
                            int tutar2 = input.nextInt();
                            bakiye = bakiye + tutar2;
                            break;
                        case 3:
                            System.out.println("Mevcut Bakiyeniz: " + bakiye);
                            break;
                        case 0:
                            System.out.println("\nBizi Tercih Ettiğiniz İçin Teşekkür Ederiz.");
                            break;
                    }
                } while (secim != 0);
                hak = 0;
            } else {
                hak--;
                System.out.println("\nHatalı Kullanıcı Adı veya Parola");
                System.out.println("Kalan Hak: " + hak);
                if (hak == 0) {
                    System.out.println("Kartınız Bloke Olmuştur...");
                }
            }
        }
    }
}
