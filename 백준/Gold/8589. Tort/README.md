# [Gold I] Tort - 8589

[문제 링크](https://www.acmicpc.net/problem/8589)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 34, 정답: 12, 맞힌 사람: 9, 정답 비율: 30.000%

### 분류

이분 탐색, 매개 변수 탐색, 정렬

### 문제 설명

<p>Bajtek obchodzi dzisiaj swoje urodziny. Zdmuchnął już wszystkie świeczki z tortu urodzinowego oraz podzielił go na $(n+1)^2$&nbsp;kawałk&oacute;w. Niestety zrobił to w taki spos&oacute;b, że kawałki tortu są teraz r&oacute;żnych wielkości, niekt&oacute;re kawałki są większe, a inne mniejsze od pozostałych. Bajtek wybiera sw&oacute;j kawałek jako pierwszy i chciałby wybrać $k$-ty pod względem wielkości, czyli taki, w kt&oacute;rym $k-1$&nbsp;kawałk&oacute;w jest nie mniejszych od niego, a $(n+1)^2 - k$&nbsp;kawałk&oacute;w jest nie większych.</p>

<p>Wiemy, że tort urodzinowy Bajtka ma kształt prostokąta oraz że podzielił go $n$&nbsp;prostymi cięciami wzdłuż jednego z bok&oacute;w prostokąta i $n$&nbsp;prostymi cięciami wzdłuż drugiego z bok&oacute;w. Chcielibyśmy znać powierzchnię wybranego przez Bajtka kawałka tortu.</p>

### 입력

<p>W pierwszym wierszu standardowego wejścia znajdują się cztery liczby całkowite $a$, $b$, $n$&nbsp;oraz $k$&nbsp;pooddzielane pojedynczymi odstępami ($1 &le; a, b &le; 10^9$, $0 &le; n &le; 2 \cdot 10^5$, $1 &le; k &le; (n+1)^2$), oznaczające odpowiednio długości dw&oacute;ch bok&oacute;w tortu, liczbę cięć wykonanych przez Bajtka w każdym z kierunk&oacute;w oraz numer szukanego kawałka.</p>

<p>Drugi wiersz zawiera ciąg $n$&nbsp;liczb całkowitych $x_1, x_2, \dots , x_n$, ($0 &lt; x_i &lt; a)$, gdzie $x_i$&nbsp;oznacza miejsce $i$-tego cięcia wzdłuż jednego z bok&oacute;w prostokąta (jest to odległość od lewego boku prostokąta). Ponadto zachodzi ($x_j &lt; x_{j+1}$)&nbsp;dla $j = 1, \dots ,&nbsp;n-1$.</p>

<p>Trzeci wiersz zawiera ciąg $n$&nbsp;liczb całkowitych&nbsp;$y_1, y_2, \dots , y_n$, ($0 &lt; y_i &lt; b)$, gdzie $y_i$&nbsp;oznacza miejsce $i$-tego cięcia wzdłuż drugiego z bok&oacute;w prostokąta (jest to odległość od dolnego boku prostokąta). Ponadto zachodzi ($y_j &lt; y_{j+1}$)&nbsp;dla $j = 1, \dots ,&nbsp;n-1$.</p>

### 출력

<p>Pierwszy i jedyny wiersz standardowego wyjścia powinien zawierać jedną liczbę całkowitą, r&oacute;wną powierzchni $k$-tego pod względem wielkości kawałka tortu.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/e7d920bb-76c0-4f6d-babc-303e77c7405f/-/preview/" /></p>