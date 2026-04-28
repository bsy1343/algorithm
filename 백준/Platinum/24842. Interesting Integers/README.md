# [Platinum II] Interesting Integers - 24842

[문제 링크](https://www.acmicpc.net/problem/24842)

### 성능 요약

시간 제한: 20 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 171, 정답: 39, 맞힌 사람: 23, 정답 비율: 22.772%

### 분류

조합론, 다이나믹 프로그래밍, 자릿수를 이용한 다이나믹 프로그래밍, 수학

### 문제 설명

<p>Let us call an integer&nbsp;<i>interesting</i>&nbsp;if the product of its digits is&nbsp;<a href="https://en.wikipedia.org/wiki/Divisor#Definition" target="_blank">divisible</a>&nbsp;by the sum of its digits. You are given two integers&nbsp;$A$&nbsp;and&nbsp;$B$. Find the number of interesting integers between&nbsp;$A$&nbsp;and $B$&nbsp;(both inclusive).</p>

### 입력

<p>The first line of the input gives the number of test cases, $T$.&nbsp;$T$ lines follow.</p>

<p>Each line represents a test case and contains two integers: $A$ and $B$.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x:&nbsp;y</code>, where $x$&nbsp;is the test case number (starting from 1) and&nbsp;$y$&nbsp;is the number of interesting integers between&nbsp;$A$&nbsp;and&nbsp;$B$&nbsp;(inclusive).</p>

### 제한

<ul>
	<li>$1&le;T&le;100$.</li>
</ul>

### 힌트

<p>In Sample Case #1, since the product and the sum of digits are the same for single-digit integers, all integers between $1$&nbsp;and&nbsp;$9$&nbsp;are interesting.</p>

<p>In Sample Case #2, there are no interesting integers between&nbsp;$91$&nbsp;and&nbsp;$99$.</p>

<p>In Sample Case #3, there are five interesting integers between&nbsp;$451$&nbsp;and&nbsp;$460$:</p>

<ol>
	<li>$451$&nbsp;(product of its digits is&nbsp;$4&times;5&times;1=20$, sum of its digits is&nbsp;$4+5+1=10$).</li>
	<li>$453$&nbsp;(product of its digits is&nbsp;$4&times;5&times;3=60$, sum of its digits is&nbsp;$4+5+3=12$).</li>
	<li>$456$&nbsp;(product of its digits is $4&times;5&times;6=120$, sum of its digits is&nbsp;$4+5+6=15$).</li>
	<li>$459$&nbsp;(product of its digits is&nbsp;$4&times;5&times;9=180$, sum of its digits is $4+5+9=18$).</li>
	<li>$460$&nbsp;(product of its digits is&nbsp;$4&times;6&times;0=0$, sum of its digits is&nbsp;$4+6+0=10$).</li>
</ol>