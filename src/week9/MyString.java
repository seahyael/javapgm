package src.week8;

public class MyString {
    public static int whichFirst(String str1, String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if(str1.compareTo(str2) <= 0) return 1;
        else return 2;
    }

    public static String removeSpaces(String str){
        str = str.replaceAll(" ","");
        return str;
    }
}
