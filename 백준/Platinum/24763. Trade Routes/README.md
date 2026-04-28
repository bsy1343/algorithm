# [Platinum III] Trade Routes - 24763

[문제 링크](https://www.acmicpc.net/problem/24763)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 25, 정답: 19, 맞힌 사람: 15, 정답 비율: 71.429%

### 분류

자료 구조, 그리디 알고리즘, 우선순위 큐, 작은 집합에서 큰 집합으로 합치는 테크닉, 트리, 트리를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>All roads lead to Rome. In this case, we mean every road in the road network in the Roman Empire can be travelled in only one direction. Each city that is not Rome has exactly one road that leaves it and by following these roads, you will always end up in Rome.</p>

<p>Each city, including Rome itself, may create a trade route to Rome which brings Rome some value. These values are all distinct. Each city does not want to be too congested with traders so they constrain the number of trade routes that the city can be a part of.</p>

<p>We say that a city is part of a trade route if it is contained in the unique path from the city that created the trade route and Rome. A city is a part of its own trade route.</p>

<p>Given the city constraints, determine the maximum value that can be brought to Rome by choosing a subset of cities to create trade routes.</p>

### 입력

<p>The first line of input contains a single integer $N$ ($2 \leq N \leq 300\,000$), which is the number of cities. The cities are numbered $1$ to $N$. Rome is city number $1$.</p>

<p>The next line contains $N-1$ integers $p_2, p_3, \ldots, p_{N}$ ($1 \leq p_i &lt; i$), where $p_i$ is the city you reach by following the single road out of city $i$.</p>

<p>The next line contains $N$ integers $b_1, b_2, \ldots, b_{N}$ ($0 \leq b_i \leq N$), where $b_i$ is the maximum number of trade routes that city $i$ can be a part of.</p>

<p>The next line contains $N$ distinct integers $v_1, v_2, \ldots, v_N$ ($0 \leq v_i \leq 10^9$), which is the value brought to Rome if city $i$ creates a trade route.</p>

### 출력

<p>First display the maximum possible value Rome can receive from any valid subset of chosen trade routes. Next display $T$, the number of trade routes created, then display the $T$ cities, in increasing order, that were selected.</p>

<p>If there are multiple possible solutions, display any of them.</p>