package pertemuan7;

public class CelciusReamur implements KonverterSatuan {
  private String asal;
  private String tujuan;

  public CelciusReamur() {
    this.asal = "Celcius";
    this.tujuan = "Reamur";
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
    return (4.0f / 5.0f) * in;
  }
}