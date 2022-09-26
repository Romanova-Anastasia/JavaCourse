package interface_abstract;

public class FoodProcessor extends Appliances{

    private String name;

    public FoodProcessor(){

    }

    public FoodProcessor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
