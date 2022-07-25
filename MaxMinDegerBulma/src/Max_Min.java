import java.util.Scanner;

public class Max_Min {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 0;
        int min = 0;
        int sayi;

        System.out.print("Kaç Sayı Gireceksiniz?: ");
        int sinir = input.nextInt();

        for(int i = 1; i<=sinir;i++){
            System.out.print(i+". Sayıyı Giriniz: ");
            sayi = input.nextInt();

            if(i == 1){
                max = sayi;
                min = sayi;
            }

            if(sayi < min){
                min = sayi;
            } else if(sayi > max){
                max = sayi;
            }
        }

        System.out.println("En Buyuk Sayi: " + max);
        System.out.println("En Kucuk Sayi: " + min);
    }
}
