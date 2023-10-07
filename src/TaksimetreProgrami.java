import java.util.Scanner;

public class TaksimetreProgrami {
    public static void main(String[] args) {

        //Değişkenler
        int km;
        double perKm = 2.20, total, startPrice = 10;

        //Kullanıcıdan Veri Alma
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km Cinsinden Gririniz : ");
        km = input.nextInt();

        //Hesaplamalar
        total = (km * perKm);
        total += startPrice;
        total = (total < 20) ? 20 : total;
        System.out.println("Toplam Tutar : " + total);

    }
}
