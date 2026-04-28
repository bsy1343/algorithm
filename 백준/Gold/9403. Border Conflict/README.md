# [Gold IV] Border Conflict - 9403

[문제 링크](https://www.acmicpc.net/problem/9403)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 18, 정답: 6, 맞힌 사람: 6, 정답 비율: 33.333%

### 분류

다이나믹 프로그래밍, 기하학

### 문제 설명

<p>Irvanistan and Jikjikestan are two neighboring countries that have fought several wars with many casualties over their border dispute. Despite the loss of lives in the scale of tens of thousands, none of their border claims have been accepted by the other party.</p>

<p>Recently, the logical leaders who have gained control of both countries have accepted the United Nations proposal to resolve their border dispute. The proposal is to come up with a shorter and simplified version of the border that is calculated by a fair computer program.</p>

<p>To describe the problem accurately, let the current border P be a set of non-crossing line segments each connecting two border points. Let p<sub>0</sub>, p<sub>1</sub>, &hellip; , p<sub>N</sub> be these border points; i.e., P is exactly composed of the line segments connecting p<sub>i</sub> and p<sub>i+1</sub>, for 0 &le; i &lt; N.</p>

<p>The UN suggests to create a new border C with points c<sub>0</sub>, c<sub>1</sub>, &hellip; , c<sub>K</sub>, in such a way that c<sub>0</sub> = p<sub>0</sub> and c<sub>K</sub> = p<sub>N </sub>and the following constraints are satisfied.</p>

<ol>
	<li>Each point c<sub>i</sub> should be one of the points p<sub>0</sub>, &hellip; , p<sub>N</sub>. Obviously, if c<sub>i</sub> = p<sub>r</sub> and c<sub>i+1</sub> = p<sub>s</sub>, then s &gt; r.</li>
	<li>Each point p<sub>i </sub>should have a distance of at most some given number D from C. The distance of p<sub>i</sub> from C is defined as the distance from p<sub>i</sub> to the closest point on C. Note that, the line segment drawn from p<sub>i</sub> to the closest point on C, is always perpendicular to C.</li>
</ol>

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/9403/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-09-13%20%EC%98%A4%ED%9B%84%206.14.23.png" style="height:160px; line-height:20.8px; opacity:0.9; width:180px" /></p>

<p>Your task is to find a new border C with the shortest possible length, while adhering to the above constraints.</p>

### 입력

<p>There are multiple test cases in the input. The first line of each test case contains N (2 &le; N &le; 100), the number of points followed by D (0 &le; D &le; 500). Each of the next N lines contains two integers x<sub>i</sub>, y<sub>i</sub> (&minus;10000 &le; x<sub>i</sub>,y<sub>i</sub> &le; 10000) which are the coordinates of the point p<sub>i</sub>. Note that the point coordinates are increasing; i.e. x<sub>i </sub>&lt; x<sub>i+1</sub> and y<sub>i</sub> &lt; y<sub>i+1</sub>. The input terminates with a line containing &ldquo;0&rdquo;.</p>

### 출력

<p>For each test case write a single line containing the shortest possible length of the new border with exactly two digits after the decimal point.</p>