# [Platinum II] Bringing Order to Disorder - 11751

[문제 링크](https://www.acmicpc.net/problem/11751)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 75, 정답: 54, 맞힌 사람: 40, 정답 비율: 76.923%

### 분류

백트래킹, 브루트포스 알고리즘, 조합론, 다이나믹 프로그래밍, 수학, 재귀

### 문제 설명

<p>A sequence of digits usually represents a number, but we may define an alternative interpretation. In this problem we define a new interpretation with the order relation ≺ among the digit sequences of the same length defined below.</p>

<p>Let s be a sequence of n digits, d<sub>1</sub>d<sub>2</sub>&middot;&middot;&middot;d<sub>n</sub>, where each d<sub>i</sub> (1 &le; i &le; n) is one of 0, 1, . . . , and 9. Let sum(s), prod(s), and int(s) be as follows:</p>

<ul>
	<li>sum(s) = d<sub>1</sub> + d<sub>2</sub> + &middot; &middot; &middot; + d<sub>n</sub></li>
	<li>prod(s) = (d<sub>1</sub> + 1) &times; (d<sub>2</sub> + 1) &times; &middot; &middot; &middot; &times; (d<sub>n</sub> + 1)</li>
	<li>int(s) = d<sub>1</sub> &times; 10<sup>n&minus;1</sup> + d<sub>2</sub> &times; 10<sup>n&minus;2</sup> + &middot; &middot; &middot; + d<sub>n</sub> &times; 10<sup>0</sup></li>
</ul>

<p>int(s) is the integer the digit sequence s represents with normal decimal interpretation.</p>

<p>Let s<sub>1</sub> and s<sub>2</sub> be sequences of the same number of digits. Then s<sub>1</sub> ≺ s<sub>2</sub> (s<sub>1</sub> is less than s<sub>2</sub>) is satisfied if and only if one of the following conditions is satisfied.</p>

<ol>
	<li>sum(s<sub>1</sub>) &lt; sum(s<sub>2</sub>)</li>
	<li>sum(s<sub>1</sub>) = sum(s<sub>2</sub>) and prod(s<sub>1</sub>) &lt; prod(s<sub>2</sub>)</li>
	<li>sum(s<sub>1</sub>) = sum(s<sub>2</sub>), prod(s<sub>1</sub>) = prod(s<sub>2</sub>), and int(s<sub>1</sub>) &lt; int(s<sub>2</sub>)</li>
</ol>

<p>For 2-digit sequences, for instance, the following relations are satisfied.</p>

<p style="text-align: center;">00 ≺ 01 ≺ 10 ≺ 02 ≺ 20 ≺ 11 ≺ 03 ≺ 30 ≺ 12 ≺ 21 ≺ &middot; &middot; &middot; ≺ 89 ≺ 98 ≺ 99</p>

<p>Your task is, given an n-digit sequence s, to count up the number of n-digit sequences that are less than s in the order ≺ defined above.</p>

### 입력

<p>The input consists of a single test case in a line.</p>

<pre>
d<sub>1</sub>d<sub>2</sub>&middot;&middot;&middot;d<sub>n</sub></pre>

<p>n is a positive integer at most 14. Each of d<sub>1</sub>, d<sub>2</sub>, . . . , and d<sub>n</sub> is a digit.</p>

### 출력

<p>Print the number of the n-digit sequences less than d<sub>1</sub>d<sub>2</sub>&middot;&middot;&middot;d<sub>n</sub> in the order defined above.</p>