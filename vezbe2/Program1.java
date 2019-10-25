class Zadatak1 {
  public static void main(String[] args) {
    int br;
    do {
      br = Svetovid.in.readInt("Unesite prirodan broj: ");
    } while (br <= 0);
    
    for (int i = 1; i <= br/2; i++) {
      if (br % i == 0) {
        System.out.print(i + " ");
      }
    }
    System.out.println(br);
  }
}