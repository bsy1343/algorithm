# [Silver II] Żołnierze - 8631

[문제 링크](https://www.acmicpc.net/problem/8631)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 69, 정답: 15, 맞힌 사람: 14, 정답 비율: 25.926%

### 분류

조합론, 자료 구조, 해시를 사용한 집합과 맵, 수학, 정렬, 집합과 맵

### 문제 설명

<p>Na porannym apelu w koszarach wszyscy przebywający tam żołnierze muszą ustawić się w szeregu. Nie mogą jednak stanąć w dowolnej kolejności, tylko od najwyższego do najniższego. Najwyższy może przy tym stać zar&oacute;wno z lewej, jak i z prawej strony. Pom&oacute;ż im wyznaczyć liczbę sposob&oacute;w, na jakie mogą ustawić się poprawnie.</p>

<p>Dwa ustawienia żołnierzy uważamy za identyczne wtedy i tylko wtedy, gdy każdy żołnierz w obu ustawieniach ma tego samego sąsiada po lewej stronie (lub w obu nie ma go wcale) oraz w obu ustawieniach ma tego samego sąsiada po prawej stronie (lub w obu nie ma go wcale).</p>

<p>Napisz program, kt&oacute;ry:</p>

<ul>
	<li>wczyta ze standardowego wejścia opis wszystkich przebywających w koszarach żołnierzy,</li>
	<li>wyznaczy liczbę ustawień żołnierzy w jednym rzędzie w kolejności od najwyższego do najniższego,</li>
	<li>wypisze cztery ostatnie cyfry dziesiętne wyniku na standardowe wyjście.</li>
</ul>

### 입력

<p>W pierwszym wierszu wejścia znajduje się jedna liczba całkowita $n$&nbsp;($1 &le; n &le; 200\,000$), oznaczająca liczbę żołnierzy w koszarach. Drugi wiersz wejścia zawiera $n$&nbsp;liczb całkowitych $w_i$&nbsp;($1 &le; w_i &le; 10^9$), pooddzielanych pojedynczymi odstępami i oznaczających wysokości kolejnych żołnierzy.</p>

### 출력

<p>Tw&oacute;j program powinien wypisać w pierwszym i jedynym wierszu wyjścia cztery ostatnie cyfry dziesiętne liczby ustawień żołnierzy w jednym rzędzie w kolejności posortowanej względem ich wysokości. Jeżeli wynik jest mniejszy niż $1\,000$, to należy wypisać wszystkie jego cyfry.</p>

### 힌트

<p>Oto wszystkie poprawne ustawienia żołnierzy z przykładu (w nawiasach znajdują się wysokości żołnierzy, a poza nimi - ich numery, zgodne z kolejnością z wejścia):</p>

<ul>
	<li>3 (1), 1 (2), 7 (2), 2 (3), 4 (4), 5 (4), 6 (5)</li>
	<li>3 (1), 7 (2), 1 (2), 2 (3), 4 (4), 5 (4), 6 (5)</li>
	<li>3 (1), 1 (2), 7 (2), 2 (3), 5 (4), 4 (4), 6 (5)</li>
	<li>3 (1), 7 (2), 1 (2), 2 (3), 5 (4), 4 (4), 6 (5)</li>
	<li>6 (5), 4 (4), 5 (4), 2 (3), 1 (2), 7 (2), 3 (1)</li>
	<li>6 (5), 5 (4), 4 (4), 2 (3), 1 (2), 7 (2), 3 (1)</li>
	<li>6 (5), 4 (4), 5 (4), 2 (3), 7 (2), 1 (2), 3 (1)</li>
	<li>6 (5), 5 (4), 4 (4), 2 (3), 7 (2), 1 (2), 3 (1)</li>
</ul>