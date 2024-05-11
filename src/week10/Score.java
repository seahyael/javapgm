package src.week10;

import java.util.Scanner;

public class Score {
    int count;
    int[][] jumsu;
    int sum_student;
    double[] average_student;
    //추가한 필드
    String[] arrayClass = {"국","영","수", "총점"};
    int[] sum_class;
    double[] average_class;

    public Score(int count){
        this.count = count;
        jumsu = new int[count][4];
        sum_student = 0;
        average_student = new double[count];
        sum_class = new int[]{0,0,0};
        average_class = new double[3];
    }
    public void getScore(){
        for(int i=0;i<count;i++){
            System.out.println((i+1)+"번째 학생 점수 입력 시작");
            inputJumsu(jumsu[i]);
            System.out.println((i+1)+"번째 학생 점수 입력 종료");
            average_student[i] = (double) jumsu[i][3] / 3;
            sum_class[0] += jumsu[i][0];
            sum_class[1] += jumsu[i][1];
            sum_class[2] += jumsu[i][2];
        }
        for(int j = 0; j<3; j++){
            average_class[j] = (double) sum_class[j]/5;
        }
    }
    public void printScore(int num, String classname){
        System.out.println(classname + " 총점 : " + sum_class[num] + ", 평균 : " + average_class[num] );
    }
    public void printScore(){
        for(int i=0;i<jumsu.length;i++){
            System.out.print((i+1)+"학생 ");
            System.out.print(arrayClass[3] + " : " + jumsu[i][3]);
            String grade = "";
            if(average_student[i] >= 90){
                grade = "A";
            } else if(average_student[i] >= 80){
                grade = "B";
            } else if(average_student[i] >= 70){
                grade = "C";
            } else if(average_student[i] >= 60){
                grade = "D";
            } else {
                grade = "F";
            }
            System.out.print(", 평균 : " + average_student[i]);
            System.out.println(", 등급 : " + grade);
        }
    }


    //추가로 만든것
    public void inputJumsu(int[] tempJumsu){
        Scanner in = new Scanner(System.in);
        int sum = 0;
        for(int i=0;i<3;i++){
            System.out.print(arrayClass[i] +" : ");
            tempJumsu[i] = in.nextInt();
            sum += tempJumsu[i];
        }
        tempJumsu[3] = sum;
    }

    public void printScore(int num){
        num = num-1;
        System.out.print((num+1)+"학생 ");
        System.out.print(arrayClass[3] + " : " + jumsu[num][3]);
        String grade = "";
        if(average_student[num] >= 90){
            grade = "A";
        } else if(average_student[num] >= 80){
            grade = "B";
        } else if(average_student[num] >= 70){
            grade = "C";
        } else if(average_student[num] >= 60){
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.print(", 평균 : " + average_student[num]);
        System.out.println(", 등급 : " + grade);
    }


}

