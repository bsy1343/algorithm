# [Platinum II] Just Counting - 18467

[문제 링크](https://www.acmicpc.net/problem/18467)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 39, 정답: 18, 맞힌 사람: 17, 정답 비율: 44.737%

### 분류

수학, 그래프 이론, 그래프 탐색, 트리, 조합론

### 문제 설명

<p>You are given an undirected graph without loops and multiple edges.</p>

<p>Find the number of ways to write integers [0; 4] on edges such that for each vertex, the sum of weights of edges incident to it will be equal to zero modulo five (i.e. is equal to 5k for some integer k).</p>

<p>As the answer may be very large, you only need to find it modulo 998 244 353.</p>

### 입력

<p>The first line of input contains one integer t (1 &le; t &le; 500 000): the number of testcases.</p>

<p>The next lines contain t descriptions of test cases.</p>

<p>The first line of each test case contains two integers n, m (1 &le; n &le; 200 000, 0 &le; m &le; 300 000): the number of vertices.</p>

<p>The next m lines contain descriptions of edges, where the i-th of them contains two integers a<sub>i</sub>, b<sub>i</sub> (1 &le; a<sub>i</sub>, b<sub>i</sub> &le; n, a<sub>i</sub> &ne; b<sub>i</sub>), denoting an edge connecting vertices a<sub>i</sub> and b<sub>i</sub> in the graph.</p>

<p>It is guaranteed that there are no multiple edges.</p>

<p>It is also guaranteed that the total sum of n + m in all test cases is at most 500 000.</p>

### 출력

<p>For each test case, print one integer: the number of ways to write integers [0; 4] on edges such that for each vertex, the sum of weights of edges incident to it will be equal to zero modulo five (i.e. is equal to 5k for some integer k), modulo 998 244 353.</p>