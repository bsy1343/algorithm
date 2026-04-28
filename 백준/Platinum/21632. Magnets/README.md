# [Platinum III] Magnets - 21632

[문제 링크](https://www.acmicpc.net/problem/21632)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 29, 정답: 14, 맞힌 사람: 12, 정답 비율: 48.000%

### 분류

자료 구조, 느리게 갱신되는 세그먼트 트리, 세그먼트 트리

### 문제 설명

<p>You have a $10^9 \times 10^9$ square magnetic board with the origin of the coordinate system in the lower-left corner. There are $n$ magnets on the board, numbered from $1$ to $n$. Each magnet is an $1 \times 1$ square. Initially, the magnets are positioned in such way that the lower right corner of the $i$-th magnet has the coordinates $(i, 0)$.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/c845994f-6da0-424f-bf5a-36d584fbf9f7/-/preview/" style="width: 107px; height: 109px;" /></p>

<p style="text-align: center;">Example of the initial state for $n=5$</p>

<p>You are receiving $q$ queries of two types:</p>

<ul>
	<li>a query of type $1$ is characterized by two integers $l$ and $r$ ($1 \leq l \leq r \leq n$): take magnets with numbers from $l$ to $r$ inclusive, and rotate them by $90^{\circ}$. If the selected magnets formed a horizontal segment, then the rotation should be performed counterclockwise by $90^{\circ}$, so they will turn into a vertical segment. If the selected magnets formed a vertical segment, then the rotation should be performed clockwise $90^{\circ}$, so they will turn into a horizontal segment. All turns are relative to magnet with the smallest number. In this query, it is guaranteed that magnets with numbers from $l$ to $r$ form a continuous horizontal or vertical segment at the time of query processing.</li>
	<li>a query of type $2$ is characterized by one integer $j$ ($1 \leq j \leq n$): output the coordinates $(x, y)$ of the lower right corner of the magnet with the number $j$.</li>
</ul>

<p>Below are the board states for $n=6$ and the series of first type queries $(l_1=2,r_1=5)$, $(l_2=3,r_2=4)$, $(l_3=2,r_3=3)$, $(l_4=6,r_4=6)$.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/4795847d-db8c-469a-8766-626e4ed5b9cd/-/preview/" style="width: 107px; height: 109px;" /></p>

<p style="text-align: center;">Initial state for $n=6$.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/55509ad0-3d38-44a2-bff2-88b0da7bfbdd/-/preview/" style="width: 107px; height: 109px;" /></p>

<p style="text-align: center;">After processing a query of the first type $(l_1=2,r_1=5)$.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/18378013-fd5d-4803-a938-c1afb2cd19ea/-/preview/" style="width: 107px; height: 109px;" /></p>

<p style="text-align: center;">After processing a query of the first type $(l_2=3,r_2=4)$.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/711b7af6-98b9-440e-9548-7276a42ca124/-/preview/" style="width: 107px; height: 109px;" /></p>

<p style="text-align: center;">After processing a query of the first type $(l_3=2,r_3=3)$.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/711b7af6-98b9-440e-9548-7276a42ca124/-/preview/" style="width: 107px; height: 109px;" /></p>

<p style="text-align: center;">After processing a query of the first type $(l_4=6,r_4=6)$.</p>

<p>For each query of type $2$ you should output the coordinates of the lower right corner of the magnet with the corresponding number.</p>

### 입력

<p>The first line contains two integers $n$ and $q$ ($1 \le n, q \le 2 \cdot 10^5$) --- the number of magnets on the board and the number of queries, respectively.</p>

<p>Each of the following $q$ lines contains one query of either type $1$ or type $2$. A type $1$ query consists of $3$ integers $1$ $l$ $r$ $(1 \le l \le r \le n)$, a type $2$ query consists of $2$ integers $2$ $j$ $(1 \le j \le n)$.</p>

### 출력

<p>For each query of the type $2$ output $x$ and $y$ --- coordinates of the lower right corner of the magnet with the number $j$ at the moment of processing the corresponding query.</p>