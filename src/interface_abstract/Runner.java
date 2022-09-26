package interface_abstract;

public class Runner {

    public static void main(String[] args) {
        Appliances multiCooker = new MultiCooker();
        Appliances foodProcessor = new FoodProcessor();

        Appliances[] appliances = new Appliances[3];
        appliances[0] = multiCooker;
        appliances [1] = foodProcessor;

        for (int i = 0; i < appliances.length; i++) {
            System.out.println(appliances[i] );
        }
    }
}
