class Zadatak3 {
  public static void main(String argv[]) {
    int m = Svetovid.in.readInt("Unesite brojevni sistem: ");
    
    int broj = Svetovid.in.readInt("Unesite broj u sistemu m: ");
    
    int dekadniBroj = 0;
    int i = 0;
    while (broj > 0) {
      dekadniBroj += (broj % 10) * Math.pow(m, i++);
      broj /= 10;
    }
    
    System.out.println(dekadniBroj);
  }
}