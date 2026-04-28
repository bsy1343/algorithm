# [Platinum II] Increasing Shortest Path - 9633

[문제 링크](https://www.acmicpc.net/problem/9633)

### 성능 요약

시간 제한: 15 초, 메모리 제한: 256 MB

### 통계

제출: 326, 정답: 48, 맞힌 사람: 22, 정답 비율: 10.377%

### 분류

다이나믹 프로그래밍, 오프라인 쿼리

### 문제 설명

<p>We all love short and direct problems, it is easier to write, read and understand the problem statement. Here is one of these problems. &ldquo;Life is too short to make a story&rdquo;, said Ahmed Aly.</p>

<p>You are given a weighted directed graph of N nodes (the nodes are numbered from 1 to N ), where the weights of the edges are distinct and positive. For each graph, you are also given a list of queries to answer.</p>

<p>Each query will be represented by 3 integers A B C , which means you need to find the shortest path (the path with minimum sum of weights of its edges) which goes from node A to node B and uses at most C edges, such that the weights of the edges in that path are in increasing order along the path, which means the weight of each edge in that path should be greater than the weight of the edge before it (unless it is the first edge in the path).</p>

<p>Your task is to write a program which answers these queries.</p>

### 입력

<p>Your program will be tested on one or more test cases. The first line of the input will be a single integer T, the number of test cases (1 &le; T &le; 100). Followed by the test cases, the first line of each test case contains 3 integers separated by a single space N M Q (2 &le; N &le; 150), (0 &le; M &le; 3,000) and (1 &le; Q &le; 1,000) representing the number of nodes, the number of edges and the number of queries, respectively. Followed by M lines, each line contains 3 integers separated by a single space X Y Z (1 &le; X , Y &le; N ) (1 &le; Z &le; 3,000) which represent an edge going from the node X to the node Y with cost Z (X and Y will be different). Followed by Q lines, each line contains 3 integers separated by a single space A B C (1 &le; A, B &le; N ) (0 &le; C &le; M) which represent a query as described above (A and B will be different).</p>

<p>Note that there might multiple edges between the same pair of nodes.</p>

### 출력

<p>For each test case, print a single line for each query which contains a single integer, the minimum sum of weights for a path between the given pair of nodes which satisfies the given constraints, or -1 if there is no valid path between the given nodes which satisfies the given constraints. The output must not contain empty lines between the cases.</p>