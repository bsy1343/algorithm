# [Gold II] Walking the dog - 2181

[문제 링크](https://www.acmicpc.net/problem/2181)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 39, 정답: 7, 맞힌 사람: 7, 정답 비율: 30.435%

### 분류

기하학, 많은 조건 분기

### 문제 설명

<p>You happen to own a dog, a labrador. Because your pet tends to get lazy and fat without enough exercise, you often take your buddy out for a walk in the local park.</p>

<p>As you already get enough exercise yourself and don&#39;t feel like running after your dog, you have bought a very long rope to tie your labrador to. Assume it has infinite length. You find yourself a nice place to sit down, holding one end of the rope, and let your dog run free (while still attached to the other end of the rope). While your pet runs through the park the rope could wind around the flagpole that is standing in the middle of the park. You let this happen, but in order not to get entangled, you occasionally jump over the line when it passes the place where you sit.</p>

<p>Your job is, given the points to where the dog runs successively, to determine how many entire times the rope has been wrapped around the flagpole when the dog has finished its walk (so round your answer down to an integer). You may assume that your dog always takes the shortest path to the next point. When this path goes right through the flagpole, the dog always goes around it counterclockwise. For this problem we lay a coordinate map (-10<sup>9</sup> &le; x; y &le; 10<sup>9</sup>) over this park. The flagpole is at point (0; 0).</p>

### 입력

<ul>
	<li>The&nbsp;first line of input consists of the integer number n (0 &lt; n &le; 10000), the number of test cases;</li>
	<li>Then, for each test case:
	<ul>
		<li>A line with an integer number m (0 &lt; m &le; 1000), the number of points the dog&#39;s walk consists of;</li>
		<li>Then, m lines with two integer numbers x<sub>i</sub>; y<sub>i</sub>;(-10<sup>9</sup>&le; x<sub>i</sub>; y<sub>i</sub> &le; 10<sup>9</sup>; (x<sub>i</sub>; y<sub>i</sub>) &ne; (0; 0)), the coordinates of the i&#39;th point the dog will run to.</li>
	</ul>
	</li>
</ul>

### 출력

<p>For each test case, the output contains one line with one integer number: the number of entire windings the rope has made around the flagpole after you sit down at (x<sub>1</sub>; y<sub>1</sub>) and let your dog make the walk (x<sub>1</sub>; y<sub>1</sub>) -&gt; (x<sub>2</sub>; y<sub>2</sub>) -&gt;...-&gt;(x<sub>m</sub>; y<sub>m</sub>).</p>