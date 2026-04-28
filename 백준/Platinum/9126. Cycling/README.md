# [Platinum III] Cycling - 9126

[문제 링크](https://www.acmicpc.net/problem/9126)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 128, 정답: 28, 맞힌 사람: 19, 정답 비율: 21.348%

### 분류

자료 구조, 그래프 이론, 최단 경로, 데이크스트라, 분리 집합, 매개 변수 탐색

### 문제 설명

<p>You want to cycle to a programming contest. The shortest route to the contest might be over the tops of some mountains and through some valleys. From past experience you know that you perform badly in programming contests after experiencing large differences in altitude. Therefore you decide to take the route that minimizes the altitude difference, where the altitude difference of a route is the difference between the maximum and the minimum height on the route. Your job is to write a program that finds this route.</p>

<p>You are given:</p>

<ul>
	<li>the number of crossings and their altitudes, and</li>
	<li>the roads by which these crossings are connected.</li>
</ul>

<p>Your program must find the route that minimizes the altitude difference between the highest and the lowest point on the route. If there are multiple possibilities, choose the shortest one.</p>

<p>For example:&nbsp;</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/9126.%E2%80%85Cycling/79e8acfd.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/9126/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-06-13%20%EC%98%A4%ED%9B%84%206.11.24.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:134px; width:261px" /></p>

<p>In this case the shortest path from 1 to 7 would be through 2, 3 and 4, but the altitude difference of that path is 8. So, you prefer to go through 5, 6 and 4 for an altitude difference of 2. (Note that going from 6 directly to 7 directly would have the same difference in altitude, but the path would be longer!)</p>

### 입력

<p>On the first line an integer t (1 &le; t &le; 100): the number of test cases. Then for each test case:</p>

<ul>
	<li>One line with two integers n (1 &le; n &le; 100) and m (0 &le; m &le; 5000): the number of crossings and the number of roads. The crossings are numbered 1..n.</li>
	<li>n lines with one integer h<sub>i</sub> (0 &le; h<sub>i</sub> &le; 1 000 000 000): the altitude of the i-th crossing.</li>
	<li>m lines with three integers a<sub>j</sub>, b<sub>j</sub> (1 &le; a<sub>j</sub>,b<sub>j</sub> &le; n) and c<sub>j</sub> (1 &le; c<sub>j</sub> &le; 1000000): this indicates that there is a two-way road between crossings a<sub>j</sub> and b<sub>j</sub> of length c<sub>j</sub>. You may assume that the altitude on a road between two crossings changes linearly.</li>
</ul>

<p>You start at crossing 1 and the contest is at crossing n. It is guaranteed that it is possible to reach the programming contest from your home.</p>

### 출력

<p>For each testcase, output one line with two integers separated by a single space:&nbsp;</p>

<ul>
	<li>the minimum altitude difference, and</li>
	<li>the length of shortest path with this altitude difference.</li>
</ul>