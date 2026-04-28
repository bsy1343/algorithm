# [Platinum III] Operacje - 8700

[문제 링크](https://www.acmicpc.net/problem/8700)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 21, 정답: 12, 맞힌 사람: 10, 정답 비율: 100.000%

### 분류

자료 구조, 느리게 갱신되는 세그먼트 트리, 세그먼트 트리

### 문제 설명

<p>Mamy podany ciąg <em>n</em>&nbsp;liczb całkowitych <em>a</em><sub>1</sub>, <em>a</em><sub>2</sub>, ..., <em>a<sub>n</sub></em>&nbsp;z przedziału [0, <em>k</em>-1]. Twoim zadaniem jest wykonanie na tym ciągu <em>m</em>&nbsp;operacji polegających na:</p>

<ol>
	<li>podaniu sumy element&oacute;w <em>a<sub>c</sub></em> + <em>a</em><sub><em>c</em>+1</sub> + ... + <em>a<sub>d</sub></em>,</li>
	<li>zamianie wartości każdej liczby&nbsp;<em>a<sub>i</sub></em>&nbsp;(<em>c</em> &le; <em>i</em> &le; <em>d</em>) na (<em>a<sub>i</sub></em> + <em>l</em>)&nbsp;modulo <em>k</em>.</li>
</ol>

### 입력

<p>W pierwszym wierszu wejścia znajdują się cztery liczby całkowite <em>n</em>, <em>k</em>, <em>m</em>&nbsp;(1 &le; <em>n</em> &le; 100 000, 1 &le; <em>k</em> &le; 10, 1 &le; <em>m</em> &le; 100 000). W kolejnym wierszu znajduje się <em>n</em>&nbsp;liczb całkowitych <em>a</em><sub>1</sub>, <em>a</em><sub>2</sub>, ..., <em>a<sub>n</sub></em>&nbsp;(0 &le; <em>a<sub>i</sub></em> &le; <em>k</em> - 1), gdzie&nbsp;<em>a<sub>i</sub></em>&nbsp;oznacza <em>i</em>-ty element ciągu. Następnych <em>m</em>&nbsp;wierszy opisuje kolejne zapytania.</p>

<p>Na początku każdego zapytania pojawi się liczba <em>z<sub>i</sub></em>, oznaczająca rodzaj zapytania. Jeżeli <em>z<sub>i</sub></em> = 1, to jest to zapytanie o sumę element&oacute;w. W&oacute;wczas po liczbie&nbsp;<em>z<sub>i</sub></em>&nbsp;pojawią się dwie liczby całkowite <em>c</em>, <em>d</em>. Natomiast jeżeli <em>z<sub>i</sub></em> = 2, to zapytanie oznacza zmianę element&oacute;w w przedziale i po liczbie&nbsp;<em>z<sub>i</sub></em>&nbsp;pojawią się trzy liczby całkowite <em>c</em>, <em>d</em>, <em>l</em>&nbsp;(1 &le; <em>c</em> &le; <em>d</em> &le; <em>n</em>, 0 &le; <em>l</em> &le; <em>k</em> - 1), oznaczające liczby potrzebne do wykonania danej operacji.</p>

### 출력

<p>Dla każdej operacji sumowania należy wypisać w oddzielnym wierszu obliczony wynik.</p>