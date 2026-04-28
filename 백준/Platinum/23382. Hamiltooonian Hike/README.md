# [Platinum IV] Hamiltooonian Hike - 23382

[문제 링크](https://www.acmicpc.net/problem/23382)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 147, 정답: 74, 맞힌 사람: 68, 정답 비율: 53.968%

### 분류

해 구성하기, 깊이 우선 탐색, 그래프 이론, 그래프 탐색, 트리

### 문제 설명

<p>Alice loves hiking. She often travels through forests and over mountains for several days, bringing only a backpack. For next year&#39;s summer, she decided to travel to a beautiful area which contains a large number of cabins: places where hikers can lay down a sleeping bag and stay for the night. These cabins are connected by hiking trails, paths along the scenery in the area which lead to a next cabin.</p>

<p>Alice&#39;s plan is to perform a multi-day hike. Every day, she will walk along the trails to a new cabin to spend the night. She can walk up to three trails in one day---walking four trails is too exhausting. In order to experience as much of the cabins as possible, Alice has decided that she wants to sleep in every cabin at least once. However, the summer has a limited number of days: she does not have the time to visit a cabin multiple times.</p>

<p>Alice has noticed that this requires careful planning of her hike and wonders how to find such a route. Determine which cabin Alice should walk to for every day. Figure H.1 shows a possible route for the second sample case.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/2d8e52da-de27-4b14-bac6-51349c32a257/-/preview/" style="width: 258px; height: 200px;" /></p>

<p style="text-align: center;">Figure H.1: The input and a possible route (dashed red arrows) for the second sample case.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line containing two integers $n$ ($2\leq n\leq 2\cdot 10^5$) and $m$ ($1\leq m \leq 2\cdot 10^5$), the number of cabins and hiking trails.</li>
	<li>$m$ lines each containing two integers $x,y$ ($1 \leq x,y \leq n$, $x \neq y$), indicating that there is a hiking trail between cabins $x$ and $y$.</li>
</ul>

<p>It is guaranteed that every cabin is reachable from every other cabin. There is at most one hiking trail between any two cabins.</p>

### 출력

<p>Output the order in which Alice should visit the $n$ cabins.</p>

<p>You do not need to minimize the total number of hiking trails.</p>

<p>If there are multiple valid solutions, you may output any one of them.</p>