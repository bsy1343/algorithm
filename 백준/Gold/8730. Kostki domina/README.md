# [Gold IV] Kostki domina - 8730

[문제 링크](https://www.acmicpc.net/problem/8730)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 53, 정답: 13, 맞힌 사람: 11, 정답 비율: 34.375%

### 분류

애드 혹, 해 구성하기, 자료 구조, 오일러 경로, 그래프 이론, 해시를 사용한 집합과 맵, 정렬, 집합과 맵

### 문제 설명

<p>Adrian układa ciągi z kostek domina. Kostki podzielone są na 2 pola z pewną liczbą oczek. Kostki można obracać. Kostki dokładane są z obydwu stron tak, aby stykające się pola miały taką samą liczbę oczek.</p>

<p>Adrian ma dostępnych <em>n</em>&nbsp;kostek. Wykorzystując wszystkie kostki da się ułożyć poprawny ciąg. Adrian zastanawia się ile oczek będzie z początku (<em>p</em>) i końca (<em>k</em>) ciągu kostek.</p>

### 입력

<p>W pierwszym wierszu wejścia znajduje się jedna liczba całkowita <em>n</em>&nbsp;(1 &le; <em>n</em> &le; 10<sup>6</sup>), oznaczająca liczbę kostek domina. W&nbsp;<em>n</em>&nbsp;kolejnych wierszach po 2 liczby całkowite <em>a<sub>i</sub></em>, <em>b<sub>i</sub></em>&nbsp;(1 &le; <em>a<sub>i</sub></em>, <em>b<sub>i</sub></em> &le; 10<sup>9</sup>), oznaczające odpowiednio liczbę oczek po lewej stronie oraz po prawej stronie <em>i</em>-tej kostki.</p>

### 출력

<p>W pierwszym i jedynym wierszu wyjścia liczby <em>p</em>&nbsp;i <em>k</em>, gdy <em>p</em> &lt; <em>k</em>, w przeciwnym wypadku <em>k</em>&nbsp;i <em>p</em>. Jeśli wynik jest niejednoznaczny odpowiedzią powinno być słowo &#39;NIE&#39;.</p>