# [Gold I] Integral Array - 30673

[문제 링크](https://www.acmicpc.net/problem/30673)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 37, 정답: 13, 맞힌 사람: 10, 정답 비율: 34.483%

### 분류

수학, 누적 합, 조화수

### 문제 설명

<p>You are given an array $a$ of $n$ positive integers numbered from $1$ to $n$. Let&#39;s call an array <em>integral</em> if for any two, not necessarily different, numbers $x$ and $y$ from this array, $x \ge y$, the number $\left \lfloor \frac{x}{y} \right \rfloor$ ($x$ divided by $y$ with rounding down) is also in this array.</p>

<p>You are guaranteed that all numbers in $a$ do not exceed $c$. Your task is to check whether this array is integral.</p>

### 입력

<p>The input consists of multiple test cases. The first line contains a single integer $t$ ($1 \le t \le 10\,000$) --- the number of test cases. Description of the test cases follows.</p>

<p>The first line of each test case contains two integers $n$ and $c$ ($1 \le n \le 10^6$, $1 \le c \le 10^7$) --- the size of $a$ and the limit for the numbers in the array.</p>

<p>The second line of each test case contains $n$ integers $a_1$, $a_2$, $\ldots$, $a_n$ ($1 \le a_i \le c$) --- the array $a$.</p>

<p>Let $N$ be the sum of $n$ over all test cases and $C$ be the sum of $c$ over all test cases. It is guaranteed that $N \le 10^6$ and $C \le 10^7$.</p>

### 출력

<p>For each test case print <code>Yes</code> if the array is integral and <code>No</code> otherwise.</p>

### 힌트

<p>In the first test case it is easy to see that the array is integral:</p>

<ul>
	<li>$\left \lfloor \frac{1}{1} \right \rfloor = 1$, $a_1 = 1$, this number occurs in the arry</li>
	<li>$\left \lfloor \frac{2}{2} \right \rfloor = 1$</li>
	<li>$\left \lfloor \frac{5}{5} \right \rfloor = 1$</li>
	<li>$\left \lfloor \frac{2}{1} \right \rfloor = 2$, $a_2 = 2$, this number occurs in the array</li>
	<li>$\left \lfloor \frac{5}{1} \right \rfloor = 5$, $a_3 = 5$, this number occurs in the array</li>
	<li>$\left \lfloor \frac{5}{2} \right \rfloor = 2$, $a_2 = 2$, this number occurs in the array</li>
</ul>

<p>Thus, the condition is met and the array is integral.</p>

<p>In the second test case it is enough to see that</p>

<p>$\left \lfloor \frac{7}{3} \right \rfloor = \left \lfloor 2\frac{1}{3} \right \rfloor = 2$, this number is not in $a$, that&#39;s why it is not integral.</p>

<p>In the third test case $\left \lfloor \frac{2}{2} \right \rfloor = 1$, but there is only $2$ in the array, that&#39;s why it is not integral.</p>