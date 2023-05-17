package SpringHome;

public class Car extends Transport{
    private String modelCar;


    @Override
    public void start() {
        System.out.println("Автомобиль поехал");
    }

    public Car(String model, String brand, String modelCar) {
        super(model, brand);
        this.modelCar = modelCar;
    }
}
