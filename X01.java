// 12S24005-MIA NATHANIA SIBUEA
// 12S24036-JOSEF CHRISTIAN MARPAUNG
import java.util.*;
import java.lang.Math;

public class X01{
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double harga, kecil;
        double total, total1;

        total = 0;
        harga = Double.parseDouble(input.nextLine());
        kecil = 1000;
        while (harga != 0) {
            if (harga < kecil) {
                kecil = harga;
                total = total + kecil;
            } else {
                harga = harga;
                total = total + harga;
            }
            harga = Double.parseDouble(input.nextLine());
        }
        if (total >= 100.0) {
            total1 = total - kecil;
        } else {
            total = total;
        }
        System.out.println(toFixed(total1,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
