class Zadatak3 {
  public static void main(String argv[]) {
    int m;
    do {
      m = Svetovid.in.readInt("Unesite brojevni sistem: ");
    } while (m < 2 || m > 10);
    
    int broj;
    boolean dobarBroj = true;
    do {
      broj = Svetovid.in.readInt("Unesite broj u sistemu m: ");
      
      int tmpBroj = broj;
      while (tmpBroj > 0) {
        dobarBroj = (tmpBroj % 10) < m;
        tmpBroj /= 10;
      }
    } while (!dobarBroj);
    
    int dekadniBroj = 0;
    int i = 0;
    while (broj > 0) {
      dekadniBroj += (broj % 10) * Math.pow(m, i++);
      broj /= 10;
    }
    
    System.out.println(dekadniBroj);
  }
}
