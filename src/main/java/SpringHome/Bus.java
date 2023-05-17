package SpringHome;

public class Bus extends Transport{
    private String modelBus;

    @Override
    public void start() {
        System.out.println("Автобус поехал");
    }

    public Bus(String model, String brand, String modelBus) {
        super(model, brand);
        this.modelBus = modelBus;
    }
}
