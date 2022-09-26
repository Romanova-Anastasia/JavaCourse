package interface_abstract;

public class FoodProcessor extends Appliances{

    private String name = "Bosch";

    public FoodProcessor(){

    }

    @Override
    protected void chooseInput() {
        System.out.println("Input type: \n button \n sensor");
    }

    @Override
    public void plugIn() {

    }

    @Override
    public void plugOff() {

    }

    @Override
    public String toString(){
        return "FoodProcessor{" +
                "name='" + name + '\'' +
                '}';
    }
}
