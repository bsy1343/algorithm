# [Gold V] Crop Triangles (Large) - 12718

[문제 링크](https://www.acmicpc.net/problem/12718)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 111, 정답: 55, 맞힌 사람: 50, 정답 비율: 51.020%

### 분류

수학, 정수론, 조합론

### 문제 설명

<p>Some pranksters have watched too much Discovery Channel and now they want to build a crop triangle during the night. They want to build it inside a large crop that looks like an evenly spaced grid from above. There are some trees planted on the field. Each tree is situated on an intersection of two grid lines (a grid point). The pranksters want the vertices of their crop triangle to be located at these trees. Also, for their crop triangle to be more interesting they want the&nbsp;<em>center</em>&nbsp;of that triangle to be located at some grid point as well. We remind you that if a triangle has the vertices (x<sub>1</sub>, y<sub>1</sub>), (x<sub>2</sub>, y<sub>2</sub>) and (x<sub>3</sub>, y<sub>3</sub>), then the center for this triangle will have the coordinates ((x<sub>1</sub>&nbsp;+ x<sub>2</sub>&nbsp;+ x<sub>3</sub>) / 3, (y<sub>1</sub>&nbsp;+ y<sub>2</sub>&nbsp;+ y<sub>3</sub>) / 3).</p>

<p>You will be given a set of points with integer coordinates giving the location of all the trees on the grid. You are asked to compute how many triangles you can form with&nbsp;<strong>distinct</strong>vertexes in this set of points so that their center is a grid point as well (i.e. the center has integer coordinates).&nbsp;</p>

<p>If a triangle has area 0 we will still consider it a valid triangle.</p>

### 입력

<p>The first line of input gives the number of cases,&nbsp;<strong>N</strong>.&nbsp;<strong>N</strong>&nbsp;test cases follow. Each test case consists of one line containing the integers&nbsp;<strong>n</strong>,&nbsp;<strong>A</strong>,&nbsp;<strong>B</strong>,&nbsp;<strong>C</strong>,&nbsp;<strong>D</strong>,&nbsp;<strong>x<sub>0</sub></strong>,&nbsp;<strong>y<sub>0</sub></strong>&nbsp;and&nbsp;<strong>M</strong>&nbsp;separated by exactly one space.&nbsp;<strong>n</strong>&nbsp;will be the number of trees in the input set. Using the numbers&nbsp;<strong>n</strong>,&nbsp;<strong>A</strong>,&nbsp;<strong>B</strong>,&nbsp;<strong>C</strong>,&nbsp;<strong>D</strong>,&nbsp;<strong>x<sub>0</sub></strong>,&nbsp;<strong>y<sub>0</sub></strong>&nbsp;and&nbsp;<strong>M</strong>&nbsp;the following pseudocode will print the coordinates of the trees in the input set.&nbsp;<em>mod</em>&nbsp;indicates the remainder operation.</p>

<p>The parameters will be chosen such that the input set of trees will not have duplicates.</p>

<pre>
<code><strong>X</strong> = <strong>x<sub>0</sub></strong>, <strong>Y</strong> = <strong>y<sub>0</sub></strong>
print <strong>X</strong>, <strong>Y</strong>
for i = 1 to <strong>n</strong>-1
  <strong>X</strong> = (<strong>A</strong> * <strong>X</strong> + <strong>B</strong>) mod <strong>M</strong>
  <strong>Y</strong> = (<strong>C</strong> * <strong>Y</strong> + <strong>D</strong>) mod <strong>M</strong>
  print <strong>X</strong>, <strong>Y</strong></code></pre>

<p>Limits</p>

<ul>
	<li>1 &lt;=&nbsp;<strong>N</strong>&nbsp;&lt;= 10,&nbsp;</li>
	<li>0 &lt;=&nbsp;<strong>A</strong>,&nbsp;<strong>B</strong>,&nbsp;<strong>C</strong>,&nbsp;<strong>D</strong>,&nbsp;<strong>x<sub>0</sub></strong>,&nbsp;<strong>y<sub>0</sub></strong>&lt;= 10<sup>9</sup>,&nbsp;</li>
	<li>1 &lt;=&nbsp;<strong>M</strong>&nbsp;&lt;= 10<sup>9</sup>.</li>
	<li>3 &lt;=&nbsp;<strong>n</strong>&nbsp;&lt;= 100000.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #<strong>X</strong>: &quot; where&nbsp;<strong>X</strong>&nbsp;is the test case number (starting from 1). This should be followed by an integer indicating the number of triangles which can be located at 3 distinct trees and has a center that is a grid point.</p>

### 힌트

<p>In the first test case, the 4 trees in the generated input set are (0, 1), (7, 3), (17, 5), (17, 7).</p>