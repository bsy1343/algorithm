# [Platinum II] Line & Circle Maze - 4603

[문제 링크](https://www.acmicpc.net/problem/4603)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 25, 정답: 11, 맞힌 사람: 7, 정답 비율: 33.333%

### 분류

플로이드–워셜, 기하학, 그래프 이론, 구현, 선분 교차 판정, 최단 경로

### 문제 설명

<p>A deranged algorithms professor has devised a terrible final exam: he throws his students into a strange maze formed entirely of linear and circular paths, with line segment endpoints and object intersections forming the junctions of the maze. The professor gives his students a map of the maze and a fixed amount of time to find the exit before he floods the maze with xerobiton particles, causing anyone still in the maze to be immediately inverted at the quantum level. Students who escape pass the course; those who don&#39;t are trapped forever in a parallel universe where the grass is blue and the sky is green.</p>

<p>The entrance and the exit are always at a junction as defined above. Knowing that clever ACM programming students will always follow the shortest possible path between two junctions, he chooses the entrance and exit junctions so that the distance that they have to travel is as far as possible. That is, he examines all pairs of junctions that have a path between them, and selects a pair of junctions whose shortest path distance is the longest possible for the maze (which he rebuilds every semester, of course, as the motivation to cheat on this exam is very high).</p>

<p>The joy he derives from quantumly inverting the majority of his students is marred by the tedium of computing the length of the longest of the shortest paths (he needs this to know to decide how much time to put on the clock), so he wants you to write a program to do it for him. He already has a program that generates the mazes, essentially just a random collection of line segments and circles. Your job is to take that collection of line segments and circles, determine the shortest paths between all the distinct pairs of junctions, and report the length of the longest one.</p>

<p>The input to your program is the output of the program that generates his mazes. That program was written by another student, much like yourself, and it meets a few of the professor&#39;s specifications: 1) No endpoint of a line segment will lie on a circle; 2) No line segment will intersect a circle at a tangent; 3) If two circles intersect, they intersect at exactly two distinct points; 4) Every maze contains at least two junctions; that is, a minimum maze is either a single line segment, or two circles that intersect. There is, however, one bug in the program. (He would like to have it fixed, but unfortunately the student who wrote the code never gave him the source, and is now forever trapped in a parallel universe.) That bug is that the maze is not always entirely connected. There might be line segments or circles, or both, off by themselves that intersect nothing, or even little &quot;submazes&quot; composed of intersecting line segments and circles that as a whole are not connected to the rest of the maze. The professor insists that your solution account for this! The length that you report must be for a path between connected junctions!</p>

<p>Examples:</p>

<table class="table table-bordered" style="width:100%">
	<tbody>
		<tr>
			<td style="width: 50%; text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/4603.%E2%80%85Line%E2%80%85%26%E2%80%85Circle%E2%80%85Maze/9678e552.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/4603.%E2%80%85Line%E2%80%85%26%E2%80%85Circle%E2%80%85Maze/9678e552.png" data-original-src="https://www.acmicpc.net/upload/images2/ex1-color.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:395px; width:400px" /></td>
			<td style="width: 50%; text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/4603.%E2%80%85Line%E2%80%85%26%E2%80%85Circle%E2%80%85Maze/6458c2ec.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/4603.%E2%80%85Line%E2%80%85%26%E2%80%85Circle%E2%80%85Maze/6458c2ec.png" data-original-src="https://www.acmicpc.net/upload/images2/ex2-color.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:395px; width:400px" /></td>
		</tr>
		<tr>
			<td style="text-align: center;">Line segments only. The large dots are the junction pair whose shortest path is the longest possible.</td>
			<td style="text-align: center;">An example using circles only. Note that in this case there is also another pair of junctions with the same length longest possible shortest path.</td>
		</tr>
		<tr>
			<td style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/4603.%E2%80%85Line%E2%80%85%26%E2%80%85Circle%E2%80%85Maze/746cadfb.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/4603.%E2%80%85Line%E2%80%85%26%E2%80%85Circle%E2%80%85Maze/746cadfb.png" data-original-src="https://www.acmicpc.net/upload/images2/ex3-color.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:395px; width:400px" /></td>
			<td style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/4603.%E2%80%85Line%E2%80%85%26%E2%80%85Circle%E2%80%85Maze/5295a8a9.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/4603.%E2%80%85Line%E2%80%85%26%E2%80%85Circle%E2%80%85Maze/5295a8a9.png" data-original-src="https://www.acmicpc.net/upload/images2/ex4-color.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:395px; width:400px" /></td>
		</tr>
		<tr>
			<td style="text-align: center;">Disconnected components.</td>
			<td style="text-align: center;">Now the line segments are connected by a circle, allowing for a longer shortest path.</td>
		</tr>
	</tbody>
</table>

### 입력

<p>An input test case is a collection of line segments and circles. A line segment is specified as &quot;L X1 Y1 X2 Y2&quot; where &quot;L&quot; is a literal character, and (X1,Y1) and (X2,Y2) are the line segment endpoints. A circle is specified by &quot;C X Y R&quot; where &quot;C&quot; is a literal character, (X,Y) is the center of the circle, and R is its radius. All input values are integers, and line segment and circle objects are entirely contained in the first quadrant within the box defined by (0,0) at the lower left and (100,100) at the upper right. Each test case will consist of from 1 to 20 objects, terminated by a line containing only a single asterisk. Following the final test case, a line containing only a single asterisk marks the end of the input.</p>

### 출력

<p>For each input maze, output &quot;Case N: &quot;, where N is the input case number starting at one (1), followed by the length, rounded to one decimal, of the longest possible shortest path between a pair of connected junctions.</p>

### 힌트

<p>It is recommended that the atan2() function, rather than acos() or asin(), be used when calculating arc angles.</p>