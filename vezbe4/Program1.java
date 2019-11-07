class V5Z1 {
  public static void main(String[] args) {
    int n, a, i;
    double prosek;
    int suma = 0;
    do {
      n = Svetovid.in.readInt("Unesite broj n: ");
    } while (n > 100);
    
    for (i = 0; i <n; i++) {
      a = Svetovid.in.readInt("Unesite broj a: ");
      suma = suma + a;
    }
    prosek = (suma * 1.0) / n;
    System.out.println("Aritmeticka sredina je: " + prosek);
  }
}
