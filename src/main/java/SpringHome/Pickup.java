package SpringHome;

public class Pickup extends Transport{
    private String typePickup;

    @Override
    public void start() {
        System.out.println(typePickup+" готов к работе");
    }

    public Pickup(String model, String brand, String typePickup) {
        super(model, brand);
        this.typePickup = typePickup;
    }

    public String getTypePickup() {
        return typePickup;
    }

    public void setTypePickup(String typePickup) {
        this.typePickup = typePickup;
    }

    @Override
    public String toString() {
        return "Pickup{" +
                "typePickup='" + typePickup + '\'' +
                '}';
    }
}
