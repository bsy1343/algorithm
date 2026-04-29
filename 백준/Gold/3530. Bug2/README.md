# [Gold II] Bug2 - 3530

[문제 링크](https://www.acmicpc.net/problem/3530)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 5, 정답: 1, 맞힌 사람: 1, 정답 비율: 20.000%

### 분류

(분류 없음)

### 문제 설명

<p>There is a variety of navigation problems around us. This is a problem about an algorithm called Bug2.</p>

<p>Bug algorithms solve the following navigation problem. There is a two-dimensional map containing obstacles of an arbitrary shape, and start and finish points are given. There is also an “agent”, who initially stands at the start point S, and its task is to reach the finish point F. It knows the coordinates of the finish point, and at any moment of time it can determine its own coordinates. The agent has O(1) memory, so it cannot store the map of obstacles. The only way it can get information about the outer world is to detect whether it touches an obstacle. The Agent is able to move around the obstacle following its boundary. The problem is to reach the finish point when it is possible, and correctly report the fact of unreachability otherwise.</p>

<p>The Bug2 algorithm, which belongs to the family of Bug algorithms, works as follows:</p>

<ol>
	<li>Move towards F until one of the following happens:
	<ul>
		<li>The finish point is reached. Then the algorithm stops.</li>
		<li>An obstacle is encountered. Then go to step 2.</li>
	</ul>
	</li>
	<li>Define the current point as H. Move around the boundary of the obstacle in the clockwise direction until one of the following happens:
	<ul>
		<li>The finish point is reached. Then the algorithm stops.</li>
		<li>The point H is reached. Then the finish point is unreachable, and the algorithm stops.</li>
		<li>A point L is reached, which lies on the line SF, |LF| &lt; |HF| and it is possible to move towards F without hitting an obstacle immediately. In this case, go to step 1.</li>
	</ul>
	</li>
</ol>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/3530.%E2%80%85Bug2/6d1fd839.png" data-original-src="https://boja.mercury.kr/assets/problem/3530-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 312px; height: 200px;"></p>

<p>One may prove the correctness of an algorithm, that is, that it reaches the finish point in finite time (that is, the length of the resulting path is finite) if it is possible, and reports that the finish point is unreachable in finite time otherwise.</p>

<p>Given a set of polygonal obstacles, a start and a finish point, determine the length of the path that an agent directed by Bug2 algorithm will traverse.</p>

### 입력

<p>The first line of the input file contains five integer numbers n, x<sub>S</sub>, y<sub>S</sub>, x<sub>F</sub>, y<sub>F</sub> — the number of obstacles and the coordinates of start and finish points.</p>

<p>The rest of the input file describes obstacles. Each description starts with a line containing an integer m (m ≥ 3) — the number of vertices in the obstacle. The following m lines contain pairs of integer numbers x<sub>i</sub>, y<sub>i</sub> — the coordinates of vertices of the obstacle, given in the clockwise direction. The obstacle does not have self-intersections or self-tangencies.</p>

<p>The total number of vertices in all the obstacles does not exceed 300 000. No coordinate exceeds 10<sup>6</sup> by an absolute value.</p>

<p>No vertex of an obstacle lies on a line SF. Both start and finish point will lie strictly outside any obstacle. No two obstacles share common points. If there are two points A and B where obstacle boundaries intersect with the line SF, either |AF| = |BF| or|AF| − |BF|&nbsp;&gt; 10<sup>−6</sup> will be true.</p>

### 출력

<p>Output the length of a path traversed by the agent directed by the described algorithm. The absolute or relative error of 10<sup>−6</sup> is acceptable.</p>