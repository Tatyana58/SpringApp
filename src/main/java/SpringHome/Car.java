package SpringHome;

public class Car extends Transport{
    private String typeCar;


    @Override
    public void start() {
        System.out.println(typeCar+" готов к работе");
    }

    public Car(String model, String brand, String typeCar) {
        super(model, brand);
        this.typeCar = typeCar;
    }

    public String getModelCar() {
        return typeCar;
    }

    public void setModelCar(String typeCar) {
        this.typeCar = typeCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "typeCar='" + typeCar + '\'' +
                '}';
    }
}
