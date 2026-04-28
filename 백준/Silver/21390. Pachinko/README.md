# [Silver I] Pachinko - 21390

[문제 링크](https://www.acmicpc.net/problem/21390)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 93, 정답: 56, 맞힌 사람: 44, 정답 비율: 57.143%

### 분류

수학, 구현, 다이나믹 프로그래밍, 시뮬레이션, 확률론

### 문제 설명

<p>Pachinko is a Japanese game played for amusement and prizes, and is similar to pinball. The game is very simple: you shoot small metal balls into the machine and they fall down, bouncing off the obstacles until they fall into a gate. The gate into which your ball falls determines the winnings.</p>

<p>Since you can more or less determine the column into which the ball is dropped (by setting its initial speed and direction), you can influence your win chances. You are to calculate your expected winnings.</p>

<p>We model the pachinko machine as follows: you can drop the ball in any column and it falls down until it either reaches the bottom of the machine (which results in no wins), a gate (indicated by a number 1 to 9, which results in that win) or an obstacle (indicated by a asterisk). If a ball hits an obstacle it proceeds falling in the column to the left or to the right of the obstacle, with 50/50 probability. No two obstacles or gates are adjacent, not even diagonally, and none ara located in the leftmost or rightmost column.</p>

### 입력

<p>On the first line an integer t (1 &le; t &le; 100): the number of test cases. Then for each test case:</p>

<ul>
	<li>One line with two integers h and w (1 &le; h, w &le; 100): the width and height of the pachinko machine.</li>
	<li>h lines with w characters describing the pachinko machine. A &lsquo;<code>.</code>&rsquo; denotes an empty space, &lsquo;<code>*</code>&rsquo; an obstacle and &lsquo;<code>1</code>&rsquo;. . . &lsquo;<code>9</code>&rsquo; the winning gates.</li>
</ul>

### 출력

<p>For each testcase:</p>

<ul>
	<li>One line with the maximal expected winnings with either an absolute or a relative error of at most 10<sup>&minus;6</sup>.</li>
</ul>