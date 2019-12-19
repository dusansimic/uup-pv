# Vežbe 8

# Zadatak 1

Napisati program koji za dati ceo broj n, `0 <= n <= 30`, i r, `5 <= r <= 20`, ispisuje vrednost elementa rekurentnog niza `f(n)`.

Niz je definisan na sledeći način:

`f(n) = f(n-2) - g(n-1) + f(n-r+1) - g(n-r)`, za svako `n >= r` i `n neparno`

`f(n) = -f(n-1) + g(n-1) - g(n-2) - f(n-r)`, za svako `n >= r` i `n parno`

`g(n) = 2g(n-1) - 2f(n-r) + g(n-r+1)`, za svako `n >= r`

`f(n) = 2`, za svako n takvo da je `0 <= n < r`

`g(n) = -1`, za svako n takvo da je `0 <= n < r`

Element f(n) izračunati:
1. rekurzivno preko definicije,
2. rekurzivno pomoću akumulirajućeg parametra,
3. iterativno

Test primeri:
1. `n = 11   r = 5   590`
2. `n = 15   r = 14   12`
3. `n = 25   r = 15   8180`

