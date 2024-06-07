package src.week14;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        src.week14.Main pstudio = new src.week14.Main();
        pstudio.J092();
    }

    class Score{
        String name;
        int kor, eng, mat;
        int sum;
        double avg;

        public Score(String name, int kor, int eng, int mat) {
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.mat = mat;
            this.sum = kor + eng + mat;
            this.avg = sum / 3.0;
        }

        public String getName() {
            return name;
        }
        public int getKor() {
            return kor;
        }
        public int getEng() {
            return eng;
        }
        public int getMat() {
            return mat;
        }
        public int getSum() {
            return sum;
        }
        public double getAvg() {
            return avg;
        }

        public void setName(String name) {
            this.name = name;
        }
        public void setKor(int kor) {
            this.kor = kor;
        }
        public void setEng(int eng) {
            this.eng = eng;
        }
        public void setMat(int mat) {
            this.mat = mat;
        }
        public void setSum(int sum) {
            this.sum = sum;
        }
        public void setAvg(double avg) {
            this.avg = avg;
        }

        @Override
        public String toString() {
            return name + " " + kor + " " + eng + " " + mat;
        }
    }

    class ScoreManager {
        Map<String, Score> scores = new HashMap<>();

        public void addScore(Score score) {
            scores.put(score.name, score);
        }

        public void addScore(String data) {
            String[] arrayData = data.split(" ");
            scores.put(arrayData[0], new Score(arrayData[0], Integer.parseInt(arrayData[1]), Integer.parseInt(arrayData[2]), Integer.parseInt(arrayData[3])));
        }

        public void printScoresAndSummary() {

            try {
                File file = new File("scores.txt");
                Scanner scanner = new Scanner(file);
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    addScore(line);
                }
                scanner.close();
            } catch (Exception e) {
                System.out.println(e);
            }
            int totalKor = 0, totalEng = 0, totalMat = 0;
            int count = scores.size();

            for (Score score : scores.values()) {
                totalKor += score.kor;
                totalEng += score.eng;
                totalMat += score.mat;
            }

            double avgKor = totalKor / (double) count;
            double avgEng = totalEng / (double) count;
            double avgMat = totalMat / (double) count;

            System.out.println("국어 총점 : " + totalKor + ", 평균 : " + avgKor);
            System.out.println("영어 총점 : " + totalEng + ", 평균 : " + avgEng);
            System.out.println("수학 총점 : " + totalMat + ", 평균 : " + avgMat);

            for (Score score : scores.values()) {
                System.out.println(score.name + " 총점 : " + score.sum + ", 평균 : " + score.avg);
            }

        }

        public Score getScore(String name) {
            return scores.get(name);
        }

        public void newScore(String name, int kor, int eng, int mat){
            Score score = getScore(name);
            if(score == null){
                System.out.println("학생을 찾을 수 없습니다.");
            }
            else {
                score.kor = kor;
                score.eng = eng;
                score.mat = mat;
                try {
                    FileWriter writer = new FileWriter("scores.txt");
                    for (Score sc : scores.values()) {
                        writer.write(sc.toString() + "\n");
                    }
                    writer.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
                System.out.println(name + " 학생 국어점수: " + score.kor + ", 영어 점수: " + score.eng + ", 수학점수: " + score.mat);
            }
        }
    }

    void J091() {
        ScoreManager my = new ScoreManager();
        Scanner in = new Scanner(System.in);
        System.out.print("1.점수 통계 출력 2.학생 검색 3.학생 점수 수정 4.종료\n>>메뉴입력 ");
        int num = in.nextInt();
        while (num != 4){
            if(num == 1){
                my.printScoresAndSummary();
            }
            else if(num == 2){
                System.out.print("학생 이름: ");
                in.nextLine();
                String name = in.nextLine();
                Score score = my.getScore(name);
                if(score == null){
                    System.out.println("학생을 찾을 수 없습니다.");
                }
                else System.out.println(name + " 학생 국어점수: " + score.kor + ", 영어 점수: " + score.eng + ", 수학점수: " + score.mat);
            }
            else if(num == 3){
                in.nextLine();
                System.out.print("학생 이름: ");
                String name = in.nextLine();
                System.out.println("새로운 점수 입력");
                System.out.print(">>국어: ");
                int kor = in.nextInt();
                System.out.print(">>영어: ");
                int eng = in.nextInt();
                System.out.print(">>수학: ");
                int mat = in.nextInt();
                my.newScore(name, kor, eng, mat);
            }
            else{
                System.out.println("Wrong input. Try again");
            }
            System.out.print("1.점수 통계 출력 2.학생 검색 3.학생 점수 수정 4.종료\n>>메뉴입력 ");
            num = in.nextInt();
        }

    }

    class Car{
        String type;
        int number;
        String time;

        public String getType(){return this.type;}
        public int getNumber(){return this.number;}
        public String getTime(){return this.time;}

        public void setType(String type){this.type = type;}

        public void setNumber(int number) {this.number = number;}

        public void setTime(String time) {this.time = time;}

        public Car(int number, String type){
            this.number = number;
            this.type = type;
            LocalDateTime now = LocalDateTime.now();
            String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyyMMdd HHmm"));
            this.time = formatedNow;
        }
    };

    class CarManager {
        Map<Integer, Car> parking = new HashMap<>();

        public void addCar(Car car){
            parking.put(car.number, car);
        }
        public void print(){
            int count = 0;
            for(Car car: parking.values()){
                count++;
                System.out.println("["+count+"] "+car.number+"\t"+car.type+"\t\t"+car.time);
            }
        }

        public Car getCar(int number){
            return parking.get(number);
        }

        public void exit(Car car){
            LocalDateTime now = LocalDateTime.now();
            String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyyMMdd HHmm"));
            int used = Integer.parseInt(formatedNow.substring(11,13)) - Integer.parseInt(car.time.substring(11,13))
                    +   (Integer.parseInt(formatedNow.substring(9,11)) - Integer.parseInt(car.time.substring(9,11)));
            int fee = used/10 * 500;
            System.out.println(car.number+" "+car.type+" "+used+"min. Parking fee "+fee+" (current time "+formatedNow+")");
            parking.remove(car.number);
        }
    }

    void J092(){
        CarManager my = new CarManager();
        Scanner in = new Scanner(System.in);
        System.out.print("1) enter, 2) exit, 3) list 4) quit > ");
        int num = in.nextInt();
        while(num!=4) {
            switch (num) {
                case 1:
                    System.out.print("Enter number, type > ");
                    int number = in.nextInt();
                    String type = in.next();
                    my.addCar(new Car(number,type));
                    break;
                case 2:
                    System.out.print("Enter car number to exit > ");
                    number = in.nextInt();
                    Car car = my.getCar(number);
                    if(car == null) System.out.println("Cannot find the car");
                    else{
                        my.exit(car);
                    }
                    break;
                case 3:
                    System.out.println("=======================================");
                    System.out.println("num\t\t\ttype\ttime");
                    my.print();
                    break;
            }
            System.out.print("1) enter, 2) exit, 3) list 4) quit > ");
            num = in.nextInt();
        }
    }
}
