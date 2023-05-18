package SpringHome;

public class Bus extends Transport{
    private String typeBus;

    @Override
    public void start() {
        System.out.println(typeBus+" готов к работе");
    }

    public Bus(String model, String brand, String typeBus) {
        super(model, brand);
        this.typeBus = typeBus;
    }

    public String getTypeBus() {
        return typeBus;
    }

    public void setTypeBus(String typeBus) {
        this.typeBus = typeBus;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "typeBus='" + typeBus + '\'' +
                '}';
    }
}
