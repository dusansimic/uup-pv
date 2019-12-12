class Program1 {
  static int f(int n) {
    if (n == 0) {
      return 1;
    } else if (n == 1) {
      return 3;
    } else if (n == 2) {
      return 2;
    } else if (n == 3) {
      return 1;
    } else if (n % 10 < 5) {
      return 3 * f(n - 1) - f(n - 2) - f(n - 4);
    } else {
      return f(n - 1) + f(n - 3) - 2 * f(n - 4);
    }
  }
  
  static int f_akum(int f0, int f1, int f2, int f3, int i, int n) {
    if (n < 4) {
      if (n == 0) {
        return 1;
      } else if (n == 1) {
        return 3;
      } else if (n == 2) {
        return 2;
      } else {
        return 1;
      }
    } else if (i > n) {
      return f3;
    } else if (i % 10 < 5) {
      return f_akum(f1, f2, f3, 3 * f3 - f2 - f0, i + 1, n);
    } else {
      return f_akum(f1, f2, f3, f3 + f1 - 2 * f0, i + 1, n);
    }
  }
  
  static int f_iter(int n) {
    int[] f = {1, 3, 2, 1};
    if (n < 4) {
      return f[n];
    }
    
    for (int i = 4; i <= n; i++) {
      int fTmp = i % 10 < 5 ? 3 * f[3] - f[2] - f[0] : f[3] + f[1] - 2 * f[0];
      f[0] = f[1];
      f[1] = f[2];
      f[2] = f[3];
      f[3] = fTmp;
    }
    
    return f[3];
  }
  
  public static void main(String[] args) {
    int n;
    do {
      n = Svetovid.in.readInt("Unesite n [0, 42]: ");
    } while (!(0 <= n && n <= 42));
    
    System.out.println(f(n) + " " + f_akum(1, 3, 2, 1, 4, n) + " " + f_iter(n));
  }
}