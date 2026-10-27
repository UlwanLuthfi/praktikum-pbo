package pertemuan7;

public class Rumah implements Aset {
  private int lantai;
  private int luas;

  public void setLuas(int luas) {
    this.luas = luas;
  }

  public void setLantai(int lantai) {
    this.lantai = lantai;
  }

  @Override
  public long nilaiAset() {
    return 30000000;
  }

  @Override
  public String toString() {
    return "Rumah Lantai " + lantai + " (Luas " + luas + "m2)" + "\nNilai: Rp. " + nilaiAset();
  }
}
