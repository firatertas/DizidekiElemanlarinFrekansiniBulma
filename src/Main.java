import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};

        System.out.println("Dizi : " + Arrays.toString(list));
        System.out.println("==== Tekrar Sayıları ====");
        System.out.println("-------------------------");

        for (int i = 0; i < list.length; i++) {
            // Eğer bu eleman daha önce işlendi ise, devam et
            if (list[i] == -1) {
                continue;
            }

            int count = 1; // Her elemandan en az bir tane bulunduğunu varsayalım
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] == list[j]) {
                    count++;
                    // Daha önce işlenen elemanları işaretleyelim
                    list[j] = -1;
                }
            }

            // Elemanın frekansını yazdır
            System.out.println(list[i] + " sayısı " + count + " kere tekrar edildi.");
        }
    }
}