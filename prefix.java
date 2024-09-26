// I used online compiler
import java.io.*;
import java.util.*;
class CamelCase {
    public static int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            String cleanWord = words[i].replaceAll("[^a-zA-Z]", "");
            if (cleanWord.startsWith(searchWord)) {
                return i + 1; 
            }
        }
        
        return -1;
}
    
    public static void main(String[] args) {
        String sentence = "Guitar is my favorite musical instrument";
        String searchword = "mus";
        
        int result = isPrefixOfWord(sentence, searchword);
        System.out.println("Index: "+ result);
    }
}
