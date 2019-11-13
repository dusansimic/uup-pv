class ProgramN {
  public static void main(String[] args) {
    int br;
    do {
      br = Svetovid.in.readInt("Unesite prirodan broj: ");
    } while (br <= 0);
    
    int i = 2;
    while (i <= br / 2 && br % i == 1) {
      i++;
    }
    if (br % i == 0 && br > 2) {
      System.out.println("Broj je slozen");
    } else {
      System.out.println("Broj je prost");
    }
  }
}