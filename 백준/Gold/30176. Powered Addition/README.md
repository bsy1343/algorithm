# [Gold IV] Powered Addition - 30176

[문제 링크](https://www.acmicpc.net/problem/30176)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 78, 정답: 49, 맞힌 사람: 42, 정답 비율: 60.870%

### 분류

수학, 그리디 알고리즘, 애드 혹, 비트마스킹

### 문제 설명

<p>You have an array $a$ of length $n$. For every positive integer $x$ you are going to perform the following operation during the $x$-th second:</p>

<ul>
	<li>Select some distinct indices $i_{1}, i_{2}, \ldots, i_{k}$ which are between $1$ and $n$ inclusive, and add $2^{x-1}$ to each corresponding position of $a$. Formally, $a_{i_{j}} := a_{i_{j}} + 2^{x-1}$ for $j = 1, 2, \ldots, k$. <strong>Note that you are allowed to not select any indices at all.</strong></li>
</ul>

<p>You have to make $a$ nondecreasing as fast as possible. Find the smallest number $T$ such that you can make the array nondecreasing after at most $T$ seconds.</p>

<p>Array $a$ is nondecreasing if and only if $a_{1} \le a_{2} \le \ldots \le a_{n}$.</p>

<p>You have to answer $t$ independent test cases.</p>

### 입력

<p>The first line contains a single integer $t$ ($1 \le t \le 10^{4}$) --- the number of test cases.</p>

<p>The first line of each test case contains single integer $n$ ($1 \le n \le 10^{5}$) --- the length of array $a$. It is guaranteed that the sum of values of $n$ over all test cases in the input does not exceed $10^{5}$.</p>

<p>The second line of each test case contains $n$ integers $a_{1}, a_{2}, \ldots, a_{n}$ ($-10^{9} \le a_{i} \le 10^{9}$).</p>

### 출력

<p>For each test case, print the minimum number of seconds in which you can make $a$ nondecreasing.</p>

### 힌트

<p>In the first test case, if you select indices $3, 4$ at the $1$-st second and $4$ at the $2$-nd second, then $a$ will become $[1, 7, 7, 8]$. There are some other possible ways to make $a$ nondecreasing in $2$ seconds, but you can&#39;t do it faster.</p>

<p>In the second test case, $a$ is already nondecreasing, so answer is $0$.</p>

<p>In the third test case, if you do nothing at first $2$ seconds and select index $2$ at the $3$-rd second, $a$ will become $[0, 0]$.</p>