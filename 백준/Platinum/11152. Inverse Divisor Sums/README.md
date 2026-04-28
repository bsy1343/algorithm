# [Platinum V] Inverse Divisor Sums - 11152

[문제 링크](https://www.acmicpc.net/problem/11152)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 68, 정답: 19, 맞힌 사람: 16, 정답 비율: 29.091%

### 분류

수학, 정렬, 정수론, 백트래킹, 재귀

### 문제 설명

<p>Your friend Odd Even is obsessed with number theory. He likes to learn new operations to perform on numbers, and to spend endless hours applying his newly acquired knowledge to numbers. For instance, last year he learned about Euler&rsquo;s totient function \(\phi \left(n\right)\), which counts the number of positive integers less than or equal to n that are relatively prime to \(n\). Shortly after that, he went on a spree and calculated \(\phi \left(n\right)\) for all integers \(n\) from 1 up to one million by hand. Recently, he learned that the sum of all divisors of a number \(N\) could be calculated by the following formula:</p>

<p>\[\text{sum of divisors}\left(N\right) = \prod_{i=1}^{r}{\dfrac{p_i^{\left(a_i+1\right)} - 1}{p_i - 1}}\]</p>

<p>Here, \(p_1^{a_1}\), \(p_2^{a_2}\), ..., \(p_r^{a_r}\) is the factorization of \(N\) into prime factors where each \(p_i\) is different and \(a_i\) is the maximum power of \(p_i\) such that \(p_i^{a_i}\) that divides \(N\).</p>

<p>Odd Even wants to calculate the function in reverse; given a positive integer \(N\) he wants to find all positive integers \(M\) having \(N\) as its sum of divisors, and he wants them written out nicely in increasing order. You think this will take too long, so you have decided to intervene and offer computer assistance.</p>

<p>Write a computer program that does the following: given a positive integer \(N\), output a list of all the integers \(M\) having \(N\) as its sum of divisors, in increasing order, or inform Odd Even that no such numbers exists.</p>

### 입력

<p>The first line of the input consists of a single integer T, the number of test cases. The T following lines each contain a single integer \(N\).</p>

<ul>
	<li>0 &lt; \(N\)&nbsp;&le; 10<sup>9</sup></li>
	<li>The output can be large. For Java, it is advisable to buffer the output using StringBuilder.</li>
</ul>

### 출력

<p>For each test case, output all such numbers on one line, in increasing order, with a single space between each number. If no numbers exist, output &ldquo;none!&rdquo; (without quotes).</p>