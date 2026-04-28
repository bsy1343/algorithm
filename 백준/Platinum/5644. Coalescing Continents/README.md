# [Platinum V] Coalescing Continents - 5644

[문제 링크](https://www.acmicpc.net/problem/5644)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 25, 정답: 9, 맞힌 사람: 9, 정답 비율: 36.000%

### 분류

구현, 브루트포스 알고리즘, 백트래킹

### 문제 설명

<p>Continental drift refers to the idea that once the earths continents were all in one piece and with time they drifted away from each other and arrived at their present positions.</p>

<p>In this problem, we are concerned with the reverse process Continental Coalesce.</p>

<p>For the sake of brevity, lets assume the continents were initially merged together forming a square. With time, the square disintegrated into K different continents in the shape of rectangles and drifted away from its source.</p>

<p>You are provided with the current locations of the continents (i.e. rectangles). These locations were outlined with the help of satellites. Your first job is to figure out whether the data provided is a valid one. The data is valid if you can move the rectangles and form a square. In one move, you can pick any rectangle and push it one unit in one of the four directions (north, south, east or west). The continents can slide underneath one another during movement meaning, more than one continent can occupy a particular position simultaneously. If it is possible to form a square then you are also required to find the minimum number of moves to do that. The final position of the square is not the primary concern here. Note that in the final position, two continents cannot overlap and the desired square cannot have any holes in it.</p>

### 입력

<p>The first line of input is an integer T (T &lt;= 200) that indicates the number of test cases. Each case consists of 20 lines containing 20 characters. Each character can either be a dot(.) representing an empty space or an x (ASCII value 120). Every x character will be part of some continent.</p>

<p>Notes:</p>

<ul>
	<li>In the input grid, its guaranteed that, x characters from different continents will not be adjacent to each other. Any x character will be part of some rectangle</li>
	<li>Two cells are adjacent if they share a common edge.</li>
	<li>There will be exactly 25 x characters in the grid.</li>
	<li>The number of continents, K, will be at most 5.</li>
	<li>There is a blank line before the start of every case.</li>
	<li>The rectangles and the desired square are axis parallel.</li>
	<li>The earth here is flat. That is, the first and last row is NOT adjacent to each other. Same thing holds for the first and last column.</li>
</ul>

### 출력

<p>For each case, output the case number first. If its not possible to form a square by moving the rectangles around, output invalid data, quotes for clarity. If it is possible, output the minimum number of moves required to complete the task.</p>