# [Silver I] Balance - 7967

[문제 링크](https://www.acmicpc.net/problem/7967)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 60, 정답: 37, 맞힌 사람: 28, 정답 비율: 62.222%

### 분류

브루트포스 알고리즘, 백트래킹

### 문제 설명

<p>We are given a two-pan balance and n weights of different masses a<sub>1</sub>, a<sub>2</sub>, &hellip;, a<sub>n</sub>. We are to put each one of the given weights on the balance, one after another, in such a way that at any moment the left pan is never heavier than the right pan. At each step, we choose one weight that is not yet placed on the balance, and we place it either on the left pan or on the right pan. We continue these steps, until we use all the weights. Write program balance, which calculates the number of ways to do this.</p>

### 입력

<p>The integer n is given on the first row of the standard input (0 &lt; n &lt; 10). There are n integers on the second row: a<sub>1</sub>, a<sub>2</sub>, &hellip;, a<sub>n</sub> (0 &lt; a<sub>1</sub>, a<sub>2</sub>, &hellip;, a<sub>n</sub> &lt; 1000).</p>

### 출력

<p>Your program have to output a single integer on the standard output &ndash; the searched number of ways.</p>