package pertemuan7;

public class KumpulanAset {

  public static void main(String[] args) {

    Rumah rumah1 = new Rumah();
    rumah1.setLantai(3);
    rumah1.setLuas(500);

    Mobil mobil1 = new Mobil();
    mobil1.setMerk("Ferrari");
    mobil1.setCc(6500);

    Aset[] daftarAset = { rumah1, mobil1 };

    long totalKekayaan = 0;

    System.out.println("=== Daftar aset milik Pak Ahmad ===\n");

    for (Aset aset : daftarAset) {
      System.out.println(aset.toString());
      totalKekayaan += aset.nilaiAset();
    }

    System.out.println("\n===================================");
    System.out.println("Total Kekayaan Aset: Rp." + totalKekayaan);

  }

}
