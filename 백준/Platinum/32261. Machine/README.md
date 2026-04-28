# [Platinum III] Machine - 32261

[문제 링크](https://www.acmicpc.net/problem/32261)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 74, 정답: 14, 맞힌 사람: 12, 정답 비율: 21.053%

### 분류

애드 혹

### 문제 설명

<p>The ancient Egyptian computer scientists built several machines that shuffled arrays of integers. Thousands of years later, archaeologists discovered one of their machines and examined it.</p>

<p>The machine takes as input an array of $N$ integers and operates in a very predictable manner. It has a built-in permutation $P$ of numbers from $0$ to $N - 1$ that it uses to shuffle the input array. Specifically, $P$ is an array of length $N$ containing each element between $0$ and $N - 1$ (inclusive) exactly once.</p>

<p>Because of corrosion, the machine not only shuffles the numbers, but also takes their bitwise XOR with some unknown number $X$. More formally, the machine takes as input an array $A$ of length $N$, consisting of non-negative integers. Then, it returns another array $B$ of length $N$ such that $B[i] = A[P [i]] \oplus X$ ($0 &le; i &lt; N$), where $\oplus$ denotes the bitwise XOR operator. Note that $X$ is a fixed number, which does not change when you use the machine.</p>

<p>The bitwise XOR of two non-negative integers $c$ and $d$ is computed as follows. Assume that $c$ and $d$ have at most $t$ bits in their binary representation, that is $\max(c, d) &lt; 2^t$. Then $c \oplus d$ is a number $z$ whose $j$-th bit ($0 &le; j &lt; t$) is $1$ if and only if the $j$-th bit of $c$ and $d$ is different.</p>

<p>The archaeologists are interested in the built-in permutation $P$. Your task is to find $P$ by using the machine. The subtasks in this task impose limits on the number of times you can use the machine and the maximum number you can provide in array $A$.</p>

### 입력



### 출력



### 제한

<ul>
	<li>$1 &le; T &le; 100$</li>
	<li>$3 &le; N &le; 128$</li>
	<li>$0 &le; X &le; 255$</li>
	<li>$0 &le; P [i] &lt; N$ for each $i$ such that $0 &le; i &lt; N$</li>
	<li>$P [i] \ne P [j]$ (for all $i$ and $j$ such that $0 &le; i &lt; j &lt; N$)</li>
</ul>