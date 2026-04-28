# [Platinum V] Sretan - 15201

[문제 링크](https://www.acmicpc.net/problem/15201)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 15, 정답: 4, 맞힌 사람: 4, 정답 비율: 50.000%

### 분류

삼분 탐색

### 문제 설명

<p>Za niz cijelih brojeva a<sub>1</sub>, a<sub>2</sub>, . . . , a<sub>n</sub> kažemo da je sretan ako je svaki element niza (osim prvog i zadnjeg) jednak zbroju njemu susjednih elemenata: a<sub>j</sub> = a<sub>j&minus;1</sub> + a<sub>j+1</sub>.</p>

<p>Zadan je niz cijelih brojeva, u svakom koraku možemo odabrati jedan element niza te ga povećati ili smanjiti za jedan. Odredite minimalan broj koraka potreban da dobijemo sretan niz.</p>

### 입력

<p>U prvom redu se nalazi prirodni broj n (3 &le; n &le; 300 000) &mdash; broj elemenata niza. Sljedeći red sadrži n cijelih brojeva a<sub>1</sub>, a<sub>2</sub>, . . . , a<sub>n</sub> (&minus;10<sup>9</sup> &le; a<sub>j</sub> &le; 10<sup>9</sup>) &mdash; zadani niz.</p>

### 출력

<p>Ispi&scaron;ite traženi minimalni broj koraka.</p>

### 힌트

<p>U drugom primjeru test podataka, sa 6 koraka možemo doći do sretnog niza (2 2 0 -2).</p>