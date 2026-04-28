# [Platinum I] Neutral Ground - 32020

[문제 링크](https://www.acmicpc.net/problem/32020)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 15, 정답: 14, 맞힌 사람: 14, 정답 비율: 93.333%

### 분류

그래프 이론, 최대 유량, 최대 유량 최소 컷 정리

### 문제 설명

<p>Two kingdoms had been at war for a long time, until the emperor intervened to bring an end to the conflict. The territory in question comprises an $M$ by $N$ rectangular grid. At the emperor&#39;s insistence, the two kings have withdrawn their troops until no two opposing troops are in adjacent squares of the map (adjacent being horizontal or vertical -- diagonal is not considered).</p>

<p>The emperor proposes to designate certain squares of the map as neutral territory. Neither king will be allowed to move troops into those squares, and the emperor&#39;s own forces will patrol them to be sure that both kings observe these rules.</p>

<p>The emperor is frugal and does not want to commit more soldiers to this effort than absolutely necessary.  His generals have marked each square of the map with the number of soldiers required to secure that square. What remains is to choose which of those squares should be patrolled.</p>

<p>Write a program to determine the minimum number of soldiers that the emperor will need to be deploy to guarantee that the troops of one kingdom cannot move, in one or more steps, into squares occupied by the troops of the second kingdom (moving horizontally or vertically) without encountering the emperor&#39;s own soldiers.</p>

### 입력

<p>Input begins with a line containing $2$ integers, $w$ and $h$, denoting the width and height of the map.  $1 \leq w, h \leq 40$.</p>

<p>This is followed by $h$ lines. Each line contains $w$ characters, left justified. These characters will be &#39;A&#39; or &#39;B&#39;, designating a position held by king A or king B, or a single numeric digit, designating a currently unoccupied position that can be secured by the use of that number of soldiers. For example, a &#39;2&#39; would indicate that two soldiers must be deployed to that square to secure it against passage of other troops.  A &#39;0&#39; indicates terrain that is impassible -- the emperor need not commit soldiers there because the kingdom troops cannot pass through that square.</p>

<p>No &#39;A&#39; will be adjacent, horizontally or vertically, to any &#39;B&#39;.</p>

<p>There will be at least one &#39;A&#39; and one &#39;B&#39; in the input.</p>

### 출력

<p>Print a single line containing an integer denoting the minimum number of soldiers that the emperor must deploy to guarantee that there is no open path between any &#39;A&#39; position and any &#39;B&#39; position, using any combination of horizontal or vertical moves.</p>