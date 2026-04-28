# [Gold III] Blowin’ in the Wind - 16146

[문제 링크](https://www.acmicpc.net/problem/16146)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 7, 정답: 5, 맞힌 사람: 5, 정답 비율: 71.429%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 최단 경로, 데이크스트라, 0-1 너비 우선 탐색

### 문제 설명

<p>An important part of the 1968 protest movement were protest songs: songs with socially conscious or protest lyrics, often set to simple folk-like music. One of the iconic songs was &ldquo;Blowin&rsquo; in the Wind&rdquo; by Bob Dylan<sup>2</sup>, which starts with the lyrics &ldquo;How many roads must a man walk down before you can call him a man?&rdquo; Obviously, Dylan did not mean to imply that a certain minimum number of walked roads is the criterion for manhood &mdash; rather, the roads metaphorically represent the life experiences one has. In this problem, you will compute the minimum number of roads to walk to attain all requisite life experiences in the correct order.</p>

<p>In this problem, you will be given some life goals to fulfill in the given order. You will also be given a (connected, undirected) graph. For each life goal, there will be at least one node of the graph at which the life goal can be fulfilled. You are to compute the minimum number of roads (edges) you need to traverse from your start node (always node 1) until you have fulfilled all life goals.</p>

<p><sup>2</sup>Recipient of the 2016 Nobel Prize for literature.</p>

### 입력

<p>The first line contains a number K &ge; 1, which is the number of input data sets in the file. This is followed by K data sets of the following form:</p>

<p>The first line of the data set contains two integers 1 &le; g &le; 20 and 1 &le; n &le; 100. g is the number of life goals, and n the number of nodes in the graph.</p>

<p>This is followed by n lines, each line i = 1, 2, . . . , n describing a node i. Each line begins with g integers a<sub>i,j</sub> &isin; {0, 1}, where a<sub>i,j</sub> = 1 means that life goal j can be attained at node i. The remaining entries of the line are integers in {1, 2, . . . , n} and describe edges for node i. Edges are undirected. The same edge may appear multiple times in the list, and when edge (i, j) is listed for node i, it may or may not also appear for node j &mdash; either way, it can be used to get from node j to node i.</p>

### 출력

<p>For each data set, first output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then, output the minimum number of roads you must walk down, starting from node 1, to meet all life goals in the order 1, 2, 3, . . . , g.</p>

<p>Each data set should be followed by a blank line.</p>