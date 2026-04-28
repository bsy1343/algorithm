# [Gold IV] Marbles (Small) - 12617

[문제 링크](https://www.acmicpc.net/problem/12617)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 6, 정답: 5, 맞힌 사람: 4, 정답 비율: 100.000%

### 분류

백트래킹, 비트마스킹, 브루트포스 알고리즘, 자료 구조, 다이나믹 프로그래밍, 스택

### 문제 설명

<p>You have 2<strong>n</strong>&nbsp;marbles on a square grid. The marbles are colored in&nbsp;<strong>n</strong>&nbsp;different colors such that there are exactly 2 marbles of each color. The marbles are placed at the coordinates (1,0), (2,0), ..., (2<strong>n</strong>, 0).</p>

<p>Your task is to draw a path for each color that joins the two marbles of that color. Each path should be composed of vertical or horizontal line segments between grid points. No two paths can intersect or touch each other. No path may cross the y=0 line. Each path can only touch the y=0 line at the position of the two marbles it is connecting, so the first and last line segment of each path must be vertical.</p>

<p>Given an arrangement of marbles, return the minimum height of a solution, or return -1 if no solution exists. The height is defined as the difference between the highest and lowest Y-coordinates of the paths used.</p>

<p>An example:</p>

<pre>
red red blue yellow blue yellow
</pre>

<p>One solution would be:</p>

<pre>
 +---+    +-----------+
 |       |    |                   |
red red blue yellow blue yellow
                        |                   |
                        +-----------+
</pre>

<p>The minimum height is 2 in this case.</p>

### 입력

<p>The first line of input gives the number of cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow. The first line of each case contains&nbsp;<strong>n</strong>, the number of different colors for the marbles. The next line contains a string of 2<strong>n</strong>&nbsp;words separated by spaces which correspond to the colors of the marbles, in order from left to right. Each color is a string of lower case letters (&#39;a&#39; .. &#39;z&#39;) no longer than 10 characters. There will be exactly&nbsp;<strong>n</strong>&nbsp;different colors and each color will appear exactly twice.</p>

<p>Limits</p>

<ul>
	<li>1 &lt;=&nbsp;<strong>T</strong>&nbsp;&lt;= 50.</li>
	<li>1 &lt;=&nbsp;<strong>n</strong>&nbsp;&lt;= 20.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #<strong>x</strong>: &quot;, where&nbsp;<strong>x</strong>&nbsp;is the case number (starting from 1), followed by the height of any optimal solution, or -1 if no solution exists.</p>