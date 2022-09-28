package TasksFromTheInternet;

public class HeavyBox extends  Box{

    private int weight;

    public HeavyBox(String artem, String yume, String midzu, String friends) {
        super(artem, yume, midzu, friends);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                '}';
    }
}

