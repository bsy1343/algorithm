# [Gold III] Elevator Pitch - 20333

[문제 링크](https://www.acmicpc.net/problem/20333)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 212, 정답: 88, 맞힌 사람: 82, 정답 비율: 45.810%

### 분류

그래프 이론, 그리디 알고리즘, 그래프 탐색, 정렬, 너비 우선 탐색

### 문제 설명

<p>You are in charge of ensuring all building designs meet accessibility requirements. As law dictates, every part of your building should be reachable for wheelchair users, which means elevators will have to be installed. You are given the blueprints of the company&#39;s current project and have to determine the minimum number of elevators required.</p>

<p>The floor plan is laid out on a square grid and the blueprints tell you the number of floors above any given square. You can place an elevator at any square, which stops at all floors of that square. A wheelchair user can move up and down between floors using the elevators and can freely move to any of the four adjacent squares on the same floor. Buildings do not connect diagonally.</p>

<p>The image below shows the second sample input. Designs can consist of multiple buildings; this one contains three buildings. The design requires two elevators: one for the pyramid-shaped building and one for the tall tower. The small building of height one does not require an elevator, since it only has a ground floor.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/20333.%E2%80%85Elevator%E2%80%85Pitch/c4053586.png" data-original-src="https://upload.acmicpc.net/dcfb8c09-0c2b-43b9-afdc-56a159b69769/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 161px; height: 114px;" /><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/20333.%E2%80%85Elevator%E2%80%85Pitch/2c67730d.png" data-original-src="https://upload.acmicpc.net/e4eaa32d-4907-4f69-ad18-3c05ba24f41a/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 160px; height: 135px;" /></p>

<p style="text-align: center;">Figure E.1: A visualisation of the second sample input.</p>

### 입력

<ul>
	<li>One line containing integers $h$ and $w$ ($1\leq h, w\leq 500$), the height and width of the grid.</li>
	<li>$h$ lines of $w$ integers each, where $x_{i,j}$ ($0\leq x_{i,j} \leq 10^9$), the $j$th integer on the $i$th line, denotes the number of floors at position $(i,j)$ of the grid.</li>
</ul>

### 출력

<p>Output the minimum number of elevators you need to build to be able to reach every part of the building(s) in the grid.</p>