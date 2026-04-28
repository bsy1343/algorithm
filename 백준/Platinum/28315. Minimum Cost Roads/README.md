# [Platinum II] Minimum Cost Roads - 28315

[문제 링크](https://www.acmicpc.net/problem/28315)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 52, 정답: 23, 맞힌 사람: 20, 정답 비율: 44.444%

### 분류

그래프 이론, 최단 경로, 데이크스트라, 최소 스패닝 트리

### 문제 설명

<p>As the newly elected mayor of Kitchener, Alanna&#39;s first job is to improve the city&#39;s road plan.</p>

<p>Kitchener&#39;s current road plan can be represented as a collection of $N$ intersections with $M$ roads, where the $i$-th road has length $l_i$ meters, costs $c_i$ dollars per year to maintain, and connects intersections $u_i$ and $v_i$. To create a plan, Alanna must select some subset of the $M$ roads to keep and maintain, and that plan&#39;s cost is the sum of maintenance costs of all roads in that subset.</p>

<p>To lower the city&#39;s annual spending, Alanna would like to minimize the plan&#39;s cost. However, the city also requires that she minimizes travel distances between intersections and will reject any plan that does not conform to those rules. Formally, for any pair of intersections $(i, j)$, if there exists a path from $i$ to $j$ taking $l$ meters on the existing road plan, Alanna&#39;s plan must also include a path between those intersections that is at most $l$ meters.</p>

### 입력

<p>The first line contains the integers $N$ and $M$.</p>

<p>Each of the next $M$ lines contains the integers $u_i$, $v_i$, $l_i$, and $c_i$, meaning that there currently exists a road from intersection $u_i$ to intersection $v_i$ with length $l_i$ and cost $c_i$ $(1 \le u_i, v_i \le N, u_i \neq v_i)$.</p>

### 출력

<p>Output one integer, the minimum possible cost of a road plan that meets the requirements.</p>

### 제한

<ul>
	<li>$1 \le N, M \le 2\,000$</li>
	<li>$0 \le l_i \le 10^9$</li>
	<li>$1 \le c_i \le 10^9$</li>
</ul>