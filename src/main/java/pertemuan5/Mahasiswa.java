package pertemuan5;

public class Mahasiswa extends Person {

  private String nim;
  private String prodi;

  public void setNim(String nim) {
    this.nim = nim;
  }

  public void setProdi(String prodi) {
    this.prodi = prodi;
  }

  public String getNim() {
    return nim;
  }

  public String getProdi() {
    return prodi;
  }

  @Override
  public String toString() {
    return super.toString() + "\nNIM: " + nim + "\nProdi: " + prodi;
  }

}
