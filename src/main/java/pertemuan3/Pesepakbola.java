package pertemuan3;

public class Pesepakbola {
  public static void main(String[] args) {

    String[][] player = {
        { "Ronaldo", "Arab" },
        { "Haaland", "Norway" },
        { "Messi", "Argentina" },
        { "Mbappe", "Prancis" },
    };

    System.out.println("Daftar Pemain Bola:");

    for (int i = 0; i < player.length; i++) {
      System.out.println("Pemain: " + player[i][0] + ", Negara: " + player[i][1]);
    }

  }
}
