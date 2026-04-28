# [Platinum I] Totoro - 25508

[문제 링크](https://www.acmicpc.net/problem/25508)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 8, 정답: 4, 맞힌 사람: 4, 정답 비율: 50.000%

### 분류

수학, 자료 구조, 그래프 이론, 그래프 탐색, 너비 우선 탐색, 분리 집합, 확률론, 기댓값의 선형성

### 문제 설명

<p><em>&ldquo;Tonari no To to ro Totoro, To to ro Totoro&rdquo;</em></p>

<p>Totoro ima $K$ permutacija $p_1, \dots , p_K$ duljine $N$.</p>

<p>Neka je $S$ skup svih permutacija koje je moguće dobiti komponiranjem konačnog broja permutacija $p_i$. Kompozicija dvije permutacije $&pi;$ i $&tau;$ na mjestu $i$ ima element $&pi;(&tau; (i))$. Na primjer, kompozicija permutacija $&pi; = (1, 3, 2)$ i $&tau; = (2, 3, 1)$ jednaka je $&pi; ◦ &tau; = (3, 2, 1)$. Dozvoljeno je komponirati iste permutacije vi&scaron;e puta.</p>

<p>Jasno je da je $S$ konačan skup, jer je sadržan u skupu svih permutacija duljine $N$.</p>

<p>Zanima nas <strong>prosječan broj inverzija permutacija u skupu</strong> $S$. Broj inverzija $I(&pi;)$ permutacije $&pi;$ jednak je broju uređenih parova brojeva $1 &le; i &lt; j &le; N$ za koje je $&pi;(i) &gt; &pi;(j)$.</p>

<p>Formalno, zanima nas $\frac{1}{|S|}\sum_{&pi;&isin;S}{I(&pi;)}$. Može se dokazati da je odgovor moguće napisati kao skraćeni razlomak $\frac{A}{B}$, gdje $B$ nije djeljiv s $10^9 + 7$. Ispi&scaron;ite $AB^{-1}$ modulo $10^9 + 7$, odnosno broj $X$ takav da je $0 &le; X &lt; 10^9 + 7$ i $X &middot; B &equiv; A \pmod {10^9 + 7}$.</p>

### 입력

<p>U prvom su retku prirodni brojevi $K$ i $N$ iz teksta zadatka.</p>

<p>U $i$-tom od sljedećih $K$ redaka nalazi se permutacija $p_i$, prikazana kao niz od $N$ različitih brojeva od $1$ do $N$, odvojenih razmakom.</p>

### 출력

<p>U jedinom retku ispi&scaron;ite odgovor modulo $10^9 + 7$.</p>

### 힌트

<p>Poja&scaron;njenje prvog probnog primjera: Primijetimo da je $S = \{(2, 3, 1),(3, 1, 2),(1, 2, 3)\}$. Prva permutacija ima dvije inverzije, druga isto dvije inverzije, a zadnja je identiteta i nema inverzija. Zato je prosječan broj inverzija $\frac{4}{3}$, &scaron;to odgovara ispisanom broju modulo $10^9 + 7$.</p>

<p>Poja&scaron;njenje drugog probnog primjera: Može se provjeriti da je $S$ jednak skupu svih permutacija skupa $\{1, 2, 3, 4, 5\}$, tj. komponiranjem danih permutacija je moguće dobiti sve ostale permutacije.</p>

<p>Poja&scaron;njenje trećeg probnog primjera: U ovom primjeru vrijedi $|S| = 20$, te je odgovor jednak razlomku $\frac{149}{10}$ modulo $10^9 + 7$.</p>