# [Gold I] Twirling Robot - 4971

[문제 링크](https://www.acmicpc.net/problem/4971)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 31, 정답: 27, 맞힌 사람: 24, 정답 비율: 85.714%

### 분류

그래프 이론, 최단 경로, 데이크스트라

### 문제 설명

<p>Let&#39;s play a game using a robot on a rectangular board covered with a square mesh (Figure D-1). The robot is initially set at the start square in the northwest corner facing the east direction. The goal of this game is to lead the robot to the goal square in the southeast corner.</p>

<p style="text-align: center;"><img alt="" src="/upload/images3/D1.png" style="height:306px; width:704px" /></p>

<p style="text-align: center;">Figure D-1: Example of a board</p>

<p>The robot can execute the following five types of commands.</p>

<ul>
	<li>&quot;Straight&quot;: Keep the current direction of the robot, and move forward to the next square.</li>
	<li>&quot;Right&quot;: Turn right with 90 degrees from the current direction, and move forward to the next square.</li>
	<li>&quot;Back&quot;: Turn to the reverse direction, and move forward to the next square.</li>
	<li>&quot;Left&quot;: Turn left with 90 degrees from the current direction, and move forward to the next square.</li>
	<li>&quot;Halt&quot;: Stop at the current square to finish the game.</li>
</ul>

<p>Each square has one of these commands assigned as shown in Figure D-2. The robot executes the command assigned to the square where it resides, unless the player gives another command to be executed instead. Each time the player gives an explicit command, the player has to pay the cost that depends on the command type.</p>

<p style="text-align: center;"><img alt="" src="/upload/images3/D2.png" style="height:275px; width:677px" /></p>

<p style="text-align: center;">Figure D-2: Example of commands assigned to squares</p>

<p><br />
The robot can visit the same square several times during a game. The player loses the game when the robot goes out of the board or it executes a &quot;Halt&quot; command before arriving at the goal square.</p>

<p>Your task is to write a program that calculates the minimum cost to lead the robot from the start square to the goal one.</p>

### 입력

<p>The input is a sequence of datasets. The end of the input is indicated by a line containing two zeros separated by a space. Each dataset is formatted as follows.</p>

<pre>
w h
s(1,1) ... s(1,w)
s(2,1) ... s(2,w)
...
s(h,1) ... s(h,w)
c<sub>0</sub> c<sub>1</sub> c<sub>2</sub> c<sub>3</sub></pre>

<p>The integers h and w are the numbers of rows and columns of the board, respectively. You may assume 2 &le; h &le; 30 and 2 &le; w &le; 30. Each of the following h lines consists of w numbers delimited by a space. The number s(i, j) represents the command assigned to the square in the i-th row and the j-th column as follows.</p>

<ul>
	<li>0: &quot;Straight&quot;</li>
	<li>1: &quot;Right&quot;</li>
	<li>2: &quot;Back&quot;</li>
	<li>3: &quot;Left&quot;</li>
	<li>4: &quot;Halt&quot;</li>
</ul>

<p>You can assume that a &quot;Halt&quot; command is assigned to the goal square. Note that &quot;Halt&quot; commands may be assigned to other squares, too.</p>

<p>The last line of a dataset contains four integers c<sub>0</sub>, c<sub>1</sub>, c<sub>2</sub>, and c<sub>3</sub>, delimited by a space, indicating the costs that the player has to pay when the player gives &quot;Straight&quot;, &quot;Right&quot;, &quot;Back&quot;, and &quot;Left&quot; commands respectively. The player cannot give &quot;Halt&quot; commands. You can assume that all the values of c<sub>0</sub>, c<sub>1</sub>, c<sub>2</sub>, and c<sub>3</sub> are between 1 and 9, inclusive.</p>

### 출력

<p>For each dataset, print a line only having a decimal integer indicating the minimum cost required to lead the robot to the goal. No other characters should be on the output line.</p>