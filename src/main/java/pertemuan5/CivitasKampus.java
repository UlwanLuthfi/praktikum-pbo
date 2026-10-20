package pertemuan5;

public class CivitasKampus {

  public static void main(String[] args) {

    Dosen d1 = new Dosen();
    Security s1 = new Security();
    Mahasiswa m1 = new Mahasiswa();

    // Dosen
    d1.setNama("Nasrul");
    d1.setGender("Laki-laki");
    d1.setNidn("12345");
    d1.setGelar("S1");

    // Security
    s1.setNama("Kuncoro");
    s1.setGender("Laki-laki");
    s1.setShift("Siang");
    s1.setSektor("Gerbang Belakang");

    // Mahasiswa
    m1.setNama("Ulwan");
    m1.setGender("Laki-laki");
    m1.setNim("0110225097");
    m1.setProdi("Teknik Informatika");

    System.out.println("Civitas Kampus STTNF");
    System.out.println(d1.toString());
    System.out.println(s1.toString());
    System.out.println(m1.toString());

  }

}
