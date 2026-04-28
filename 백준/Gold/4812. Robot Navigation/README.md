# [Gold III] Robot Navigation - 4812

[문제 링크](https://www.acmicpc.net/problem/4812)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 40, 정답: 7, 맞힌 사람: 7, 정답 비율: 28.000%

### 분류

다이나믹 프로그래밍, 그래프 이론, 그래프 탐색, 너비 우선 탐색

### 문제 설명

<p>A robot has been sent to explore a remote planet. To specify the path the robot should take, a program is sent each day. The program consists of a sequence of the following commands:</p>

<ul>
	<li>FORWARD: move forward by one unit.</li>
	<li>TURN LEFT: turn left by 90 degrees. The robot remains at the same location.</li>
	<li>TURN RIGHT: turn right by 90 degrees. The robot remains at the same location.</li>
</ul>

<p>The robot also has sensor units which allows it to obtain a map of its surrounding area. The map is represented as a grid of M rows and N columns. Each grid point is represented by a coordinate (r,c) where r = 0 is the north edge of the map, r = M-1 is the south edge, c = 0 is the west edge, and c = N-1 is the east edge. Some grid points contain hazards (e.g. craters) and the program must avoid these points or risk losing the robot.</p>

<p>Naturally, if the initial location and direction of the robot and its destination position are known, we wish to send the shortest program (one consisting of the fewest commands) to move the robot to its destination (we do not care which direction it faces at the destination). You are more interested in knowing the number of different shortest programs that can move the robot to its destination, because we may need to send different sequences as interplanetary communication is not necessarily reliable. However, the number of shortest programs can be very large, so you are satisfied to compute the number as a remainder under some modulus, knowing that something you learned in classes called the Chinese remainder theorem can be used to compute the final answer.</p>

### 입력

<p>The input consists of a number of cases. The first line of each case gives three integers M, N, and the modulus m (0 &lt; M, N &lt;= 1000, 0 &lt; m &lt;= 1000000000). The next M lines contain N characters each and specify the map. A &#39;.&#39; indicates that the robot can move into that grid point, and a &#39;*&#39; indicates a hazard. The final line gives four integers r1, c1, r2, c2 followed by a character d. The coordinates (r1, c1) specify the initial position of the robot, and (r2, c2) specify the destination. The character d is one of &#39;N&#39;, &#39;S&#39;, &#39;W&#39;, &#39;E&#39; indicating the initial direction of the robot. It is assumed that the initial position and the destination are not hazards. The input is terminated when m = 0.</p>

### 출력

<p>For each case, print its case number, the modulus, as well as the remainder of the number of different programs when divided by the modulus m. The output of each case should be on a single line, in the format demonstrated below. If there is no program that can move the robot to its destination, output -1 for the number of different programs.</p>