package src.week8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main pStudio = new Main();
        pStudio.J041();
    }

    void J041(){
        Lotto lotto = new Lotto();
        lotto.printNumbers();
        lotto.remakeAuto();
        lotto.printNumbers();
    }
    void J042(){
        Lotto lotto = new Lotto();
        lotto.printNumbers();
        lotto.remake();
        lotto.printNumbers();
    }
    void J043(){
        Lotto lottoWin = new Lotto();
        lottoWin.printNumbers();

        Lotto lottoTry = new Lotto();
        lottoTry.remake();
        lottoTry.printNumbers();

        int match = lottoWin.checkWin(lottoWin, lottoTry);
        System.out.println("match : " + match);
        System.out.println("winner : " + lottoWin.winner(lottoWin, lottoTry));

    }

    void J046(){
        Scanner in = new Scanner(System.in);
        String first = in.nextLine();
        String second = in.nextLine();
        int result = MyString.whichFirst(first, second);
        if(result == 1){
            System.out.println(result + " " + first);
        }
        else System.out.println(result + " " + second);
    }

    void J047(){
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String output = MyString.removeSpaces(input);
        System.out.println(output);
    }
}