# [Silver II] Two Pointers (easy version) - 29819

[문제 링크](https://www.acmicpc.net/problem/29819)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 78, 정답: 39, 맞힌 사람: 35, 정답 비율: 50.000%

### 분류

그리디 알고리즘, 브루트포스 알고리즘, 정렬

### 문제 설명

<p>Alice and Bob are visiting cities on a very long road that stretches from points $-10^9$ to $10^9$. Alice starts at point $A$ while Bob starts at point $B$.</p>

<p>There are $n$ cities to visit, where the $i$-th city is at point $t_i$. Each city must be visited by Alice or Bob at least once, but they can be visited in <strong>any order</strong>.</p>

<p>What is the minimum <strong>total</strong> distance Alice and Bob travel?</p>

### 입력

<p>Each test consists of multiple test cases. The first line contains a single integer $T$ ($1 \le T \le 100$), the number of test cases. Each test case is formatted as follows:</p>

<p>The first line contains three space-separated integers $n$, $A$, and $B$ ($1 \le n \le 2 \cdot 10^5$, $-10^9 \le A, B \le 10^9$) -- the number of cities, Alice&#39;s position, and Bob&#39;s position, respectively.</p>

<p>The second line contains $n$ space-separated integers $t_1, t_2, \ldots, t_n$ ($-10^9 \le t_i \le 10^9$) -- the positions of the cities.</p>

<p>It is guaranteed that the sum of $n$ over all test cases is at most $2 \cdot 10^5$.</p>

### 출력

<p>For each test case, print the answer on a separate line.</p>

<p>Output the minimum total distance that Alice and Bob must travel to visit all cities.</p>

### 힌트

<p>In the first test case: There are $7$ cities. Alice starts at coordinate $-6$ and Bob starts at point $10$.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/29819.%E2%80%85Two%E2%80%85Pointers%E2%80%85(easy%E2%80%85version)/a98ec602.png" data-original-src="https://upload.acmicpc.net/6280da61-f9a6-4e56-bad3-c83e27818c57/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 1024px; height: 51px;" /></p>

<p>One possible optimal way to visit all cities is as follows ($i \xrightarrow{x} j$ means to go from $i$ to $j$, driving $x$ distance):</p>

<ul>
	<li>Alice visits the cities (given in order): $A \xrightarrow{0} \text{city }6 \xrightarrow{9} \text{city }1$.</li>
	<li>Bob visits the cities (given in order): $B \xrightarrow{1} \text{city }5 \xrightarrow{1} \text{city }3 \xrightarrow{4} \text{city }4 \xrightarrow{8} \text{city }7 \xrightarrow{1} \text{city }2$.</li>
</ul>

<p>Alice drives for a total of $0 + 9 = 9$ distance and Bob drives for a total of $1 + 1 + 4 + 8 + 1 = 15$ distance. The total distance driven by both Alice and Bob is $9 + 15 = 24$. It can be proven that there is no way to drive less than $24$ distance, thus the answer is $24$.</p>

<p>In the second test case, Alice and Bob are both already at city $2$. Bob can visit the city $2$ then city $1$, driving $2,000,000,000$ total distance. Note that Alice can choose to do nothing.</p>

<p>In the third test case, Alice can visit the only city, driving from point $4$ to point $1$ for $3$ distance. Bob does nothing.</p>