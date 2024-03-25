import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class maashesaplist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> ad = new ArrayList<String>();
        List<Byte> cocukSayisi = new ArrayList<Byte>();
        List<Integer> maas = new ArrayList<Integer>();
        List<String> medeniDurum = new ArrayList<String>();
        byte menu;
        for (;;){
            Methods.Menus();
            menu = scanner.nextByte();
            switch (menu){
                case 1:
                    Methods.veriGir(scanner,ad,cocukSayisi,maas,medeniDurum);
                    break;
                case 2:
                    Methods.maashesap(ad,cocukSayisi,maas,medeniDurum);
                    break;
                case 3:
                    Methods.listleme(ad,cocukSayisi,maas,medeniDurum);
            }

        }
    }
}
