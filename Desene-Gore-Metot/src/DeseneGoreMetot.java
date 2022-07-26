import java.util.Scanner;

public class DeseneGoreMetot {

    public static int negatif(int i) {
        if (i <= 0) {
            return i;
        } else {
            System.out.print(i + " ");
            return negatif(i - 5);
        }
    }

    public static int pozitif(int i, int j) {
        if (i > j) {
            return i;
        } else {
            System.out.print(i + " ");
            return pozitif(i + 5, j);
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayiyi giriniz: ");
        int sayi = input.nextInt();

        pozitif(negatif(sayi), sayi);
    }
}

