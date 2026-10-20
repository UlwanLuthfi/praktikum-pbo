package pertemuan2;

public class Belanja {

  public static void main(String[] args) {
    // Deklarasi dan inisialisasi variable
    String pelanggan = "Casmin";
    double totalBelanja = 150000;
    String keterangan;

    // Struktur kendali if else
    // Jika total belanja lebih dari 100.000
    // Maka pelanggan dapat hadiah
    // Selain itu tidak dapat

    if (totalBelanja > 100000) {
      keterangan = "Selamat Anda mendapat hadiah";
    } else {
      keterangan = "Terima kasih sudah berbelanja";
    }

    // Menampilkan nama pelanggan, total belanja dan keterangan
    System.out.println("Halo " + pelanggan + ", kamu berbelanja total " + totalBelanja + ", " + keterangan);
  }

}
