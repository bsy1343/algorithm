# [Platinum II] Interesting excursion - 19742

[문제 링크](https://www.acmicpc.net/problem/19742)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 512 MB

### 통계

제출: 3, 정답: 2, 맞힌 사람: 2, 정답 비율: 66.667%

### 분류

그래프 이론, 그래프 탐색, 깊이 우선 탐색

### 문제 설명

<p>Flatland has $n$ cities, connected by $m$ one-directional roads.</p>

<p>Tourist company plans to develop a scenic cyclic tour along the roads of Flatland. This tour must start and finish at the same city, visiting some intermediate cities and traveling along some of the roads in their direction. The tour can visit some city multiple times, but it may not use the same road more than once.</p>

<p>Each road is characterized by the type of its landscape, which is the number from $1$ to $m$. To make the tour really magnificent, every two adjacent roads in the tour must have different landscape types. This also should be true for the first and the last road in the tour, so that you start to travel from any city of the tour.</p>

<p>Help the company to find the tour satisfying these conditions, or report that no such tour exists. &nbsp;</p>

### 입력

<p>Input contains multiple test cases. First line contains integer $T$ ($1 \le T \le 10^5$) --- the number of test cases.</p>

<p>First line of each test case&#39;s description contains two integers &nbsp;$n$ and $m$ ($2 \le n, m \le 2 \cdot 10^5$) --- number of cities and roads. Each of next $m$ lines contain three integers $u_i$ $v_i$ $c_i$, meaning that $i$-th road starts at city $u_i$, ends at city $v_i$ and has landscape type $c_i$ ($1 \le u_i, v_i \le n$, $1 \le c_i \le m$, $u_i \neq v_i$).</p>

<p>Sum of all $n$ in all test cases does not exceed $2 \cdot 10^5$. Sum of all $m$ in all test cases does not exceed $2 \cdot 10^5$.</p>

### 출력

<p>Output the answer of each test case.</p>

<p>If the desired tour does not exist, output the only number &lt;&lt;$-1$&gt;&gt;. Otherwise, print number k $2 \le k \le m$ --- the length of the tour. In next line print $k$ numbers $e_1, e_2, \ldots, e_k$ --- numbers of roads in the tour. All numbers $e_i$ must be different. If there are multiple possible tours, output any of them.</p>