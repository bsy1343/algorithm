# [Platinum I] Assignment Problem - 21082

[문제 링크](https://www.acmicpc.net/problem/21082)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 256 MB

### 통계

제출: 22, 정답: 14, 맞힌 사람: 14, 정답 비율: 63.636%

### 분류

그리디 알고리즘, 브루트포스 알고리즘

### 문제 설명

<p>There are $m$ open positions in our company and $n \ge m$ candidates for these positions. We want to hire the best candidates, obviously. We can&#39;t hire the same candidate for two or more different positions, so we have to hire exactly $m$ candidates. Let&#39;s call the way to choose different candidates for each position <em>an assignment</em>. Two assignments are different if there exists a position for which we hire different candidates in these assignments.</p>

<p>There is a matrix $A$ of profits: $A_{ij} \ge 0$ denotes what profit we will gain from hiring $j$-th candidate for $i$-th position. We want to maximize the sum of profits we will gain from all hires. An assignment is optimal if it maximizes the sum of profits.</p>

<p>It would be easy to choose the best candidates given the matrix $A$. Unfortunately, HR world is not so simple, and they can&#39;t provide the matrix $A$ for you. Even after interviewing all the candidates we can only compare how two candidates will behave in the same position. More precisely, we know $m$ permutations $P_{i}$ of length $n$. For all $1 \le i \le m$, $1 \le x &lt; y \le n$: $A_{i P_{ix}} &gt; A_{i P_{iy}}$. In human words, for each position we know the ranking of all candidates.</p>

<p>A candidate is <em>promising</em> if and only if there exists a matrix $A$ which is consistent with all the given rankings, such that for this matrix there is only one optimal assignment and this particular candidate is hired.</p>

<p>You are to find all promising candidates so that we can conduct more thorough tests with them.</p>

### 입력

<p>The first line contains two integers $n$ and $m$ ($1 \le m \le 11$, $m \le n \le 1000$) --- the number of candidates and the number of positions.</p>

<p>Next $m$ lines contain rankings for each position. The $i$-th line contains a permutation $P_{i1}, P_{i2}, \ldots, P_{in}$ of numbers from $1$ to $n$.</p>

### 출력

<p>In the first line print the number of promising candidates, in the second line print indices of promising candidates <strong>in increasing order</strong>.</p>