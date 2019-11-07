class V5Z3 {
  public static void main(String[] args) {
    char znak;
    int ms = 0; 
    int vs = 0;
    int iz = 0;
    int ostali = 0;
    znak = Svetovid.in.readChar("Unesite znak: ");
    while(znak != '.') {
      if ('a' <= znak && znak <= 'z') {
        ms++;
      } 
      else if ('A' <= znak && znak <= 'Z') {
        vs++;
      } 
      else if (znak == ',' || znak == ';' || znak == ':' || znak == '?' || znak == '!') {
        iz++;
      }
      else {
        ostali++;
      }
      znak = Svetovid.in.readChar("Unesite znak: ");
    }
    System.out.println("Unetih malih slova: " + ms);
    System.out.println("Unetih velikih slova: " + vs);
    System.out.println("Unetih i. znakova: " + iz);
    System.out.println("Unetih ostalih znakova: " + ostali);
  }
}