# [Platinum IV] It's Mooin' Time III - 33771

[문제 링크](https://www.acmicpc.net/problem/33771)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 111, 정답: 41, 맞힌 사람: 35, 정답 비율: 38.889%

### 분류

다이나믹 프로그래밍, 애드 혹, 이분 탐색

### 문제 설명

<p>Elsie is trying to describe her favorite USACO contest to Bessie, but Bessie is having trouble understanding why Elsie likes it so much. Elsie says "And It's mooin' time! Who wants a mooin'? Please, I just want to do USACO".</p>

<p>Bessie still doesn't understand, so she transcribes Elsie's description in a string of length $N$ ($3 \leq N \leq 10^5$) containing lowercase alphabetic characters $s_1s_2 \ldots s_N$. Elsie considers a string $t$ containing three characters a moo if $t_2 = t_3$ and $t_2 \neq t_1$.</p>

<p>A triplet $(i, j, k)$ is valid if $i &lt; j &lt; k$ and string $s_i s_j s_k$ forms a moo. For the triplet, FJ performs the following to calculate its value:</p>

<ul>
	<li>FJ bends string $s$ 90-degrees at index $j$</li>
	<li>The value of the triplet is twice the area of $\Delta ijk$.</li>
</ul>

<p>In other words, the value of the triplet is $(j-i)(k-j)$.</p>

<p>Bessie asks you $Q$ ($1 \leq Q \leq 3 \cdot 10^4$) queries. In each query, she gives you two integers $l$ and $r$ ($1 \leq l \leq r \leq N$, $r-l+1 \ge 3$) and ask you for the maximum value among valid triplets $(i, j, k)$ such that $l \leq i$ and $k \leq r$. If no valid triplet exists, output $-1$.</p>

<p><strong>Note that the large size of integers involved in this problem may require the use of 64-bit integer data types (e.g., a "long long" in C/C++).</strong></p>

### 입력

<p>The first line contains two integers $N$ and $Q$.</p>

<p>The following line contains $s_1 s_2, \ldots s_N$.</p>

<p>The following $Q$ lines contain two integers $l$ and $r$, denoting each query.</p>

### 출력

<p>Output the answer for each query on a new line.</p>