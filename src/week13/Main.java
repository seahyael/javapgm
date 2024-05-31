package src.week13;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        src.week13.Main pstudio = new src.week13.Main();
        pstudio.J085();
    }

    String getText(String filepath){
        String data = "";
        try{
            FileInputStream fileInputStream = new FileInputStream(filepath);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            int i = 0;
            while ((i = bufferedInputStream.read()) != -1){
                data += (char)i + "";
            }
            fileInputStream.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return data;
    }

    void J081(){
        String data = "";
        data = getText("data.txt");

        String[] arrayData = data.split(" ");
        int[] arrayDataInt = new int[arrayData.length];
        for(int i = 0; i < arrayData.length; i++){
            try{
                arrayDataInt[i] = Integer.parseInt(arrayData[i]);
            } catch(Exception e){
                System.out.println(e);}
        }

        int max = arrayDataInt[0];
        int min = arrayDataInt[0];
        for(int i = 1; i < arrayDataInt.length; i++){
            if(arrayDataInt[i] > max){
                max = arrayDataInt[i];
            }
            if(arrayDataInt[i] < min){
                min = arrayDataInt[i];
            }
        }

        System.out.println("Maximum number : " + max);
        System.out.println("Minimun number : " + min);
    }

    void J082(){
        List<String> dataList = new ArrayList<>();
        int bmiCount = 0;
        int count = 0;
        try{
            File file = new File("data.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String each = scanner.nextLine();
                dataList.add(each);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        for(String each : dataList){
            String[] arrayHW = each.split(" ");
            int height = Integer.parseInt(arrayHW[0]);
            int weight = Integer.parseInt(arrayHW[1]);

            double bmi = weight / (height *0.01* height*0.01);
            if(bmi >= 25){
                bmiCount++;
            }
            count++;
        }

        double per = (double)bmiCount / (double)count * 100;

        System.out.println("All " + count + " persons.");
        System.out.println("Total overweight persons: " + bmiCount + " (" + per + "%)");
    }

    class Score{
        String[] name;
        int kor, eng, mat;
        int[] sum = new int[]{0,0,0};
        double[] avg = new double[3];
        int[] sumS;
        double[] avgS;
    }

    void J083(){
        Score my = new Score();
        int maxScore = 0;
        int maxK = 0, maxE = 0, maxM = 0;
        String maxName = "";
        int count = 0;
        List<String> dataList = new ArrayList<>();
        try{
            File file = new File("data.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String each = scanner.nextLine();
                dataList.add(each);
                count ++;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        my.sumS = new int[count];
        my.avgS = new double[count];
        my.name = new String[count];
        int i = 0;
        for(String each : dataList){
            String[] arrayHW = each.split(" ");
            my.name[i] = arrayHW[0];
            my.kor = Integer.parseInt(arrayHW[1]);
            my.eng = Integer.parseInt(arrayHW[2]);
            my.mat = Integer.parseInt(arrayHW[3]);

            my.sum[0] += my.kor;
            my.sum[1] += my.eng;
            my.sum[2] += my.mat;

            my.sumS[i] = my.kor + my.mat + my.eng;
            if(my.sumS[i]>maxScore){
                maxScore = my.sumS[i];
                maxK = my.kor;
                maxM = my.mat;
                maxE = my.eng;
                maxName = my.name[i];
            }
            i++;
        }

        for(i = 0; i<3; i++){
            my.avg[i] = my.sum[i] / (double)count;
        }

        System.out.println("국어 총점 : " + my.sum[0] + ", 평균 : " + my.avg[0]);
        System.out.println("영어 총점 : " + my.sum[1] + ", 평균 : " + my.avg[1]);
        System.out.println("수학 총점 : " + my.sum[2] + ", 평균 : " + my.avg[2]);

        for(i = 0; i<count; i++){
            my.avgS[i] = my.sumS[i] / 3.0;
            System.out.println(my.name[i] + " 총점 : " + my.sumS[i] + ", 평균 : " + my.avgS[i]);
        }

        System.out.println("가장 높은 평균 점수를 받은 학생 : " + maxName + ", 국어 점수 : " + maxK + ", 영어 점수 : " + maxE + ", 수학 점수 : " + maxM );
    }

    void J084(){
        int count = 0;
        List<String> dataList = new ArrayList<>();
        try{
            File file = new File("data.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String each = scanner.nextLine();
                dataList.add(each);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        int max = 0;
        int min = 100000;
        String maxS = "";
        String minS = "";

        for(String each : dataList){

        count++;
        if(each.length() > max){
                max = each.length();
                maxS = each;
        } else if (each.length() == max) {
            maxS += ", " + each;
        }
            if(each.length()< min){
                min = each.length();
                minS = each;
        }else if (each.length() == min) {
                minS += ", " + each;
            }
        }

        System.out.println("Count : " + count);
        System.out.println("Longest name : " + maxS);
        System.out.println("Shortest name : " + minS);
    }

    void J085(){
        String data = "";

        data = getText("data.txt");

        int[] arrayNum = {0,0,0}; // 대, 소, 빈칸
        for(int i=0;i<data.length();i++){
            int each = data.charAt(i);
            if(each >= 65 && each <= 90){
                //대문자
                arrayNum[0]++;
            }
            if(each >= 97 && each <= 122){
                //소문자
                arrayNum[1]++;
            }
            if(" ".equals(data.substring(i, i+1))){
                //공백
                arrayNum[2]++;
            }
        }

        System.out.println("A~Z - " + arrayNum[0]);
        System.out.println("a~z - " + arrayNum[1]);
        System.out.println("spaces - " + arrayNum[2]);

    }
}
