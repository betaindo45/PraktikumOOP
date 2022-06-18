import java.util.ArrayList;

public class RentArchive {
    private ArrayList<CarRent> dataRental = new ArrayList<>();
    public void Rent(CarRider rider, Car car, int duration){
        if(car.isStatus()){
            System.out.println("Mobil berhasil disewakan");
            dataRental.add(new
            CarRent(rider,car,duration));
            car.setStatus(false);
        }else{
            System.out.println("Maaf, mobil sudah disewa");
        }
    }
    public void Info(){
        System.out.println("====Informasi Pelanggan====");
        for (int i = 0; i < dataRental.size(); i++) {
            System.out.println("Nama\t\t: " + dataRental.get(i).getRider().getNama());
            System.out.println("Umur\t\t: " + dataRental.get(i).getRider().getUmur());
            System.out.println("Nomor HP\t: " +
            dataRental.get(i).getRider().getNoHP());
            System.out.println("Mobil yangdirental : ");
            System.out.println("Tipe Mobil\t: "+ dataRental.get(i).getCar().getCarType());
            System.out.println("No Polisi\t: " +dataRental.get(i).getCar().getPolNumber());
            System.out.println("Durasi\t\t: " +dataRental.get(i).getDuration() + " hari");
            System.out.println("=================================");
        }
    }
}
