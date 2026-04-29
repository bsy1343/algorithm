# [Bronze I] Finaliści - 33817

[문제 링크](https://www.acmicpc.net/problem/33817)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 2048 MB

### 통계

제출: 102, 정답: 72, 맞힌 사람: 38, 정답 비율: 73.077%

### 분류

구현

### 문제 설명

<p>W tym roku postanowiłeś/aś w końcu dostać się do finału Potyczek! Zanim tego dokonasz, warto dowiedzieć się, jakie są dokładnie zasady kwalifikacji na finał. W Regulaminie konkursu znalazłeś/aś następujące punkty:</p>

<ul>
	<li>Po pięciu rundach zdalnych do finału konkursu zostanie zakwalifikowanych $20$ uczestników. Dziesięciu spośród nich to zawodnicy sklasyfikowani na miejscach od $1$ do $10$ na liście rankingowej A+B+C. Następnych dziesięciu to najwyżej sklasyfikowani zawodnicy z kolejnych miejsc, z wyłączeniem osób, które przynajmniej dwukrotnie uczestniczyły w finale Potyczek Algorytmicznych.</li>
	<li>Do finału mogą zostać zakwalifikowani jedynie zawodnicy, którzy są obywatelami Polski, bądź są rezydentami w Polsce, albo uczą się, studiują lub pracują w Polsce.</li>
	<li>W celu wyłonienia $20$ uczestników zakwalifikowanych do finału, najpierw z rankingu usuwani są uczestnicy, którzy nie mogą się do niego zaklasyfikować, oraz ci, którzy rezygnują z udziału w nim. Następnie, spośród pozostałych uczestników, $20$ finalistów wybieranych jest zgodnie z zasadami opisanymi powyżej.</li>
</ul>

<p>Twój kolega bardzo dobrze zna wszystkich zawodników i przewidział, jak będzie wyglądał tegoroczny ranking. Dał Ci listę n zawodników numerowanych liczbami od 1 do n w kolejności od największych wyników (na liście Twojego kolegi nie ma remisów). Dla każdego z zawodników wiesz, czy może i chce uczestniczyć w finale oraz ile razy wcześniej uczestniczył w finale.</p>

<p>Wyznacz listę $20$ zawodników, którzy zgodnie z regulaminem zostaną zakwalifikowani do finału.</p>

<p>Możesz założyć, że zawodników na liście jest wystarczająco dużo, żeby zgodnie z regulaminem obsadzić wszystkie $20$ miejsc.</p>

### 입력

<p>Pierwszy wiersz zawiera liczbę całkowitą $n$ ($20 ≤ n ≤ 10\, 000$), oznaczającą liczbę zawodników w rankingu Potyczek.</p>

<p>Kolejne n wierszy zawiera informacje o kolejnych zawodnikach. Każdy z nich zawiera słowo s oraz liczbę całkowitą $x$ ($s ∈ \{$<code>TAK</code>, <code>NIE</code>$\}$, $0 ≤ x &lt; 20$). Słowo <code>TAK</code> oznacza, że zawodnik może i chce uczestniczyć w finale, słowo <code>NIE</code> oznacza, że zawodnik nie może, bądź nie chce uczestniczyć w finale. Liczba x oznacza dotychczasową liczbę startów w finale danego zawodnika.</p>

### 출력

<p>Na wyjściu wypisz jeden wiersz zawierający $20$ liczb całkowitych pooddzielanych pojedynczymi odstępami i oznaczających numery zawodników zakwalifikowanych na finał Potyczek w porządku rosnącym.</p>

### 힌트

<p>Wyjaśnienie przykładu: Zawodnicy o numerach $1$, $2$, $7$, $8$, $11$, $15$, $17$, $19$, $29$ są pomijani, gdyż nie mogą/nie chcą uczestniczyć w finale. Dziecięciu najlepszych zawodników wśród pozostałych ma numery $3$, $4$, $5$, $6$, $9$, $10$, $12$, $13$, $14$, $16$. Następnie, pomijając zawodników o numerach $20$, $21$ oraz $31$, gdyż byli już w finale co najmniej dwukrotnie, otrzymujemy drugą dziesiątkę finalistów o numerach: $18$, $22$, $23^∗$, $24$, $25$, $26$, $27$, $28$, $30$, $32$.</p>

<hr>
<p>$^∗$Twój kolega przewiduje, że zawodnik numer $23$ wygra finał!</p>