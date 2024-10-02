public class RefrigeratorAdapter implements PowerOutlet{
    private Refrigerator refrigerator;
    
    public RefrigeratorAdapter (Refrigerator refrigerator){
        this.refrigerator = new Refrigerator();
    
    }
    public String plugIn(){
        return refrigerator.startCooling();
    }
}