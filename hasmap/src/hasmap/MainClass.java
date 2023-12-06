package hasmap;

import java.util.HashMap;

public class MainClass {

    public static void main(String[] args) {
    	
        String[] chat = {"Buna", "Buna", "ce", "mai", "faci"};
        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : chat) {
            if (wordCount.containsKey(word)) {
               
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
           
                wordCount.put(word, 1);
            }
        }

     
       
    	   System.out.println(wordCount);
       
    }
    
}
