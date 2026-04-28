# [Gold II] ERP - 9911

[문제 링크](https://www.acmicpc.net/problem/9911)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 27, 정답: 9, 맞힌 사람: 9, 정답 비율: 36.000%

### 분류

구현, 그래프 이론, 최단 경로, 데이크스트라

### 문제 설명

<p>The city of Eropagnis has just introduced a new electronic road pricing system. &nbsp;Every car has a device that can detect when you are turning left, turning right, moving straight ahead or making a u-turn and will charge you accordingly. &nbsp;The road transport authority has decided to charge \$1 for a left turn and \$5 for a right turn. &nbsp;Moving straight ahead is free while u-turns are forbidden except at ends of roads when it is no longer possible to move forward, turn left or turn right. &nbsp;Making such u-turns cost \$10 each time.</p>

<p>You decided to design and market a road guidance system that will give the cheapest route between any two points in the city. &nbsp;Luckily for you, all roads in Eropagnis go in either the North, South, East or West direction.</p>

<p>Example 1: In the following figure, a &lsquo;<code>#</code>&rsquo; symbol indicates a road segment while a &lsquo;<code>.</code>&rsquo; symbol indicates a non-road segment. &nbsp;Road segments can be traversed in both directions. &nbsp;The symbol &lsquo;<code>E</code>&rsquo; indicates the starting point with the car facing East while the symbol &lsquo;<code>F</code>&rsquo; indicates the finish point.</p>

<pre>
...........
....#####..
....#...#..
....#...#..
.#E######..
....#......
.##F#......
...........</pre>

<p>The cheapest route costing \$8 is to move forward, make 3 left turns, followed by a right turn to F. &nbsp;It is also possible to move forward and make two right turns to reach F but this route costs \$10.</p>

<p>Example 2: In the following figure, the symbol &lsquo;S&rsquo; indicates the starting point with the car facing South. &nbsp;The cheapest route is to immediately turn left, make the first left turn, followed by the first right turn, costing \$7.</p>

<pre>
.....................
.#######.............
.#.....#.......#.....
.###...#.......#.....
...#...#.......#.....
.###...#.......#.....
.#.....#.......#.....
.############F#####..
.......#..........#..
.......#..........#..
...#...#...#####..#..
...#...#...#.#.#..#..
..#S########.#.#..#..
...#.......#.###..#..
...#.......#......#..
...........########..
.....................</pre>

<p>The height of the map is at least 4 and at most 30. &nbsp;The width of the map is at least 4 and at most 30. &nbsp;There is exactly one starting point and one finish point. &nbsp;There is a route from the starting point to the finish point. &nbsp;There is always a frame of &lsquo;.&rsquo; surrounding the map so it is not possible to go outside the map boundary that is given.</p>

### 입력

<p>The input&nbsp;consists of the following lines:</p>

<ol>
	<li>The first line contains two positive integers indicating the height h and the width w of the map.</li>
	<li>Each of the following h lines contains w characters. &nbsp;The characters consist of either
	<ul>
		<li>&lsquo;<code>.</code>&rsquo; for non-road portions of the map, or</li>
		<li>&lsquo;<code>#</code>&rsquo; for road portions of the map, or</li>
		<li>&lsquo;<code>E</code>&rsquo; for the starting point with the car facing East, or</li>
		<li>&lsquo;<code>W</code>&rsquo; for the starting point with the car facing West, or</li>
		<li>&lsquo;<code>N</code>&rsquo; for the starting point with the car facing North, or</li>
		<li>&lsquo;<code>S</code>&rsquo; for the starting point with the car facing South, or</li>
		<li>&lsquo;<code>F</code>&rsquo; for the finish point.</li>
	</ul>
	</li>
</ol>

<p>Exactly one of the characters in the map is &lsquo;<code>E</code>&rsquo;, &lsquo;<code>W</code>&rsquo;, &lsquo;<code>N</code>&rsquo; or &lsquo;<code>S</code>&rsquo;.</p>

### 출력

<p>The output contains a single number which is the cost of the cheapest route from the starting point to the finish point.</p>