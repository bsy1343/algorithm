# [Gold II] Płytkie nawiasowania - 26786

[문제 링크](https://www.acmicpc.net/problem/26786)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 25, 정답: 13, 맞힌 사람: 12, 정답 비율: 63.158%

### 분류

그리디 알고리즘, 누적 합, 문자열

### 문제 설명

<p>Ciąg składający się z nawias&oacute;w otwierających i zamykających nazwiemy nawiasowaniem. Nawiasowanie jest poprawne, jeśli nawiasy można tak połączyć w pary, żeby były poprawnie zagnieżdżone. Definiujemy też głębokość zagnieżdżenia.</p>

<p>Formalnie poprawne nawiasowanie można zdefiniować rekurencyjnie:</p>

<ul>
	<li>Ciąg pusty jest poprawnym nawiasowaniem; jego głębokość wynosi 0.</li>
	<li>Jeśli ciąg w jest poprawnym nawiasowaniem o głębokości h, to ciąg (w), kt&oacute;ry powstaje przez dopisanie nawiasu otwierającego na początku i nawiasu zamykającego na końcu, jest poprawnym nawiasowaniem o głębokości h + 1.</li>
	<li>Jeśli ciągi w<sub>1</sub> i w<sub>2</sub> są poprawnymi nawiasowaniami o głębokościach, odpowiednio, h<sub>1</sub> i h<sub>2</sub>, to ciąg w<sub>1</sub>w<sub>2</sub>, kt&oacute;ry powstaje przez ich sklejenie, jest poprawnym nawiasowaniem o głębokości max(h<sub>1</sub>, h<sub>2</sub>)</li>
</ul>

<p>Dane są poprawne nawiasowanie w i liczba H. Przez odwr&oacute;cenie nawiasu rozumiemy zmianę pewnego nawiasu otwierającego na zamykający lub odwrotnie. Ile minimalnie odwr&oacute;ceń nawias&oacute;w trzeba wykonać, żeby uzyskać poprawne nawiasowanie o głębokości nie większej niż H?</p>

### 입력

<p>W pierwszym wierszu wejścia znajdują się dwie liczby całkowite n i H (n &ge; 2, 1 &le; H &le; n/2) oznaczające długość ciągu oraz maksymalną głębokość.</p>

<p>W drugim wierszu znajduje się n-literowy napis składający się ze znak&oacute;w <code>(</code> i <code>)</code>, będący poprawnym nawiasowaniem.</p>

### 출력

<p>Tw&oacute;j program powinien wypisać jedną liczbę całkowitą oznaczającą minimalną liczbę odwr&oacute;ceń nawias&oacute;w, jakie trzeba wykonać, aby uzyskać poprawne nawiasowanie o głębokości co najwyżej H.</p>

### 힌트

<p>Wyjaśnienie przykładu: Ciąg <code>(()(()))</code> ma głębokość 3. Odwr&oacute;cenie piątego i sz&oacute;stego nawiasu da nam ciąg <code>(()()())</code> o głębokości 2.</p>

<p>Jedno odwr&oacute;cenie nawiasu nie wystarczy, bo nie uzyskamy w ten spos&oacute;b poprawnego nawiasowania.</p>