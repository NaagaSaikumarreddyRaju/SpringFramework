package xmlconfig.Injection.constructor;

public class Publisher {
    private String name;
    private String location;

    public Publisher(String name, String location) {
        //System.out.println("Publisher constructor");
        this.name = name;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
