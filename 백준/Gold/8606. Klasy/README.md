# [Gold V] Klasy - 8606

[문제 링크](https://www.acmicpc.net/problem/8606)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 21, 정답: 9, 맞힌 사람: 8, 정답 비율: 66.667%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>W Bajtocji dzieci grają w ciekawą odmianę gry w klasy. Na chodniku jest namalowany kwadrat o boku $n$, podzielony na $n^2$&nbsp;jednakowych p&oacute;l. Zadaniem jednego z dzieci, zwanego dalej zawodnikiem, jest ponumerowanie wszystkich p&oacute;l w ściśle określony spos&oacute;b. Przed grą zawodnikowi wyznaczany jest kierunek świata: p&oacute;łnoc, południe, zach&oacute;d lub wsch&oacute;d oraz dozwolony rodzaj skrętu: prawo lub lewo.</p>

<p>Wyznaczone dziecko wchodzi na wybrane przez siebie pole - jedno z czterech p&oacute;l przy wierzchołkach kwadratu, zwraca się w wyznaczonym kierunku świata i rozpoczyna numerowanie od postawienia liczby $1$&nbsp;na polu startowym. W każdym ruchu zawodnik:</p>

<ul>
	<li>idzie naprz&oacute;d o jedno pole, o ile w wyniku tego ruchu pozostanie nadal wewnątrz kwadratu, a pole, na kt&oacute;re przejdzie, jest wolne, tj. jeszcze nieponumerowane;</li>
	<li>w przeciwnym przypadku wykonuje skręt w dozwolonym kierunku, ale tylko jeden, i idzie naprz&oacute;d o jedno pole.</li>
</ul>

<p>Każde kolejne odwiedzone pole zawodnik numeruje kolejną liczbą naturalną. Dodatkowo zakładamy, że w pierwszym ruchu zawodnik nie może wykonać skrętu, a jedynie p&oacute;jść naprz&oacute;d w wyznaczonym kierunku. Pole startowe musi więc zostać wybrane z rozwagą. Jeżeli na przykład kwadrat ma bok długości $5$, zadany został kierunek p&oacute;łnoc i skręt w prawo, to doświadczony zawodnik wybrałby jako pole startowe r&oacute;g południowo-zachodni, a cały ponumerowany kwadrat wyglądałby tak:</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/adabf349-f983-4575-91d8-50383d71b1ab/-/preview/" /></p>

<p>Twoim zadaniem jest napisanie programu, kt&oacute;ry wypisze zawartość pewnego zadanego wycinka kwadratu wypełnionego przez dzieci.</p>

### 입력

<p>W pierwszym wierszu standardowego wejścia znajdują się pooddzielane pojedynczymi odstępami: liczba całkowita $n$&nbsp;($2 &le; n &le; 5\,000$), oznaczająca długość boku kwadratu, oraz dwa wyrazy oznaczające kierunek świata (jedno ze sł&oacute;w:&nbsp;<code>POLNOC</code>,&nbsp;<code>POLUDNIE</code>,&nbsp;<code>ZACHOD</code>&nbsp;lub&nbsp;<code>WSCHOD</code>) i dozwolony skręt (jedno ze sł&oacute;w:&nbsp;<code>PRAWO</code>&nbsp;lub&nbsp;<code>LEWO</code>).</p>

<p>W drugim wierszu wejścia znajdują się cztery liczby całkowite $x_1$, $x_2$, $y_1$, $y_2$&nbsp;($1 &le; x_1 &le; x_2 &le; n$, $1 &le; y_1 &le; y_2 &le; n$, $(x_2-x_1) \cdot (y_2 - y_1) &le; 1\,000\,000$) oznaczające odpowiednio pierwszą i ostatnią kolumnę oraz pierwszy i ostatni wiersz wycinka, kt&oacute;ry należy wypisać. Kolumny są ponumerowane od $1$&nbsp;do $n$&nbsp;z zachodu na wsch&oacute;d, zaś wiersze - od $1$&nbsp;do $n$&nbsp;z południa na p&oacute;łnoc.</p>

### 출력

<p>Tw&oacute;j program powinien wypisać na standardowe wyjście dokładnie $y_2 - y_1 + 1$&nbsp;wierszy, a w każdym z nich po $x_2 - x_1 + 1$&nbsp;liczb pooddzielanych pojedynczymi odstępami. Mają one przedstawiać kolejne wiersze wycinka ponumerowanego kwadratu, podane w kolejności od najbardziej wysuniętego na p&oacute;łnoc do położonego najbardziej na południu.</p>