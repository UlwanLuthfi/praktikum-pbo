package pertemuan6;

public class Kucing extends Hewan {

  @Override
  public void bersuara() {

    System.out.println("Meooongzz");

  }

  @Override
  public void makan() {

    System.out.println("Makan ikan");

  }

  @Override
  public String toString() {
    return "Suara kucing";
  }

}
