# [Platinum I] Telephone Network - 3669

[문제 링크](https://www.acmicpc.net/problem/3669)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 27, 정답: 9, 맞힌 사람: 5, 정답 비율: 22.727%

### 분류

애드 혹, 이분 그래프, 이분 매칭, 깊이 우선 탐색, 그래프 이론, 그래프 탐색, 재귀

### 문제 설명

<p>A telephone company wants to build a new telephone network in a city. The company has the goal that each person in the city should be able to call each other person. Of course, it is not possible to build direct connections between every pair of persons. Instead, the company uses a network made up of several layers.</p>

<p>We denote a network switch in layer j by S(j). A switch S(0) consists of one input, one output and a cable connecting the input to the output. A switch S(j) with j &gt; 0 consists of 2<sup>j</sup> inputs, 2<sup>j</sup> outputs and two switches S(j - 1). Input i of S(j) (0 &le; i &lt; 2<sup>j</sup>) is connected via a cable to the inputs i mod 2<sup>j-1</sup> of each of the two switches S(j - 1). Similarly, output i of S(j) is connected to the outputs i mod 2<sup>j-1</sup> of each of the two switches S(j - 1).</p>

<p style="text-align: center;"><img alt="" src="/upload/images2/telephone.png" style="height:163px; width:324px" /></p>

<p>The connections between a switch S(j) and the two switches S(j - 1) it consists of.</p>

<p>We are considering a network with one switch S(n) in the outermost layer. It can be shown that any input and output of switch S(n) has a unique connection path to any of the S(0) switches. Therefore, any input of S(n) can be connected to any of its outputs, and the connection path is uniquely determined by specifying through which switch S(0) the connection is established.</p>

<p>We number the switches S(0) belonging to the switch S(n) from 0 to 2<sup>n</sup> - 1. The i-th switch S(0) is defined as follows. Write the number i in binary as b<sub>n-1</sub>b<sub>n-2</sub>...b<sub>0</sub>. This defines a path from an input of S(n) to the i-th switch S(0) via the following procedure: for each j, b<sub>j</sub> = 0 indicates that the path extends from S(j + 1) to the first S(j) switch to which it is directly connected, and b<sub>j</sub> = 1 indicates that the path extends to the second S(j) switch. Note that regardless of which input of S(n) is selected, this path arrives at the same S(0) switch, which is given the number i. See also the figure below the sample data for details of how the numbering works.</p>

<p>Sometimes multiple connections are needed at the same time. In order to avoid interference, each of the inputs and outputs of all switches S(j) (0 &le; j &le; n) can be used by at most one connection. Given a set of connection requests, can you find connection paths for each request such that the connection paths are disjoint?</p>

### 입력

<p>On the first line a positive integer: the number of test cases, at most 100. After that per test case:</p>

<ul>
	<li>One line with two integers n (1 &le; n &le; 16) and m (1 &le; m &le; 2<sup>n</sup>): the layer of the outermost switch and the number of connection requests.</li>
	<li>m lines, each with two integers a<sub>i</sub> and b<sub>i</sub> (0 &le; a<sub>i</sub>, b<sub>i</sub> &lt; 2<sup>n</sup>). Each such line represents a connection request from input number a<sub>i</sub> of S(n) to output number b<sub>i</sub>. You may assume that the integers a<sub>i</sub> are pairwise distinct, and the integers b<sub>i</sub> are pairwise distinct as well.</li>
</ul>

### 출력

<p>Per test case:</p>

<ul>
	<li>One line with m integers s<sub>1</sub>, . . . , s<sub>m</sub>, where s<sub>i</sub> is the number of the S(0) switch through which the connection of input a<sub>i</sub> to output bi is established.</li>
</ul>

<p>The connection paths should be disjoint. You may print any valid solution, and you may assume that there is at least one valid solution.</p>

### 힌트

<p><img alt="" src="/upload/images2/telephonehint.png" style="height:365px; width:506px" /></p>

<p>A possible connection scheme for the second sample case, with used cables in bold.</p>