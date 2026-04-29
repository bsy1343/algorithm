# [Gold II] One Way Only - 35356

[문제 링크](https://www.acmicpc.net/problem/35356)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 23, 정답: 9, 맞힌 사람: 6, 정답 비율: 46.154%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/35356.%E2%80%85One%E2%80%85Way%E2%80%85Only/0576715d.jpg" data-original-src="https://boja.mercury.kr/assets/problem/35356-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 192px; height: 146px;"></p>

<p style="text-align: center;"><b>Figure 1</b>: The preferred path in the sample case. Three tiles are X-ed out to enforce this path.</p>

<p>You’ve been tasked with mapping out one of the most dangerous hiking routes deep within the Amazon rainforest. This hiking route exists on a rectangular area of land that has been tiled into a 2D grid with $r$ rows and $c$ columns. Hikers who dare attempt this trail begin on the top-left tile $(1, 1)$ and work their way down to tile $(r, c)$. In order to finish as fast as possible, every hiker will move only rightward or downward during their hike.</p>

<p>After a thorough examination of the entire land area, you’ve uncovered just how unforgiving this jungle can be. With many tiles containing extreme hazards (from apex predators to mangrove swamps), you’ve determined that there is exactly one path through the jungle consisting of only rightward and downward moves that also avoids all of the major obstacles. You call this path your <em>preferred path</em>.</p>

<p>However, hikers who try this route may feel adventurous and follow a different path (still consisting of only rightward and downward moves) instead of the preferred path. To discourage the hikers from doing this, you plan to X out some tiles on the map, knowing that a hiker will not pass through an X-ed out tile under any circumstances. Consequently, if the only path from $(1, 1)$ to $(r, c)$ that does not pass through an X-ed out tile is your preferred path, then the hikers will have no choice but to follow it!</p>

<p>Given the map dimensions and your preferred path, can you determine the minimum number of tiles you must X out to force all hikers to take your preferred path?</p>

### 입력

<p>The first line of input contains two integers $r$ and $c$ ($1 \le r, c \le 10^5$, $r \cdot c \ge 2$), the number of rows and columns on the map.</p>

<p>The next line has a string of length $r + c - 2$ which contains exactly $r-1$ ‘<code>D</code>’s and $c-1$ ‘<code>R</code>’s: the sequence of moves that follows your preferred path through the jungle. A ‘<code>D</code>’ represents a downward move on the map, while an ‘<code>R</code>’ represents a rightward move.</p>

### 출력

<p>Output a single integer, the minimum number of tiles you must X out on the map to guarantee that all future hikers will take your preferred path through the jungle.</p>