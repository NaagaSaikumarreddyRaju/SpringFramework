package xmlconfig.beanFactory;

public class FactoryBean {
    public IndianNames getIndianNames(){
        return new IndianNames();
    }
    public USANames getUSANames(){ return new USANames();}
}
