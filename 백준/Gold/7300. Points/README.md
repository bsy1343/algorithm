# [Gold III] Points - 7300

[문제 링크](https://www.acmicpc.net/problem/7300)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 18, 정답: 10, 맞힌 사람: 6, 정답 비율: 42.857%

### 분류

자료 구조, 분리 집합, 그래프 이론, 그래프 탐색

### 문제 설명

<p>Let p<sub>1</sub>, p<sub>2</sub>, . . . , p<sub>n</sub> be n points on the plane. We have m rules of form p<sub>i</sub> rel p<sub>j</sub> , each inform us that the relation rel holds among the locations of points pi and pj on the plane. For example, &ldquo;p<sub>i</sub> NE p<sub>j</sub>&rdquo; indicates that point p<sub>j</sub> is located NorthEast of point p<sub>i</sub>. There are eight different relations {N, E, S, W, NE, NW, SE, SW}, corresponding to the eight directions on the plane. Let (x<sub>i</sub>, y<sub>i</sub>) and (x<sub>j</sub> , y<sub>j</sub> ) be&nbsp;the coordinates of pi, and pj respectively. Then p<sub>i</sub> rel p<sub>j</sub> exactly means one of the following, depending&nbsp;on the value of rel:</p>

<ol>
	<li>N stands for North. This means that x<sub>j</sub> = x<sub>i</sub> and y<sub>j</sub> &gt; y<sub>i</sub></li>
	<li>E stands for East. This means that x<sub>j</sub>&nbsp;&gt; x<sub>i&nbsp;</sub>and y<sub>j</sub>&nbsp;= y<sub>i</sub></li>
	<li>S stands for South. This means that x<sub>j</sub>&nbsp;= x<sub>i</sub> and y<sub>j</sub>&nbsp;&lt; y<sub>i</sub></li>
	<li>W stands for West. This means that x<sub>j</sub>&nbsp;&lt; x<sub>i</sub> and y<sub>j</sub>&nbsp;= y<sub>i</sub></li>
	<li>NE stands for NorthEast. This means that x<sub>j</sub>&nbsp;&gt; x<sub>i</sub> and y<sub>j</sub>&nbsp;&gt; y<sub>i</sub></li>
	<li>NW stands for NorthWest. This means that x<sub>j</sub>&nbsp;&lt; x<sub>i</sub> and y<sub>j</sub>&nbsp;&gt; y<sub>i</sub></li>
	<li>SE stands for SouthEast. This means that x<sub>j</sub>&nbsp;&gt; x<sub>i</sub> and y<sub>j</sub>&nbsp;&lt; y<sub>i</sub> and</li>
	<li>SW stands for SouthWest. This means that x<sub>j</sub>&nbsp;&lt; x<sub>i</sub> and y<sub>j</sub>&nbsp;&lt;&nbsp;y<sub>i</sub></li>
</ol>

<p>The problem is to determine whether it possible to locate p<sub>1,</sub> p<sub>2</sub>, . . . , pn on the plane so that all given rules are satisfied.</p>

### 입력

<p>The first line of the input contains a single integer t (1 &le; t &le; 20) which is the number of test cases in the input. The first line of each test case contains two integers n (2 &le; n &le; 500) which is the number of points and m (1 &le; m &le; 10<sup>4</sup>) which is the number of rules. In each of the following m lines, there is one rule of the form i rel j which means that p<sub>i</sub> has relation rel with p<sub>j</sub> .</p>

### 출력

<p>The output contains one line per each test case containing one of the words &lsquo;POSSIBLE&rsquo; or &lsquo;IMPOSSIBLE&rsquo; indicating if the set of points in the test case can be located on the plane according to the given rules.</p>