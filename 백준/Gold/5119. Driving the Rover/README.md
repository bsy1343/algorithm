# [Gold IV] Driving the Rover - 5119

[문제 링크](https://www.acmicpc.net/problem/5119)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 45, 정답: 13, 맞힌 사람: 13, 정답 비율: 33.333%

### 분류

그래프 이론, 그래프 탐색

### 문제 설명

<p>Driving a rover on Mars while sitting on Earth isn&rsquo;t all that easy. It takes a while for signals to be delivered up there, and feedback isn&rsquo;t all that instantaneous, either. Furthermore, the rover is a rather delicate and expensive vehicle. As a result, it drives rather slowly, and has to be given very precise instructions on which motors to use at what time. Here, we will look at a very much simplified model of driving a rover.</p>

<p>For our model, the rover will have the commands FORWARD, BACKWARD, FASTER, SLOWER, STOP, RIGHT, LEFT, NOOP. They work as follows:</p>

<ul>
	<li>FORWARD: The rover starts rolling forward at a speed of 1cm/s.</li>
	<li>BACKWARD: The rover starts rolling backward at a speed of 1cm/s.</li>
	<li>FASTER: If the rover is already rolling forward, its speed increases by 1cm/s, but never to more than 5cm/s.</li>
	<li>SLOWER: If the rover is rolling forward, its speed decreases by 1cm/s.</li>
	<li>STOP: The rover stops moving.</li>
	<li>RIGHT: The rover turns 90 degrees to the right.</li>
	<li>LEFT: The rover turns 90 degrees to the left.</li>
	<li>NOOP: Don&rsquo;t change anything.</li>
</ul>

<p>The commands FORWARD, BACKWARD, RIGHT, and LEFT only take effect if the rover is stopped at the time. If it is moving already, the command is ignored. Similarly, FASTER and SLOWER only take effect if the rover is rolling forward; otherwise, they are ignored.</p>

<p>You will be given a sequence of n &le; 1000 commands, for n consecutive seconds. Your goal is to figure out the final location of the rover at the end of those n seconds, assuming the rover started at the point (0, 0) facing up. x coordinates increase from left to right, and y coordinates increase from bottom to top.</p>

### 입력

<p>The first line contains the number K of data sets. This is followed by K data sets, each of the following form:</p>

<p>The first line contains the number of commands/seconds n. This is followed by n lines, each containing one of the above 8 commands, all in uppercase.</p>

### 출력

<p>For each data set, output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then output the (integer) coordinates at which the rover ends up, in the order x y. Each data set should be followed by a blank line.</p>