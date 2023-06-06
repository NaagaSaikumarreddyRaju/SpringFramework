package JavaBasedConfig.InjectingCollectionData;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionData {
    List<String> names;
    Set<Integer> pinCode;
    Map<String,Integer> wordCount;

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public Set<Integer> getPinCode() {
        return pinCode;
    }

    public void setPinCode(Set<Integer> pinCode) {
        this.pinCode = pinCode;
    }

    public Map<String, Integer> getWordCount() {
        return wordCount;
    }

    public void setWordCount(Map<String, Integer> wordCount) {
        this.wordCount = wordCount;
    }
}
