package TasksFromTheInternet;

public class Box {
    private String artem;
    private String yume;
    private String midzu;
    private String friends;

    public Box(String artem, String yume, String midzu, String friends) {
        this.artem = artem;
        this.yume = yume;
        this.midzu = midzu;
        this.friends = friends;
    }

    public String getArtem() {
        return artem;
    }

    public void setArtem(String artem) {
        this.artem = artem;
    }

    public String getYume() {
        return yume;
    }

    public void setYume(String yume) {
        this.yume = yume;
    }

    public String getMidzu() {
        return midzu;
    }

    public void setMidzu(String midzu) {
        this.midzu = midzu;
    }

    public String getFriends() {
        return friends;
    }

    public void setFriends(String friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "Box{" +
                "artem='" + artem + '\'' +
                ", yume='" + yume + '\'' +
                ", midzu='" + midzu + '\'' +
                ", friends='" + friends + '\'' +
                '}';
    }
}
