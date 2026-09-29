package praktikum2;

public class HimpunanNilai {
  public static void main(String[] args) {

    int[] nilai = { 80, 85, 90, 75, 88 };
    System.out.println("Jumlah elemen: " + nilai.length);

    // Menampilkan semua elemen dengan for
    for (int i = 0; i < nilai.length; i++) {
      System.out.println("Nilai ke-" + (i + 1) + ": " + nilai[i]);
    }

    // Hitung rata-rata
    int total = 0;
    for (int n : nilai) {
      total += n;
    }

    double rata = (double) total / nilai.length;
    System.out.println("Rata-rata: " + rata);
  }
}
