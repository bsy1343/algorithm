# [Platinum III] Cow Steeplechase - 5924

[문제 링크](https://www.acmicpc.net/problem/5924)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 209, 정답: 78, 맞힌 사람: 72, 정답 비율: 39.344%

### 분류

기하학, 이분 매칭

### 문제 설명

<p>Farmer John has a brilliant idea for the next great spectator sport: Cow Steeplechase! As everyone knows, regular steeplechase involves a group of horses that race around a course filled with obstacles they must jump over. FJ figures the same contest should work with highly-trained cows, as long as the obstacles are made short enough.</p>

<p>In order to design his course, FJ makes a diagram of all the N (1 &lt;= N &lt;= 250) possible obstacles he could potentially build. Each one is represented by a line segment in the 2D plane that is parallel to the horizontal or vertical axis. Obstacle i has distinct endpoints (X1_i, Y1_i) and (X2_i, Y2_i) (1 &lt;= X1_i, Y1_i, X2_i, Y2_i &lt;= 1,000,000,000). An example is as follows:</p>

<pre>
   --+-------   
-----+-----
  ---+---     |
     |     |  |
   --+-----+--+-   |
     |     |  |  | |
     |   --+--+--+-+-
           |  |  | |
              |
</pre>

<p>FJ would like to build as many of these obstacles as possible, subject to the constraint that no two of them intersect. Starting with the diagram above, FJ can build 7 obstacles:</p>

<pre>
   ----------   
-----------
  -------     |
           |  |
           |  |    |
           |  |  | |
           |  |  | |
           |  |  | |
              |
</pre>


<p>Two segments are said to intersect if they share any point in common, even an endpoint of one or both of the segments. FJ is certain that no two horizontal segments in the original input diagram will intersect, and that similarly no two vertical segments in the input diagram will intersect.</p>

<p>Please help FJ determine the maximum number of obstacles he can build.</p>

### 입력

<ul>
	<li>Line 1: A single integer: N.</li>
	<li>Lines 2..N+1: Line i+1 contains four space-separated integers representing an obstacle: X1_i, Y1_i, X2_i, and Y2_i.</li>
</ul>

### 출력

<ul>
	<li>Line 1: The maximum number of non-crossing segments FJ can choose.</li>
</ul>

### 힌트

<h4>Input Details</h4>

<p>There are three potential obstacles. The first is a horizontal segment connecting (4, 5) to (10, 5); the second and third are vertical segments connecting (6, 2) to (6, 12) and (8, 3) to (8, 5).</p>

<h4>Output Details</h4>

<p>The optimal solution is to choose both vertical segments.</p>