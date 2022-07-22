import java.util.Scanner;

public class KombinasyonHesapla {
    public static int faktoriyel(int a) {
        int sonuc = 1;
        for (int i = 1; i <= a; i++) {
            sonuc = sonuc * i;
        }
        return sonuc;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sonuc;
        System.out.println("C(n,r)");
        System.out.print("n: ");
        int n = input.nextInt();
        System.out.print("r: ");
        int r = input.nextInt();

        sonuc = faktoriyel(n) / (faktoriyel(r) * faktoriyel(n - r));
        System.out.println("C(" + n + "," + r + ") = " + sonuc);
    }
}
