// 12S24005-MIA NATHANIA SIBUEA
// 12S24036-JOSEF CHRISTIAN MARPAUNG
import java.util.*;
import java.lang.Math;

public class X01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double termurah, price, total;

        total = 0;
        termurah = 999;
        price = Double.parseDouble(input.nextLine());
        while (price != 0) {
            if (price == 0) {
            } else {
                if (price < termurah) {
                    termurah = price;
                } else {
                    price = price;
                }
                total = total + price;
            }
            price = Double.parseDouble(input.nextLine());
        }
        if (total >= 100) {
            total = total - termurah;
        } else {
            total = total;
        }
        System.out.println(toFixed(total,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
