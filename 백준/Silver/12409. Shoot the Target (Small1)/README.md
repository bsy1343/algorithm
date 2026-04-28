# [Silver II] Shoot the Target (Small1) - 12409

[문제 링크](https://www.acmicpc.net/problem/12409)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 168, 정답: 21, 맞힌 사람: 15, 정답 비율: 11.719%

### 분류

브루트포스 알고리즘, 기하학, 삼분 탐색

### 문제 설명

<p>Kazuki is playing Worms. There is a target above the ground which he has to hit. However, it is slanted so that it is not perpendicular to the ground. Kazuki is allowed to shoot from anywhere on the ground and he wants to find the best place to stand to maximize the visible angle of the target. Find this maximum visible angle in degrees.</p>

<p>The world is a 2D plane, with the y-axis pointing up towards the sky. The ground can be considered as the x-axis. You will be given the coordinates of the two endpoints of the target --&nbsp;<strong>(X1, Y1)</strong>&nbsp;and&nbsp;<strong>(X2, Y2)</strong>. The target is a line segment between those two points.</p>

<p>Note that the visible angle of the target that Kazuki wants to maximize is the angle formed by the points&nbsp;<strong>(X1, Y1)</strong>,&nbsp;<strong>(X, 0)</strong>&nbsp;and&nbsp;<strong>(X2, Y2)</strong>. The optimal&nbsp;<strong>X</strong>&nbsp;will not necessarily be an integer.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;&nbsp;<strong>T</strong>&nbsp;lines follow. Each lines consists of 4 integers&nbsp;<strong>X1</strong>,&nbsp;<strong>Y1</strong>,&nbsp;<strong>X2</strong>&nbsp;and&nbsp;<strong>Y2</strong>&nbsp;separated by spaces, where&nbsp;<strong>(X1, Y1)</strong>&nbsp;and&nbsp;<strong>(X2, Y2)</strong>&nbsp;are the coordinates of the two ends of the target.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li><strong>X1</strong>&nbsp;&ne;&nbsp;<strong>X2</strong></li>
	<li>1 &le;&nbsp;<strong>Y1, Y2</strong>&nbsp;&le; 10</li>
	<li>-10 &le;&nbsp;<strong>X1, X2</strong>&nbsp;&le; 10</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #t: Z&quot;, where t is the case number (starting from 1) and&nbsp;<strong>Z</strong>&nbsp;is the maximum visible angle of the target in degrees that Kazuki can achieve. Answers accurate to within an absolute or relative error of 10<sup>-4</sup>&nbsp;will be accepted.</p>