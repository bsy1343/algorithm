# [Silver I] Combinations - 13239

[문제 링크](https://www.acmicpc.net/problem/13239)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 491, 정답: 355, 맞힌 사람: 320, 정답 비율: 74.246%

### 분류

수학, 다이나믹 프로그래밍, 조합론

### 문제 설명

<p>When we have a set of n elements from which we take k elements, we have a combination.</p>

<p>For example, if we have a set with the numbers from 1 to 5, we have the following different combinations:</p>

<ul>
	<li>1-combinations (1 element from the set each time): (1), (2), (3), (4), (5)</li>
	<li>2-combinations (2 elements from the set each time): (1, 2), (1, 3), (1, 4), (1, 5), (2, 3), (2, 4), (2, 5), (3, 4), (3, 5), (4, 5).</li>
	<li>3-combinations (3 elements from the set each time): (1, 2, 3), (1, 2, 4), (1, 2, 5), (1, 3, 4), (1, 3, 5), (1, 4, 5), (2, 3, 4), (2, 3, 5), (2, 4, 5), (3, 4, 5),&nbsp;</li>
	<li>4-combinations (4 elements from the set each time): (1, 2, 3, 4), (1, 3, 4, 5), (1, 2, 4, 5), (1, 2, 3, 5), (2, 3, 4, 5)</li>
	<li>5-combination (all the elements at once): (1, 2, 3, 4, 5)</li>
	<li>0-combination (no element): ()</li>
</ul>

<p>The following formula will give us the number of k-combinations of n elements:</p>

<p>\[{n \choose k} = \frac{n (n-1)\cdots(n-k+1)}{k(k-1)\cdots 1}\]</p>

<p>As we saw in the list before</p>

<ul>
	<li>(5 over 0) = 1</li>
	<li>(5 over 1) = 5</li>
	<li>(5 over 2) = 10</li>
	<li>(5 over 3) = 10</li>
	<li>(5 over 4) = 5</li>
	<li>(5 over 5) = 1&nbsp;</li>
</ul>

<p>Your task is to compute several (n over k) operations.</p>

### 입력

<p>A line with an integer t. The following t lines will contain 2 integers each separated by spaces. The first value will be n and second k.</p>

<ul>
	<li>1 &le; t &le; 1000</li>
	<li>1 &le; n &le; 1000</li>
	<li>0 &le; k &le; n</li>
</ul>

### 출력

<p>For each (n k) pair. Compute the number of k-combinations of a set of size n. Compute the results modulo 1000000007 (10^9 + 7).</p>