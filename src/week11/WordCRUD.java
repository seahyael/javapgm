package src.week11;

import java.util.ArrayList;
import java.util.Scanner;
public class WordCRUD {
    ArrayList<Word> list;
    public WordCRUD() {
        list = new ArrayList<Word>();
    }
    void addWord(){
        String english, korean;
        int level;
        Scanner s = new Scanner(System.in);
        System.out.print("English > ");
        english = s.next();
        s.nextLine();
        System.out.print("Korean > ");
        korean = s.nextLine();
        System.out.print("Level (1~3) > ");
        level = s.nextInt();
        Word new_word = new Word(english, korean, level);
        list.add(new_word);
    }
    void editWord(){
    }
    void listWord(){
        for(int i=0; i<list.size(); i++)
            System.out.printf("%d - %s\n",i+1, list.get(i).toString());
    }
    void deleteWord(){
    }
}
