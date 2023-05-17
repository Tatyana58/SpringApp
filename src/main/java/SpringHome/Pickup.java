package SpringHome;

public class Pickup extends Transport{
    private String modelPickup;

    @Override
    public void start() {
        System.out.println("Грузовик поехал");
    }

    public Pickup(String model, String brand, String modelPickup) {
        super(model, brand);
        this.modelPickup = modelPickup;
    }
}
