public class Car {
    private String carType, polNumber, Merk;
    private boolean Status;
    Car(String carType, String polNumber, StringMerk, boolean Status ){
        this.carType = carType;
        this.polNumber = polNumber;
        this.Merk = Merk;
        this.Status = Status;
    }

    public String getPolNumber() {
        return polNumber;
    }

    public String getMerk() {
        return Merk;
    }


    public String getCarType() {
        return carType;
    }

    public void setStatus(boolean status) {
        Status = status;
    }

    public boolean isStatus() {
        return Status;
    }
}
