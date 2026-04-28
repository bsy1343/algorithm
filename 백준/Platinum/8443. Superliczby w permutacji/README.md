# [Platinum III] Superliczby w permutacji - 8443

[문제 링크](https://www.acmicpc.net/problem/8443)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 14, 정답: 6, 맞힌 사람: 6, 정답 비율: 42.857%

### 분류

이분 탐색, 다이나믹 프로그래밍, 가장 긴 증가하는 부분 수열 문제

### 문제 설명

<p>Permutacja <em>n</em>-elementowa jest ciągiem&nbsp;<em>n</em>-elementowym składającym się z r&oacute;żnych liczb ze zbioru 1, 2, ..., <em>n</em>. Przykładowo, ciąg 2, 1, 4, 5, 3&nbsp;jest permutacją 5-elementową.</p>

<p>W permutacjach liczb będą interesować nas najdłuższe rosnące podciągi. W przykładowej permutacji mają one długość 3&nbsp;i istnieją dokładnie dwa takie podciągi, a mianowicie 2, 4, 5&nbsp;oraz 1, 4, 5.</p>

<p><em>Superliczbą</em>&nbsp;nazwiemy każdą liczbę, kt&oacute;ra należy do dowolnego z najdłuższych rosnących podciąg&oacute;w. W permutacji 2, 1, 4, 5, 3&nbsp;superliczbami są 1, 2, 4, 5, zaś liczba 3&nbsp;superliczbą nie jest.</p>

<p>Twoim zadaniem jest dla zadanej permutacji znaleźć wszystkie superliczby.</p>

<p>Napisz program, kt&oacute;ry:</p>

<ul>
	<li>wczyta permutację ze standardowego wejścia,</li>
	<li>znajdzie wszystkie superliczby,</li>
	<li>wypisze znalezione superliczby na standardowe wyjście.</li>
</ul>

### 입력

<p>Wejście składa się z dw&oacute;ch wierszy. W pierwszym wierszu znajduję się jedna liczba <em>n</em>, 1 &le; <em>n</em> &le; 100000. W drugim wierszu znajduję się <em>n</em>&nbsp;liczb tworzących permutację&nbsp;<em>n</em>-elementową, pooddzielanych pojedynczymi odstępami.</p>

### 출력

<p>Wyjście powinno się składać z dw&oacute;ch wierszy. W pierwszym wierszu powinna znaleźć się jedna liczba <em>m</em>&nbsp;- liczba superliczb w wejściowej permutacji. W drugim powinny znaleźć się superliczby pooddzielane pojedynczymi odstępami, wymienione w kolejności rosnącej.</p>