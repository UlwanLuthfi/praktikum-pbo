package pertemuan7;

public class Mobil implements Aset {
  private String merk;
  private int cc;

  public void setCc(int cc) {
    this.cc = cc;
  }

  public void setMerk(String merk) {
    this.merk = merk;
  }

  @Override
  public long nilaiAset() {
    return 10000000;
  }

  @Override
  public String toString() {
    return "Mobil Merk " + merk + " (" + cc + " CC)" + "\nNilai: Rp. " + nilaiAset();
  }
}
