package pertemuan7;

public class ReamurCelcius implements KonverterSatuan {
  private String asal;
  private String tujuan;

  public ReamurCelcius() {
    this.asal = "Reamur";
    this.tujuan = "Celcius";
  }

  @Override
  public String satuanInput() {
    return this.asal;
  }

  @Override
  public String satuanOutput() {
    return this.tujuan;
  }

  @Override
  public float konversi(float in) {
    return (5.0f / 4.0f) * in;
  }
}