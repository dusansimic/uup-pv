class Program1 {
  static void stampajPolinom(String message, Polinom p) {
    System.out.print(message);
    PolinomN.stampaj(p);
    System.out.println();
  }
  
  static void stampajBroj(String message, double broj) {
    System.out.print(message);
    System.out.println(broj);
  }
  
  static Polinom izvod(Polinom p) {
    if (p == null) {
      return null;
    }
    
    Polinom rez = new Polinom();
    if (p.st <= 0) {
      return rez;
    }
    
    rez.st = p.st - 1;
    for (int i = 0; i <= rez.st; i++) {
      rez.k[i] = p.k[i+1]*(i+1);
    }
    
    return rez;
  }
  
  static Polinom kompozicija(Polinom f, Polinom g) {
    if (f == null || g == null) {
      return null;
    }
    
    if (g.st == -1) {
      return f;
    }
    
    Polinom rez = new Polinom();
    if (f.st == -1) {
      return rez;
    }
    
    rez.k[0] = f.k[0];
    for (int i = 1; i <= f.st; i++) {
      Polinom acum = PolinomN.kopiraj(g);
      for (int j = 1; j < i; j++) {
        acum = PolinomN.puta(acum, g);
      }
      acum = PolinomN.brojPuta(acum, f.k[i]);
      rez = PolinomN.saberi(rez, acum);
    }
    
    return rez;
  }
  
  public static void main(String[] args) {
    // a)
    Polinom p = new Polinom();
    p.st = 2;
    p.k[2] = 3;
    stampajPolinom("a) p(x) = ", p);
    
    // b)
    Polinom q = new Polinom();
    q.st = 0;
    q.k[0] = 6;
    stampajPolinom("b) q(x) = ", q);
    
    // c)
    Polinom r = new Polinom();
    r.st = 3;
    r.k[0] = 8;
    r.k[1] = 2.5;
    r.k[3] = 4;
    stampajPolinom("c) r(x) = ", r);
    
    // d)
    Polinom s = new Polinom();
    s = PolinomN.ucitaj();
    stampajPolinom("d) s(x) = ", s);
    
    // e)
    Polinom t = new Polinom();
    t = PolinomN.puta(PolinomN.saberi(p, q), PolinomN.oduzmi(r, s));
    if (t != null) {
      stampajPolinom("e) t(x) = ", t);
    }
    
    // f)
    Polinom u = new Polinom();
    u = PolinomN.brojPuta(t, 2);
    stampajPolinom("f) u(x) = ", u);
    
    // g)
    Polinom v = new Polinom();
    double vRez = PolinomN.izracunaj(1.0, u);
    stampajBroj("g) v(x) = ", vRez);
    
    // h)
    Polinom w = new Polinom();
    w = izvod(u);
    stampajPolinom("h) w(x) = ", w);
    
    // i)
    Polinom c = new Polinom();
    c = kompozicija(w, p);
    stampajPolinom("i) c(x) = ", c);
  }
}