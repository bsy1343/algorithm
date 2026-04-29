# [Platinum II] Connect Five - 32891

[문제 링크](https://www.acmicpc.net/problem/32891)

### 성능 요약

시간 제한: 2.5 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 104, 정답: 38, 맞힌 사람: 32, 정답 비율: 41.558%

### 분류

기하학, 많은 조건 분기, 브루트포스 알고리즘, 애드 혹

### 문제 설명

<p>In the town of Nattanham, all roads run either north to south, or east to west, and span the entire town. Furthermore, all roads are an equal distance apart. This makes navigating the town extremely easy.</p>

<p>Unfortunately, the roads are quite poor and could do with a fresh layer of asphalt. However, there is not enough money to fix all the roads, so some sections of road need to be given priority.</p>

<p>The mayor has selected five locations in town that he considers to be of great importance: the city hall, the police station, the hospital, the fire department, and of course the mayor's house. Each of these locations is at an intersection.</p>

<p>The mayor wishes that, for each pair of these important locations, it becomes possible to get from one to the other along a shortest path that consists entirely of refurbished road. Within this restriction, the mayor would like to refurbish the smallest amount of road. The intersections do not count toward this amount. Figure C.1 depicts an optimal configuration of refurbished roads.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/32891.%E2%80%85Connect%E2%80%85Five/cf30b92c.jpg" data-original-src="https://boja.mercury.kr/assets/problem/32891-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 550px; height: 400px;"></p>

<p style="text-align: center;">Figure C.1: Illustration of Sample Input 1, with the locations labelled by their initial letters, and a possible way of refurbishing the minimum number of road segments ($22$). The point $(0,0)$ is located at the bottom-left corner of the grid.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>Five lines, each with two integers $x$ and $y$ ($0 \le x, y \le 1000$), the grid coordinates of each of the five important locations.</li>
</ul>

<p>It is guaranteed that the locations are distinct.</p>

### 출력

<p>Output the minimum number of road segments that need to be refurbished.</p>