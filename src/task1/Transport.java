package task1;

public class Transport {
    private String brand;
    private String model;
    private final double year;
    private final String country;
    private String color;
    private double maxSpeed;

    public Transport(String brand, String model, double year, String country, String color, double maxSpeed) {
        this.brand = Utils.checkData(brand, 0);
        this.model = Utils.checkData(model, 0);
        this.year = Utils.checkData(year, 2);
        this.country = Utils.checkData(country, 2);
        this.color = Utils.checkData(color, 1);
        this.maxSpeed = Utils.checkData(maxSpeed, 3);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setBrand(String brand) {
        this.brand = Utils.checkData(brand, 0);
    }

    public void setModel(String model) {
        this.model = Utils.checkData(model, 0);
    }

    public void setColor(String color) {
        this.color = Utils.checkData(color, 1);
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = Utils.checkData(maxSpeed, 3);
    }

    @Override
    public String toString() {
        return "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + (int) year +
                ", country='" + country + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + (int) maxSpeed;
    }
}
