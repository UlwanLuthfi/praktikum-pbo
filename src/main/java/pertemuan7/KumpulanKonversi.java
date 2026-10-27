package pertemuan7;

import java.util.Scanner;

public class KumpulanKonversi {
  public static void main(String[] args) {
    int jumlahKonverter = 4;
    int n = 0;
    KonverterSatuan[] konverters = new KonverterSatuan[jumlahKonverter];

    // Register converters into array
    konverters[n++] = new CelciusFahrenheit();
    konverters[n++] = new FahrenheitCelcius();
    konverters[n++] = new CelciusReamur();
    konverters[n++] = new ReamurCelcius();

    Scanner scanner = new Scanner(System.in);

    System.out.println("Assalamu'alaikum, Aku adalah Konverter Besaran Suhu");

    while (true) {
      System.out.println("\nSilakan pilih nomor konverter:");
      for (int i = 0; i < konverters.length; i++) {
        System.out.println((i + 1) + ". " + konverters[i].satuanInput() + " ke " + konverters[i].satuanOutput());
      }

      System.out.print("Konverter pilihan anda (0 untuk QUIT) : ");
      int pilih = scanner.nextInt();

      if (pilih == 0) {
        System.out.println("Selesai dan terima kasih...");
        break;
      }

      if (pilih < 1 || pilih > konverters.length) {
        System.out.println("Pilihan tidak valid! Silakan pilih angka 1 hingga " + konverters.length + ".");
        continue;
      }

      KonverterSatuan terpilih = konverters[pilih - 1];
      System.out.println(">> anda pilih " + terpilih.satuanInput() + " ke " + terpilih.satuanOutput());

      System.out.print("Masukkan besaran suhu (" + terpilih.satuanInput() + ") : ");
      float nilaiInput = scanner.nextFloat();

      float hasil = terpilih.konversi(nilaiInput);
      System.out.println(">> " + nilaiInput + " " + terpilih.satuanInput() + " setara dengan " + hasil + " "
          + terpilih.satuanOutput());
    }

    scanner.close();
  }
}
