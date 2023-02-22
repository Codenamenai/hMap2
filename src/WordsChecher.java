import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordsChecher {
    protected Set<String> set;
    protected String text;
    protected String[] word;

    public WordsChecher(String text) {
        this.text = text;
        word = text.split("\\P{IsAlphabetic}+");
        set = new HashSet<>();
    }

    public void setAdd() {
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


