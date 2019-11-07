class V5Z2 {
  public static void main(String[] args) {
   int a, b, c;
   int i = 0;
   a = Svetovid.in.readInt("Unesite vrednost za broj a: ");
   b = Svetovid.in.readInt("Unesite vrednost za broj b: ");
   c = Svetovid.in.readInt("Unesite vrednost za broj c: ");
   int min = b;
   while (a <= c && b>= c) {
     if (c < min) {
       min = c;
     }
     c = Svetovid.in.readInt("Unesite vrednost za broj c: ");
     i++;
   }
   System.out.println("Najmanji broj je: " + min);
   System.out.println("Broj unesenih elemenata je: " +  i);
  }
}