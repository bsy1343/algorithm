# [Platinum I] A Color Game - 20260

[문제 링크](https://www.acmicpc.net/problem/20260)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 23, 정답: 12, 맞힌 사람: 12, 정답 비율: 85.714%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Playing games is fun. For programmers, however, playing games with programs is even more fun. Consider a simple single-user tabletop game as follows. Given a row of sticks, each of which is in one of the seven colors, red (R), green (G), blue (B), cyan (C), magenta (M), yellow (Y), and key (K), the goal of the game is to eliminate all the sticks by repeating the following rules.</p>

<ul>
	<li>Consecutive sticks with the same color can be eliminated if the size of them is not less than m.</li>
	<li>The remaining sticks will move closer together.</li>
</ul>

<p>For the case where the row is <code>BBBRRRRRRGGGB</code> and m is 3, all the sticks can be successfully eliminated as the following steps:</p>

<ol>
	<li><code>BBBRRRRRRGGGB</code></li>
	<li><code>BBBGGGB</code> (By eliminating all red sticks)</li>
	<li><code>BBBB</code> (By eliminating all green sticks)</li>
	<li>(By eliminating all blue sticks)</li>
</ol>

<p>For the same row of sticks with m = 4, however, it is no way to eliminate all the sticks.</p>

<p>Given a row of n sticks and the value of m, your task is to determine if it is possible to eliminate all the sticks.</p>

### 입력

<p>Each test case is given as a string that is the row of sticks and an integer m.</p>

### 출력

<p>Output <code>Yes</code> if it is possible to eliminate all the sticks. Otherwise, output <code>No</code>.</p>

### 제한

<ul>
	<li>0 &lt; n, m &le; 500</li>
</ul>