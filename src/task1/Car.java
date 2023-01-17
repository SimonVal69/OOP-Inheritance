package task1;

public class Car extends Transport {
    private double engineVolume;
    private String transmission;
    private final String carBody;
    private String vehicleRegNumber;
    private final double seatsAmount;
    private boolean isWinter;

    protected class Key {
        private final boolean remoteIgnition;
        private final boolean nonKeyIgnition;

        public Key(boolean remoteIgnition, boolean nonKeyIgnition) {
            this.remoteIgnition = remoteIgnition;
            this.nonKeyIgnition = nonKeyIgnition;
        }

        @Override
        public String toString() {
            return "Key{" +
                    "remoteIgnition=" + remoteIgnition +
                    ", nonKeyIgnition=" + nonKeyIgnition +
                    '}';
        }
    }

    public Car(String brand, String model, double year, String country, String color, double maxSpeed, double engineVolume, String transmission, String carBody, String vehicleRegNumber, double seatsAmount, boolean isWinter) {
        super(brand, model, year, country, color, maxSpeed);
        this.engineVolume = Utils.checkData(engineVolume, 0);
        this.transmission = Utils.checkData(transmission, 0);
        this.carBody = Utils.checkData(carBody, 0);
        this.vehicleRegNumber = Utils.checkData(vehicleRegNumber, 0);
        this.seatsAmount = Utils.checkData(seatsAmount, 1);
        this.isWinter = isWinter;
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

    public String getCarBody() {
        return carBody;
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

    public boolean getIsWinter() {
        return isWinter;
    }

    public void setIsWinter(boolean isWinter) {
        this.isWinter = isWinter;
    }

    @Override
    public String toString() {
        return "Car{" + super.toString() +
                ", engineVolume=" + engineVolume +
                ", transmission='" + transmission + '\'' +
                ", carBody='" + carBody + '\'' +
                ", vehicleRegNumber='" + vehicleRegNumber + '\'' +
                ", seatsAmount=" + (int) seatsAmount +
                ", isWinter=" + isWinter +
                "} ";
    }
}
