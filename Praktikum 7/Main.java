public class Main {
    public static void main(String[] args){
    CarRider Budi = new CarRider("Budi",28,"085787456743");
    CarRider Santoso = new CarRider("Santoso", 20,"089535483130");
    CarRider Joni = new CarRider("Joni",21,"087564325678");
    CarRider Maung = new CarRider("Maung", 23,"086587340909");

    CarData data = new CarData();

    data.addCar("Sedan","AG 3475 ECI","BMW");
    data.addCar("SUV", "N 8724 AV","Mitsubishi");
    data.addCar("4X4","AD 3509 GB","Jeep");
    data.addCar("Avanza G","B 3543 HJ","Toyota");
    data.listCar();

    System.out.println();

    RentArchive sewa = new RentArchive();
    sewa.Rent(Budi, data.carList.get(2),9);
    sewa.Rent(Santoso,
    data.carList.get(2),8);

    sewa.Rent(Joni, data.carList.get(1), 5);
    sewa.Rent(Maung, data.carList.get(0), 4);
    System.out.println();

    sewa.Info();
    }
}
