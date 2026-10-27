package pertemuan6;

public class KumpulanSuaraHewan {

  public static void main(String[] args) {

    // Buat objek
    Hewan kucing = new Kucing();
    Hewan burung = new Burung();

    // Panggil method bersuara
    kucing.bersuara();
    kucing.makan();

    burung.bersuara();
    burung.makan();

  }

}
