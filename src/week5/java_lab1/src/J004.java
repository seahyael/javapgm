import java.util.Scanner;
import java.lang.Math;

public class J004 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double x1, y1;
        double x2, y2;

        x1 = keyboard.nextDouble();
        y1 = keyboard.nextDouble();
        x2 = keyboard.nextDouble();
        y2 = keyboard.nextDouble();

        System.out.println(Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2)));
    }
}