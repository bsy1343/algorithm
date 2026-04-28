# [Platinum II] Sum Zero - 27368

[문제 링크](https://www.acmicpc.net/problem/27368)

### 성능 요약

시간 제한: 0.6 초, 메모리 제한: 1024 MB

### 통계

제출: 42, 정답: 16, 맞힌 사람: 15, 정답 비율: 55.556%

### 분류

자료 구조, 그리디 알고리즘, 희소 배열

### 문제 설명

<p>Roxy, the space traveler, is facing a very abstract problem. Since she&rsquo;s clueless as to how to solve it, you, as her best friend, have no choice but to help her out:</p>

<p>She is given an array $c_1, c_2, \dots , c_N$ consisting of $N$ integers, and $Q$ pairs of endpoints $(L_i , R_i)$, each representing the subarray $c_{L_i} , c_{L_i+1}, \dots , c_{R_i}$, where $1 &le; i &le; N$.</p>

<p>For each such pair $(L_i , R_i)$, Roxy is asked what is the maximum number of disjoint sum-0 subarrays one can choose from the queried array $c_{L_i} , c_{L_i+1}, \dots , c_{R_i}$. Two subarrays are considered disjoint if they have no entries in common; however, they can still have neighboring endpoints. Note that, there might be entries from the queried array that are not part of any of the chosen subarrays.</p>

### 입력

<p>The first line of the input contains a single integer $N$.</p>

<p>The second line contains $N$ space-separated integers $c_1, c_2, \dots , c_N$.</p>

<p>The third line contains the number $Q$ of queries.</p>

<p>The next $Q$ lines contain two numbers $L_i$ and $R_i$ each, representing the $i$<sup>th</sup> query.</p>

### 출력

<p>Print $Q$ lines: on the $i$<sup>th</sup> line you should print the answer to the $i$<sup>th</sup> query.</p>

### 제한

<ul>
	<li>$1 &le; N &le; 400\,000$</li>
	<li>$1 &le; Q &le; 400\,000$</li>
	<li>$&minus;10^9 &le; c_i &le; 10^9$ for all $1 &le; i &le; N$</li>
	<li>$1 &le; L_i &le; R_i &le; N$ for all $1 &le; i &le; Q$</li>
</ul>