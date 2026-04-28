# [Platinum V] Social Network - 17339

[문제 링크](https://www.acmicpc.net/problem/17339)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 25, 정답: 8, 맞힌 사람: 7, 정답 비율: 29.167%

### 분류

수학, 다이나믹 프로그래밍, 그래프 이론, 조합론, 최단 경로, 데이크스트라, 플로이드–워셜

### 문제 설명

<p>In the study of social networks, we commonly use graph theory to explain certain social phenomena.</p>

<p>Let&#39;s look at a problem regarding this. There are&nbsp;<var>n</var>&nbsp;people in a social group. Between people, there are different levels of relationships. We represent this relationship network using an undirected graph with&nbsp;<var>n</var>&nbsp;nodes. If two different people are familiar with each other, then there will exist an undirected edge between their corresponding nodes on the graph. Additionally, the edge will have a positive weight&nbsp;<var>c</var>&nbsp;&ndash; the smaller the value of&nbsp;<var>c</var>, the closer the relationship between the two people.</p>

<p>We can use the shortest path between the corresponding nodes of two people&nbsp;<var>s</var>&nbsp;and&nbsp;<var>t</var>&nbsp;to measure the closeness of their relationship. Note that other nodes on the shortest path provides some level of benefit to the relationship between&nbsp;<var>s</var>&nbsp;and&nbsp;<var>t</var>, and that these nodes have a certain level of importance with respect to&nbsp;<var>s</var>&nbsp;and&nbsp;<var>t</var>&#39;s relationship. Through analysis of the shortest paths passing through node&nbsp;<var>v</var>, we can measure&nbsp;<var>v</var>&#39;s importance level to the entire social network.</p>

<p>Observing that there may be multiple shortest paths between nodes&nbsp;<var>A</var>&nbsp;and&nbsp;<var>B</var>, we revise our definition of the importance level as follows:</p>

<p>Let&nbsp;<var>C</var><sub><var>s</var>,<var>t</var></sub>&nbsp;represent the number of shortest paths between nodes&nbsp;<var>s</var>&nbsp;and&nbsp;<var>t</var>, and&nbsp;<var>C</var><sub><var>s</var>,<var>t</var>&nbsp;</sub>(<var>v</var>) represent the number of shortest paths between nodes&nbsp;<var>s</var>&nbsp;and&nbsp;<var>t</var>&nbsp;which passes through&nbsp;<var>v</var>. The&nbsp;<b>importance level</b>&nbsp;of node&nbsp;<var>v</var>&nbsp;to the social network is defined as:</p>

<p>$I(v) = \sum_{s \neq v, t \neq v}{\frac{C_{s, t}(v)}{C_{s, t}}}$</p>

<p>To ensure that&nbsp;<var>I</var>(<var>v</var>) and&nbsp;<var>C</var><sub><var>s</var>,<var>t</var>&nbsp;</sub>(<var>v</var>) are always defined, we will only deal with social networks that can be represented by connected, undirected graphs. Furthermore, there will always exist a shortest path of finite length between any pair of nodes.</p>

<p>Given such a weighted, undirected graph representing the social network, please calculate the importance level of each node.</p>

### 입력

<p>The first line of input contains two integers&nbsp;<var>n</var>&nbsp;and&nbsp;<var>m</var>, representing the number of nodes and the number of undirected edges in the social network. The nodes in the graph are numbered consecutively from 1 to&nbsp;<var>n</var>.</p>

<p>For the next&nbsp;<var>m</var>&nbsp;lines, each line contains three integers&nbsp;<var>a</var>,&nbsp;<var>b</var>, and&nbsp;<var>c</var>&nbsp;describing an undirected edge connecting nodes&nbsp;<var>a</var>&nbsp;and&nbsp;<var>b</var>&nbsp;with weight&nbsp;<var>c</var>. Note that there will be at most one undirected edge between any pair of nodes, and no loops will occur within the graph (where the two ends of an edge rest on the same node).</p>

### 출력

<p>Output&nbsp;<var>n</var>&nbsp;lines, each line containing a single real number, accurate to 3 digits after the decimal point. Line&nbsp;<var>i</var>&nbsp;represents the importance of node&nbsp;<var>i</var>&nbsp;to the social network. Your outputted numbers will be considered correct if the absolute differences between them and the correct values do not exceed 0.001.</p>

### 제한

<p>For 50% of the test cases:&nbsp;<var>n</var>&nbsp;&le; 10,&nbsp;<var>m</var>&nbsp;&le; 45<br />
For 100% of the test cases:&nbsp;<var>n</var>&nbsp;&le; 100,&nbsp;<var>m</var>&nbsp;&le; 4500, and the weight&nbsp;<var>c</var>&nbsp;of any edge will be a positive integer satisfying 1 &le;&nbsp;<var>c</var>&nbsp;&le; 1000.<br />
It is guaranteed that the data will consist of connected, undirected graphs, and that the number of shortest paths between any two nodes will not exceed 10<sup>10</sup>.</p>