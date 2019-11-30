class Program3 {
  public static void main(String[] args) {
    String unos = Svetovid.in.readLine("Unesite neki string: ");
    
    int[] slova = new int[26];
    
    for (int i = 0; i < unos.length(); i++) {
      char karakter = Character.toUpperCase(unos.charAt(i));
      if (karakter >= 'A' && karakter <= 'Z') {
        slova[karakter - 'A']++;
      }
    }
    
    for (int i = 0; i < slova.length; i++) {
      System.out.print(((char) (i + 'A')) + " ");
      for (int j = 0; j < slova[i]; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}