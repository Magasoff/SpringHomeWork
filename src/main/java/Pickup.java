
public class Pickup extends Transport {
    private String model;

    public Pickup(String brand, String model) {
        super(brand);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Pickup{" +
                "model='" + model + '\'' +
                '}';
    }

    public void startPickup() {
        System.out.println(model + " загружен");
    }
}



