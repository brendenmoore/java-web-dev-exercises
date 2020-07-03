package exercises.technology;

public class Laptop extends Computer {
    private double batteryLifeHours;

    public Laptop(int year, double price, String brand, String model, double someBatteryLifeHours) {
        super(year, price, brand, model);
        batteryLifeHours = someBatteryLifeHours;
    }

    public double getBatteryLifeHours() {
        return batteryLifeHours;
    }

    public void setBatteryLifeHours(double batteryLifeHours) {
        this.batteryLifeHours = batteryLifeHours;
    }
}
