# [Gold II] Candy - 28679

[문제 링크](https://www.acmicpc.net/problem/28679)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 20, 정답: 11, 맞힌 사람: 9, 정답 비율: 60.000%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>In the ancient city of Ica, there is said to be a palace with wealth beyond imagination. Inside, there is a corridor with $N$ boxes of candy from all over the world. Travellers passing by can take as much candy as they want, provided that they pay its weight in gold.</p>

<p>The boxes of candy are numbered $0$ to $N-1$ from left to right. In box $i$, there are $a_i$ units of candy left, where $a_i$ is a non-negative integer.</p>

<p>As the guardian of the palace, you would like to move the boxes around so that boxes with a lot of candy end up closer to the entrance.</p>

<p>You are given the array $a_0, a_1, \ldots, a_{N-1}$, as well as the numbers $F$ and $T$. In a single operation, you are allowed to swap two <strong>adjacent</strong> elements of $a_0, a_1, \ldots, a_{N-1}$. What is the minimum number of operations required so that the first $F$ elements of the array sum to at least $T$?</p>

### 입력

<p>The first line of the input contains three integers, $N$, $F$, and $T$.</p>

<p>The second line of the input contains $N$ integers $a_0, a_1, \ldots, a_{N-1}$.</p>

### 출력

<p>If it is impossible to achieve the objective using the operations, print <code>NO</code>.</p>

<p>Otherwise, print a single integer, the minimal number of operations.</p>

### 제한

<ul>
	<li>$1 \le N \le 100$.</li>
	<li>$1 \le F \le N$.</li>
	<li>$0 \le T \le 10^{11}$.</li>
	<li>$0 \le a_i \le 10^9$ for $i = 0, 1, \ldots, N-1$.</li>
</ul>

<p>The numbers in the input may not fit in a $32$-bit integer, so be aware of overflows if you are using C++.</p>

### 힌트

<p>In the first sample test case, the first two elements should sum to at least $27$. This can be achieved by a single swap of two adjacent elements: swap the $4$ and $20$. After this swap, the array becomes <code>10 20 4 6 3 3</code>, and indeed the first two elements sum to $10+20 = 30\ge 27$.</p>

<p>In the second sample test case, the $0$ must move all the way to the end of the array; this takes three swaps.</p>

<p>In the third sample test case, it is impossible to make the first two elements sum to at least $100$; the best we can do is $60+30=90$.</p>