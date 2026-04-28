# [Platinum V] Looking for Waldo - 25256

[문제 링크](https://www.acmicpc.net/problem/25256)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 101, 정답: 25, 맞힌 사람: 24, 정답 비율: 26.087%

### 분류

누적 합, 스위핑

### 문제 설명

<p>You may know the game <em>Where is Waldo?</em>. In this game you need to find a person named Waldo in a crowd of people. This problem is kind of similar. You need to find an axis-aligned rectangle of minimal area which contains the letters <code>W</code>, <code>A</code>, <code>L</code>, <code>D</code> and <code>O</code> and those letters are hidden in a crowd of other letters.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/cda0c4ea-ff65-4db6-bddb-6b83beb5fe11/-/preview/" style="width: 232px; height: 119px;" /></p>

<p style="text-align: center;">Figure L.1: Illustration of the second sample case.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with two integers $h$ and $w$ $(1\leq h, w \leq 10^5$, $h\cdot{}w \leq 10^5)$, the height and width of the grid of letters.</li>
	<li>$h$ lines, each with $w$ upper case letters <code>A</code>-<code>Z</code>, the grid of letters.</li>
</ul>

### 출력

<p>Output the area of the smallest axis-aligned rectangle which contains at least one of each of the letters <code>W</code>, <code>A</code>, <code>L</code>, <code>D</code> and <code>O</code>. If there is no rectangle containing those letters, output <code>impossible</code>.</p>