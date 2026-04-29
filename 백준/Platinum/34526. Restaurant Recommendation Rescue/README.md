# [Platinum I] Restaurant Recommendation Rescue - 34526

[문제 링크](https://www.acmicpc.net/problem/34526)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 6, 정답: 6, 맞힌 사람: 6, 정답 비율: 100.000%

### 분류

느리게 갱신되는 세그먼트 트리, 세그먼트 트리, 애드 혹, 자료 구조

### 문제 설명

<p>A certain aspiring musician K loves going for shabu-shabu! Recently, she’s been to $N$ shabushabu restaurants, numbered $1, 2, \dots , N$, following the following algorithm:</p>

<ol>
	<li>K keeps an ordered list of recommendations, starting with restaurant $1$.</li>
	<li>On the $i$-th day, she visits the next recommended restaurant on her list, which recommends her restaurants $R_i = \{r_{i,1}, \dots , r_{i,ℓ_i}\}$.</li>
	<li>K appends $R_i$ to her list of restaurants to visit.</li>
	<li>K repeats steps 2-4 until she runs out of recommended restaurants.</li>
	<li>K writes down the array $A_0, \dots , A_{N−1}$, where $A_i$ equals the number of restaurants she was recommended on the $(i + 1)$-th day. That is, $A_i = |R_{i+1}|$.</li>
</ol>

<p>It is guaranteed that $\bigcup^N_{i=1} R_i = \{2, \dots , N\}$ and $R_i ∩ R_j = ∅$ for $i \ne j$, that is, every restaurant, other than the first, will be recommended by exactly one other restaurant.</p>

<p>Once K finishes her list, K’s delinquent friend H decides to play a prank on her! She replaces the array $A_0, \dots , A_{N−1}$ with another array $B_0, \dots , B_{N−1}$! K thinks that this new array $B_i$ might just be a cyclic shift of her array, so she asks you to determine all possible $0 ≤ k &lt; N$ such that $A_i = B_{(i+k) \bmod N}$, for all $0 ≤ i &lt; N$ and any valid output of her algorithm $A_0, \dots , A_{N−1}$.</p>

<p>Furthermore, K will then perform $Q$ operations, where for the $i$-th operation, she swaps $B_{x_i}$, $B_{y_i}$ and asks you to do the same on the new array. Can you help K see through her friend’s prank?</p>

### 입력

<p>The first line of input will contain two integers, $N$ ($1 ≤ N ≤ 500\, 000$) and $Q$ ($0 ≤ Q ≤ 300\, 000$).</p>

<p>The next line of input will contain $N$ space-separated non-negative integers, $B_0, B_1, \dots , B_{N−1}$ ($0 ≤ B_i &lt; N$), the initial sequence.</p>

<p>The $i$-th of the next $Q$ lines of input will contain two integers each, $x_i$ and $y_i$ ($0 ≤ x_i , y_i &lt; N$ and $x_i \ne y_i$), indicating you are to swap $B_{x_i}$ with $B_{y_i}$ .</p>

### 출력

<p>For each of the $Q + 1$ arrays (including the initial array $B_0, \dots , B_{N−1}$), let $S = \{k_1, \dots , k_m\}$ denote the set of integers $0 ≤ k_j &lt; N$ such that there exists a valid output $A_0, \dots , A_{N−1}$ of K’s algorithm such that $A_i = B_{(i+k_j ) \bmod N}$ for all $0 ≤ i &lt; N$. Output, on a single line, the integers $m$ and $\sum^m_{i=1} k_i \pmod {998\, 244\, 353}$, separated by a space.</p>

<p>In particular, if $S = ∅$, your output should be <code>0 0</code>.</p>