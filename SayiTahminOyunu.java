import java.util.Scanner;
import java.util.Random;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int rastgeleSayi = random.nextInt(100) + 1; // 1-100 arasında sayı
        int tahmin;
        int denemeSayisi = 0;

        System.out.println("1 ile 100 arasında bir sayı tuttum. Bakalım tahmin edebilecek misin?");

        while (true) {
            System.out.print("Tahmininizi girin: ");
            tahmin = scanner.nextInt();
            denemeSayisi++;

            if (tahmin < rastgeleSayi) {
                System.out.println("Daha büyük bir sayı girin.");
            } else if (tahmin > rastgeleSayi) {
                System.out.println("Daha küçük bir sayı girin.");
            } else {
                System.out.println("Tebrikler! " + denemeSayisi + " denemede doğru tahmin ettiniz.");
                break;
            }
        }

        scanner.close();
    }
}