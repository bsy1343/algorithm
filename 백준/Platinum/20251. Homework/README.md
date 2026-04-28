# [Platinum I] Homework - 20251

[문제 링크](https://www.acmicpc.net/problem/20251)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 7, 정답: 2, 맞힌 사람: 2, 정답 비율: 100.000%

### 분류

수학, 자료 구조, 정수론, 세그먼트 트리, 느리게 갱신되는 세그먼트 트리, 모듈로 곱셈 역원

### 문제 설명

<p>There are n children (numbered from 1 to n) learning the arithmetic operations, which include <em>addition</em> &ldquo;+&rdquo;, <em>subtraction</em> &ldquo;&minus;&rdquo;, <em>multiplication</em> &ldquo;&times;&rdquo;, and <em>division</em> &ldquo;&divide;&rdquo; on rational numbers.</p>

<p>In the beginning, each child has a paper sheet with only a zero on it. Their teacher, Frank, will then give them q operations. The i-th operation consists of an operator c<sub>i</sub> and an integer x<sub>i</sub>. The children numbered ℓ<sub>i</sub>, ℓ<sub>i</sub> + 1, . . . , r<sub>i</sub> have to append the operator c<sub>i</sub> and the integer x<sub>i</sub> to their paper sheets. After that, every child has an expression on their sheet to be evaluated.</p>

<p>For example, suppose that n = 3, q = 2, c<sub>1</sub> is &ldquo;+&rdquo;, x<sub>1</sub> = 1, ℓ<sub>1</sub> = 1, r<sub>1</sub> = 2, c<sub>2</sub> is &ldquo;&minus;&rdquo;, x<sub>2</sub> = 2, ℓ<sub>2</sub> = 2, and r<sub>2</sub> = 3. The expressions on the sheets are are 0 + 1, 0 + 1 &minus; 2 and 0 &minus; 2 for children 1, 2 and 3, respectively.</p>

<p>Since Frank is really lazy and wants to verify the answers quickly, he asks you to calculate the sums of the values of all children&rsquo;s expressions. Suppose that the value of the expression assigned to child i is a<sub>i</sub>/b<sub>i</sub>, then the value will be a &times; b<sup>&minus;1</sup> mod 10<sup>9</sup> + 7 instead, where b<sup>&minus;1</sup> denotes the integer satisfying b &times; b<sup>&minus;1</sup> &equiv; 1 mod 10<sup>9</sup> + 7. If the sum is not in [0, 10<sup>9</sup> + 7), then the sum modulo 10<sup>9</sup> + 7 should be returned to Frank.</p>

<p>Note: The arithmetic operations has PEMDAS rule, that is, multiplications and divisions should be evaluated before evaluating additions and subtraction.</p>

### 입력

<p>The first line consists of two space-separated integers n and q. The i-th of the following q lines consists of four space-separated tokens ℓ<sub>i</sub>, r<sub>i</sub>, c<sub>i</sub>, x<sub>i</sub>. For the sake of convenience, <code>*</code> and <code>/</code> are used to represent the multiplication and the division operators, respectively.</p>

### 출력

<p>Output the number that you should return to Frank.</p>

### 제한

<ul>
	<li>1 &le; n &le; 10<sup>5</sup></li>
	<li>1 &le; q &le; 10<sup>5</sup></li>
	<li>ℓ<sub>i</sub>, r<sub>i</sub> &isin; [1, n] for all 1 &le; i &le; q.</li>
	<li>c<sub>i</sub> &isin; {<code>+</code>, <code>-</code>, <code>*</code>, <code>/</code>} for all 1 &le; i &le; q. 	For all 1 &le; i &le; q, x<sub>i</sub> = 0 implies that c<sub>i</sub> is not <code>/</code>.</li>
	<li>x<sub>i</sub> &isin; [0, 10<sup>9</sup> + 7) for all 1 &le; i &le; q.</li>
</ul>