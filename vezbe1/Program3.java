class Program3 {
  public static void main(String args[]) {
    int svota = Svetovid.in.readInt("Unesite svotu novca: ");
    
    System.out.println("Optimalno je:\n");
    int apoeni100 = svota / 100;
    System.out.println("\t100 -> " + apoeni100);
    svota %= 100;
    int apoeni50 = svota / 50;
    System.out.println("\t50 -> " + apoeni50);
    svota %= 50;
    int apoeni20 = svota / 20;
    System.out.println("\t20 -> " + apoeni20);
    svota %= 20;
    int apoeni10 = svota / 10;
    System.out.println("\t10 -> " + apoeni10);
    svota %= 10;
    int apoeni5 = svota / 5;
    System.out.println("\t5 -> " + apoeni5);
    svota %= 5;
    int apoeni2 = svota / 2;
    System.out.println("\t2 -> " + apoeni2);
    svota %= 2;
    int apoeni1 = svota;
    System.out.println("\t1 -> " + apoeni1);
  }
}