# [Gold IV] Army of Clones - 24846

[문제 링크](https://www.acmicpc.net/problem/24846)

### 성능 요약

시간 제한: 1.5 초, 메모리 제한: 512 MB

### 통계

제출: 81, 정답: 52, 맞힌 사람: 45, 정답 비율: 63.380%

### 분류

그래프 이론, 최단 경로, 데이크스트라, 0-1 너비 우선 탐색

### 문제 설명

<p>The army of $x$ clones sneaked into the spaceship &quot;Death Star&quot; to help Luke Skywalker battling with Darth Vader. The spaceship consists of $n$ rooms and $m$ bidirectional passages between them. The clones start in the room 1 and want to go to the room $n$, where Luke is.</p>

<p>However every room is guarded by droids, room $i$ is guarded by $a_i$ droids. When the clones appear in the room, the battle between them and the droids starts. If the number of clones is greater than the number of droids, the clones will kill all the droids and all the clones will stay alive. Otherwise the clones will kill all droids as well, but they will lose half of the army: if there are $x$ clones at the beginning of the battle, then there will be $\left \lfloor \frac{x}{2} \right \rfloor$ clones at the end of battle, rounded down. The clones have to battle in all rooms they would visit, including rooms 1 and $n$.</p>

<p>Help the captain of the army to count the maximum number of clones that can come from the room 1 to the room $n$ .</p>

### 입력

<p>The first line contains two integers $n$ and $m$ --- number of rooms and passages in &quot;Death Star&quot; ($1 \le n, m \le 2 \cdot 10^5$).</p>

<p>The following $m$ lines describe passages: the $i$-th passage is described by two integers $u_i$ and $v_i$ --- the rooms that are connected by the passage ($1 \le u_i, v_i \le n$, $u_i \neq v_i$). It is guaranteed that every pair of rooms is connected by at most one passage.</p>

<p>The next line contains an integer $x$ --- the number of clones in the army ($1 \le x \le 10^9$).</p>

<p>The last line contains $n$ integers $a_1, a_2, \ldots, a_n$ --- the number of droids in the rooms ($1 \le a_i \le 10^9$).</p>

### 출력

<p>Print a single integer --- the maximum number of clones that can go from room 1 to room $n$. If there is no path to follow, so that at least one clone survives, print 0.</p>