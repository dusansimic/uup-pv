class Zadatak4 {
  public static void main(String[] args) {
    int n;
    do {
      n = Svetovid.in.readInt("Unesite prirodan broj n: ");
    } while (n <= 0);
    
    int[][] matrica = new int[n][n];
    
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        matrica[i][j] = Svetovid.in.readInt("Unesite [" + i + "][" + j + "] broj: ");
      }
    }
    
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (matrica[i][j] > max) {
          max = matrica[i][j];
        }
      }
    }
    
    System.out.println("MAX -> " + max);
  }
}