# [Platinum IV] Count the Bits - 16417

[문제 링크](https://www.acmicpc.net/problem/16417)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 58, 정답: 49, 맞힌 사람: 42, 정답 비율: 89.362%

### 분류

다이나믹 프로그래밍, 자릿수를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>Given a value k and a number of bits b, calculate the total number of 1-bits in the binary representations of all multiples of k that are between 0 and 2<sup>b</sup>-1 (inclusive).</p>

### 입력

<p>Each input will consist of a single test case. Note that your program may be run multiple times on different inputs.</p>

<p>Each test case will consist of a single line containing two space-separated integers k (1 &le; k &le; 1,000) and b (1 &le; b &le; 128), where k and b are as described above.</p>

### 출력

<p>Output a single integer, which is the total number of 1-bits in the binary representations of all multiples of k that are between 0 and 2<sup>b</sup>-1 (inclusive). Since this number may be very large, output it modulo 10<sup>9</sup>+9.</p>

### 힌트

<p>Consider the second sample: k=10 and b=5.</p>

<p>2<sup>5</sup>-1 = 31. All the multiples of 10 between 0 and 31 are: 10, 20 and 30.</p>

<ul>
	<li>10 = 01010b (2 1-bits)</li>
	<li>20 = 10100b (2 1-bits)</li>
	<li>30 = 11110b (4 1-bits)</li>
</ul>

<p>That&rsquo;s a total of 2+2+4=8 1-bits.</p>