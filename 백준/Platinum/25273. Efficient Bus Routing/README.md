# [Platinum III] Efficient Bus Routing - 25273

[문제 링크](https://www.acmicpc.net/problem/25273)

### 성능 요약

시간 제한: 5 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 14, 정답: 4, 맞힌 사람: 4, 정답 비율: 57.143%

### 분류

해 구성하기, 트리

### 문제 설명

<p>In the country of Optopia, they do everything as optimal as possible, and everything inside of Optopia has been designed with this in mind. For example, in order to guarantee that GPS route planners are always optimal, the road network of Optopia has been designed such that there is exactly one way to travel between any two cities in Optopia.</p>

<p>Optopia also has a network of bus lines, where each bus line travels back and forth between two cities, stopping at every city in between. Recently, there was a big scandal in Optopia. A citizen of Optopia figured out that the current network of bus lines is in fact non-optimal. It uses too many bus lines!</p>

<p>This is where you come into the story. You have been hired by Optopia to fix their embarrassing mistake. Your task is to design a new optimal network of bus lines. Optopia has specified two requirements for the new bus line network: </p>

<ul>
	<li>It must be possible to travel between any two pairs of cities by bus.</li>
	<li>The number of bus lines should be as few as possible.</li>
</ul>

<p>Model the country of Optopia as an undirected graph, where the nodes represent the cities of Optopia, and where the edges represent the roads between pairs of cities. Additionally, represent each bus line by two cities, the two end stops of that bus line.</p>

### 입력

<p>The first line consists of one integer $N$ ($3 \leq N \leq 2 \cdot 10^5$), the number of cities in Optopia. The next $N-1$ lines consists of two integers $u$ and $v$ ($1 \leq u,v \leq N$, $u \neq v$), a pair of cities that are connected by a road. It is guaranteed that Optopia is connected, meaning it is possible to travel between any two cities using the road network. </p>

### 출력

<p>On the first line output the optimal number of bus lines $M$. Then output $M$ lines, where the $i$-th line should contain two space separated integers $a_i, b_i$ ($1 \leq a_i, b_i \leq N$), the two endpoints of the $i$-th bus line. </p>