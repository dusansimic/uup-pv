class Zadatak3 {
  public static void main(String[] args) {
    int br;
    do {
      br = Svetovid.in.readInt("Unesite prirodan broj: ");
    } while (br <= 0);
    
    int koliko = 0;
    while (br > 0) {
      int cif = br % 10;
      if (cif == 2 || cif == 3 || cif == 5 || cif == 7) {
        koliko++;
      }
      br /= 10;
    }
    
    System.out.println(koliko);
  }
}