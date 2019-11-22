class Zadatak3 {
  public static void main(String[] args) {
    String a = Svetovid.in.readLine("Unesite string a: ");
    String b = Svetovid.in.readLine("Unesite string b: ");
    
    String manji = "", veci = "";
    int br = 0;
    if (a.length() > b.length()) {
      veci = a;
      manji = b;
    } else if (a.length() < b.length()) {
      manji = a;
      veci = b;
    } else {
      br += a == b ? 1 : 0;
    }
    
    for (int i = 0; i <= veci.length() - manji.length(); i++) {
      boolean sadrzi = true;
      for (int j = 0; j < manji.length(); j++) {
        sadrzi = manji.charAt(j) == veci.charAt(i + j);
      }
      br += sadrzi ? 1 : 0;
    }
    
    System.out.println("Sadrzi se " + br + " puta.");
  }
}