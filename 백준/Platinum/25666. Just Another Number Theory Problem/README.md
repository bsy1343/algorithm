# [Platinum II] Just Another Number Theory Problem - 25666

[문제 링크](https://www.acmicpc.net/problem/25666)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 31, 정답: 19, 맞힌 사람: 17, 정답 비율: 58.621%

### 분류

수학, 정수론

### 문제 설명

<p>Given are $n$ <strong>prime</strong> numbers $1 &lt; p_1 &lt; p_2 &lt; \ldots &lt; p_n &lt; 10^{18}$ with $p_1 \le 100$. We say that the number $x$ is <em>good</em> if $x$ is divisible by at least one $p_i$.</p>

<p>Take all <em>good</em> numbers $a_1, a_2, \cdots, a_m$ in $[0, p_1 \cdot p_2 \cdot \ldots \cdot p_n]$ and sort them in order ($a_1 &lt; a_2 &lt; \ldots &lt; a_m$). Your task is to calculate $\sum_{i=1}^{m-1} (a_{i+1} - a_i)^2$. As the sum could be very large, you should output it modulo $998\,244\,353$.</p>

### 입력

<p>The first line of the input contains a single integer $n$ ($1 \le n \le 10^5$).</p>

<p>The next line of the input contains $n$ integers $p_1, p_2, \ldots, p_n$ ($1 &lt; p_1 &lt; p_2 &lt; \ldots &lt; p_n &lt; 10^{18}$). It is guaranteed that $2 \le p_1 &lt; 100$ and each $p_i$ ($1 \le i \le n$) is a prime number.</p>

### 출력

<p>Output a single line with a single integer, indicating the answer modulo $998\,244\,353$.</p>

### 힌트

<p>In the first example, the list of good numbers is:</p>

<ul>
	<li>$a_1 = 0$</li>
	<li>$a_2 = 2$</li>
	<li>$a_3 = 4$</li>
	<li>$a_4 = 5$</li>
	<li>$a_5 = 6$</li>
	<li>$a_6 = 8$</li>
	<li>$a_7 = 10$</li>
</ul>

<p>Thus, the answer is $(2-0)^2+(4-2)^2+(5-4)^2+(6-5)^2+(8-6)^2+(10-8)^2=18$.</p>