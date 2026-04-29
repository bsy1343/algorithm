# [Gold II] SLAGALICA - 34576

[문제 링크](https://www.acmicpc.net/problem/34576)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 9, 정답: 6, 맞힌 사람: 5, 정답 비율: 83.333%

### 분류

구현, 그래프 이론, 그래프 탐색, 너비 우선 탐색, 비트마스킹

### 문제 설명

<p>„Slavko, već dugo na natjecanju nije bila neka slagalica koju djeca trebaju složiti.“</p>

<p>„Da da, Mirko. Zadnja je bila na državnom prije ohoho vremena. Prošla su već tri tjedna.“</p>

<p>„Baš imam jednu dobru, svojevrsni omaž na legendarnu <em>Obratnu kocku</em>. Dobiješ tablicu s $N$ redaka i $M$ stupaca, a u svakom polju je upisan broj ili $0$ ili $1$.“</p>

<p>„Uhuhu već zvuči sočno. Koje su operacije i što želimo postići?“</p>

<p>„Jedina moguća operacija je da zamjeniš vrijednosti dvaju polja koja su susjedna u toj tablici. Susjedna se naravno misli u četiri smjera, gore, dolje, lijevo i desno. Treba u što manje operacija postići sljedeća dva svojstva:</p>

<ol>
<li>za svaki $x$ od $1$ do $N-1$ i za svaki $y$ od $1$ do $M$ vrijedi $p[x][y] &gt;= p[x+1][y]$</li>
<li>za svaki $x$ od $1$ do $N$ i za svaki $y$ od $1$ do $M-1$ vrijedi $p[x][y] &gt;= p[x][y+1]$</li>
</ol>

<p>Naravno, natjecatelje ćemo pitati u koliko najmanje operacija mogu postići da vrijede ta dva svojstva.“</p>

<p>„Genijalno! Sviđa mi se! Taman još jedan zadatak točno po mom ukusu - onaj kojeg ja ne znam riješiti, a oni sigurno znaju!“</p>

### 입력

<p>U prvom su retku prirodni brojevi $N$ i $M$ ($1 ≤ N, M ≤ 20$, $4 ≤ N \times M ≤ 20$), broj redaka i broj stupaca tablice.</p>

<p>U sljedećih $N$ redaka nalaze se po $M$ brojeva koji su ili $0$ ili $1$.</p>

### 출력

<p>Ispiši najmanji mogući broj operacija tako da tražena svojstva budu zadovoljena.</p>

### 힌트

<p>Opis drugog probnog primjera: Jedno od mogućih rješenja je da je prva operacija $(1,2)$ &lt;-&gt; $(1,3)$, druga $(3, 2)$ &lt;-&gt; $(3, 3)$, treća $(3, 1)$ &lt;-&gt; $(2, 1)$ i četvrta $(3, 2)$ &lt;-&gt; $(3, 1)$.</p>