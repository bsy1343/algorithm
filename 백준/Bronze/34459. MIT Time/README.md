# [Bronze III] MIT Time - 34459

[문제 링크](https://www.acmicpc.net/problem/34459)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 219, 정답: 146, 맞힌 사람: 123, 정답 비율: 66.129%

### 분류

구현, 사칙연산, 수학

### 문제 설명

<p>Busy Beaver arrived to his MIT class late! However, thanks to "MIT time", all classes actually start $5$ minutes later than the posted time.</p>

<p>Busy Beaver wants to make a generalization of this system. Namely, if someone arrives $N$ minutes late to an event, then:</p>

<ul>
	<li>if $N \le 5$, they arrived on "MIT time";</li>
	<li>if $5 &lt; N \le 25$, they arrived on "MIT$^2$ time";</li>
	<li>if $25 &lt; N \le 125$, they arrived on "MIT$^3$ time";</li>
	<li>and so on. Formally, if $k \ge 2$, then "MIT$^k$ time" is when $5^{k-1} &lt; N \le 5^k$.</li>
</ul>

<p>Given $N$, determine on which of "MIT time", "MIT$^2$ time", etc. this person arrived at.</p>

### 입력

<p>The first line contains a single integer $T$ $(1 \leq T \leq 10^5)$ --- the number of test cases.</p>

<p>The only line of each test case contains a single integer $N$ ($1 \le N \le 10^9$) --- the number of minutes late to an event the person is.</p>

### 출력

<p>For each test case, output a single line that consists of either "<code>MIT time</code>" or "<code>MIT^</code>$k$ <code>time</code>" for some integer $k \geq 2$, corresponding to the time this person arrives at.</p>

### 힌트

<p>In the first test case, $N = 4$, which is at most $5$, so this is MIT time. </p>

<p>In the second test case, $N = 5$, which is equal to $5$, so this is also MIT time. </p>

<p>In the third test case, $N = 13$, which is not more than $25$ but more than $5$, so this is MIT$^2$ time. </p>

<p>The fourth test case, $N = 126$, which is not more than $5^4=625$ but more than $5^3 = 125$, so this is MIT$^4$ time. </p>