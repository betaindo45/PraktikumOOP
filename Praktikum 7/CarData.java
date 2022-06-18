import java.util.ArrayList;

public class CarData {
    ArrayList <Car> carList = new ArrayList<>();
    public void addCar(String carType, String polNumber, String Merk){
        carList.add(new Car(carType, polNumber, Merk,true));
    }
    public void listCar(){
        System.out.println("========Daftar Mobil========");
        System.out.println(" PT. Java Rental Indo ");
        for (int i = 0; i < carList.size() ; i++) {
            System.out.println("============================");
            System.out.println("Tipe Mobil\t\t:" + carList.get(i).getCarType());
            System.out.println("Nomor Polisi\t:" + carList.get(i).getPolNumber());
            System.out.println("Merk Mobil\t\t:" + carList.get(i).getMerk());
        }
        System.out.println("============================");
    }
}
