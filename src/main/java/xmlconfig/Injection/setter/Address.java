package xmlconfig.Injection.setter;

public class Address {
    private String dno;
    private String city;
    private String state;

    public Address(){
        //System.out.println("Constructor created in Address Field");
    }
    public String getDno() {
        return dno;
    }

    public void setDno(String dno) {
        this.dno = dno;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
