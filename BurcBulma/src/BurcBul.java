import java.util.Scanner;

public class BurcBul {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String burc = "";
        boolean isHata = false;

        System.out.print("Kaçıncı Ayda Doğdunuz: ");
        int ay = input.nextInt();

        System.out.print("Doğduğunuz Gün: ");
        int gun = input.nextInt();

        switch (ay) {
            case 1:
                if (gun >= 1 && gun <= 21) {
                    burc = "Oğlak";
                } else if (gun >= 22 && gun <= 31) {
                    burc = "Kova";
                } else {
                    isHata = true;
                }
                break;
            case 2:
                if (gun >= 1 && gun <= 19) {
                    burc = "Kova";
                } else if (gun >= 20 && gun <= 29) {
                    burc = "Balık";
                } else {
                    isHata = true;
                }
                break;
            case 3:
                if (gun >= 1 && gun <= 20) {
                    burc = "Balık";
                } else if (gun >= 21 && gun <= 31) {
                    burc = "Koç";
                } else {
                    isHata = true;
                }
                break;
            case 4:
                if (gun >= 1 && gun <= 20) {
                    burc = "Koç";
                } else if (gun >= 21 && gun <= 30) {
                    burc = "Boğa";
                } else {
                    isHata = true;
                }
                break;
            case 5:
                if (gun >= 1 && gun <= 21) {
                    burc = "Boğa";
                } else if (gun >= 22 && gun <= 31) {
                    burc = "İkizler";
                } else {
                    isHata = true;
                }
                break;
            case 6:
                if (gun >= 1 && gun <= 22) {
                    burc = "İkizler";
                } else if (gun >= 23 && gun <= 30) {
                    burc = "Yengeç";
                } else {
                    isHata = true;
                }
                break;
            case 7:
                if (gun >= 1 && gun <= 22) {
                    burc = "Yengeç";
                } else if (gun >= 23 && gun <= 31) {
                    burc = "Aslan";
                } else {
                    isHata = true;
                }
                break;
            case 8:
                if (gun >= 1 && gun <= 22) {
                    burc = "Aslan";
                } else if (gun >= 23 && gun <= 31) {
                    burc = "Başak";
                } else {
                    isHata = true;
                }
                break;
            case 9:
                if (gun >= 1 && gun <= 22) {
                    burc = "Başak";
                } else if (gun >= 23 && gun <= 30) {
                    burc = "Terazi";
                } else {
                    isHata = true;
                }
                break;
            case 10:
                if (gun >= 1 && gun <= 22) {
                    burc = "Terazi";
                } else if (gun >= 23 && gun <= 31) {
                    burc = "Akrep";
                } else {
                    isHata = true;
                }
                break;
            case 11:
                if (gun >= 1 && gun <= 21) {
                    burc = "Akrep";
                } else if (gun >= 22 && gun <= 30) {
                    burc = "Yay";
                } else {
                    isHata = true;
                }
                break;
            case 12:
                if (gun >= 1 && gun <= 21) {
                    burc = "Yay";
                } else if (gun >= 22 && gun <= 31) {
                    burc = "Oğlak";
                } else {
                    isHata = true;
                }
                break;
            default:
                System.out.println("Hatalı Bir Ay Girdiniz...");
        }

        if (isHata) {
            System.out.println("Hatali Bir Gün Girdiniz...");
        } else {
            System.out.println("\nBurcunuz: " + burc);
        }

    }
}
