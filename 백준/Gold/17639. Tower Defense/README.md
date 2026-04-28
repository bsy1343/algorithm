# [Gold I] Tower Defense - 17639

[문제 링크](https://www.acmicpc.net/problem/17639)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 11, 정답: 11, 맞힌 사람: 10, 정답 비율: 100.000%

### 분류

많은 조건 분기, 구현

### 문제 설명

<p>You are playing a simple tower defense game.</p>

<p>The game is played on an infinite square grid. At the beginning of the game the entire grid is empty, except for two cells. The cell (x<sub>e</sub>, y<sub>e</sub>) contains the entrance through which enemy units will be entering the grid. The cell (x<sub>h</sub>, y<sub>h</sub>) contains your home: a building you are trying to protect from the invaders.</p>

<p>Before the invaders arrive you may build up to 10 000 turrets. Each turret will occupy one empty cell of the grid.</p>

<p>The invaders can move in four cardinal directions and always follow the shortest path from the entrance to your home. For your master plan, you require that distance to be exactly d.</p>

### 입력

<p>The first line of input contains two integers: the coordinates x<sub>e</sub> and y<sub>e</sub> (&minus;10<sup>9</sup> &le; x<sub>e</sub>, y<sub>e</sub> &le; 10<sup>9</sup>).</p>

<p>The second line of input contains two integers: the coordinates x<sub>h</sub> and y<sub>h</sub> (&minus;10<sup>9</sup> &le; x<sub>h</sub>, y<sub>h</sub> &le; 10<sup>9</sup>).</p>

<p>The third line of input contains one integer: the desired distance d (1 &le; d &le; 2000).</p>

<p>The cells (x<sub>e</sub>, y<sub>e</sub>) and (x<sub>h</sub>, y<sub>h</sub>) are distinct and their distance on the empty grid is at most 2000.</p>

### 출력

<p>If there is no solution, output a single line with the text &ldquo;impossible&rdquo; (quotes for clarity).</p>

<p>If there are multiple solutions, you may output any one of them. The first line of output should contain the number t of turrets you want to place (0 &le; t &le; 10 000). Each of the following t lines should contain the coordinates of one turret.</p>

<p>All coordinates of all turrets must be between &minus;2 &middot; 10<sup>9</sup> and 2 &middot; 10<sup>9</sup>, inclusive.</p>

<p>The checker for this task will also accept solutions that output additional and/or different whitespace between the numbers in the output.</p>

### 힌트

<p>In the first example the current distance from the entrance to your home is already 20. You cannot decrease it to 14 by placing turrets.</p>

<p>In the second example the invaders have to go around the turret at (10, 47) which increases the distance between the entrance and your home from 30 to 32. The second turret in this example output is useless and illustrates that you do not have to minimize the number of turrets, and that the turrets can be placed outside the part of the grid that contains the entrance and the exit.</p>

<p>The third example output is shown below, using E for the entrance, H for the home and asterisks for turrets.</p>

<pre>
.......
..*....
..*....
.E*.*H.
....*..
.....*.
.......</pre>