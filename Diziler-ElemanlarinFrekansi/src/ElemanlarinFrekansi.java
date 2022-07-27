public class ElemanlarinFrekansi {
    public static void main(String[] args) {
        int[] dizi = {1, 4, 2, 5, 3, 6, 4, 7, 5, 8, 6, 9};
        int[] frekans = new int[dizi.length];

        for (int i = 0; i < dizi.length; i++){
            frekans[i] = 1;
        }

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                if ((i != j) && (dizi[i] == dizi[j])) {
                    frekans[i]++;
                }
            }
        }

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                if ((i != j) && (dizi[i] == dizi[j])) {
                    dizi[j] = 0;
                }
            }
        }

        for (int i = 0; i < dizi.length; i++) {
            if (frekans[i] >= 1) {
                if (dizi[i] != 0){
                    System.out.println(dizi[i] + " sayisi " + frekans[i] + " kere tekrar edildi.");
                }
            }
        }
    }
}
