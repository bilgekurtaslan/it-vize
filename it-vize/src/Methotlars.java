import java.util.List;
import java.util.Scanner;

public class Methotlars {
    public static void Menuu() {
        System.out.println("1- Veri Giriniz / 2- Fatura Hesaplama");
    }

    public static void veriGir(Scanner scanner, List<String> isim, List<Integer> dakika, List<Integer> sms, List<Integer> internet) {
        System.out.println("İsim Giriniz: ");
        isim.add(scanner.next());
        System.out.println("Dakika Kullanımınızı Giriniz");
        dakika.add(scanner.nextInt());
        System.out.println("Sms Kullanımı Giriniz: ");
        sms.add(scanner.nextInt());
        System.out.println("İnternet Kullanımı Giriniz");
        internet.add(scanner.nextInt());
    }

    public static void faturahesaplama(List<String> isim, List<Integer> dakika, List<Integer> sms, List<Integer> internet) {
        double fatura = 0;
        for (int i = 0; i < isim.size(); i++) {
          fatura = (dakika.get(i)*0.50) + (sms.get(i)*.4 ) + (internet.get(i)*12);
        }
        System.out.println("Faturanız: " + fatura);
    }
}
