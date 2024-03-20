package jobsheet6;

public class HotelMain29 {
    public static void main(String[] args) {

        HotelService29 list = new HotelService29(5);

        Hotel29 h1 = new Hotel29("Hotel Wahyu1", "Bandung", 150, (byte) 3);
        Hotel29 h2 = new Hotel29("Hotel Wahyu2", "Jogja", 100, (byte) 4);
        Hotel29 h3 = new Hotel29("Hotel Wahyu3", "Jakarta", 300, (byte) 5);
        Hotel29 h4 = new Hotel29("Hotel Wahyu4", "Bogor", 200, (byte) 2);
        Hotel29 h5 = new Hotel29("Hotel Wahyu5", "Malang", 250, (byte) 4);

        list.tambah(h1);
        list.tambah(h2);
        list.tambah(h3);
        list.tambah(h4);
        list.tambah(h5);

        System.out.println("Daftar Hotel sebelum sorting:");
        list.tampil();

        System.out.println("Daftar Hotel setelah sorting harga:");
        list.bubbleSort();
        list.tampil();

        System.out.println("Daftar Hotel setelah sorting rating:");
        list.selectionSort();
        list.tampil();
    }
}
