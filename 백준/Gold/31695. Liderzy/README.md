# [Gold IV] Liderzy - 31695

[문제 링크](https://www.acmicpc.net/problem/31695)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 28, 정답: 16, 맞힌 사람: 16, 정답 비율: 57.143%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>Według słownika PWN &bdquo;lider&rdquo; to między innymi &bdquo;przyw&oacute;dca partii politycznej, związku zawodowego lub innych organizacji społecznych&rdquo;. Natomiast w algorytmice liderem ciągu element&oacute;w nazywamy element, kt&oacute;rego liczba wystąpień jest ściśle większa od połowy długości ciągu. Dla przykładu, liderem ciągu [7, 2, 5, 7, 7] jest liczba 7, zaś ciąg [2, 3, 2, 3] nie posiada lidera w og&oacute;le.</p>

<p>W tym zadaniu skupimy się na tym drugim znaczeniu słowa &bdquo;lider&rdquo;. Mając dany ciąg liczb, Twoim zadaniem jest podzielić go na minimalną liczbę ciąg&oacute;w (niekoniecznie sp&oacute;jnych), z kt&oacute;rych każdy posiada lidera, i wypisać tę minimalną liczbę. Można wykazać, że taki podział jest zawsze możliwy.</p>

### 입력

<p>W pierwszym wierszu wejścia znajduje się jedna liczba całkowita n (1 &le; n &le; 500 000), oznaczająca długość ciągu.</p>

<p>W drugim wierszu wejścia znajduje się ciąg n liczb całkowitych a<sub>1</sub>, a<sub>2</sub>, . . . , a<sub>n</sub> (1 &le; a<sub>i</sub> &le; n).</p>

### 출력

<p>W jedynym wierszu wyjścia powinna znaleźć się jedna liczba całkowita, oznaczająca minimalną możliwą liczbę ciąg&oacute;w, na kt&oacute;re można podzielić wejściowy ciąg tak, aby każdy wynikowy ciąg posiadał lidera.</p>

### 힌트

<p>Wyjaśnienie przykładu: Wejściowy ciąg można podzielić na przykład na ciągi [1, 3, 1] i [2, 2]. W ten spos&oacute;b oba wynikowe ciągi będą posiadały lidera (odpowiednio liczby 1 i 2).</p>