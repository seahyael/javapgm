package src.week10.screenshots;

import java.util.Scanner;

public class BMICalculator {
    int height, weight;
    double bmi;
    int level;
    String name;
    String[] bmiLevel = {"Underweight","Healty Weight","Overweight", "Obesity"};
    public BMICalculator() {
        height = 0;
        weight = 0;
        bmi = weight / (height*0.01*height*0.01);
        level = 0;
        name = "";
    }
    public void getHW() {
        Scanner in = new Scanner(System.in);
        System.out.println("이름? ");
        name = in.nextLine();
        System.out.println("신장? ");
        height = in.nextInt();
        System.out.println("체중? ");
        weight = in.nextInt();

        bmi = weight / (height*0.01*height*0.01);

        if(bmi < 18.5) level = 1;
        else if(bmi < 25) level = 2;
        else if(bmi < 30) level = 3;
        else level = 4;
    }
    public void printBMI() {
        System.out.println("이름 : " + name);
        System.out.println("신장: " + height);
        System.out.println("체중: " + weight);
        System.out.println("BMI: " + bmi);
        System.out.println("BMI Level: " + bmiLevel[level-1]);
    }
}
