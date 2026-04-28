# [Platinum III] Critical Structures - 20264

[문제 링크](https://www.acmicpc.net/problem/20264)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 72, 정답: 32, 맞힌 사람: 25, 정답 비율: 46.296%

### 분류

그래프 이론, 단절점과 단절선, 이중 연결 요소

### 문제 설명

<p>Intelligence Cloud Privacy Company (ICPC) is a world famous cloud service company that aims at developing secure and powerful cloud computing environments for users. Engineers in the ICPC construct a data center with n computing nodes, denoted by 1, 2, . . . , n, and m communication links. We can model this data center as an undirected graph G = (V, E), in which n vertices represent n computing nodes and an edge between Node i to Node j if there is a communication link between them; we also call i and j are two end-nodes of this link. In addition, for two arbitrary nodes i and j in G, there is at most one communication link between i and j, and there is no communication link between the same node.</p>

<p>A <em>linear array</em> structure in a data center G is a sequence of nodes &lang;v<sub>0</sub>, v<sub>1</sub>, . . . , v<sub>k&minus;1</sub>&rang;, where k &ge; 2, such that any two consecutive v<sub>i&minus;1</sub> and v<sub>i</sub> for 1 &le; i &le; k &minus; 1 have a communication link, and v<sub>i</sub> for 0 &le; i &le; k &minus; 1 are all distinct. A ring structure is a sequence of nodes &lang;v<sub>0</sub>, v<sub>1</sub>, . . . , v<sub>k&minus;1</sub>&rang;, where k &ge; 4, such that any two consecutive v<sub>i&minus;1</sub> and v<sub>i</sub>&nbsp;for 1 &le; i &le; k &minus;1 have a communication link, v<sub>0</sub> = v<sub>k&minus;1</sub> and v<sub>i</sub> for 0 &le; i &le; k&minus;2 are all distinct. A data center G is connected if there is a linear array between any two nodes; otherwise, it is disconnected. Using some elegant resource allocation algorithm, a research team of the ICPC needs to find the following critical structures for enhancing the privacy and security:</p>

<ol>
	<li>Critical node: a node in G whose removal disconnects G.</li>
	<li>Critical link: a communication link in G whose removal disconnects G.</li>
	<li>Critical component: a maximal set of communication links in G such that any two communication links in the set lie on a common ring.</li>
	<li>Largest critical component: a critical component with the maximum number of communication links.</li>
</ol>

<p>Given a connected data center G, your task is to write a computer program for computing the number of critical nodes, the number of critical links, and</p>

<p>&mu;<sup>*</sup>&nbsp;= (the number of critical components) / (the number of communication links in a largest critical component) = p / q,</p>

<p>where p/q is an irreducible form of &mu;<sup>*</sup>.</p>

### 입력

<p>The first line of the input file contains an integer L (L &le; 10) that indicates the number of test cases as follows. For each test case, the first line contains two integers (separated by a space) representing n and m. Then it is immediately followed by m lines, in which each line contains two integers that represent two end-nodes of a communication link; moreover, any two consecutive integers are separated by a space.</p>

### 출력

<p>The output contains one line for each test case. Each line contains four positive integers representing the number of critical nodes, the number of critical links, p, and q, where p q is an irreducible form of &mu;<sup>*</sup>. Note that any two consecutive integers are separated by a space.</p>

### 제한

<ul>
	<li>3 &le; n &le; 1000 for each test case.</li>
	<li>n &minus; 1 &le; m &le; n(n&minus;1)/2</li>
	<li>The sum of m in all L tests is smaller than 10<sup>6</sup>.</li>
</ul>