# [Gold III] If I Could Turn Back Time - 32924

[문제 링크](https://www.acmicpc.net/problem/32924)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 44, 정답: 24, 맞힌 사람: 24, 정답 비율: 55.814%

### 분류

그리디 알고리즘, 많은 조건 분기, 정렬

### 문제 설명

<p>Inna is an avid hiker. She's visiting a range of $n$ mountains with heights $h_1, h_2, \ldots, h_n$.</p>

<p>At a nearby shop, Inna has found a book that mentions that at some point in the past, the heights of the mountains were $p_1, p_2, \ldots, p_n$ in the same order. However, there is no evidence of how old this book is.</p>

<p>The book also describes a model of erosion that makes the mountains shorter year after year. Every year, based on the weather, a certain height threshold $x$ can be determined. Then, every mountain with the current height of at least $x$ decreases in height by exactly $1$. Different years can have different values of $x$.</p>

<p>Inna is curious how old the book actually is, and whether the described model is sound. Help her figure out the smallest number of years in which erosion could take the mountains from heights $p_1, p_2, \ldots, p_n$ to heights $h_1, h_2, \ldots, h_n$ in the same order, or determine that it is impossible under the given model.</p>

### 입력

<p>Each test contains multiple test cases. The first line contains the number of test cases $t$ ($1 \le t \le 10^4$). The description of the test cases follows.</p>

<p>The first line of each test case contains a single integer $n$, denoting the number of mountains ($1 \le n \le 10^5$).</p>

<p>The second line contains $n$ integers $h_1, h_2, \ldots, h_n$, denoting the current heights of the mountains ($1 \le h_i \le 10^6$).</p>

<p>The third line contains $n$ integers $p_1, p_2, \ldots, p_n$, denoting the heights of the mountains in the same order at some point in the past ($1 \le p_i \le 10^6$).</p>

<p>It is guaranteed that the sum of $n$ over all test cases does not exceed $10^5$.</p>

### 출력

<p>For each test case, print the smallest number of years in which erosion could take the mountains from heights $p_1, p_2, \ldots, p_n$ to heights $h_1, h_2, \ldots, h_n$, or a single integer $-1$ if the described model is unsound.</p>

### 힌트

<p>In the first test case, the heights of the mountains could go from $(5, 3, 6, 2)$ to $(3, 2, 4, 2)$ in just two years:</p>

<ul>
	<li>Suppose that in the first year, $x = 4$. After this year, the heights of the mountains are $(4, 3, 5, 2)$.</li>
	<li>Suppose that in the second year, $x = 3$. After this year, the heights of the mountains are $(3, 2, 4, 2)$.</li>
</ul>