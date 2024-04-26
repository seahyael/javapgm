package src.week7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        src.week7.Main pstudio = new src.week7.Main();
        pstudio.J035();
    }
    void J031() {
        String userid;
        String password;
        String name;
        int len;

        Scanner in = new Scanner(System.in);
        userid = in.nextLine();
        password = in.nextLine();
        if(password.length() < 3) {
            System.out.println("Error! password is too short.");
            System.exit(0);
        }
        else {
            len = password.length() - 2;
            password = password.substring(0, 2);
            for(int i = 0; i<len; i++) password =  password + "*";
        }
        name = in.nextLine();

        System.out.println("User Id: " + userid);
        System.out.println("Password: " + password);
        System.out.println("User Name: " + name);
    }

    void J032(){
        String str;
        String reverse = "";

        Scanner in = new Scanner(System.in);
        str = in.nextLine();

        for(int i = 0; i<str.length(); i++){
            reverse = reverse + str.charAt(str.length()-i-1);
        }

        System.out.println(reverse);
    }

    void J033(){
        int count;
        String name;
        String longest, shortest;

        Scanner in = new Scanner(System.in);
        count = in.nextInt();
        in.nextLine();
        name = in.nextLine();
        longest = name;
        shortest = name;
        for(int i = 1; i<count; i++) {
            name = in.nextLine();
            if(name.length() > longest.length()){
                longest = name;
            }
            if(name.length() < shortest.length()){
                shortest = name;
            }
        }

        System.out.println("Longest: " + longest);
        System.out.println("Shortest: " + shortest);
    }

    void J034(){
        String[] usernames = {"kim", "lee", "park", "hong", "choi"};
        String[] passwords = {"1111", "1234", "3456", "3535", "7777"};
        String username, password;
        int check = -1;

        Scanner in = new Scanner(System.in);
        username = in.nextLine();
        for(int i = 0; i<usernames.length; i++){
            if(username.equals(usernames[i]))
                check = i;
        }
        if(check == -1) {
            System.out.println("No user!");
            System.exit(0);
        }

        password= in.nextLine();
        if(password.equals(passwords[check]))
            System.out.println("Login OK!");
        else
            System.out.println("Incorrect password!");
    }

    void J035(){
        String input;
        String[] year = new String[4];
        String month, day;
        int output = 0;

        Scanner in = new Scanner(System.in);
        input = in.next();
        for(int i = 0; i<4; i++) {
            year[i] = input.substring(i, i+1);
        }
        month = input.substring(4,6);
        day = input.substring(6);

        for(int i = 0; i<4; i++) {
            output += Integer.parseInt(year[i]);
        }
        output += Integer.parseInt(month);
        output += Integer.parseInt(day);

        System.out.println(output);
    }
}
