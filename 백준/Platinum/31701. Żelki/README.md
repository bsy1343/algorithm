# [Platinum V] Żelki - 31701

[문제 링크](https://www.acmicpc.net/problem/31701)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 20, 정답: 7, 맞힌 사람: 6, 정답 비율: 31.579%

### 분류

다이나믹 프로그래밍, 배낭 문제

### 문제 설명

<p>Bajtek uwielbia żelki. W nowo otwartym sklepie (kt&oacute;ry sprzedaje tylko żelki) można zakupić ich aż n rodzaj&oacute;w &ndash; i-ty z tych rodzaj&oacute;w opisany jest kolorem żelka, jego wagą w bajtogramach oraz ceną w bajtogroszach. Żelki sprzedawane są pojedynczo. Kolory żelk&oacute;w oznaczamy liczbami od 1 do k. W sklepie dostępna jest nieograniczona liczba żelk&oacute;w każdego rodzaju.</p>

<p>Bajtek poza żelkami uwielbia estetykę kolorystyczną. Pozwoli on sobie kupić jakiś multizbi&oacute;r żelk&oacute;w tylko i wyłącznie wtedy, gdy dla każdego koloru od 1 do k kupi dokładnie tyle samo żelk&oacute;w.</p>

<p>Bajtek poza żelkami i estetyką kolorystyczną uwielbia liczby. Dla każdej liczby całkowitej r z przedziału [0, m &minus; 1] zastanawia się on, ile co najmniej bajtogroszy musiałby wydać, aby kupić multizbi&oacute;r żelk&oacute;w, w kt&oacute;rym sumaryczna ich masa po podzieleniu przez m daje resztę r. Pom&oacute;ż mu i napisz program, kt&oacute;ry policzy za niego szukane wartości!</p>

### 입력

<p>W pierwszym wierszu standardowego wejścia znajdują się trzy liczby całkowite n, k i m (1 &le; n, k, m &le; 7 000), oznaczające odpowiednio liczbę sprzedawanych rodzaj&oacute;w żelk&oacute;w, liczbę kolor&oacute;w żelk&oacute;w oraz opisaną wartość m.</p>

<p>W każdym z kolejnych n wierszy znajdują się po trzy liczby całkowite. Liczby w i-tym z tych wierszy to kolejno k<sub>i</sub>, m<sub>i</sub> oraz c<sub>i</sub> (1 &le; k<sub>i</sub> &le; k; 1 &le; m<sub>i</sub> &le; m; 1 &le; c<sub>i</sub> &le; 10<sup>9</sup>) &ndash; odpowiednio kolor, masa w bajtogramach i cena w bajtogroszach żelk&oacute;w i-tego rodzaju.</p>

### 출력

<p>Na wyjściu powinno znaleźć się m wierszy. W i-tym z nich powinna znaleźć się jedna liczba całkowita &ndash; minimalna sumaryczna cena multizbioru żelk&oacute;w, kt&oacute;ry Bajtek może kupić i w kt&oacute;rym sumaryczna masa żelk&oacute;w w bajtogramach po podzieleniu przez m daje resztę i&minus;1. Jeśli taki multizbi&oacute;r nie istnieje, zamiast tego w tym wierszu powinna znaleźć się liczba &minus;1.</p>

### 힌트

<p>Wyjaśnienie przykładu: W pierwszym teście przykładowym:</p>

<ul>
	<li>Aby sumaryczna masa żelk&oacute;w była podzielna przez m = 6, Bajtek może nie kupić żadnego żelka &ndash; nie wyda on wtedy pieniędzy w og&oacute;le.</li>
	<li>Aby reszta z dzielenia łącznej masy żelk&oacute;w przez 6 wynosiła 1, Bajtek powinien kupić jeden żelek pierwszego rodzaju, dwa drugiego rodzaju i jeden trzeciego rodzaju. W ten spos&oacute;b zapłaci on 10 bajtogroszy i otrzyma po dwa żelki każdego z dw&oacute;ch kolor&oacute;w o sumarycznej masie r&oacute;wnej 7 bajtogram&oacute;w.</li>
	<li>Aby reszta z dzielenia łącznej masy żelk&oacute;w przez 6 wynosiła 5, Bajtek powinien kupić dwa żelki pierwszego rodzaju, trzy żelki drugiego rodzaju i jeden żelek trzeciego rodzaju.</li>
</ul>

<p>W drugim teście przykładowym nie są dostępne żadne żelki drugiego koloru &ndash; jedynym rozwiązaniem zadowalającym Bajtka jest niekupienie żadnych żelk&oacute;w.</p>