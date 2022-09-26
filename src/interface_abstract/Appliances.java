package interface_abstract;

public abstract class Appliances implements Enabler {
    protected abstract void chooseInput();

    void menu() {
        System.out.println("menu");
    }

    void multiCook () {
        System.out.println("multiCook");
    }
}
