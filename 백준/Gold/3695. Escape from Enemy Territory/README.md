# [Gold III] Escape from Enemy Territory - 3695

[문제 링크](https://www.acmicpc.net/problem/3695)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 128 MB

### 통계

제출: 31, 정답: 12, 맞힌 사람: 11, 정답 비율: 57.895%

### 분류

너비 우선 탐색, 그래프 이론, 그래프 탐색, 매개 변수 탐색

### 문제 설명

<p>A small group of commandos has infiltrated deep into enemy territory. They have just accomplished their mission and now have to return to their rendezvous point. Of course they don&rsquo;t want to get caught even if the mission is already over. Therefore they decide to take the route that will keep them as far away from any enemy base as possible.</p>

<p>Being well prepared for the mission, they have a detailed map of the area which marks all (known) enemy bases, their current position and the rendezvous point. For simplicity, we view the the map as a rectangular grid with integer coordinates (x, y) where 0 &le; x &lt; X, 0 &le; y &lt; Y . Furthermore, we approximate movements as horizontal and vertical steps on this grid, so we use Manhattan distance: dist((x<sub>1</sub>, y<sub>1</sub>),(x<sub>2</sub>, y<sub>2</sub>)) = |x<sub>2</sub> &minus; x<sub>1</sub>| + |y<sub>2</sub> &minus; y<sub>1</sub>|. The commandos can only travel in vertical and horizontal directions at each step.</p>

<p>Can you help them find the best route? Of course, in case that there are multiple routes that keep the same minimum distance to enemy bases, the commandos want to take a shortest route that does so. Furthermore, they don&rsquo;t want to take a route off their map as it could take them in unknown, dangerous areas, but you don&rsquo;t have to worry about unknown enemy bases off the map.</p>

### 입력

<p>On the first line one positive number: the number of testcases, at most 100. After that per testcase:</p>

<ul>
	<li>One line with three positive numbers N, X, Y. 1 &le; N &le; 10 000 is the number of enemy bases and 1 &le; X, Y &le; 1 000 the size of the map: coordinates x, y are on the map if 0 &le; x &lt; X, 0 &le; y &lt; Y.</li>
	<li>One line containing two pairs of coordinates x<sub>i</sub>, y<sub>i</sub> and x<sub>r</sub>, y<sub>r</sub>: the initial position of the commandos and the rendezvous point.</li>
	<li>N lines each containing one pair of coordinates x, y of an enemy base.</li>
</ul>

<p>All pairs of coordinates are on the map and different from each other.</p>

### 출력

<p>Per testcase:</p>

<ul>
	<li>One line with two numbers separated by one space: the minimum separation from an enemy base and the length of the route.</li>
</ul>