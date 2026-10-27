package pertemuan7;

public class FahrenheitCelcius implements KonverterSatuan {
  private String asal;
  private String tujuan;

  public FahrenheitCelcius() {
    this.asal = "Fahrenheit";
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
    return (5.0f / 9.0f) * (in - 32);
  }
}