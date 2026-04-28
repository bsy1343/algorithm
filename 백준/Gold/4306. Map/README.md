# [Gold III] Map - 4306

[문제 링크](https://www.acmicpc.net/problem/4306)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 24, 정답: 6, 맞힌 사람: 4, 정답 비율: 30.769%

### 분류

많은 조건 분기, 기하학, 구현

### 문제 설명

<p>A pirate&#39;s treasure map typically contains a series of instructions which, if followed, lead you from the landing place on a desert isle to&nbsp;<i>the spot marked X</i>&nbsp;where the treasure is buried. You are to construct such a series of instructions for a particular desert isle.</p>

<p>The island is a circle with radius&nbsp;<i>r</i>&nbsp;paces whose centre is at (0,0). Relative to the centre, the point (0,1) is north, (0,-1) is south, (1,0) is east, and (-1,0) is west. Also, (1,1) is northeast, (1,-1) is southeast, (-1,1) is northwest, and (-1,-1) is southwest.</p>

<p>The landing place, on the circumference, is specified by its coordinates. The spot marked X, on the surface of the island is also specified by its coordinates.</p>

<p>Each instruction in the sequence should have the form</p>

<pre>
<i>direction distance</i>
</pre>

<p>where&nbsp;<i>direction</i>&nbsp;is one of { north, south, east, west, northeast, northwest, southeast, southwest } and&nbsp;<i>distance</i>&nbsp;is a non-negative real number indicating the number of paces to be travelled in the given direction. When executed as a sequence the instructions should lead from the landing place to the spot marked X without leaving the island. The total distance (that is, the sum of the distances in your sequence) should be minimized. From the possible sequences that minimize total distance, choose one with the minimum number of instructions.</p>

### 입력

<p>Input will consist of a number of test cases, followed by a line containing -1. Each test case consists of a single line containing five real numbers:&nbsp;<i>r, x, y, X, Y</i>.&nbsp;<i>r</i>&nbsp;is the radius of the island;&nbsp;<i>x,y</i>&nbsp;are the coordinates of the landing place;&nbsp;<i>X,Y</i>&nbsp;are the coordinates of the spot marked X. The landing place and the spot marked X are distinct.</p>

### 출력

<p>For each test case, output the sequence, one instruction per line. Distances should be accurate to ten places after the decimal, as shown. Output an empty line between test cases.</p>