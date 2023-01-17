package task2;

import task1.Utils;

public class Bus extends Transport {
    private double engineVolume;
    private String transmission;
    private String vehicleRegNumber;
    private final double seatsAmount;

    public Bus(String brand, String model, double year, String country, String color, double maxSpeed, double engineVolume, String transmission, String vehicleRegNumber, double seatsAmount) {
        super(brand, model, year, country, color, maxSpeed);
        this.engineVolume = Utils.checkData(engineVolume, 0);
        this.transmission = Utils.checkData(transmission, 0);
        this.vehicleRegNumber = Utils.checkData(vehicleRegNumber, 0);
        this.seatsAmount = Utils.checkData(seatsAmount, 1);
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = Utils.checkData(engineVolume, 0);
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = Utils.checkData(transmission, 0);
    }

    public String getVehicleRegNumber() {
        return vehicleRegNumber;
    }

    public void setVehicleRegNumber(String vehicleRegNumber) {
        this.vehicleRegNumber = Utils.checkData(vehicleRegNumber, 0);
    }

    public double getSeatsAmount() {
        return seatsAmount;
    }

    @Override
    public String toString() {
        return "Bus{" + super.toString() +
                ", engineVolume=" + engineVolume +
                ", transmission='" + transmission + '\'' +
                ", vehicleRegNumber='" + vehicleRegNumber + '\'' +
                ", seatsAmount=" + (int) seatsAmount +
                "} ";
    }
}
