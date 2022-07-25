import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Fibonacci Serisinin Eleman Sayisini Giriniz: ");
        int elemanSayi = input.nextInt();
        int sayac = 2;
        int a = 0;
        int b = 1;

        System.out.print(a + " ");
        System.out.print(b + " ");

        while (elemanSayi != sayac) {
            int c = a + b;
            System.out.print(c + " ");
            sayac++;
            a = b;
            b = c;
        }
    }
}
