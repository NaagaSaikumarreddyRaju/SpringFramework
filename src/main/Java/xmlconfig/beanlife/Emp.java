package xmlconfig.beanlife;

public class Emp {

    Emp(){
        System.out.println("Employee constructor");
    }
    public void empInfo(){
        System.out.println("Employees are good");
    }

    public void init(){
        System.out.println("Employee :: init() method");
    }

    public void destroy(){
        System.out.println("Employee :: destroy() method");
    }
}
