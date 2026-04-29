# [Silver III] Pascal Multiple - 32675

[문제 링크](https://www.acmicpc.net/problem/32675)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 64, 정답: 40, 맞힌 사람: 30, 정답 비율: 63.830%

### 분류

다이나믹 프로그래밍, 수학

### 문제 설명

<p>The $(i,j)$th binomial coefficient, denoted $C(i,j)$, is the (zero-indexed) $j$th entry of the (zero-indexed) $i$th row in Pascal's triangle:</p>

<pre>1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
...
</pre>

<p>where $C(0,0) = 1$ and the $(i+1)$st row can be computed from the $i$th row using the recursion $$C(i+1, j) = C(i,j) + C(i, j-1),$$ treating as $0$ any out-of-bounds entries of the triangle on the right-hand side.</p>

<p>Given $N$ and $K$, compute how many entries in the first $N+1$ rows of Pascal's triangle are multiples of $K$. To be precise: for how many pairs of indices $(i,j)$ with $0\leq i\leq N$ and $0 \leq j \leq i$, is $C(i,j)$ divisible by $K$?</p>

### 입력

<p>The single line of input contains two positive integers $N$ $(1 \leq N \leq 10^3)$ and $K$ $(1 \leq K \leq N)$, with meaning as described above.</p>

### 출력

<p>Print the number of entries in the first $N+1$ rows of Pascal's triangle that are divisible by $K$.</p>