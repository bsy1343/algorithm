# [Platinum II] XOR - 11840

[문제 링크](https://www.acmicpc.net/problem/11840)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 256 MB

### 통계

제출: 179, 정답: 60, 맞힌 사람: 52, 정답 비율: 41.270%

### 분류

자료 구조, 트리, 이분 탐색, 트라이

### 문제 설명

<p>You are given numbers N, x and a sequence of N numbers. Find the largest possible interval of consequently following elements, such that &quot;xor&quot;of these elements is not less than x. I.e., more formally, find such i and k that</p>

<p>a<sub>i</sub> &oplus; a<sub>i+1</sub> &oplus; &middot; &middot; &middot; &oplus; a<sub>i+k&minus;1</sub> &ge; x, 1 &le; i &le; i + k &minus; 1 &le; N, and k is largest possible positive number.</p>

<p>It&#39;s guaranteed that for each test from the testset such an interval exists.</p>

<p>We remind you that xor(&oplus;) operation is applied to numbers in binary representation, so that for each pair of bits the following is true:</p>

<ul>
	<li>0 &oplus; 0 = 0</li>
	<li>0 &oplus; 1 = 1</li>
	<li>1 &oplus; 0 = 1</li>
	<li>1 &oplus; 1 = 0</li>
</ul>

<p>The result of this operation doesn&#39;t depend on the order of operands a&oplus;b = b&oplus;a. Moreover (a&oplus;(a&oplus;b)) = b.</p>

<p>In Pascal this operation is represented as xor. In C/C++/Java as &and;.</p>

### 입력

<p>The first line of input contains N (1 &le; N &le; 250 000) and x (0 &le; x &le; 1 000 000 000). The second line of input contains N non-negative numbers not exceeding 10<sup>9</sup>.</p>

### 출력

<p>The first line of output must contain two numbers: i and k. In case of many solutions output the one with the smallest i.</p>