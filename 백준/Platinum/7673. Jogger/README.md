# [Platinum III] Jogger - 7673

[문제 링크](https://www.acmicpc.net/problem/7673)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 7, 정답: 5, 맞힌 사람: 5, 정답 비율: 71.429%

### 분류

자료 구조, 분리 집합, 그래프 이론, 트리

### 문제 설명

<p>Every morning, Joe the Jogger goes for a brisk run around his neighborhood. The houses in the neighborhood (which are numbered from 1 to n) are connected together by a set of roads with the property that between every two houses, there exists exactly one unique path. That is, the graph structure of the road network is a tree of unknown topology, consisting of n leaf nodes (corresponding to each of the houses) and up to n&minus;1 (but possibly fewer) internal nodes denoting intersections where roads split or merge (see Figure 4).</p>

<p>In this problem, your task is to help Joe plan a jogging route from one house in the neighborhood to another house. Because Joe is a veteran jogger, he wants his route to take as long as possible. Given a matrix of distances (in meters) between each pair of houses along the road graph, the number of seconds r it takes Joe to run one meter, and the number of seconds t it takes for Joe to cross each intersection along the route, determine the pair of houses for which the total travel time is as long as possible.</p>

<p style="text-align: center;"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/7673/1.png" style="height:185px; width:386px" /></p>

<p style="text-align: center;">Figure 4: Diagram of neighborhood with n = 9. Houses correspond to numbered nodes, whereas internal nodes of the tree (i.e., intersections) correspond to filled nodes. Note that multiple roads may meet at a single intersection. Here, d<sub>3,9</sub> = 9 + 1 + 7 + 6 = 23. If r = 1 and t = 5, then running from house 3 to house 9 takes Joe 1 &times; 23 + 3 &times; 5 = 38 seconds. In the neighborhood shown above, this is the longest possible route, timewise, that Joe can take.</p>

### 입력

<p>The input test file will contain multiple cases. Each test case begins with a line containing three integers: n (where 1 &le; n &le; 50), the total number of houses in the neighborhood, r (where 1 &le; r &le; 10), the number of seconds per meter traveled, and t (where 1 &le; t &le; 100), the number of seconds needed to cross each intersection. Then, the next n lines each contain n values indicating the distances d<sub>ij</sub> (where 1 &le; d<sub>ij</sub> &le; 1000) between each pair of houses. The distances are specified in row-major order; i.e., the jth entry of the ith line is d<sub>ij</sub>.</p>

<p>You are guaranteed that d<sub>ii</sub> = 0 for each i and that d<sub>ij</sub> = d<sub>ji</sub> for i &ne; j. Furthermore, you may assume that the distance matrix corresponds to path lengths along some valid tree, no house coincides with any internal node of the tree, each internal node of the tree has degree &ge; 3, and all edges in the tree have positive length. Input is terminated by a single line containing the number 0; do not process this line.</p>

### 출력

<p>For each test case, you must print a single line of output containing the longest total travel time possible.</p>