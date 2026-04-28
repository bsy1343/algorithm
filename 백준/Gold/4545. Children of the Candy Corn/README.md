# [Gold III] Children of the Candy Corn - 4545

[문제 링크](https://www.acmicpc.net/problem/4545)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 23, 정답: 15, 맞힌 사람: 10, 정답 비율: 100.000%

### 분류

너비 우선 탐색, 그래프 이론, 그래프 탐색, 구현, 시뮬레이션

### 문제 설명

<p>The cornfield maze is a popular Halloween treat. Visitors are shown the entrance and must wander through the maze facing zombies, chainsaw-wielding psychopaths, hippies, and other terrors on their quest to find the exit.</p>

<p>One popular maze-walking strategy guarantees that the visitor will eventually find the exit. Simply choose either the right or left wall, and follow it. Of course, there&#39;s no guarantee which strategy (left or right) will be better, and the path taken is seldom the most efficient. (It also doesn&#39;t work on mazes with exits that are not on the edge; those types of mazes are not represented in this problem.)</p>

<p>As the proprieter of a cornfield that is about to be converted into a maze, you&#39;d like to have a computer program that can determine the left and right-hand paths along with the shortest path so that you can figure out which layout has the best chance of confounding visitors.</p>

### 입력

<p>Input to this problem will begin with a line containing a single integer n indicating the number of mazes. Each maze will consist of one line with a width, w, and height, h (3 &lt;= w, h &lt;= 40), followed by h lines of w characters each that represent the maze layout. Walls are represented by hash marks (&#39;#&#39;), empty space by periods (&#39;.&#39;), the start by an &#39;S&#39; and the exit by an &#39;E&#39;.</p>

<p>Exactly one &#39;S&#39; and one &#39;E&#39; will be present in the maze, and they will always be located along one of the maze edges and never in a corner. The maze will be fully enclosed by walls (&#39;#&#39;), with the only openings being the &#39;S&#39; and &#39;E&#39;. The &#39;S&#39; and &#39;E&#39; will also be separated by at least one wall (&#39;#&#39;).</p>

<p>You may assume that the maze exit is always reachable from the start point.</p>

### 출력

<p>For each maze in the input, output on a single line the number of (not necessarily unique) squares that a person would visit (including the &#39;S&#39; and &#39;E&#39;) for (in order) the left, right, and shortest paths, separated by a single space each. Movement from one square to another is only allowed in the horizontal or vertical direction; movement along the diagonals is not allowed.</p>