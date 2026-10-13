package praktikum4;

public class Person {

  private String nama;
  private String gender;

  // Fungsi
  public void setNama(String nama) {
    this.nama = nama;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getNama() {
    return nama;
  }

  public String getGender() {
    return gender;
  }

  @Override
  public String toString() {
    return "\nNama: " + nama + "\nGender: " + gender;
  }

}
