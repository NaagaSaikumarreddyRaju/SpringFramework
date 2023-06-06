package xmlconfig.beanFactory;

public class MainNamesData {
    NamesData namesData;
    public void setNamesData(NamesData namesData){
        this.namesData = namesData;
    }
    public void namesInfo(){
        for(String name: namesData.getNames()){
            System.out.println(name);
        }
    }
}
