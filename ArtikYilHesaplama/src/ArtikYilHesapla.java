import java.util.Scanner;

public class ArtikYilHesapla {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Yıl Giriniz: ");
        int yil = input.nextInt();

        if (yil % 4 == 0) {
            if (yil % 100 == 0) {
                if (yil % 400 == 0) {
                    System.out.println(yil + " artık bir yıldır.");
                } else {
                    System.out.println(yil + " artık bir yıl değildir.");
                }
            } else {
                System.out.println(yil + " artık bir yıldır.");
            }
        } else {
            System.out.println(yil + " artık bir yıl değildir.");
        }
    }
}
