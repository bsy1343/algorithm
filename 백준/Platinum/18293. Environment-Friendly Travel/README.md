# [Platinum V] Environment-Friendly Travel - 18293

[문제 링크](https://www.acmicpc.net/problem/18293)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 132, 정답: 56, 맞힌 사람: 46, 정답 비율: 45.098%

### 분류

다이나믹 프로그래밍, 그래프 이론, 최단 경로, 데이크스트라

### 문제 설명

<p>Taking holidays unfortunately has a carbon footprint. The CO<sub>2</sub>-cost of a kilometer traveled depends on the mode of transportation. For instance, train travel is less costly than bus travel, which is itself less costly than car travel.</p>

<p>Your objective is to plan a holiday trip from your house, given by 2D coordinates (x<sub>s</sub>, y<sub>s</sub>), to your travel destination, given by (x<sub>d</sub>, y<sub>d</sub>). Being aware of the environmental impact of travel, you want to minimize the CO<sub>2</sub>-cost of your holiday, but you still want to keep the total number of kilometers traveled within a given budget B.</p>

<p>To aid you in planning, you have access to a map of N stations, possibly linked by T different modes of transportation (airplane, train, etc.) numbered 1, . . . , T. Each mode has a CO<sub>2</sub>-cost per distance unit C<sub>1</sub>, . . . , C<sub>T</sub>. You can travel by car from your home to the destination, from your home to any station, and from any station to the destination point, at a cost C<sub>0</sub> per distance unit. C<sub>0</sub> is always greater than any of C<sub>1</sub>, . . . , C<sub>T</sub>.</p>

<p>Each of the N stations has coordinates (x<sub>i</sub>, y<sub>i</sub>) for i = 0, . . . , N &minus; 1. Each station may be connected to some other stations via one or several of the T modes. Each connection works both ways, so only one direction has to be listed. There can be multiple modes of transportation available between two stations. You can only travel between two stations via their connections using the available transportation modes (car travel is not allowed between stations).</p>

<p>The distance between two points a and b is the 2D distance between (x<sub>a</sub>, y<sub>a</sub>) and (x<sub>b</sub>, y<sub>b</sub>), rounded to the nearest integer above:</p>

<p style="text-align: center;">dist(a, b) = &lceil;&radic;((x<sub>a</sub> - x<sub>b</sub>)<sup>2</sup> + (y<sub>a</sub> - y<sub>b</sub>)<sup>2</sup>)&rceil;,</p>

<p>and the CO<sub>2</sub>-cost of travel between a and b, using transport mode i is:</p>

<p style="text-align: center;">cost(a, b, i) = C<sub>i</sub> &times; dist(a, b).</p>

<p>Given two source&ndash;destination coordinates, a budget B expressed in distance units, a list of transportation modes and their respective CO<sub>2</sub>-costs, and the station network, your task is to compute the minimal CO<sub>2</sub>-cost possible while traveling at most B kilometers.</p>

### 입력

<p>The input consists of the following lines:</p>

<ul>
	<li>Line 1 contains two space-separated integers, x<sub>s</sub> and y<sub>s</sub>, the coordinates of your house.</li>
	<li>Line 2 contains two space-separated integers, x<sub>d</sub> and y<sub>d</sub>, the coordinates of your destination.</li>
	<li>Line 3 contains an integer, B, the maximal distance (in kilometers) that you accept to travel.</li>
	<li>Line 4 contains an integer, C<sub>0</sub>, the CO<sub>2</sub>-cost per distance unit of traveling by car.</li>
	<li>Line 5 contains an integer, T, the number of modes of transportation (beside cars).</li>
	<li>Line i + 5, for 1 &le; i &le; T, contains the integer C<sub>i</sub>, the CO<sub>2</sub>-cost per distance unit of transportation mode i.</li>
	<li>Line T + 6 contains the integer N, the number of stations.</li>
	<li>Line i + T + 7 describes station i (0 &le; i &lt; N) and contains 3 + 2 &times; l<sub>i</sub> space-separated integers. The first three integers are x<sub>i</sub>, y<sub>i</sub> and l<sub>i</sub>. The pair (x<sub>i</sub>, y<sub>i</sub>) represents the coordinates of station i, while l<sub>i</sub> is the number of links between station i and other stations. The l<sub>i</sub> remaining pairs of integers (j, m<sub>j</sub>) each describe a link to station j (0 &le; j &lt; N) using transportation mode m<sub>j</sub> (1 &le; m<sub>j</sub> &le; T). All links are bidirectional.</li>
</ul>

### 출력

<p>The output should contain a single line with a single integer representing the minimal feasible CO<sub>2</sub>-cost or &minus;1 if no feasible cost is found within the kilometer budget.</p>

### 제한

<p>All inputs are integers. All coordinates are in [0, 100] &times; [0, 100].</p>

<ul>
	<li>1 &le; T &le; 100;</li>
	<li>1 &le; N &le; 1 000;</li>
	<li>0 &le; B &le; 100;</li>
	<li>1 &le; C<sub>1</sub>, . . . , C<sub>T</sub> &lt; C<sub>0</sub> &le; 100;</li>
	<li>for each station, there are at most 100 links to other stations.</li>
</ul>

### 힌트

<p>The results corresponds to the CO2-cost of the following route:</p>

<ol>
	<li>from home at (1,1) to station 0 at (2,3) by car for a cost of 100 &times; &lceil;&radic;(1<sup>2</sup> + 2<sup>2</sup>)&rceil; = 300,</li>
	<li>to station 2 at (9,3) via transportation mode 2 for a cost of 50 &times; &lceil;&radic;(7<sup>2</sup> + 0<sup>2</sup>)&rceil; = 350,</li>
	<li>to the destination at (10,2) by car for a cost of 100 &times; &lceil;&radic;(1<sup>2</sup> + 1<sup>2</sup>)&rceil; = 200 for a total of 850.</li>
</ol>

<p>This route is valid because the total distance traveled is 3 + 7 + 2 = 12, within the allowed budget of 12.</p>