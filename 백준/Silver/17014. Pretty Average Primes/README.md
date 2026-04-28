# [Silver I] Pretty Average Primes - 17014

[문제 링크](https://www.acmicpc.net/problem/17014)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 210, 정답: 111, 맞힌 사람: 95, 정답 비율: 49.738%

### 분류

수학, 브루트포스 알고리즘, 정수론, 소수 판정, 에라토스테네스의 체

### 문제 설명

<p>For various given positive integers N &gt; 3, find two primes, A&nbsp;and B such that N is the average (mean) of A&nbsp;and B. That is, N should be equal to (A+B)/2.</p>

<p>Recall that a prime number is an integer P &gt; 1 which is only divisible by 1 and P. For example, 2, 3, 5, 7, 11 are the first few primes, and 4, 6, 8, 9 are not prime numbers.</p>

### 입력

<p>The first line of input is the number T (1 &le; T &le; 1000), which is the number of test cases. Each of the next T lines contain one integer N<sub>i</sub> (4 &le; N<sub>i</sub> &le; 1000000, 1 &le; i &le; T).</p>

<p>For 6 of the available 15 marks, all N<sub>i</sub> &lt; 1000.</p>

### 출력

<p>The output will consist of T lines. The i<sup>th</sup> line of output will contain two integers, A<sub>i</sub>&nbsp;and B<sub>i</sub>, separated by one space. It should be the case that N<sub>i</sub> = (A<sub>i</sub> + B<sub>i</sub>)/2 and that A<sub>i</sub>&nbsp;and B<sub>i</sub>&nbsp;are prime numbers.</p>

<p>If there are more than one possible A<sub>i</sub>&nbsp;and b<sub>i</sub> for a particular N<sub>i</sub>, output any such pair. The order of the pair A<sub>i</sub> and B<sub>i</sub> does not matter.</p>

<p>It will be the case that there will always be at least one set of values A<sub>i</sub> and B<sub>i</sub>&nbsp;for any given N<sub>i</sub>.</p>

### 힌트

<p>You may have heard about Goldbach&rsquo;s conjecture, which states that every even integer greater than 2 can be expressed as the sum of two prime numbers. There is no known proof, yet, so if you want to be famous, prove that conjecture (after you finish the CCC).</p>

<p>This problem can be used to help verify that conjecture, since every even integer can be written as 2N, and your task is to find two primes A and B such that 2N=A+B.</p>