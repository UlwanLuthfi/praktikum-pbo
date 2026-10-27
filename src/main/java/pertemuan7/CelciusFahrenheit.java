package pertemuan7;

public class CelciusFahrenheit implements KonverterSatuan {
  private String asal;
  private String tujuan;

  public CelciusFahrenheit() {
    this.asal = "Celcius";
    this.tujuan = "Fahrenheit";
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
    return (9.0f / 5.0f) * in + 32;
  }
}