# [Platinum III] Graph - 19559

[문제 링크](https://www.acmicpc.net/problem/19559)

### 성능 요약

시간 제한: 0.7 초 (추가 시간 없음), 메모리 제한: 256 MB

### 통계

제출: 214, 정답: 51, 맞힌 사람: 48, 정답 비율: 27.273%

### 분류

그래프 이론, 그래프 탐색, 정렬, 깊이 우선 탐색

### 문제 설명

<p>You are given an undirected graph where each edge has one of two colors: black or red.</p>

<p>Your task is to assign a real number to each node so that:</p>

<ul>
	<li>for each black edge the sum of values at its endpoints is 1;</li>
	<li>for each red edge the sum of values at its endpoints is 2;</li>
	<li>the sum of the absolute values of all assigned numbers is the smallest possible.</li>
</ul>

<p>Otherwise, if it is not possible, report that there is no feasible assignment of the numbers.</p>

### 입력

<p>The first line contains two integers N (1 &le; N &le; 100 000) and M (0 &le; M &le; 200 000): the number of nodes and the number of edges, respectively. The nodes are numbered by consecutive integers: 1, 2, . . . , N.</p>

<p>The next M lines describe the edges. Each line contains three integers a, b and c denoting that there is an edge between nodes a and b (1 &le; a, b &le; N) with color c (1 denotes black, 2 denotes red).</p>

### 출력

<p>If there is a solution, the first line should contain the word &ldquo;YES&rdquo; and the second line should contain N space-separated numbers. For each i (1 &le; i &le; N), the i-th number should be the number assigned to the node i.</p>

<p>Output should be such that:</p>

<ul>
	<li>the sum of the numbers at the endpoints of each edge differs from the precise value by less than 10<sup>&minus;6</sup>;</li>
	<li>the sum of the absolute values of all assigned numbers differs from the smallest possible by less than 10<sup>&minus;6</sup>.</li>
</ul>

<p>If there are several valid solutions, output any of them.</p>

<p>If there is no solution, the only line should contain the word &ldquo;NO&rdquo;.</p>