# [Silver V] Szyfr - 8546

[문제 링크](https://www.acmicpc.net/problem/8546)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 203, 정답: 129, 맞힌 사람: 105, 정답 비율: 64.815%

### 분류

수학, 다이나믹 프로그래밍, 사칙연산

### 문제 설명

<p>Limak włamuje się do Systemu Liczącego Cokolwiek (TM). Bezpieczeństwo SLC jest oparte na Niezwykle Mocnym Systemie Haseł (TM), kt&oacute;ry Limak złamał. System ten polega na tym, że komputer podaje parę liczb <em>n</em>, <em>m</em>, a haker musi bardzo szybko podać ostatnie cyfry kolejnych liczb Fibonacciego od fib(<em>n</em>), aż do fib(<em>m</em>). Liczby Fibonacciego liczy się w spos&oacute;b następujący: fib(1) = 1; fib(2) = 1; fib(<em>n</em>) = fib(<em>n</em>-1) + fib(<em>n</em>-2), <em>n</em> &gt; 2. Pierwsze dwie liczby Fibonacciego to jedynki, a każda następna jest sumą dw&oacute;ch poprzednich. Zatem kolejnymi liczbami Fibonacciego są: 1, 1, 2, 3, 5, 8, 13, .... Napisz program, kt&oacute;ry pomoże Limakowi.</p>

### 입력

<p>W pierwszym i jedynym wierszu są podane dwie liczby naturalne <em>n</em>, <em>m</em>&nbsp;(0 &lt; <em>n</em> &lt; <em>m</em> &lt; 10 000 000), oddzielone pojedynczym odstępem.</p>

### 출력

<p>W pierwszym i jedynym wierszu powinien zostać podany ciąg ostatnich (najmniej znaczących) cyfr liczb Fibonacciego od fib(<em>n</em>)&nbsp;aż do fib(<em>m</em>). Cyfry nie mogą być oddzielone żadnymi znakami.</p>