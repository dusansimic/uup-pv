class Program2 {
  public static void main(String args[]) {
    char input = Svetovid.in.readChar("Unesite nesto: ");
    if (input >= 'A' && input <= 'Z') {
      System.out.println("Uneto je veliko slovo!");
    } else if (input >= 'a' && input <= 'z') {
      System.out.println("Uneto je malo slovo!");
    } else if (input >= '0' && input <= '9') {
      System.out.println("Unet je broj!");
    } else {
      System.out.println("Unet je specijalni znak!");
    }
  }
}