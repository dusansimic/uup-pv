class Zadatak2 {
  public static void main(String args[]) {
    int a = Svetovid.in.readInt("Unesite a: ");
    
    int n;
    for (n = 0; n*(n + 1) < 2*a; n++);
    n--;
    System.out.println(n);
  }
}