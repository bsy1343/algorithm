# [Platinum III] A Simple Function - 15471

[문제 링크](https://www.acmicpc.net/problem/15471)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 42, 정답: 22, 맞힌 사람: 19, 정답 비율: 63.333%

### 분류

수학, 정수론, 조합론, 모듈로 곱셈 역원, 페르마의 소정리, 뤼카 정리

### 문제 설명

<p>A function f : N<sup>3</sup> &rarr; N where N stands for the set of non-negative integers, is defined as follows.</p>

<ul>
	<li>f(i, 0, M) = 1, for all i and M.</li>
	<li>f(i, i, M) = 1, for all i and M.</li>
	<li>f(i, x, M) = 0, for all i &lt; x.</li>
	<li>f(i, x, M) = f(i &minus; 1, x &minus; 1, M) + f(i &minus; 1, x, M), if f(i &minus; 1, x &minus; 1, M) + f(i &minus; 1, x, M) is NOT a multiple of M, for all 0 &lt; x &lt; i.</li>
	<li>f(i, x, M) = 0, if f(i &minus; 1, x &minus; 1, M) + f(i &minus; 1, x, M) is a multiple of M, for all 0 &lt; x &lt; i.</li>
</ul>

<p>For example, f(2, 1, 2) = 0 and f(4, 2, 5) = 6.</p>

### 입력

<p>The first line of the input contains an integer T, the number of test cases. T lines follow, one line per test case consisting of three space-separated integers a, b and M indicating that the value of f(a, b, M) is to be computed.</p>

<p>You may assume:</p>

<ul>
	<li>1 &le; T &le; 10<sup>4</sup></li>
	<li>0 &le; a &lt; 2<sup>31</sup></li>
	<li>0 &le; b &lt; 2<sup>31</sup></li>
	<li>M &le; 10000 is a prime</li>
</ul>

### 출력

<p>For each test case, output a single integer which denotes your answer modulo 10<sup>9</sup> + 7 in a line.</p>