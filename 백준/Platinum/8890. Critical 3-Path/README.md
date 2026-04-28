# [Platinum II] Critical 3-Path - 8890

[문제 링크](https://www.acmicpc.net/problem/8890)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 128 MB

### 통계

제출: 361, 정답: 75, 맞힌 사람: 57, 정답 비율: 22.984%

### 분류

다이나믹 프로그래밍, 그래프 이론

### 문제 설명

<p>The PERT (Project Evaluation and Review Technique) chart, a graphical tool used in the field of project management, is designed to analyze and represent the set of tasks involved in completing a given project. Edges in PERT chart represent tasks to be performed, and edge weights represent the length of time required to perform the task. For vertices u, v, w of a PERT chart, if edge (u,v) enters vertex v and edge (v,w) leaves v, then task (u,v) must be performed prior to task (v,w). A path through a PERT chart represents a sequence of tasks that must be performed in a particular order. Note that there is no cycle in the PERT chart. A critical path is a longest path in PERT chart, corresponding to the longest time to perform an ordered sequence of tasks. The weight of a critical path is a lower bound on the total time to perform all the tasks in a project.&nbsp;</p>

<p>A 3-path of six distinct vertices s<sub>1</sub>, s<sub>2</sub>, s<sub>3</sub>, t<sub>1</sub>, t<sub>2</sub>, t<sub>3</sub> in a PERT chart is defined as follows:&nbsp;</p>

<ol>
	<li>A 3-path consists of three paths P<sub>i</sub> from vertex s<sub>i</sub> to vertex t<sub>i</sub> for i =1, 2, 3.</li>
	<li>The paths P<sub>1</sub>, P<sub>2</sub>, P<sub>3</sub> are vertex-disjoint, i.e., no two of the paths have vertices in common.</li>
</ol>

<p>The length of a 3-path is the sum of the length of the 3 paths P<sub>1</sub>, P<sub>2</sub>, P<sub>3</sub>. A critical 3-path of six distinct vertices in a PERT chart is a 3-path of maximum length over all 3-paths.</p>

<p>For example, a critical 3-path {P<sub>1</sub>, P<sub>2</sub>, P<sub>3</sub>} of a graph in Figure 1, where P<sub>1</sub> is a path from vertex 3 to vertex 15, P<sub>2</sub> is a path from vertex 4 to vertex 16, and P<sub>3</sub> is path from vertex 5 to vertex 17, is as follows:</p>

<ul>
	<li>P<sub>1</sub> : 3 &rarr; 6 &rarr; 11 &rarr; 15</li>
	<li>P<sub>2</sub> : 4 &rarr; 7 &rarr; 9 &rarr; 12 &rarr; 16</li>
	<li>P<sub>3</sub> : 5 &rarr; 8 &rarr; 13 &rarr; 17&nbsp;</li>
</ul>

<p>The length of the critical 3-path is 128.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/8890.%E2%80%85Critical%E2%80%853-Path/ab863faf.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/8890.%E2%80%85Critical%E2%80%853-Path/ab863faf.png" data-original-src="https://www.acmicpc.net/upload/images2/3path.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:268px; width:564px" /></p>

<p style="text-align:center">Figure 1. A sample PERT chart</p>

<p>Given a graph corresponding to a PERT chart and six distinct vertices, write a program to find the length of critical 3-path of the graph corresponding to the six vertices.&nbsp;</p>

### 입력

<p>Your program is to read from standard input. The input consists of T test cases. The number of test cases T is given in the first line of the input. Each test case starts with a line containing two integers, n and m (6 &le; n &le; 100, n-1 &le; m &le; n(n-1)/2), where n is the number of vertices and m is the number of edges. Every input node is numbered from 1 to n. Next line contains six integers s<sub>1</sub>, s<sub>2</sub>, s<sub>3</sub>, t<sub>1</sub>, t<sub>2</sub>, t<sub>3</sub>, where all six integers are distinct. In the following m lines, the weight of the directed edges are given; each line contains three integers, u, v, and W (1 &le; W &le; 100,000), where W is the weight of an edge from vertex u to v. You may assume that u &lt; v.</p>

### 출력

<p>Your program is to write to standard output. Print exactly one line for each test case. The line should contain the length of critical 3-path {P<sub>1</sub>, P<sub>2</sub>, P<sub>3</sub>}, where P<sub>i</sub> is a path from s<sub>i</sub> to t<sub>i</sub> (1 &le; i &le; 3). If there does not exist a critical 3-path, print 0.</p>