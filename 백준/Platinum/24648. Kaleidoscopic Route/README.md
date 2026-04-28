# [Platinum III] Kaleidoscopic Route - 24648

[문제 링크](https://www.acmicpc.net/problem/24648)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 106, 정답: 23, 맞힌 사람: 22, 정답 비율: 26.190%

### 분류

다이나믹 프로그래밍, 그래프 이론, 그래프 탐색, 너비 우선 탐색

### 문제 설명

<p>There are $n$ cities in Kaleidostan connected with $m$ bidirectional roads. The cities are numbered from $1$ to $n$. Each road has an integer called <em>colorfulness</em>.&nbsp;</p>

<p>Keanu wants to travel from city $1$ to city $n$. He wants to take the <em>shortest</em> route --- that is, the route with the smallest number of roads. Among all the shortest routes, he wants to take the <em>kaleidoscopic</em> one --- that is, the route with the largest possible difference between the maximum and the minimum colorfulnesses of its roads. Help Keanu find such a route.</p>

### 입력

<p>The first line contains two integers $n$ and $m$ --- the number of cities and the number of roads ($2 \le n \le 10^5$; $1 \le m \le 2 \cdot 10^5$).</p>

<p>The $i$-th of the following $m$ lines contains three integers $v_i$, $u_i$, and $c_i$ --- the indices of the cities connected by the $i$-th road, and the colorfulness of the $i$-th road ($1 \le v_i, u_i \le n$; $v_i \neq u_i$; $0\le c_i \le 10^9$).</p>

<p>Each pair of cities is connected by at most one road. It is guaranteed that you can travel from any city to any other city using the roads.</p>

### 출력

<p>In the first line, print a single integer $k$ --- the number of roads in the required route.&nbsp;</p>

<p>In the second line, print $k+1$ integers $c_0, c_1, \ldots, c_k$ --- the sequence of cities on the route ($1 \le c_i \le n$; $c_0 = 1$; $c_k = n$).</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/24648.%E2%80%85Kaleidoscopic%E2%80%85Route/e6cc2c52.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/24648.%E2%80%85Kaleidoscopic%E2%80%85Route/e6cc2c52.png" data-original-src="https://upload.acmicpc.net/267995d6-ba65-40eb-9c44-8901a70b372a/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 353px; height: 142px;" /></p>

<p>In the example test, the required route consists of $3$ roads, and the difference between the maximum and the minimum colorfulnesses of its roads is $8-2=6$.</p>