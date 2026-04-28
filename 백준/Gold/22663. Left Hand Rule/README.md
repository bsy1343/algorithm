# [Gold I] Left Hand Rule - 22663

[문제 링크](https://www.acmicpc.net/problem/22663)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 5, 정답: 4, 맞힌 사람: 4, 정답 비율: 80.000%

### 분류

구현

### 문제 설명

<p>The left-hand rule, which is also known as the wall follower, is a well-known strategy that solves a two- dimensional maze. The strategy can be stated as follows: once you have entered the maze, walk around with keeping your left hand in contact with the wall until you reach the goal. In fact, it is proven that this strategy solves some kind of mazes.</p>

<p>Your task is to write a program that determines whether the given maze is solvable by using the left-hand rule and (if the maze is solvable) the number of steps to reach the exit. Moving to a cell from the entrance or the adjacent (north, south, east or west) cell is counted as a step.</p>

<p>In this problem, the maze is represented by a collection of walls placed on the two-dimensional grid. We use an ordinary Cartesian coordinate system; the positive&nbsp;<i>x</i>-axis points right and the positive&nbsp;<i>y</i>-axis points up. Each wall is represented by a line segment which is parallel to the&nbsp;<i>x</i>-axis or the&nbsp;<i>y</i>-axis, such that both ends of each wall are located on integer coordinates. The size of the maze is given by&nbsp;<i>W</i>&nbsp;and&nbsp;<i>H</i>&nbsp;that indicate the width and the height of the maze, respectively. A rectangle whose vertices are on (0, 0), (<i>W</i>, 0), (<i>W</i>,&nbsp;<i>H</i>) and (0,&nbsp;<i>H</i>) forms the outside boundary of the maze. The outside of the maze is always surrounded by walls except for the entrance of the maze. The entrance is represented by a line segment whose ends are (<i>x<sub>E</sub></i>,&nbsp;<i>y<sub>E</sub></i>) and (<i>x<sub>E</sub></i>&#39;,&nbsp;<i>y<sub>E</sub></i>&#39;). The entrance has a unit length and is located somewhere on one edge of the boundary. The exit is a unit square whose bottom left corner is located on (<i>x<sub>X</sub></i>,&nbsp;<i>y<sub>X</sub></i>).</p>

<p>A few examples of mazes are illustrated in the figure below. They correspond to the datasets in the sample input.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/e31e5e88-941b-4dae-b521-d180ebed932e/-/preview/" style="width: 484px; height: 170px;" /></p>

<p style="text-align: center;">Figure 1: Example Mazes (shaded squares indicate the exits)</p>

### 입력

<p>The input consists of multiple datasets.</p>

<p>Each dataset is formatted as follows:</p>

<pre>
<i>W H N</i>
<i>x</i><sub>1</sub> <i>y</i><sub>1</sub> <i>x</i><sub>1</sub>&#39; <i>y</i><sub>1</sub>&#39;
<i>x</i><sub>2</sub> <i>y</i><sub>2</sub> <i>x</i><sub>2</sub>&#39; <i>y</i><sub>2</sub>&#39;
...
<i>x</i><sub><i>N</i></sub> <i>y</i><sub><i>N</i></sub> <i>x</i><sub><i>N</i></sub>&#39; <i>y</i><sub><i>N</i></sub>&#39;
<i>x</i><sub><i>E</i></sub> <i>y</i><sub><i>E</i></sub> <i>x</i><sub><i>E</i></sub>&#39; <i>y</i><sub><i>E</i></sub>&#39; <i>x<sub>X</sub></i> <i>y<sub>X</sub></i>
</pre>

<p><i>W</i>&nbsp;and&nbsp;<i>H</i>&nbsp;(0 &lt;&nbsp;<i>W</i>,&nbsp;<i>H</i>&nbsp;&le; 100) indicate the size of the maze.&nbsp;<i>N</i>&nbsp;is the number of walls inside the maze. The next&nbsp;<i>N</i>&nbsp;lines give the positions of the walls, where (<i>x<sub>i</sub></i>,&nbsp;<i>y<sub>i</sub></i>) and (<i>x<sub>i</sub></i>&#39;,&nbsp;<i>y<sub>i</sub></i>&#39;) denote two ends of each wall (1 &le;&nbsp;<i>i</i>&nbsp;&le;&nbsp;<i>N</i>). The last line gives the positions of the entrance and the exit. You can assume that all the coordinates given in the input are integer coordinates and located inside the boundary of the maze. You can also assume that the wall description is not redundant, i.e. an endpoint of a wall is not shared by any other wall that is parallel to it.</p>

<p>The input is terminated by a line with three zeros.</p>

### 출력

<p>For each dataset, print a line that contains the number of steps required to reach the exit. If the given maze is unsolvable, print &ldquo;Impossible&rdquo; instead of the number of steps.</p>