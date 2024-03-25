
import java.util.List;
import java.util.Scanner;

public class Methods {
    public static void Menus() {
        System.out.println("1- Veri Gir/ 2-Maaş Hesaplama/ 3-Listeleme");
    }

    public static void veriGir(Scanner scanner, List<String> ad, List<Byte> cocukSayisi, List<Integer> maas, List<String> medeniDurum) {
        System.out.println("İsim Giriniz: ");
        ad.add(scanner.next());
        System.out.println("Maaş Giriniz: ");
        maas.add(scanner.nextInt());
        System.out.println("Çocuk Giriniz: ");
        cocukSayisi.add(scanner.nextByte());
        System.out.println("Medeni Durumunuzu Giriniz(evli/bekar): ");
        medeniDurum.add(scanner.next());


    }

    public static void maashesap(List<String> ad, List<Byte> cocukSayisi, List<Integer> maas, List<String> medeniDurum) {
        for (int i = 0; i < ad.size(); i++) {
            if (medeniDurum.get(i).equals("evli")) {
                maas.set(i, maas.get(i) + 1000);

            }
            if (cocukSayisi.get(i)>0){
                maas.set(i,maas.get(i) + cocukSayisi.get(i)*500);
            }
        }
        System.out.println("Güncel Maaşınız: " + maas);
    }

    public static void listleme(List<String> ad, List<Byte> cocukSayisi, List<Integer> maas, List<String> medeniDurum) {
        for (int i = 0; i < ad.size(); i++) {

            System.out.println("İsim: " + ad.get(i));
            System.out.println("Çocuk Sayısı: " + cocukSayisi.get(i));
            System.out.println("Medeni Durumu: " + medeniDurum.get(i));
            System.out.println("Maaşı: " + maas.get(i));
            System.out.println("--------------");

        }
    }
}
