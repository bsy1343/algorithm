# [Gold V] Pionek - 8026

[문제 링크](https://www.acmicpc.net/problem/8026)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 41, 정답: 17, 맞힌 사람: 14, 정답 비율: 40.000%

### 분류

유클리드 호제법, 수학, 정수론

### 문제 설명

<p>Rozważmy nieskończoną (we wszystkich kierunkach) planszę o kwadratowych polach. Na tej planszy stoi pionek na polu o wsp&oacute;łrzędnych $(1,1)$. Pionek ten może wykonywać pewne ruchy. Może się on przesuwać o pewne ustalone liczby p&oacute;l w prawo bądź w lewo oraz o pewne ustalone liczby p&oacute;l w g&oacute;rę bądź w d&oacute;ł.</p>

<p>Przy takich ograniczeniach można zwykle dojść pionkiem tylko do niekt&oacute;rych p&oacute;l planszy. Twoim zadaniem jest określić, ile spośr&oacute;d takich osiągalnych p&oacute;l mieści się w pewnym prostokątnym fragmencie planszy.</p>

### 입력

<p>W pierwszym wierszu standardowego wejścia znajdują się dwie liczby całkowite $n$&nbsp;oraz $m$&nbsp;($1 &le; n, m &le; 200\,000$) oznaczające odpowiednio liczbę ruch&oacute;w poziomych oraz pionowych, jakie może wykonać pionek za jednym skokiem.</p>

<p>W drugim wierszu znajdują się cztery liczby całkowite $x_1$, $y_1$, $x_2$, $y_2$&nbsp;($-10^9 &le; x_1, y_1, x_2, y_2 &le; 10^9$) oznaczające odpowiednio wsp&oacute;łrzędne lewego dolnego i prawego g&oacute;rnego wierzchołka prostokątnego fragmentu planszy, w kt&oacute;rym należy policzyć liczbę p&oacute;l osiągalnych. Przyjmujemy, że punkt $(x,y)$&nbsp;należy do tego prostokąta wtedy i tylko wtedy, gdy $x_1 &le; x &le; x_2$&nbsp;oraz $y_1 &le; y &le; y_2$.</p>

<p>W każdym z następnych $n$&nbsp;wierszy znajduje się jedna liczba całkowita $a_i$&nbsp;($1 &le; a_i &le; 10^{18}$) oznaczająca liczbę p&oacute;l o jakie pionek może się przesunąć w prawo lub w lewo wykonując $i$-ty poziomy ruch.</p>

<p>W każdym z następnych $m$&nbsp;wierszy znajduje się jedna liczba całkowita $b_i$&nbsp;($1 &le; b_i &le; 10^{18}$) oznaczająca liczbę p&oacute;l o jakie pionek może się przesunąć w g&oacute;rę lub w d&oacute;ł wykonując $i$-ty pionowy ruch.</p>

### 출력

<p>Tw&oacute;j program powinien wypisać w pierwszym i jedynym wierszu standardowego wyjścia jedną liczbę całkowitą oznaczającą liczbę p&oacute;l w obrębie zadanego prostokątnego fragmentu planszy, do kt&oacute;rych pionek może się dostać.</p>