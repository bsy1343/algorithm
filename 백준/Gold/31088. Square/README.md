# [Gold II] Square - 31088

[문제 링크](https://www.acmicpc.net/problem/31088)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 7, 정답: 6, 맞힌 사람: 5, 정답 비율: 100.000%

### 분류

수학, 정수론, 소수 판정, 에라토스테네스의 체

### 문제 설명

<p>Father Study loves math very much.</p>

<p>Given a sequence of integers $a_1,a_2,...,a_n$, Father Study wants to calculate another sequence of integers $t_1,t_2,...,t_n$ satisifing </p>

<ul>
	<li>For each $i (1 \le i \le n)$, $t_i &gt; 0$.</li>
	<li>For each $i (1\le i &lt; n)$, $a_i \times t_i \times a_{i+1} \times t_{i+1}$ is a square number. (In mathematics, a square number or perfect square is an integer that is the square of an integer, in other words, it is the product of some integer with itself.)</li>
	<li>$\prod_{i=1}^{n}{t_i}$ is minimized.</li>
</ul>

<p>Please help Father Study to calculate the answer --- the minimum value of $\prod_{i=1}^{n}{t_i}$. Because the answer is too large, please output the answer modulo $1000000007$.</p>

### 입력

<p>The first line contains a single integer $n$ ($1\le n \le 100000$).</p>

<p>The second line contains $n$ integers $a_1, a_2, ..., a_n$ ($1 \le a_i \le 1000000$) separated by single spaces.</p>

### 출력

<p>Output one integer -- the answer modulo $1000000007$. </p>