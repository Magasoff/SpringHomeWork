public class Bus extends Transport {
    private String model;

    public Bus(String brand, String model) {
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
        return "Bus{" +
                "model='" + model + '\'' +
                '}';
    }

    public void startBus() {
        System.out.println(model + " начинает движение");
    }
}



