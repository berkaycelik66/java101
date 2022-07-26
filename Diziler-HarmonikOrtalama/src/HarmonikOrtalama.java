public class HarmonikOrtalama {

    public static void main(String[] args) {
        int[] dizi = {1, 2, 3, 4, 5};
        double toplam = 0;
        for (int i : dizi) {
            toplam = toplam + (1.0 / i);
        }

        System.out.println("Harmonik Ortalama: " + (dizi.length / toplam));
    }
}
