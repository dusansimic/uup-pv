class Zadatak1 {
  public static void main(String[] args) {
    String prvi = Svetovid.in.readLine("Unesite prvi string: ");
    String drugi = Svetovid.in.readLine("Unesite drugi string: ");
    
    if (prvi.length() != drugi.length()) {
      System.out.println("Stringovi nisu jednaki!");
    } else {
      boolean okej = true;
      for (int i = 0; i < prvi.length(); i++) {
        if (Character.toLowerCase(prvi.charAt(i)) != Character.toLowerCase(drugi.charAt(i))) {
          System.out.println("Stringovi nisu jednaki!");
          okej = false;
        }
      }
      if (okej) {
        System.out.println("Stringovi jesu jednaki!");
      }
    }
  }
}