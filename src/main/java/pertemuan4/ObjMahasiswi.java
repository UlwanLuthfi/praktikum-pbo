package pertemuan4;

public class ObjMahasiswi {

  // Object
  public static void main(String[] args) {

    // Mahasiswa 1
    Mahasiswi mhs1 = new Mahasiswi("Zihan", 26, 99.9, 123, "Depok");
    mhs1.tampilData();

    // Mahasiswa 2
    Mahasiswi mhs2 = new Mahasiswi("Gibran", 36, 58, 55, "Jakarta");
    mhs2.tampilData();

    // Mahasiswa 3
    Mahasiswi mhs3 = new Mahasiswi("Megawati", 99, 69, 115, "Bogor");
    mhs3.tampilData();

    // Test class public, protected & private
    System.out.println("Test class public, protected & private");
    System.out.println(mhs1.nama); // public
    System.out.println(mhs1.umur); // protected
    System.out.println(mhs1.getNilai()); // private
    System.out.println(mhs1.nim); // public
    System.out.println(mhs1.alamat); // public

  }

}
