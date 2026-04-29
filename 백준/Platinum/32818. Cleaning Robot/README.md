# [Platinum IV] Cleaning Robot - 32818

[문제 링크](https://www.acmicpc.net/problem/32818)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 79, 정답: 21, 맞힌 사람: 14, 정답 비율: 22.581%

### 분류

구현, 많은 조건 분기, 시뮬레이션

### 문제 설명

<p>The road network of a city consists of a set of axis-parallel rectangles. Each rectangle road may overlap with others as shown in the figure below. The city operates an autonomous cleaning robot that is responsible to clean the entire roads every day. During cleaning, each rectangle is classified into one of three types as follows.</p>

<ol>
	<li>Uncleared (UC): A rectangle that the cleaning robot has never visited.</li>
	<li>Partially cleared (PC): A rectangle that has been cleaned partially.</li>
	<li>All cleared (AC): A rectangle that has been completely cleaned.</li>
</ol>

<p>The cleaning robot works according to the following routing algorithm.</p>

<ul>
	<li>The robot moves in a clockwise direction while cleaning each rectangle.</li>
	<li>If the robot encounters a road of a new UC rectangle during the cleaning of a rectangle, it will turn at the crossing point and move towards the UC rectangle.</li>
	<li>When a rectangle is completely cleaned as the robot reaches a point $(x, y)$ and another PC rectangle is encountered at $(x, y)$, the robot resumes cleaning the PC rectangle at that same point $(x, y)$.</li>
	<li>If the robot returns to the starting point, it will stay at that point afterwards.</li>
	<li>It takes the robot one second to move a unit distance along edges, and takes two seconds in changing direction at a crossing point or corner.</li>
</ul>

<p>Let us explain the routing algorithm with the following example. The example road network consists of four rectangles $\{R_1, R_2, R_3, R_4\}$ where the starting point is $s$ of $R_1$.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/32818.%E2%80%85Cleaning%E2%80%85Robot/2535a02f.png" data-original-src="https://boja.mercury.kr/assets/problem/32818-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 401px; height: 300px;"></p>

<p>The orange lines in the following figure depict the trajectory of the cleaning robot starting from $s$ of $R_1$.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/32818.%E2%80%85Cleaning%E2%80%85Robot/16d237e3.jpg" data-original-src="https://boja.mercury.kr/assets/problem/32818-2.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 402px; height: 300px;"></p>

<p>Given information about $n$ rectangles, we want to know the exact locations of the robot for the five query points $t_i$ ($1 ≤ i ≤ 5$) in time. Note that the starting point is designated to the upper left corner of the rectangle $R_1$.</p>

### 입력

<p>Your program is to read from standard input. The input starts $1 ≤ i ≤ 5$ with a line containing one integer, $n$ ($1 ≤ n ≤ 50$), where $n$ is the number of rectangles $R_i$. The second line gives the five query points $t_i$ ($1 ≤ i ≤5$) in time where $1 ≤ t_i ≤ 100\,000$. The $i$-th line of following $n$ lines gives four integers $x_l$, $y_l$, $x_u$, $y_u$ for $R_i$ where $(x_l , y_l)$ is the lower left corner and $(x_u, y_u)$ is the upper right corner where $1 ≤ x_l &lt; x_u ≤1\,000$, and $1 ≤ y_l &lt; y_u ≤ 1\,000$. Note that the intersection points between rectangles are all in the middle of edges, not at corner points, and there are no edge overlaps among rectangles, so the configurations below are not given in this problem. Also note that rectangles are not necessarily all connected into one component.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/32818.%E2%80%85Cleaning%E2%80%85Robot/ab3d73ef.png" data-original-src="https://boja.mercury.kr/assets/problem/32818-3.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 442px; height: 150px;"></p>

### 출력

<p>Your program is to write to standard output. Print exactly five lines. The line should contain two integers $x_i$, $y_i$ where $(x_i, y_i)$ is the location of the cleaning robot at time $t_i$ ($1 ≤ i ≤ 5$).</p>

<p>The following shows sample input and output for three test cases. Note that at time $t = 0$, the robot is ready to start at the starting point.</p>