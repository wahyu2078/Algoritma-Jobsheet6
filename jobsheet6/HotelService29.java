package jobsheet6;

public class HotelService29 {
    Hotel29[] rooms;
    int count;

    public HotelService29(int size) {
        rooms = new Hotel29[size];
        count = 0;
    }

    void tambah(Hotel29 h) {
        if (count < rooms.length) {
            rooms[count] = h;
            count++;
        } else {
            System.out.println("Kamar penuh!");
        }
    }

    void tampil() {
        for (int i = 0; i < count; i++) {
            System.out.println("Nama Hotel: " + rooms[i].nama);
            System.out.println("Kota: " + rooms[i].kota);
            System.out.println("Harga: " + rooms[i].harga);
            System.out.println("Bintang: " + rooms[i].bintang);
            System.out.println("-----------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (rooms[j].harga > rooms[j + 1].harga) {
                    Hotel29 temp = rooms[j];
                    rooms[j] = rooms[j + 1];
                    rooms[j + 1] = temp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < count - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < count; j++) {
                if (rooms[j].bintang > rooms[idxMin].bintang) {
                    idxMin = j;
                }
            }
            Hotel29 temp = rooms[idxMin];
            rooms[idxMin] = rooms[i];
            rooms[i] = temp;
        }
    }
}
