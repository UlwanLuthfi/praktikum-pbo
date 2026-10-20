package pertemuan3;

public class HimpunanNilai {
  public static void main(String[] args) {

    int[] nilai = { 70, 80, 87, 76, 90, 100 };
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
    System.out.printf("Rata-rata: %.2f%n", rata);
  }
}
