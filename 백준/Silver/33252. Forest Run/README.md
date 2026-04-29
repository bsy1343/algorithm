# [Silver II] Forest Run - 33252

[문제 링크](https://www.acmicpc.net/problem/33252)

### 성능 요약

시간 제한: 6 초, 메모리 제한: 2048 MB

### 통계

제출: 92, 정답: 30, 맞힌 사람: 23, 정답 비율: 31.507%

### 분류

그래프 이론, 그래프 탐색, 깊이 우선 탐색, 너비 우선 탐색, 트리

### 문제 설명

<p>Forrest Gump wants to participate in the annual Forest Run. As usual, the forest where this event takes place contains many trees. However, the forest for this year's run is special. The hiking trails are also shaped like trees; this means that each entrance into the forest branches off into multiple trails, these trails will never form a cycle, and entrances into the forest do not have incoming trails from another entrance. In order to finish the Forest Run, every path from every entrance to every trail end and back must be run.</p>

<p>All intersections in the forest (including the entrances) are numbered, starting from one. Every trail between two intersections is one kilometer long. You can neglect the distance between the entrances to the forest.</p>

<p>Can you calculate the full distance that Forrest must run in order to complete the Forest Run?</p>

### 입력

<ul>
	<li>One line with two integers: $1 \leq n \leq 10^6$, the number of intersections in the forest, and $1 \leq e \leq n$, the number of entrances into the forest.</li>
	<li>One line with $e$ integers: these are the numbers of the intersections that are the entrances to the forest.</li>
	<li>$n$ lines, one for each intersection $i$. Each line has one integer $0 \leq c_i \leq n - 1$, indicating the number of trails exiting intersection $i$, followed by $c_i$ integers which are the numbers of the intersections that the trails exiting intersection $i$ lead to.</li>
</ul>

### 출력

<ul>
	<li>One line containing one integer, which is the amount of kilometers that Forrest must run.</li>
</ul>