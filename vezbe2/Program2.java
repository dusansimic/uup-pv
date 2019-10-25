class Zadatak2 {
  public static void main(String[] args) {
    int br;
    do {
      br = Svetovid.in.readInt("Unesite prirodan broj: ");
    } while (br <= 0);
    
    boolean prost = true;
    
    for (int i = 2; i <= Math.sqrt(br) && prost; i++) {
      if (br % i == 0) {
        prost = false;
      }
    }
    
    System.out.println("Broj " + br + " je " + (prost ? "prost" : "slozen") + ".");
  }
}