public class Car extends Transport {
    private String model;

    public Car(String brand, String model) {
        super(brand);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public void start() {
        System.out.println(model + " начинает движение");
    }
}
