package src.week10;
import src.week10.screenshots.BMICalculator;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        src.week10.Main pstudio = new src.week10.Main();
        pstudio.J055();
    }
    void J051(){
        MakePW a = new MakePW();
        a.makeString(10);
        a.make(10,4);
    }

    void J052(){
        Score a= new Score(5);
        a.getScore();
        a.printScore();
    }

    void J053(){
        Score a = new Score(5);
        a.getScore();;
        a.printScore(5);
    }

    void J054(){
        Score a = new Score(5);
        a.getScore();;
        a.printScore(2, "수학");
    }

    void J055(){
        BMICalculator a = new BMICalculator();
        a.getHW();
        a.printBMI();
    }
}
