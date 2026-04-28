# [Silver IV] Gravity - 13986

[문제 링크](https://www.acmicpc.net/problem/13986)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 439, 정답: 312, 맞힌 사람: 238, 정답 비율: 73.684%

### 분류

구현

### 문제 설명

<p>You would like to implement a simple simulation of gravity on a 2-dimensional grid, consisting of n rows and m columns.</p>

<p>Some grid cells may contain obstacles, some may contain a single apple, and all others are empty.</p>

<p>The following rules are followed until no further changes are possible:</p>

<ul>
	<li>The obstacles do not move.</li>
	<li>Whenever there is an empty cell immediately below an apple, the apple moves into the empty cell.</li>
</ul>

<p>Find the final configuration of the grid after all apples have settled.</p>

### 입력

<p>The first line of input contains two space-separated integers n and m (1 &le; n, m &le; 50).</p>

<p>Each of the next n lines contains m characters, describing the board, from top to bottom. Obstacles are denoted as &lsquo;#&rsquo;, apples are denoted as &lsquo;o&rsquo;, and empty cells are denoted as &lsquo;.&rsquo;.</p>

### 출력

<p>Print, on n lines, the final configuration of the grid after executing the rules stated above.</p>