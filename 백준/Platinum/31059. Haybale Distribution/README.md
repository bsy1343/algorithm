# [Platinum V] Haybale Distribution - 31059

[문제 링크](https://www.acmicpc.net/problem/31059)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 463, 정답: 127, 맞힌 사람: 104, 정답 비율: 32.808%

### 분류

수학, 정렬, 누적 합, 삼분 탐색

### 문제 설명

<p>Farmer John is distributing haybales across the farm!</p>

<p>Farmer John&#39;s farm has $N$ $(1\le N\le 2\cdot 10^5)$ barns, located at integer points $x_1,\dots, x_N$ $(0 \le x_i \le 10^6)$ on the number line. Farmer John&#39;s plan is to first have $N$ shipments of haybales delivered to some integer point $y$ $(0 \le y \le 10^6)$ and then distribute one shipment to each barn.</p>

<p>Unfortunately, Farmer John&#39;s distribution service is very wasteful. In particular, for some $a_i$ and $b_i$ $(1\le a_i, b_i\le 10^6)$, $a_i$ haybales are wasted per unit of distance left each shipment is transported, and $b_i$ haybales are wasted per unit of distance right each shipment is transported. Formally, for a shipment being transported from point $y$ to a barn at point $x$, the number of haybales wasted is given by</p>

<p>$$\begin{cases} a_i\cdot (y-x) &amp; \text{if } y \ge x \\ b_i\cdot (x-y) &amp; \text{if } x &gt; y \end{cases}.$$</p>

<p>Given $Q$ $(1\le Q\le 2\cdot 10^5)$ independent queries each consisting of possible values of $(a_i,b_i)$, please help Farmer John determine the fewest amount of haybales that will be wasted if he chooses $y$ optimally.</p>

### 입력

<p>The first line contains $N$.</p>

<p>The next line contains $x_1\dots x_N$.</p>

<p>The next line contains $Q$.</p>

<p>The next $Q$ lines each contain two integers $a_i$ and $b_i$.</p>

### 출력

<p>Output $Q$ lines, the $i$th line containing the answer for the $i$th query.</p>