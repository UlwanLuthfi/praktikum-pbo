package pertemuan6;

public abstract class BujurSangkar extends Bentuk2D {

  double sisi;

  public BujurSangkar(double sisi) {
    this.sisi = sisi;
  }

  @Override
  public double luasBidang() {
    return sisi * sisi;
  }

  @Override
  public double kelilingBidang() {
    return 4 * sisi;
  }

  @Override
  public String toString() {
    return namaBentuk() + " \nPanjang sisi " + sisi;
  }

}
