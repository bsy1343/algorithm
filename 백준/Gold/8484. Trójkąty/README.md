# [Gold II] Trójkąty - 8484

[문제 링크](https://www.acmicpc.net/problem/8484)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 40, 정답: 24, 맞힌 사람: 16, 정답 비율: 53.333%

### 분류

수학, 브루트포스 알고리즘, 애드 혹, 기하학

### 문제 설명

<p>Masz dany ciąg liczbowy <em>c</em>&nbsp;i ciąg zapytań postaci: &quot;Czy w ciągu <em>c<sub>a</sub></em>, <em>c</em><sub><em>a</em>+1</sub>, ..., <em>c</em><sub><em>b</em>-1</sub>, <em>c<sub>b</sub></em>&nbsp;istnieje tr&oacute;jka liczb taka, że istnieje tr&oacute;jkąt, kt&oacute;rego długościami bok&oacute;w są te liczby?&quot;.</p>

### 입력

<p>W pierwszym wierszu standardowego wejścia znajduje się jedna liczba całkowita <em>n</em>&nbsp;(1 &le; n &le; 1 000 000) będąca długością ciągu <em>c</em>. W drugim wierszu znajduje się <em>n</em>&nbsp;liczb całkowitych oznaczających ciąg <em>c</em>&nbsp;(1 &le; <em>c<sub>i</sub></em> &le; 1 000 000 000). W trzecim wierszu znajduje się jedna liczba całkowita <em>p</em>&nbsp;(1 &le; <em>p</em> &le; 100 000). Każdy z następnych <em>p</em>&nbsp;wierszy zawiera dwie liczby całkowite <em>a</em>&nbsp;i <em>b</em>&nbsp;(1 &le; <em>a</em> &le; <em>b</em> &le; 1 000 000) oddzielone pojedynczym odstępem.</p>

### 출력

<p>Na standardowe wyjście należy wypisać dokładnie <em>p</em>&nbsp;wierszy zawierających jedno słowo&nbsp;<code>TAK</code>&nbsp;lub&nbsp;<code>NIE</code>, w zależności od tego, czy w danym podciągu istnieje tr&oacute;jka liczb taka, że istnieje tr&oacute;jkąt, kt&oacute;rego długościami bok&oacute;w są te liczby.</p>