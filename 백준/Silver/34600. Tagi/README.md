# [Silver II] Tagi - 34600

[문제 링크](https://www.acmicpc.net/problem/34600)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 19, 정답: 8, 맞힌 사람: 7, 정답 비율: 43.750%

### 분류

누적 합

### 문제 설명

<p>Markov veliki pomoćnik u organizaciji nastupa je robot Tagi. Kad god uhvate slobodan trenutak, Marko i Tagi vole igrati sljedeću igru: prvo Tagi odredi niz od $N$ prirodnih brojeva. Zatim Tagi mora čim brže odgovoriti na $M$ Markovih pitanja. U svakom pitanju Marka zanima koliki je zbroj brojeva u nizu od pozicije $L$ do pozicije $R$.</p>

<p>Naravno, Tagiju je to prelako pa su igru učinili još zanimljivijom. Marko će Tagiju u svakom pitanju zadati i broj za transformiranje $X$. Tagi će zatim brojeve od pozicije $L$ do pozicije $R$ transformirati na sljedeći način:</p>

<ul>
<li>Ako je broj <strong>paran</strong>, tada će njega transformirati u upola manji broj (tj., podijeliti će broj s $2$)</li>
<li>Ako je broj <strong>neparan</strong>, tada će taj broj transformirati u broj $X$.</li>
</ul>

<p>Nakon što Tagi transformira brojeve, zbrojit će ih i odgovoriti Marku na pitanje. A prije nego Marko postavi novo pitanje, Tagi će sve transformacije <strong>poništiti</strong>.</p>

<p>Iako je Tagi besprijekoran u svim ostalim zadacima, transformiranje brojeva mu ne ide tako lako. Pomozite mu odgovoriti na Markova pitanja!</p>

### 입력

<p>U prvom retku su prirodni brojevi $N$ i $M$ ($1 ≤ N ≤ 100\, 000$, $1 ≤ M ≤ 1\, 000\, 000$), broj brojeva u nizu i broj Markovih pitanja.</p>

<p>U sljedećem retku je $N$ prirodnih brojeva $A_i$ ($1 ≤ A_i ≤ 1\, 000\, 000\, 000$), brojevi u nizu.</p>

<p>Slijedi $M$ redaka po tri broja $L_i$, $R_i$ i $X_i$ ($1 ≤ L_i≤ R_i ≤ N$, $1 ≤ X_i ≤ 1\, 000\, 000\, 000$) koji označavaju da Marko u $i$-tom pitanju traži zbroj brojeva od pozicije $L_i$ do pozicije $R_i$ uz zadani broj za transformiranje $X_i$.</p>

### 출력

<p>U $M$ redova ispiši po jedan prirodan broj, redom odgovor na svako Markovo pitanje.</p>

### 힌트

<p>Opis prvog probnog primjera:</p>

<ol>
<li>upit: $7 + 2 + 1 + 7$</li>
<li>upit: $5 + 5$</li>
<li>upit: $9 + 9 + 2$</li>
<li>upit: $4$</li>
<li>upit: $1 + 1 + 16 + 6$</li>
</ol>