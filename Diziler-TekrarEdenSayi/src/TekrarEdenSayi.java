public class TekrarEdenSayi {
    public static void main(String[] args) {
        int[] dizi = {1, 4, 2, 5, 3, 6, 4, 7, 5, 8, 6, 9};

        int[] tekrarEden = new int[dizi.length];
        int index = 0;
        int x;

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                x = 0;

                //Durum Kontrol
                if ((i != j) && (dizi[i] == dizi[j])) {

                    //Sayı "tekrarEden dizisinin icinde" var mı?
                    for (int k = 0; k <= index; k++) {
                        if (dizi[i] == tekrarEden[k]) {
                            x++; //Var ise x bir artıyor;
                        }
                    }

                    {//eger tekrareden dizisinde yoksa dizinin içine atıyor
                        if (x < 1)
                            tekrarEden[index++] = dizi[i];
                    }
                }
            }
        }

        for (int a : tekrarEden) {
            if (a != 0)
                System.out.println(a);
        }
    }
}
