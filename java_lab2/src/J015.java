import java.util.Scanner;
public class J015 {
    public static void main(String [] args){
        int num1, num2, num3;
        int max_num = 0, min_num = 100000000;

        Scanner keyboard = new Scanner(System.in);
        num1 = keyboard.nextInt();
        num2 = keyboard.nextInt();
        num3 = keyboard.nextInt();;

        if(num1>num2){
            min_num = num2;
            max_num = num1;
        }
        else{
            min_num = num1;
            max_num = num2;
        }

        if(num3<min_num){
            min_num = num3;
        }
        else{
            max_num = num3;
        }

        System.out.println(max_num + " " + min_num);
    }
}
