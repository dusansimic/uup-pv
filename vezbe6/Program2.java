class Program2 {
  public static void main(String[] args) {
    int n;
    do {
      n = Svetovid.in.readInt("Unesite prirodan broj n: ");
    } while (n <= 0);
    
    int[] nizA = new int[n];
    for (int i = 0; i < n; i++) {
      nizA[i] = Svetovid.in.readInt("Unesite " + (i + 1) + ". element niza: ");
    }
    int[] nizB = new int[n];
    for (int i = 0; i < n; i++) {
      nizB[i] = Svetovid.in.readInt("Unesite " + (i + 1) + ". element niza: ");
    }
    
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (nizB[j] != 0 && nizA[i] % nizB[j] == 0) {
          System.out.println("(" + nizA[i] + ", " + nizB[j] + ")");
        }
      }
    }
  }
}