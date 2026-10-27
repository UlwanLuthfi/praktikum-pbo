package pertemuan6;

public class Burung extends Hewan {

  @Override
  public void bersuara() {

    System.out.println("Suara burung");

  }

  @Override
  public void makan() {

    System.out.println("Makan biji");

  }

  @Override
  public String toString() {
    return "Suara burung";
  }

}
