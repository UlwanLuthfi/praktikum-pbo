package praktikum2;

import javax.swing.JOptionPane;

public class HitungLuas {

  public static float luasLingkaran(int r) {

    float luas = (float) (22.0 / 7.0) * r * r;
    return luas;

  }

  public static float luasSegitiga(float alas, float tinggi) {
    float luas = (float) 0.5f * alas * tinggi;
    return luas;
  }

  public static void main(String[] args) {
    int jariJari = Integer.parseInt(JOptionPane.showInputDialog("Masukan Jari: "));
    float alas = Float.parseFloat(JOptionPane.showInputDialog("Masukan Alas: "));
    float tinggi = Float.parseFloat(JOptionPane.showInputDialog("Masukan Tinggi: "));

    String pesan = "Luas lingkaran dengan jari-jari " + jariJari + " = " + luasLingkaran(jariJari) + "\n"
        + "Luas segitiga dengan alas " + alas + " dan tinggi " + tinggi + " = " + luasSegitiga(alas, tinggi);

    JOptionPane.showMessageDialog(null, pesan);
  }

}
