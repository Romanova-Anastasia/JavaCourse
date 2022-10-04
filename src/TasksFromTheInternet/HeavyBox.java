package TasksFromTheInternet;

public class HeavyBox extends Box implements Comparable<HeavyBox> {

    private int weight;

    public HeavyBox(double width, double height, double depth, int weight) {
        super(width, height, depth);
        this.weight = weight;
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
                "} " + super.toString();
    }

    @Override
    public int compareTo(HeavyBox anotherWeight) {
        return Integer.compare(this.weight, anotherWeight.weight);
    }


}

