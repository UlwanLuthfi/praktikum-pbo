package praktikum2;

public class Pesepakbola {
  public static void main(String[] args) {

    String[][] pemain_timnas = {
        { "Emil Audero", "Rayo Vallecano(SPA)" },
        { "Jay Idzes", "Sassuolo(ITA)" },
        { "Calvin Verdonk", "LOSC Lille(FRA)" },
        { "Dean James", "Go Ahead Eagles(NED)" },
        { "Kevin Diks", "Monchengladbach(GER)" },
        { "Luke Vickery", "Macarthur FC (AUST)" },
        { "Ole Romeny", "Fortuna Sittard (NED)" },
    };

    System.out.println("Daftar Pemain Timnas:");

    for (int i = 0; i < pemain_timnas.length; i++) {
      System.out.println(pemain_timnas[i][0] + "\t: " +
          pemain_timnas[i][1]);
    }

  }
}
