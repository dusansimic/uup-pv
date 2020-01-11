class Program1 {
  static void stampajPolinom(String message, Polinom p) {
    System.out.print(message);
    PolinomN.stampaj(p);
    System.out.println();
  }
  
  static void uvecajNeNula(Polinom p) {
    if (p == null) {
      System.out.println("Polinom je null");
      return;
    }
    if (p.st == -1) {
      System.out.println("Polinom je nula polinom");
      return;
    }
    
    for (int i = 0; i <= p.st; i++) {
      if (p.k[i] > 0) {
        p.k[i]++;
      }
    }
    PolinomN.nadjiStepen(p);
    stampajPolinom("c) uvecan svaki ne nula koeficijent = ", p);
  }
  
  static void stampajNajmanjiMonom(Polinom p) {
    if (p == null) {
      return;
    }
    if (p.st == -1) {
      System.out.println("d) monom sa najmanjim koeficijentom je 0*x^0");
    }
    int najmanjiMonom = 0;
    for (int i = 1; i <= p.st; i++) {
      if (p.k[i] < p.k[najmanjiMonom]) {
        najmanjiMonom = i;
      }
    }
    
    Polinom mon = new Polinom();
    mon.st = najmanjiMonom;
    mon.k[najmanjiMonom] = p.k[najmanjiMonom];
    stampajPolinom("d) monom sa najmanjim koeficijentom je ", mon);
  }
  
  public static void main(String[] args) {
    // a)
    Polinom p = PolinomN.ucitaj();
    Polinom q = PolinomN.ucitaj();
    stampajPolinom("p(x) = ", p);
    stampajPolinom("q(x) = ", q);
    Polinom[] rez1 = PolinomN.deli(p, q);
    stampajPolinom("a) ostatak pri deljenju p i q = ", rez1[1]);
    
    // b)
    Polinom tmp1 = new Polinom();
    tmp1.st = 4;
    tmp1.k[4] = 2;
    tmp1.k[1] = 3;
    Polinom r = PolinomN.saberi(PolinomN.oduzmi(q, PolinomN.brojPuta(p, 3)), tmp1);
    stampajPolinom("b) r(x) = ", r);
    
    // c)
    uvecajNeNula(r);
    
    // d)
    stampajNajmanjiMonom(r);
  }
}