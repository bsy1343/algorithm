# [Silver II] Jib Job - 32898

[문제 링크](https://www.acmicpc.net/problem/32898)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 2048 MB

### 통계

제출: 68, 정답: 55, 맞힌 사람: 54, 정답 비율: 80.597%

### 분류

그리디 알고리즘, 기하학, 수학

### 문제 설명

<p>After last year's success of building an infinite wall, Bob was hired for a new job. His first task is to set up multiple cranes on a new construction site.</p>

<p>Each crane consists of a central tower with a horizontal beam (the <em>jib</em>) attached to the top that can freely rotate around the central tower. The towers have already been set up for Bob, at some fixed coordinates and with some fixed height. Only the jibs still need to be placed. However, Bob has to be careful with this. First off, the length of a jib may not exceed the height of its tower, as else the crane would simply topple over. Secondly, the length of a jib must be a positive integer number of metres. Thirdly, no two cranes should be able to collide. Luckily, all the towers are of different height. Therefore, the only way two cranes could collide is if the jib of one tower crashed into the tower of another crane. Note that a jib touching the tower of another crane does not result in a crash.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/32898.%E2%80%85Jib%E2%80%85Job/b5de4abc.png" data-original-src="https://boja.mercury.kr/assets/problem/32898-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 450px; height: 500px;"></p>

<p style="text-align: center;">Figure J.1: Illustration of Sample Input 3. The number at the centre of each circle indicates the height of the crane at that position. The number at each arrow indicates the length of the jib for that crane.</p>

<p>With this in mind, Bob wants to maximize the area that can be reached with at least one of the cranes, that is, the area of points on the ground such that at least one of the jibs can be positioned above them through rotations. Which length should each of the jibs have so that Bob can maximize the covered area?</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with one integer $n$ $(1\leq n\leq500)$, the number of cranes.</li>
	<li>$n$ lines, each with three integers $x$, $y$, and $h$ ($0\leq x,y\leq 10\,000$, $1\leq h\leq 10\,000$), describing the position of the crane and its height in metres.</li>
</ul>

<p>It is guaranteed that no two cranes are at the same position and that all heights are distinct.</p>

### 출력

<p>For each crane, output the positive integer length of its jib in metres, such that the covered area is maximized.</p>

<p>If there are multiple optimal solutions, you may output any one of them.</p>