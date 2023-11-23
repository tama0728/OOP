package Week12;

import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.*;


class CountWordsInText {
    private String[] doc;
    private Map<String, Integer> wordsMap;
    private ArrayList<String> wordsList;

    private String del = "(\\,|\\!|\\;|\\.|\\s+)+";
    
    public CountWordsInText(String[] doc) {
        this.doc = doc;
        wordsMap = new HashMap<String, Integer>();
        wordsList = new ArrayList<String>(); 
    }    
    public void countWords() {
        for (String line : doc) {
            String[] words = line.split(del);
            for (String word : words) {
                if (wordsMap.containsKey(word))
                    wordsMap.put(word, wordsMap.get(word) + 1);
                else {
                    wordsMap.put(word, 1);
                    wordsList.add(word);
                }
            }
        }
    }    
    public void printWordsShownMoreThan(int n) {
        wordsList.sort(String::compareTo);
        for (String word : wordsList){
            if (wordsMap.get(word) >= n)
                System.out.printf("%s : %d\n", word, wordsMap.get(word));
        }
    }
    
    public static void main(String[] args) {
        String doc[] = {
            "Hear the sledges with the bells",
            "Silver bells!",
            "What a world of merriment their melody foretells!",
            "How they tinkle, tinkle, tinkle,",
            "In the icy air of night!",
            "While the stars, that oversprinkle",
            "All the heavens, seem to twinkle",
            "With  a crystalline delight;",
            "Keeping time, time, time,",
            "In a sort if Runic rhyme,",
            "To the tintinabulation that so musically wells",
            "From the bells, bells, bells, bells,",
            "Bells, bells, bells,",
            "From the jingling and the tinkling of the bells."
        };
        
        CountWordsInText countWords = new CountWordsInText(doc);
        countWords.countWords();
        countWords.printWordsShownMoreThan(3);
    }
}  
