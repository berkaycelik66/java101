import java.util.Scanner;

public class ElemanlariSirala {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin Boyutunu Giriniz: ");
        int boyut = input.nextInt();

        int[] dizi = new int[boyut];

        for (int i = 0; i < dizi.length; i++) {
            System.out.print((i + 1) + ". Elemanı Giriniz: ");
            dizi[i] = input.nextInt();
        }

        for (int i = 0; i < dizi.length; i++) {
            for (int j = i+1; j < dizi.length; j++) {
                if (dizi[i] > dizi[j]) {
                    int ata = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = ata;
                }
            }
        }

        System.out.println("Küçükten Büyüğe Sıralama: ");
        for (int a : dizi) {
            System.out.print(a + " ");
        }
    }
}
