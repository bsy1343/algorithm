# [Gold V] Periodic Sequence - 33297

[문제 링크](https://www.acmicpc.net/problem/33297)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 89, 정답: 19, 맞힌 사람: 12, 정답 비율: 30.769%

### 분류

문자열, 수학, 유클리드 호제법, 정수론

### 문제 설명

<p>As you may know, some fractions of integers $\frac{A}{B}$ result in an infinite periodic decimal representation. For example, $\frac{4}{7}$ results in $0.57\overline{142857}$, which means that the $142857$ part is repeating itself. Note that we could also write $0.5714\overline{285714}$ or $0.571\overline{428571428571}$. As you see, it is not trivial to check if two such sequences are equal.</p>

<p>Therefore, you have to help us. You are given only the periodic part of two sequences and need to check if they are equal. Note that the periodic parts are considered equal if they can be made equal by repetition and cyclic shifting.</p>

### 입력

<p>The first line contains two integers $n$ and $m$ ($1 \leq n, m \leq 5 \cdot 10^5$) --- the length of the first and second sequence.</p>

<p>The second line contains $n$ integers $a_i$ ($0 \leq a_i &lt; 10$) --- the first sequence.</p>

<p>The third line contains $m$ integers $b_i$ ($0 \leq b_i &lt; 10$) --- the second sequence.</p>

### 출력

<p>Print <code>YES</code> if the two sequences are equal and <code>NO</code> if they are not.</p>