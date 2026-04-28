# [Platinum II] Add One - 25657

[문제 링크](https://www.acmicpc.net/problem/25657)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 61, 정답: 14, 맞힌 사람: 14, 정답 비율: 29.787%

### 분류

가우스 소거법, 선형대수학, 수학

### 문제 설명

<p>Given $n$ integers $a_1, a_2, \ldots, a_n$, you want to perform the following operation exactly $n-1$ times.</p>

<ul>
	<li>Choose two integers $x$ and $y$ in the sequence, remove them, and add a number with the value $x\oplus y$.</li>
</ul>

<p>Since this alone is just too boring, you can additionally choose a number and add one to it at any moment. You must perform the add-one operation <strong>exactly once</strong>.</p>

<p>Eventually, only one number will be left in this sequence, and you need to maximize this remaining number. Print the maximum value of the remaining number.</p>

### 입력

<p>The first line of the input contains a single integer $n$ ($1 \le n \le 10^6$).</p>

<p>The next line of the input contains $n$ integers $a_1, a_2, \ldots, a_n$ ($0 \le a_i &lt; 2^{60}$).</p>

### 출력

<p>Output a single line containing a single integer: the maximum value of the remaining number.</p>

### 힌트

<p>In the first example, the optimal strategy is:</p>

<ul>
	<li>Choose $1$ and $2$: $[\mathbf{1}, \mathbf{2}, 1, 2] \to [1, 2, \mathbf{3}]$</li>
	<li>Choose $1$ and $2$: $[\mathbf{1}, \mathbf{2}, 3] \to [3, \mathbf{3}]$</li>
	<li>Add one to the number $3$: $[\mathbf{3}, 3] \to [3, \mathbf{4}]$</li>
	<li>Choose $3$ and $4$: $[\mathbf{3}, \mathbf{4}] \to [\mathbf{7}]$</li>
</ul>