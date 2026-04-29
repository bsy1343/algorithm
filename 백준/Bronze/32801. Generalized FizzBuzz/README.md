# [Bronze IV] Generalized FizzBuzz - 32801

[문제 링크](https://www.acmicpc.net/problem/32801)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 741, 정답: 538, 맞힌 사람: 493, 정답 비율: 72.607%

### 분류

구현, 브루트포스 알고리즘, 사칙연산, 수학

### 문제 설명

<p>FizzBuzz is a common coding interview problem. The problem is as follows:</p>

<blockquote>
<p>Given a positive integer $n$, for all integers $i$ from 1 to $n$, inclusive:</p>

<ul>
	<li>If $i$ is divisible by both $3$ and $5$, print "FizzBuzz".</li>
	<li>Otherwise, if $i$ is divisible by $3$, print "Fizz".</li>
	<li>Otherwise, if $i$ is divisible by $5$, print "Buzz".</li>
	<li>Otherwise, print $i$.</li>
</ul>

<p>We are interested in a generalized version of FizzBuzz:</p>

<p>Given three positive integers $n$, $a$, and $b$, for all integers $i$ from 1 to $n$, inclusive:</p>

<ul>
	<li>If $i$ is divisible by both $a$ and $b$, print "FizzBuzz".</li>
	<li>Otherwise, if $i$ is divisible by $a$, print "Fizz".</li>
	<li>Otherwise, if $i$ is divisible by $b$, print "Buzz".</li>
	<li>Otherwise, print $i$.</li>
</ul>
</blockquote>

<p>Given $n$, $a$ and $b$, how many times are "Fizz", "Buzz", and "FizzBuzz" printed for a correct implementation?</p>

### 입력

<p>The first and only line of input contains three positive integers $n$, $a$ and $b$ $(1 \le n, a, b \le 10^6.)$</p>

### 출력

<p>Output three integers: the number of times "Fizz" is printed, the number of times "Buzz" is printed, and the number of times "FizzBuzz" is printed.</p>