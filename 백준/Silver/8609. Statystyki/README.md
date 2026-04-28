# [Silver IV] Statystyki - 8609

[문제 링크](https://www.acmicpc.net/problem/8609)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 72, 정답: 30, 맞힌 사람: 16, 정답 비율: 28.571%

### 분류

구현, 문자열

### 문제 설명

<p>W Bajtocji od niedawna wydawana jest nowa gazeta&nbsp;<i>BajtNews</i>. O dziwo, mieszkańcy Bajtocji wcale nie interesują się treścią publikowanych w niej artykuł&oacute;w, a jedynie statystykami, kt&oacute;re ich dotyczą. Niekt&oacute;rzy z nich stali się już tak leniwi, że nie chcą sami tworzyć statystyk, dlatego poprosili Ciebie o napisanie programu, kt&oacute;ry będzie przygotowywał je automatycznie.</p>

<p>Bajtocjanie chcą znać liczby wystąpień następujących obiekt&oacute;w w artykułach:</p>

<ol>
	<li><b>spacji</b>, czyli pojedynczych odstęp&oacute;w;</li>
	<li><b>liczb</b>, czyli ciągłych (tzn. jednokawałkowych) fragment&oacute;w tekstu złożonych z cyfr (<code>0</code>&nbsp;-&nbsp;<code>9</code>), sąsiadujących z każdej strony ze znakiem niebędącym cyfrą lub z początkiem lub końcem tekstu;</li>
	<li><b>sł&oacute;w</b>, czyli ciągłych fragment&oacute;w złożonych z małych (<code>a</code>&nbsp;-&nbsp;<code>z</code>) lub wielkich (<code>A</code>&nbsp;-&nbsp;<code>Z</code>) liter alfabetu angielskiego, sąsiadujących z każdej strony ze znakiem niebędącym literą lub z początkiem lub końcem tekstu;</li>
	<li><b>zdań</b>, czyli sp&oacute;jnych fragment&oacute;w tekstu zakończonych kropką (i niezawierających innych kropek w środku), zawierających co najmniej jedno słowo; każde zdanie sąsiaduje z lewej strony albo z kropką, albo z początkiem tekstu;</li>
	<li><b>palindrom&oacute;w</b>, czyli sł&oacute;w symetrycznych - takich sł&oacute;w (gdzie słowo jest rozumiane w sensie punktu trzeciego), kt&oacute;re czytane wprost i wspak mogą się r&oacute;żnić co najwyżej wielkością liter, np.&nbsp;<code>Abba</code>.</li>
</ol>

<p>Napisz program, kt&oacute;ry:</p>

<ul>
	<li>wczyta ze standardowego wejścia artykuł oraz spis rodzaj&oacute;w obiekt&oacute;w, kt&oacute;re mają zostać przeanalizowane,</li>
	<li>wyznaczy żądane statystyki,</li>
	<li>wypisze wynik na standardowe wyjście.</li>
</ul>

### 입력

<p>W pierwszym wierszu wejścia znajduje się jedna liczba całkowita $n$&nbsp;($1 &le; n &le; 5$) oznaczająca liczbę żądanych rodzaj&oacute;w statystyk. W drugim wierszu znajduje się $n$&nbsp;liczb całkowitych $a_i$&nbsp;($1 &le; a_i &le; 5$), pooddzielanych pojedynczymi odstępami i oznaczających numery typ&oacute;w obiekt&oacute;w, kt&oacute;re należy zliczyć. Numery odpowiadają kolejności, w jakiej r&oacute;żne rodzaje obiekt&oacute;w zostały opisane powyżej (np. $a_i = 3$&nbsp;oznacza żądanie zliczenia sł&oacute;w w tekście). Możesz założyć, że liczby $a_i$&nbsp;są parami r&oacute;żne.</p>

<p>Trzeci wiersz wejścia zawiera całą treść artykułu. Może się ona składać z następujących znak&oacute;w:</p>

<ul>
	<li>cyfr:&nbsp;<code>0</code>&nbsp;-&nbsp;<code>9</code>;</li>
	<li>liter:&nbsp;<code>a</code>&nbsp;-&nbsp;<code>z</code>&nbsp;oraz&nbsp;<code>A</code>&nbsp;-&nbsp;<code>Z</code>;</li>
	<li>odstęp&oacute;w (spacji) oraz tabulacji;</li>
	<li>znak&oacute;w interpunkcyjnych: &#39;<code>,</code>&#39; (przecinek), &#39;<code>.</code>&#39; (kropka), &#39;<code>!</code>&#39; (wykrzyknik), &#39;<code>?</code>&#39; (pytajnik).</li>
</ul>

<p>Liczba znak&oacute;w w treści artykułu nie przekroczy $1\,000\,000$. Możesz r&oacute;wnież założyć, że:</p>

<ul>
	<li>w co najmniej 20% przypadk&oacute;w testowych należy zliczać tylko statystyki pierwszego rodzaju (spacje),</li>
	<li>w co najmniej 40% przypadk&oacute;w testowych należy zliczać tylko statystyki pierwszego oraz drugiego rodzaju (spacje i liczby),</li>
	<li>w co najmniej 60% przypadk&oacute;w testowych należy zliczać tylko statystyki rodzaj&oacute;w od 1 do 3 (spacje, liczby i słowa),</li>
	<li>w co najmniej 80% przypadk&oacute;w testowych należy zliczać tylko statystyki rodzaj&oacute;w od 1 do 4 (spacje, liczby, słowa oraz zdania).</li>
</ul>

### 출력

<p>W pierwszym i jedynym wierszu wyjścia Tw&oacute;j program powinien wypisać $n$&nbsp;liczb całkowitych pooddzielanych pojedynczymi odstępami, oznaczających kolejne żądane rodzaje statystyk.</p>

### 힌트

<p>W przykładzie żądane są wszystkie rodzaje statystyk w następującej kolejności:</p>

<ul>
	<li>(2.) liczby, kt&oacute;re są dwie (<code>5</code>&nbsp;oraz&nbsp;<code>45</code>);</li>
	<li>(4.) zdania, kt&oacute;re są dwa;</li>
	<li>(1.) spacje, kt&oacute;re są trzy;</li>
	<li>(3.) słowa - jest ich cztery (<code>domEK</code>,&nbsp;<code>K</code>,&nbsp;<code>k</code>&nbsp;oraz&nbsp;<code>aLA</code>);</li>
	<li>(5.) palindromy - są trzy (<code>K</code>,&nbsp;<code>k</code>&nbsp;oraz&nbsp;<code>aLA</code>).</li>
</ul>