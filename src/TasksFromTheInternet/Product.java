package TasksFromTheInternet;

public class Product {
    String nameToy;

    public void Toy() {
    }

    public Product(String nameToy) {
        this.nameToy = nameToy;
    }

    public String getNameToy() {
        return nameToy;
    }

    public void setNameToy(String nameToy) {
        this.nameToy = nameToy;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nameToy='" + nameToy + '\'' +
                '}';
    }
}



