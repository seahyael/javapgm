package src.week6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main pstudio = new Main();
        pstudio.J027();
    }
    void J021(){
        int height, weight;
        double bmi;
        int people;
        int out = 0;

        Scanner in = new Scanner(System.in);
        people = in.nextInt();

        for(int i = 0; i<people; i++){
            height = in.nextInt();
            weight = in.nextInt();
            bmi = weight / (height*0.01*height*0.01);
            if(bmi>=25) out++;
        }

        System.out.println(out);
    }

    void J023(){
        int count;
        int number;
        int totalsum = 0;
        double average;

        Scanner in = new Scanner(System.in);
        count = in.nextInt();

        for(int i = 0; i<count; i++){
            number = in.nextInt();
            totalsum += number;
        }

        average = (double)totalsum/count;

        System.out.println(totalsum + " " + average);
    }

    void J024(){
        int[] numbers = new int[10];
        int first = 0;
        int second = 0;
        int second_max_index = 0;
        
        Scanner in = new Scanner(System.in);
        for(int i = 0; i<10; i++){
            numbers[i] = in.nextInt();
            if(numbers[i] > first) first = numbers[i];
        }
        for(int i = 0; i<10; i++){
            if(numbers[i] > second && numbers[i] != first) {
                second = numbers[i];
                second_max_index = i+1;
            }
        }

        System.out.println("[" + second_max_index + "] " + second);
    }

    void J025(){
        int[] monthdays = {31,28,31,30,31,30,31,31,30,31,30,31};
        int month, day;
        int day_count = 0;

        Scanner in = new Scanner(System.in);
        month = in.nextInt()-1;
        day = in.nextInt();
        if(month>11 || month<0) {
            System.out.println("Wrong date!");
            System.exit(0);}
        if(monthdays[month] < day || day<1) {
            System.out.println("Wrong date!");
            System.exit(0);
        }

        for(int i = 0; i<month; i++){
            day_count += monthdays[i];
        }
        day_count += day;

        System.out.println(day_count);
    }

    void J027(){
        int[] height = new int[10];
        int[] weight = new int[10];
        double[] bmi = new double[10];
        int count;
        int i;
        int out = 0;

        Scanner in = new Scanner(System.in);
        count = in.nextInt();

        for(i = 0; i<count; i++){
            height[i] = in.nextInt();
            weight[i] = in.nextInt();
            bmi[i] = weight[i] / (height[i]*0.01*height[i]*0.01);
        }

        System.out.print("Overweight person - ");
        for(i = 0; i<count; i++){
            if(bmi[i] >=25) {
                System.out.print(i + 1 + " ");
                out++;
            }
        }
        System.out.println("\nTotal - " + out);
    }
}
