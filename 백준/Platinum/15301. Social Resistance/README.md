# [Platinum II] Social Resistance - 15301

[문제 링크](https://www.acmicpc.net/problem/15301)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 6, 정답: 5, 맞힌 사람: 5, 정답 비율: 100.000%

### 분류

가우스 소거법, 선형대수학, 수학

### 문제 설명

<p>In many networks, we need a measure of the closeness of one node to another. The classic measure is link distance. If the network is represented as a connected undirected graph with an edge between any pair of nodes that have a direct link, the link distance is the number of edges in the shortest path between the nodes. For example, the Kevin Bacon number of an actor is the link distance from the actor to Kevin Bacon in a graph with nodes actors and an edge between two actors if they have appeared in the same movie. The Erdos number for mathematicians is the link distance from a mathematician to Paul Erdos in a graph with nodes mathematicians and an edge between two mathematicians if they have co-authored a published paper. In the graph below, the link distance from ALEX to JORDAN is 2 and the link distance from ALEX to SAM or DYLAN is 3.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15301.%E2%80%85Social%E2%80%85Resistance/2f4afb71.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15301/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:287px; width:436px" /></p>

<p>In the graph, the link distance from JORDAN to ALEX or to DYLAN is the same (2) but JORDAN and DYLAN are in some sense &ldquo;more connected&rdquo; than JORDAN and ALEX. An attempt to reflect this in a distance measurement is resistance distance. This is similar to the relationship between friends in online social networks. In this case, the nodes in the graph are people (as shown above) and the resistance distance between them is the closeness of their friendship.</p>

<p>The resistance distance between two nodes in a graph is computed by finding the resistance between the two nodes in the graph as an electrical network with 1 ohm resistors for each edge. That is: if node 1 is held at V1 and node 2 is held at V2, (V2 != V1), and the voltages at all other nodes are allowed to float, the resistance is (V1 &ndash; V2) / (current from node 1 to node 2). Or, the resistance is (V1 &ndash; V2) when the current from node 1 to node 2 is one ampere.</p>

<p>Recall:</p>

<ol>
	<li>The sum of the currents on edges into a node must be the current flowing out to the external world (-1 for node 1, 1 for node 2 and 0 for all other nodes).</li>
	<li>The voltage drop across an edge from node a to node b is the current in the edge times the resistance along the edge (which is 1 in our case).</li>
</ol>

<p>For this problem, you will write a program which takes as input the description of a graph as nodes and edges and a set of pairs of nodes in the graph and computes the resistance distance between each pair of nodes in the list. The sample Input/Output below computes the resistance distance from node JORDAN to each other node in the picture above.</p>

### 입력

<p>The first line of input contains a single decimal integer P, (1 &le; P &le; 10000), which is the number of data sets that follow. Each data set should be processed identically and independently.</p>

<p>Each data set consists of multiple lines of input. The first line of each data set contains the data set number, K, the number of nodes, N (2 &le; N &le; 20), the number of queries, Q (1 &le; Q &le; 10) and the number of edges, E (1 &le; E &le; N(N-1)/2). This line is followed by a set of lines describing the edges and then a set of lines giving a list of resistance distances to compute for the graph.</p>

<p>The edges are described by a sequence of lines containing a node number, n (1 &le; n &le; N), a count and the nodes which are connected to node n. The sequence ends when E edges have been specified. There will be no self-loops or parallel edges.</p>

<p>The queries are described by Q lines, each of which has a query number, q (1 &le; q &le; Q), and two node numbers n1 and n2. The program is to find the resistance distance from n1 to n2.</p>

### 출력

<p>For each data set there is one line of output. The single output line consists of the data set number, K, followed by a single space followed by the queried resistance distances to 3 decimal places in the order of the input.</p>