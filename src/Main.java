public class Main {
    public static void main(String[] args) {
        int[] dizi = {2, 4, 6, 8, 10, 2, 6, 12, 14, 8, 10, 16, 18};

        System.out.println("Tekrar Eden Çift Sayılar:");
        for (int i = 0; i < dizi.length; i++) {
            int sayi = dizi[i];
            if (sayi % 2 == 0) {
                boolean tekrarEdiyor = false;
                for (int j = 0; j < i; j++) {
                    if (dizi[j] == sayi) {
                        tekrarEdiyor = true;
                        break;
                    }
                }
                if (tekrarEdiyor) {
                    System.out.println(sayi);
                }
            }
        }
    }
}