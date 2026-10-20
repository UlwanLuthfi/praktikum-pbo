package pertemuan4;

public class Mahasiswi {

  // Class / Blueprint
  // Member 1
  // Variable / Atribut / Data Mahasiswi
  public String nama;
  protected int umur;
  private double nilai;
  public int nim;
  public String alamat;

  // Member 2 - Constructor
  public Mahasiswi(String nama, int umur, double nilai, int nim, String alamat) {
    this.nama = nama;
    this.umur = umur;
    this.nilai = nilai;
    this.nim = nim;
    this.alamat = alamat;
  }

  // Method (function dalam class) untuk mencetak data mahasiswi
  public void tampilData() {
    System.out.println("Mahasiswi");
    System.out.println("Nama: " + nama);
    System.out.println("Umur: " + umur);
    System.out.println("Nilai: " + nilai);
    System.out.println("NIM: " + nim);
    System.out.println("Alamat: " + alamat);
    System.out.println("");
  }

  // Menangkap class private pada nilai
  public double getNilai() {
    return nilai;
  }

}
