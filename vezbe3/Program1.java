class Zadatak1 {
  public static void main(String[] args) {
    int br;
    do {
      br = Svetovid.in.readInt("Unesite prirodan broj: ");
    } while (br <= 0);
    
    int zbir = 0;
    while (br > 0) {
      int cif = br % 10;
      zbir = zbir + cif;
      br /= 10;
    }
    
    System.out.println(zbir);
  }
}
