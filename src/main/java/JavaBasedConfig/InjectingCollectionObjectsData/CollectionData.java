package JavaBasedConfig.InjectingCollectionObjectsData;

import java.util.List;
import java.util.Set;

public class CollectionData {
    private List<Book> books;
    private Set<Customer> customers;

    public CollectionData(List<Book> books, Set<Customer> customers) {
        this.books = books;
        this.customers = customers;
    }

    @Override
    public String toString() {
        return "CollectionData{" +
                "books=" + books +
                ", customers=" + customers +
                '}';
    }
}
