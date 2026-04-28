# [Platinum I] SLALOM - 3246

[문제 링크](https://www.acmicpc.net/problem/3246)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 22, 정답: 9, 맞힌 사람: 8, 정답 비율: 40.000%

### 분류

다이나믹 프로그래밍, 기하학

### 문제 설명

<p>Janica did the first slalom rather bad and her only chance of winning the game is to do the second slalom as fast as humanly possible using the shortest route.</p>

<p>The beginning and the end of a path are two points in the plane coordinate system and the gates through which each skier has to pass are line segments parallel with the x coordinate axis. A sequence of numbers determining y coordinate of the start point, y coordinates of the gates given in the same order in which a skier have to pass them and the y coordinate of the end point is strictly decreasing sequence.</p>

<p>A path beginning with a start point and ending with an end point consists of a sequence of line segments. Two consecutive line segments share the same endpoint that lies on a line segment representing a gate. Each line segment in the sequence connects two consecutive gates. The start point is an end point of the first line segment un the sequence and the end point is an endpoint of the last line segment in the sequence.</p>

<p>Write a program that will determine the length of the shortest path connecting the star point and the end point.&nbsp;</p>

### 입력

<p>The first line of input file contains an integer N, 1 &le; N &le; 5000, the number of gates.</p>

<p>The second line contains two whole numbers XS and YS separated by a space character, the coordinates of the start point.</p>

<p>Each of the following N consecutive lines contains three whole numbers X1, X2 and Y separated by a space character, X1 &lt; X2, meaning that end points of corresponding gate are (X1,Y) and (X2,Y). The gates are given in the same order a skier have to pass through them.</p>

<p>The last line contains two whole numbers XC and YC separated by a space character, the coordinates of the end point.</p>

<p>The absolute values of all coordinates contained in the input files will be less than or equal to 15000.&nbsp;</p>

### 출력

<p>The first and only line of output file should contain the length of the shortest path, rounded to four decimal places, i.e., your answer should not differ from the correct answer by more than 0.0001.&nbsp;</p>