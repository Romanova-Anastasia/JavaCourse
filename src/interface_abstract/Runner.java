package interface_abstract;

public class Runner {

    public static void main(String[] args) {

        MultiCooker multiCooker = new MultiCooker("Redmond");
        MultiCooker multiCooker1 = new MultiCooker("Redmond111");
        FoodProcessor foodProcessor = new FoodProcessor();

       // multiCooker.setName("Redmond");
        multiCooker.chooseInput();
        multiCooker.plugIn();

        foodProcessor.setName("Bosch");
        foodProcessor.setName("Mulin");

        Appliances[] appliances = new Appliances[3];
        appliances[0] = multiCooker;
        appliances [1] = foodProcessor;
        appliances[2] = multiCooker1;

        for (int i = 0; i < appliances.length; i++) {
            System.out.println(appliances[i] );
        }
    }
}
