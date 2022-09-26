package interface_abstract;

public class MultiCooker extends  Appliances implements Bluetooth{

    private String name = "REDMOND";


    public MultiCooker() {

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
