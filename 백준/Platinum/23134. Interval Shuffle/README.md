# [Platinum I] Interval Shuffle - 23134

[문제 링크](https://www.acmicpc.net/problem/23134)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 37, 정답: 20, 맞힌 사람: 20, 정답 비율: 60.606%

### 분류

자료 구조, 세그먼트 트리, 느리게 갱신되는 세그먼트 트리

### 문제 설명

<p>Kanade has a sequence $A_{1...n}$ and $m$ intervals $[L_i, R_i]$ of indices from $1$ to $n$, bounds included. He does $m$ operations in sequence, one for each interval. For the $i$-th operation, Kanade can choose and perform one of the following two actions:</p>

<ol>
	<li>Choose $x \in [L_i, R_i]$ and update $A_x := A_x + 1$.</li>
	<li>Rearrange $A_{L_i...R_i}$ in any order Kanade wants.</li>
</ol>

<p>Now Kanade wants to know the maximum value of $A_{k}$ after these operations. Find the answer for each $k \in [1, n]$.</p>

### 입력

<p>The first line of input contains two integers $n$ and $m$, the size of the sequence and the number of operations ($1 \leq n, m \leq 2 \cdot 10^5$). The second line contains $n$ integers $A_{1...n}$, the initial sequence ($0 \leq A_i \leq 2 \cdot 10^5$).</p>

<p>Then follow $m$ lines. The $i$-th of them contains two integers $L_i$ and $R_i$ describing the respective interval ($1 \leq L_i \leq R_i \leq n$).</p>

### 출력

<p>Output $n$ integers, the $i$-th of which is the maximum possible value of $A_{i}$ after $m$ operations.</p>