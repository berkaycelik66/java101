import java.util.Scanner;
import java.util.Arrays;

public class MaxMinBulma{

    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        int[] dizi = {15,12,788,1,-1,-778,2,0};

        int maxYakin = dizi[0];
        int minYakin  = dizi[0];

        System.out.print("Bir Sayi Giriniz: ");
        int girilenSayi = input.nextInt();

        Arrays.sort(dizi);
        for(int i: dizi){
            if(i <= girilenSayi){
                minYakin = i;
            }

            if(i >= girilenSayi) {
                maxYakin = i;
                break;
            }
        }

        System.out.println("Girilen sayidan kucuk en yakin sayi: " + minYakin);
        System.out.println("Girilen sayidan buyuk en yakin sayi: " + maxYakin);

    }
}
