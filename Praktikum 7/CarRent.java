public class CarRent {
    private CarRider rider;
    private Car car;
    private int duration;
    CarRent(CarRider rider, Car car,int duration){
    this.rider = rider;
    this.car = car;
    this.duration = duration;
    }
    public CarRider getRider() {
        return rider;
    }
    public Car getCar() {
        return car;
    }
    public int getDuration() {
        return duration;
    }
}
