class Zadatak2 {
  public static void main(String[] args) {
    String prvi = Svetovid.in.readLine("Unesite prvi string: ");
    String drugi = Svetovid.in.readLine("Unesite drugi string: ");
    
    int duz = prvi.length() > drugi.length() ? drugi.length() : prvi.length();
    
    boolean jednaki = true;
    boolean prviVeci = false;
    boolean kraj = false;
    for (int i = 0; i < duz && !kraj; i++) {
      if (prvi.charAt(i) != drugi.charAt(i)) {
        jednaki = false;
        prviVeci = prvi.charAt(i) > drugi.charAt(i);
        kraj = true;
      }
    }
    if (jednaki && prvi.length() != drugi.length()) {
      jednaki = false;
      prviVeci = prvi.length() > drugi.length();
    }
    
    if (jednaki) {
      System.out.println("Leksikografski su jednaki!");
    } else if (prviVeci) {
      System.out.println("Prvi je leksikografski veci!");
    } else {
      System.out.println("Drugi je leksikografski veci!");
    }
  }
}