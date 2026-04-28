# [Gold V] Dwukrotność sumy cyfr - 26756

[문제 링크](https://www.acmicpc.net/problem/26756)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 23, 정답: 18, 맞힌 사람: 18, 정답 비율: 78.261%

### 분류

수학, 구현, 시뮬레이션, 비둘기집 원리

### 문제 설명

<p>Bajtazar wymyśla ciąg liczb naturalnych: rozpoczyna od swojej ulubionej liczby X (czyli pierwszy wyraz ciągu A<sub>1</sub> = X), natomiast każda kolejna liczba w ciągu to dwukrotność sumy cyfr poprzedniej (czyli dla każdego i &ge; 1 zachodzi A<sub>i+1</sub> = 2 &middot; s(A<sub>i</sub>), gdzie s(k) oznacza sumę cyfr k). Na przykład, jeśli X = 1, to pierwszymi wyrazami tego będą A<sub>1</sub> = 1, A<sub>2</sub> = 2, A<sub>3</sub> = 4, A<sub>4</sub> = 8, A<sub>5</sub> = 16, A<sub>6</sub> = 14, . . . .</p>

<p>Czy potrafisz szybko wyznaczyć N-ty wyraz ciągu? Napisz program, kt&oacute;ry wczyta wartości N oraz X, po czym wyznaczy N-ty wyraz ciągu Bajtazara rozpoczynającego się od X.</p>

### 입력

<p>W pierwszym (jedynym) wierszu wejścia znajdują się dwie liczby naturalne N oraz X (1 &le; N, X &le; 10<sup>18</sup>).</p>

### 출력

<p>Tw&oacute;j program powinien wypisać na wyjście jedną liczbę całkowitą: N-ty wyraz ciągu Bajtazara, czyli element A<sub>N</sub>.</p>