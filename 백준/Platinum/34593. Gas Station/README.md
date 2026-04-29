# [Platinum II] Gas Station - 34593

[문제 링크](https://www.acmicpc.net/problem/34593)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 2048 MB

### 통계

제출: 84, 정답: 49, 맞힌 사람: 39, 정답 비율: 53.425%

### 분류

그리디 알고리즘, 다이나믹 프로그래밍, 매개 변수 탐색, 트리, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>Alex is planning rest area placements on a simplified model of Taiwan’s freeway system. The system contains $n$ interchanges, connected by $n − 1$ bidirectional roads. The network is connected, and there is exactly one shortest route between any pair of interchanges. The $i$-th road connects interchanges $u_i$ and $v_i$, and has a length of $l_i$.</p>

<p>Exactly $k$ rest areas with gas stations can be built, each located at an interchange. A driver may start a trip from any interchange and travel to any other, always following the unique shortest path. They begin each trip with a full tank of gas and can refuel only at interchanges that have a rest area.</p>

<p>Alex is curious about the smallest possible fuel tank capacity $d$ such that it’s possible to place the $k$ rest areas in a way that ensures no driver will ever run out of gas. On any trip, the driver must never have to travel more than $d$ units along the path without passing through a rest area, including at the beginning or end of the journey. The goal is to figure out the minimum such $d$, assuming the rest areas are placed in the best possible way.</p>

### 입력

<p>The first line contains two integer $n$, $k$.</p>

<p>Followed by $n − 1$ lines, the $i$-th of which contains three integers $u_i$, $v_i$, $l_i$, representing the $i$-th road connects interchanges $u_i$ and $v_i$ with a length $l_i$.</p>

### 출력

<p>Output one integer, the smallest possible fuel tank capacity $d$.</p>

### 제한

<ul>
<li>$2 ≤ n ≤ 2 \times 10^5$</li>
<li>$0 ≤ k ≤ n$</li>
<li>$1 ≤ u_i , v_i ≤ n$</li>
<li>$1 ≤ l_i ≤ 10^9$</li>
<li>It is guaranteed that the input roads form a tree.</li>
</ul>