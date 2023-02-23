import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordsChecher {
    protected Set<String> set;

    public WordsChecher(String text) {
        String[] word = text.split("\\P{IsAlphabetic}+");
        set = new HashSet<>();
        for (String words : word
        ) {
            set.add(words);
        }
        {
        }
    }

    public boolean hasWord(String word) {
        return set.contains(word);
    }
}


