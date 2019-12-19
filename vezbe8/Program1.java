class Program1 {
  static int f(int n, int r) {
    if (n < r) {
      return 2;
    }
    return (n % 2 == 1) ? (f(n-2, r) - g(n-1, r) + f(n-r+1, r) - g(n-r, r)) : (-f(n-1, r) + g(n-1, r) - g(n-2, r) - f(n-r, r));
  }
  
  static int g(int n, int r) {
    return n < r ? -1 : 2*g(n-1, r) - 2*f(n-r, r) + g(n-r+1, r);
  }
  
  static int f_akum(int[] f, int[] g, int i, int n, int r) {
    if (n < r) {
      return 2;
    }
    if (i > n) {
      return f[r-1];
    }
    
    int fTmp = (i % 2 == 1) ? f[r-2] - g[r-1] + f[1] - g[0] : -f[r-1] + g[r-1] - g[r-2] - f[0];
    int gTmp = 2*g[r-1] - 2*f[0] + g[1];
    for (int j = 1; j < r; j++) {
      f[j-1] = f[j];
      g[j-1] = g[j];
    }
    f[r-1] = fTmp;
    g[r-1] = gTmp;
    
    return f_akum(f, g, i + 1, n, r);
  }
  
  static int f_iter(int n, int r) {
    if (n < r) {
      return 2;
    }
    int[] f = new int[r];
    int[] g = new int[r];
    for (int i = 0; i < r; i++) {
      f[i] = 2;
      g[i] = -1;
    }
    
    for (int i = r; i <= n; i++) {
      int fTmp = (i % 2 == 1) ? f[r-2] - g[r-1] + f[1] - g[0] : -f[r-1] + g[r-1] - g[r-2] - f[0];
      int gTmp = 2*g[r-1] - 2*f[0] + g[1];
      for (int j = 1; j < r; j++) {
        f[j-1] = f[j];
        g[j-1] = g[j];
      }
      f[r-1] = fTmp;
      g[r-1] = gTmp;
    }
    
    return f[r-1];
  }
  
  public static void main(String[] args) {
    int n;
    do {
      n = Svetovid.in.readInt("Unesite n [0, 30]: ");
    } while (!(0 <= n && n <= 30));
    int r;
    do {
      r = Svetovid.in.readInt("Unesite r [5, 20]: ");
    } while (!(5 <= r && r <= 20));
    
    int[] fArr = new int[r];
    int[] gArr = new int[r];
    for (int i = 0; i < r; i++) {
      fArr[i] = 2;
      gArr[i] = -1;
    }
    
    System.out.println(f(n, r) + " " + f_akum(fArr, gArr, r, n ,r) + " " + f_iter(n, r));
  }
}
