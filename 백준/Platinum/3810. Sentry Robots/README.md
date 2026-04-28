# [Platinum II] Sentry Robots - 3810

[문제 링크](https://www.acmicpc.net/problem/3810)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 32, 정답: 20, 맞힌 사람: 18, 정답 비율: 64.286%

### 분류

그래프 이론, 최대 유량, 이분 매칭

### 문제 설명

<p><img alt="" src="/upload/images2/robot(1).png" style="float:right; height:97px; width:148px" />We need to guard a set of points of interest using sentry robots that can not move or turn. We can position a sentry at any position facing either north, south, east or west. Once a sentry is settled, it guards the points of interest that are infront of it. If two or more points are in the same row or column a single robot can guard them all. Unfortunately, there are also some obstacles that the robot cannot see through.</p>

<p>From a set of points of interest and obstacles lying on a grid, calculate the minimum number of robots needed to guard all the points. In order to guard a point of interest, a robot must be facing the direction of this point and must not be any obstacles in between.</p>

<p>Given the following grid, where # represents an obstacle and * a point of interest, the minimum number of robots needed is 2 (a possible position and orientation is shown using arrows for each robot).</p>

<p>Note that this is not the actual input or output, just a figure.</p>

<pre>
   Grid             Solution
. . . . . .        . . . . . .
. * # * . .        . * # * . .
. . # . . .        . . # . . .
. * # * . .        . &uarr; # &uarr; . .
</pre>

<p>For the following grid we need 4 robots because of the obstacles.</p>

<pre>
   Grid             Solution
. * * . .           . &rarr; * . .
. * # * .           . &uarr; # &uarr; .
. # * . .           . # &darr; . .
. . # . .           . . * . .
</pre>

### 입력

<p>The first line of the input has an integer C representing the number of test cases that follow. Before each test case there is an empty line.</p>

<p>For each case, the first line has 2 integers, Y and X, representing the height and width of the grid. The next line has an integer that indicates the number of points of interest P. The following P lines will have the positions py and px of the points of interest, one point per line. The next line has an integer that indicates the number of obstacles W. The following W lines will have the positions wy and wx of an obstacle, one per line.</p>

### 출력

<p>For each test case print the minimum number of robots needed to guard all the points of interest, one per line.</p>

<p>CONSTRAINTS</p>

<ul>
	<li>1 &le; C &le; 50</li>
	<li>1 &le; Y, X &le; 100</li>
	<li>0 &le; P &le; Y &lowast; X</li>
	<li>0 &le; W &le; Y &lowast; X</li>
	<li>0 &le; P + W &le; Y &lowast; X</li>
	<li>1 &le; px, wx &le; X</li>
	<li>1 &le; py, wy &le; Y</li>
</ul>