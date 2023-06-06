package xmlconfig.Injection.constructor;

public class Book {
    private int id;
    private String name;
    private String author;
    private Publisher publisher;

    public Book(int id, String name, String author,Publisher publisher) {
        super();
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publisher=" + publisher +
                '}';
    }
}
