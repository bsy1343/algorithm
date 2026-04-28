# [Platinum IV] Nawiasy - 8441

[문제 링크](https://www.acmicpc.net/problem/8441)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 39, 정답: 5, 맞힌 사람: 5, 정답 비율: 19.231%

### 분류

자료 구조, 세그먼트 트리

### 문제 설명

<p><em>Słowem nawiasowym</em>&nbsp;będziemy nazywali słowo złożone z dw&oacute;ch rodzaj&oacute;w znak&oacute;w: nawias&oacute;w otwierających, czyli &quot;(&quot;, oraz nawias&oacute;w zamykających, czyli &quot;)&quot;. Wśr&oacute;d wszystkich sł&oacute;w nawiasowych będziemy wyr&oacute;żniać&nbsp;<em>poprawne wyrażenia nawiasowe</em>. Są to takie słowa nawiasowe, w kt&oacute;rych występujące nawiasy można połączyć w pary w taki spos&oacute;b, że:</p>

<ul>
	<li>każda para składa się z nawiasu otwierającego oraz (występującego dalej w słowie nawiasowym) nawiasu zamykającego,</li>
	<li>dla każdej pary fragment słowa nawiasowego zawarty między nawiasami tej pary zawiera tyle samo nawias&oacute;w otwierających co zamykających.</li>
</ul>

<p>Na słowie nawiasowym można wykonywać operacje:</p>

<ul>
	<li><em>zamiany</em>, kt&oacute;ra zamienia <em>i</em>-ty nawias w słowie na przeciwny,</li>
	<li><em>sprawdzenia</em>, kt&oacute;ra sprawdza, czy słowo nawiasowe jest poprawnym wyrażeniem nawiasowym.</li>
</ul>

<p>Na pewnym słowie nawiasowym wykonywane są kolejno operacje zamiany lub sprawdzenia.</p>

<p>Napisz program, kt&oacute;ry:</p>

<ul>
	<li>wczyta ze standardowego wejścia słowo nawiasowe oraz ciąg operacji kolejno wykonywanych na tym słowie,</li>
	<li>dla każdej operacji sprawdzenia (występującej we wczytanym ciągu operacji) stwierdzi, czy bieżące słowo nawiasowe jest poprawnym wyrażeniem nawiasowym,</li>
	<li>wypisze wynik na standardowe wyjście.</li>
</ul>

### 입력

<p>W pierwszym wierszu wejścia znajduje się jedna liczba całkowita <em>n</em>&nbsp;(1 &le; <em>n</em> &le; 30000) oznaczająca długość słowa nawiasowego. W drugim wierszu znajduje się n nawias&oacute;w bez znak&oacute;w odstępu między nimi. W trzecim wierszu znajduje się jedna liczba całkowita m (1 &le; <em>m</em> &le; 1000000) oznaczająca liczbę operacji wykonywanych na słowie nawiasowym. W każdym z kolejnych m wierszy znajduje się jedna liczba całkowita. Jeśli w (<em>k</em> + 3)-wierszu (dla 1 &le; <em>k</em> &le; <em>m</em>) występuje liczba 0, to znaczy, że k-tą z kolei operacją wykonywaną na słowie nawiasowym jest operacja sprawdzenia. Jeśli zaś jest to liczba całkowita p spełniająca 1 &le; <em>p</em> &le; <em>n</em>, to znaczy, że operacją tą jest operacja zamiany p-tego nawiasu na przeciwny.</p>

### 출력

<p>Tw&oacute;j program powinien wypisać w kolejnych wierszach (standardowego wyjścia) wyniki kolejnych operacji sprawdzenia. Jeśli bieżące słowo nawiasowe jest poprawnym wyrażeniem nawiasowym, to należy wypisać słowo&nbsp;<code>TAK</code>, w przeciwnym przypadku słowo&nbsp;<code>NIE</code>. (Na wyjściu powinno pojawić się tyle wierszy, ile operacji sprawdzenia zadano na wejściu.)</p>