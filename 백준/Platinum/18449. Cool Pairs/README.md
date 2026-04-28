# [Platinum II] Cool Pairs - 18449

[문제 링크](https://www.acmicpc.net/problem/18449)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 55, 정답: 22, 맞힌 사람: 22, 정답 비율: 40.000%

### 분류

그리디 알고리즘, 정렬, 해 구성하기

### 문제 설명

<p>You have two permutations of n elements, p<sub>1</sub>, p<sub>2</sub>, . . . , p<sub>n</sub> and q<sub>1</sub>, q<sub>2</sub>, . . . , q<sub>n</sub>, and one integer k.</p>

<p>You need to find two integer arrays, a and b, with the following properties:</p>

<ul>
	<li>The elements of the arrays must be integers such that &minus;n &le; a<sub>i</sub>, b<sub>i</sub> &le; n.</li>
	<li>The permutations induce the following order: a<sub>p<sub>1</sub></sub> &le; a<sub>p<sub>2</sub></sub> &le; . . . &le; a<sub>p<sub>n</sub></sub> and b<sub>q<sub>1</sub></sub> &le; b<sub>q<sub>2</sub></sub> &le; . . . &le; b<sub>q<sub>n</sub></sub>.</li>
	<li>A pair (i, j) is cool if i &lt; j and a<sub>i</sub> + b<sub>j</sub> &lt; 0. The number of cool pairs must be exactly k.</li>
</ul>

### 입력

<p>The first line of the input contains two integers n and k: the number of elements and the required number of cool pairs (1 &le; n &le; 300 000, 0 &le; k &le; n&middot;(n&minus;1)/2).</p>

<p>The second line contains n space-separated integers: the permutation p<sub>1</sub>, p<sub>2</sub>, . . . , p<sub>n</sub>.</p>

<p>The third line contains n space-separated integers: the permutation q<sub>1</sub>, q<sub>2</sub>, . . . , q<sub>n</sub>.</p>

<p>It is guaranteed that each integer from 1 to n appears exactly once in each permutation.</p>

### 출력

<p>If there is no such pair of integer arrays that the number of cool pairs is equal to k, print &ldquo;No&rdquo; on a single line.</p>

<p>Otherwise, print &ldquo;Yes&rdquo; on the first line, and print the arrays a and b on the next two lines. Separate array elements by spaces.</p>