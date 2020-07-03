package exercises.technology;

public class Computer extends AbstractEntity{
    private int year;
    private double price;
    private String brand;
    private String model;

    public Computer(int aYear, double aPrice, String aBrand, String aModel) {
        super();
        year = aYear;
        price = aPrice;
        brand = aBrand;
        model = aModel;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
