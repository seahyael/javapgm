import java.util.Scanner;

public class J001 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int height, weight;
        height = keyboard.nextInt();
        weight = keyboard.nextInt();

        double bmi;
        bmi = weight/ (height*0.01*height*0.01);

        System.out.printf("%.1f",bmi);
    }
}


