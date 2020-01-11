# Vežbe 9

**Bitno!** Pre početka, morate da ubacite `PolinomN.java` u folder u kom se nalazi fajl koji ćete kompajlirati. Tj. vaš program i `PolinomN.java` moraju da se nalaze u istom folderu. Ako to ne uradite, vaš kod se neće kompajlirati. Kada se kompajlira program, morate imati otvoren fajl `PolinomN.java` u Dr. Javi da bi se i on kompajlirao.

# Zadatak 1

Koristeći klasu `PolinomN`, napisati program koji formira i štampa:

1. p(x) = 3x<sup>2</sup>
2. q(x) = 6
3. r(x) = 4x<sup>3</sup> - 2.5x + 8
4. s(x) = polinom koji unosi korisnik sa tastature
5. t(x) = (p(x) + q(x)) * (r(x) - s(x))
6. u(x) = 2t(x)
7. v = u(1)
8. w(x) = u'(x)
9. c(x) = w(p(x))

Štampu polinoma vršiti na sledeći način.
```java
System.out.print("p(x) = ");
PolinomN.stampaj(p);
System.out.println();
```
