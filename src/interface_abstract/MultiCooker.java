package interface_abstract;

public class MultiCooker extends  Appliances implements Bluetooth{

    private String name;


    public MultiCooker() {

    }

    public MultiCooker(String name) {
        this.name = name;
    }

    @Override
    protected void chooseInput() {
        System.out.println("Input type: \n button \n sensor");
    }

    @Override
    public void plugIn() {
        System.out.println("plugIn");
    }

    @Override
    public void plugOff() {
        System.out.println("plugOff");
    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }

    public void Menu() {

    }
    void multiCook () {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MultiCooker{" +
                "name='" + name + '\'' +
                '}';
    }
}
