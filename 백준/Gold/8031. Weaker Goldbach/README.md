# [Gold II] Weaker Goldbach - 8031

[문제 링크](https://www.acmicpc.net/problem/8031)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 172, 정답: 40, 맞힌 사람: 31, 정답 비율: 19.620%

### 분류

수학, 정수론, 소수 판정, 에라토스테네스의 체

### 문제 설명

<p>In the year of 1742 C. Goldbach wrote in his letter to L. Euler that according to him each integer n &gt; 5 was the sum of three prime numbers (a prime number is an integer n &gt; 1, which has only two positive, integer divisors: 1 and n.). Euler answered, that Golbach&#39;s statement was equal to the one, that each even number n &ge; 4 was the sum of two prime numbers. However, it did not make them any closer to the solution of the basic problem: is it really so? At the present we know that this statement is true for numbers up to 10<sup>11</sup> (and we know much more, but this hypothesis is still an open problem). We are not about to verify that, but we will try to solve a less ambitious problem. Each integer n &ge; 10 is the sum of different odd prime numbers.</p>

<p>
Write a program which:</p>

<ul>
	<li>reads integers from the standard input,</li>
	<li>finds their decompositions into the sums of different odd prime numbers,</li>
	<li>writes the results to the standard output.</li>
</ul>

<p>There could be many of such decompositions. Your program can find any of them.</p>

### 입력

<p>In the first line of the standard input there is one positive integer n, n &le; 40. In each of the following n lines there is one integer from the interval [10&hellip;2,000,000,000].</p>

<p>&nbsp;</p>

### 출력

<p>Decomposition of the number k has to be written in two lines. In the first line one integer m &ge; 1 should be written, this is the number of addends of the decomposition. In the second line m different odd numbers should be written in ascending order. Their sum should be equal to k, and they should be separated by single spaces. The decompositions should appear in the same order as the integers in the input file.</p>

<p>&nbsp;</p>