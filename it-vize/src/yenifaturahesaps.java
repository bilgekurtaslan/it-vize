import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class yenifaturahesaps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> isim = new ArrayList<String>();
        List<Integer> dakika = new ArrayList<Integer>();
        List<Integer> sms = new ArrayList<Integer>();
        List<Integer> internet = new ArrayList<Integer>();
        byte menu;
        for (;;){
            Methotlars.Menuu();
            menu = scanner.nextByte();
            switch (menu){
                case 1:
                    Methotlars.veriGir(scanner,isim,dakika,sms,internet);
                    break;
                case 2:
                    Methotlars.faturahesaplama(isim,dakika,sms,internet);
            }

        }
    }
}
