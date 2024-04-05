import java.util.Scanner;

public class J002 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double c_degree;
        double f_degree;

        c_degree = keyboard.nextDouble();

        f_degree = c_degree * 1.8 +32;

        System.out.println(f_degree);
    }
}