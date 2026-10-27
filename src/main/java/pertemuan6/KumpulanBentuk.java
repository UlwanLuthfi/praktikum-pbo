package pertemuan6;

public class KumpulanBentuk {

  public static void main(String[] args) {

    // Bentuk2D b1 = new Lingkaran(8);
    // Bentuk2D b2 = new Lingkaran(5);
    // Bentuk2D ar_bentuk[] = { b1, b2 };

    // for (Bentuk2D b2d : ar_bentuk) {
    // System.out.println(b2d + " luasnya " + b2d.luasBidang());
    // }

    Bentuk2D b3 = new PersegiPanjang(10, 20);
    System.out.println(b3 + "\nMemiliki luas " + b3.luasBidang() + " dan keliling " + b3.kelilingBidang());

  }

}
