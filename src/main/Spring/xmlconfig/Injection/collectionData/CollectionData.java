package xmlconfig.Injection.collectionData;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionData {
    List<String> names;
    Set<Integer> pinCode;
    Map<String,Integer> wordCount;
    Properties properties;
    List<BookData> bookData;

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

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public List<BookData> getBookData() {
        return bookData;
    }

    public void setBookData(List<BookData> bookData) {
        this.bookData = bookData;
    }
}
