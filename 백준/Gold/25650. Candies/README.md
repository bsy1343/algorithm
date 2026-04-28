# [Gold II] Candies - 25650

[문제 링크](https://www.acmicpc.net/problem/25650)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 17, 정답: 8, 맞힌 사람: 8, 정답 비율: 57.143%

### 분류

자료 구조, 그리디 알고리즘, 스택, 덱

### 문제 설명

<p>Grammy has a circular array $a_1, a_2, \ldots, a_n$. You can do the following operations several (possibly zero) times in any order:</p>

<ul>
	<li>Choose two adjacent positions with the same number, and erase them.</li>
	<li>Choose two adjacent positions such that the numbers on these positions add up to a special number $x$, and erase them.</li>
</ul>

<p>After each time you do an operation successfully, Grammy will give you a candy. Meanwhile, the remaining parts of the array will be concatenated. For example, after deleting the third and fourth element of the array, the second element and the fifth element will become adjacent.</p>

<p>Find the maximum number of candies you can get.</p>

<p>Two positions $u$ and $v$ ($u&lt;v$) are <em>adjacent</em> if and only if $u+1=v$ or $u=1$ and $v=L$, where $L$ is the length of the remaining array.</p>

### 입력

<p>The first line contains two integers $n$ and $x$ ($1 \leq n \leq 10^5$, $1 \leq x \leq 10^9$) denoting the length of the array and the special number $x$.</p>

<p>The second line contains $n$ integers $a_1, a_2,\ldots, a_n$ ($1 \leq a_i \leq 10^9$) denoting the numbers in the circular array.</p>

### 출력

<p>Output an integer denoting the maximum number of candies you can get.</p>