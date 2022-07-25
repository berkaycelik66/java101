import java.util.Scanner;

public class Ebob_Ekok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ebob = 1;
        int ekok = 1;
        int max, min;

        System.out.print("Birinci Sayıyı Giriniz: ");
        int sayi1 = input.nextInt();

        System.out.print("Ikinci Sayıyı Giriniz: ");
        int sayi2 = input.nextInt();

        if (sayi1 >= sayi2) {
            max = sayi1;
            min = sayi2;
        } else {
            max = sayi2;
            min = sayi1;
        }

        //EBOB
        for (int i = min; i >= 1; i--) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
                break;
            }
        }

        //EKOK
        for (int j = max; j <= sayi1 * sayi2; j++) {
            if (j % sayi1 == 0 && j % sayi2 == 0) {
                ekok = j;
                break;
            }
        }

        System.out.println("EBOB(" + sayi1 + "," + sayi2 + ") = " + ebob);
        System.out.println("EKOK(" + sayi1 + "," + sayi2 + ") = " + ekok);
    }
}
