# [Gold II] Prime-Factor Prime - 15520

[문제 링크](https://www.acmicpc.net/problem/15520)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 144, 정답: 78, 맞힌 사람: 74, 정답 비율: 62.185%

### 분류

수학, 정수론, 소수 판정, 에라토스테네스의 체

### 문제 설명

<p>A positive integer is called a &quot;prime-factor prime&quot; when the number of its prime factors is prime. For example, 12 is a prime-factor prime because the number of prime factors of 12 = 2 &times; 2 &times; 3 is 3, which is prime. On the other hand, 210 is not a prime-factor prime because the number of prime factors of 210 = 2 &times; 3 &times; 5 &times; 7 is 4, which is a composite number.</p>

<p>In this problem, you are given an integer interval [<em>l</em>,<em>r</em>]. Your task is to write a program which counts the number of prime-factor prime numbers in the interval, i.e. the number of prime-factor prime numbers between <em>l</em> and <em>r</em>, inclusive.</p>

### 입력

<p>The input consists of a single test case formatted as follows.</p>

<pre>
l r</pre>

<p>A line contains two integers <em>l</em> and <em>r</em> (1 &le; <em>l</em> &le; <em>r</em> &le; 10<sup>9</sup>), which presents an integer interval [<em>l</em>,<em>r</em>]. You can assume that 0 &le; <em>r</em> - <em>l</em> &lt; 1,000,000.</p>

### 출력

<p>Print the number of prime-factor prime numbers in [<em>l</em>,<em>r</em>].</p>

### 힌트

<p>In the first example, there are 4 prime-factor primes in [<em>l</em>,<em>r</em>]: 4, 6, 8, and 9.</p>