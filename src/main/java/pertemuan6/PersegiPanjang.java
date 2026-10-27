package pertemuan6;

public class PersegiPanjang extends Bentuk2D {

  double panjang;
  double lebar;

  public PersegiPanjang(double panjang, double lebar) {
    this.panjang = panjang;
    this.lebar = lebar;
  }

  @Override
  public double luasBidang() {
    return panjang * lebar;
  }

  @Override
  public double kelilingBidang() {
    return 2 * (panjang + lebar);
  }

  @Override
  public String toString() {
    return namaBentuk() + " \nPanjang " + panjang + " | Lebar " + lebar;
  }

}
