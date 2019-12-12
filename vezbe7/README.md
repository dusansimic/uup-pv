# Vežbe 7

# Zadatak 1

Napisati program koji za dati ceo broj n, `0 <= n <= 42`, ispisuje vrednost elementa reukurentnog niza `f(n)`. Niz je definisan na sledeći način:

`f(n) = f(n-1) + f(n-3) - 2f(n-4)`, poslednja cifra `n >= 5`

`f(n) = 3f(n-1) - f(n-2) - f(n-4)`, poslednja cifra `n < 5`

`f(0) = 1`

`f(1) = 3`

`f(2) = 2`

`f(3) = 1`

Element `f(n)` izračunati:
1. rekurzivno preko definicije,
2. rekurzivno pomoću akumilirajućeg parametra,
3. iterativno.
