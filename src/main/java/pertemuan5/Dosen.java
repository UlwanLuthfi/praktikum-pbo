package pertemuan5;

public class Dosen extends Person {

  private String nidn;
  private String gelar;

  public void setNidn(String nidn) {
    this.nidn = nidn;
  }

  public void setGelar(String gelar) {
    this.gelar = gelar;
  }

  @Override
  public String toString() {
    return super.toString() + "\nNIDN: " + nidn + "\nGelar: " + gelar;
  }

}
