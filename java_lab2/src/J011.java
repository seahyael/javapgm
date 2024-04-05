import java.util.Scanner;
public class J011 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int height, weight;
        height = keyboard.nextInt();
        weight = keyboard.nextInt();

        double bmi;
        bmi = weight/ (height*0.01*height*0.01);

        if(bmi >= 25){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}