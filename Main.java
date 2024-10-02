class Main{
    public static void main(String args[]){

        Laptop laptop = new Laptop();
        Refrigerator refrigerator = new Refrigerator();
        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();

        PowerOutlet LaptopAdapter = new LaptopAdapter(laptop);
        PowerOutlet RefrigeratorAdapter = new RefrigeratorAdapter(refrigerator);
        PowerOutlet SmartphoneAdapter = new SmartphoneAdapter(smartphoneCharger);

        System.out.println(LaptopAdapter.plugIn());
        System.out.println(RefrigeratorAdapter.plugIn());
        System.out.println(SmartphoneAdapter.plugIn());

    }
}