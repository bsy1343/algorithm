# [Platinum IV] Permutations on the Road: Alice - 20570

[문제 링크](https://www.acmicpc.net/problem/20570)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 10, 정답: 8, 맞힌 사람: 8, 정답 비율: 88.889%

### 분류

자료 구조, 세그먼트 트리

### 문제 설명

<p>Alice and Bob frequently take long road trips to get to various programming competitions in their area. Since everything&#39;s bigger in the state that they live in, they have turned to playing car games to pass the time.</p>

<p>Alice and Bob are both computer scientists, so they quickly tired of &quot;guess the number&quot;, as the guesser could always identify the number using a logarithmic number of guesses. To up the challenge, they created a new game: &quot;guess the permutation&quot;.</p>

<p>A permutation of length $N$ is an arrangement of the numbers $1, \dots, N$. For a given permutation $P$, define $\text{inv}(l, r)$ to be the number of pairs $(i, j)$ with $l \leq i \leq j \leq r$ such that $P_i &gt; P_j$.</p>

<p>When playing this game, Alice thinks of a permutation, and Bob can ask Alice the result of the function $\text{inv}$ for up to $N$ inputs.&nbsp;</p>

<p>Alice has already thought of her permutation $P$. As she mindlessly answers all of Bob&#39;s queries, she thinks of a different problem: What is the sum of $\text{inv}(l, r)$ over all values of $l$ and $r$?</p>

### 입력

<p>The first line of input contains a single integer $N$ ($1 \leq N \leq 100\,000$), the length of the permutation. The second line of input contains $N$ space separated integers, Alice&#39;s permutation $P$.</p>

### 출력

<p>Output a single integer, the sum of $\text{inv}(l, r)$ over all values of $l$ and $r$. It is guaranteed the answer fits in a signed $64$-bit integer.</p>

### 힌트

<p>In the first sample case, there are no inversions.</p>

<p>In the second sample case,</p>

<ul>
	<li>$\text{inv}(1, 1) = 0$.</li>
	<li>$\text{inv}(1, 2) = 0$.</li>
	<li>$\text{inv}(1, 3) = 1$.</li>
	<li>$\text{inv}(2, 2) = 0$.</li>
	<li>$\text{inv}(2, 3) = 1$.</li>
	<li>$\text{inv}(3, 3) = 0$.</li>
</ul>

<p>Summing these values gives $2$.</p>