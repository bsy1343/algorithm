# [Platinum IV] Konstrukcija - 19232

[문제 링크](https://www.acmicpc.net/problem/19232)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 9, 정답: 4, 맞힌 사람: 4, 정답 비율: 50.000%

### 분류

그래프 이론, 해 구성하기

### 문제 설명

<p>Let G be a directed acyclic graph. If c<sub>1</sub>, c<sub>2</sub>, c<sub>3</sub>, . . . c<sub>n</sub> are distinct vertices of G such that there is a path from c<sub>1</sub> to c<sub>2</sub>, there is a path from c<sub>2</sub> to c<sub>3</sub>, . . . and there is a path from c<sub>n&minus;1</sub> to c<sub>n</sub>, we say that array C = (c<sub>1</sub>, c<sub>2</sub>, c<sub>3</sub>, . . . c<sub>n</sub>) is an ordered array starting at c<sub>1</sub> and ending at c<sub>n</sub>. Note that between neighbouring elements c<sub>i</sub> and c<sub>i+1</sub> of ordered array C it isn&rsquo;t necessary to exist a direct edge, it is enough for the path to exist from c<sub>i</sub> to c<sub>i+1</sub>.</p>

<p>For this definition of an ordered array C = (c<sub>1</sub>, c<sub>2</sub>, c<sub>3</sub>, . . . c<sub>n</sub>), we define its length len(C) = n. Therefore, the length of an ordered array is equal to the number of vertices it holds. Note that the ordered array can have a length of 1 when holding a single vertex which represents both its beginning and its end.</p>

<p>Also, for an ordered array C = (c<sub>1</sub>, c<sub>2</sub>, c<sub>3</sub>, . . . c<sub>n</sub>) we can define its sign as sgn(C) = (&minus;1)<sup>len(C)+1</sup>. For vertices x and y of G, let&rsquo;s denote with S<sub>x,y</sub> a set of all ordered arrays that start in x and end in y.</p>

<p>Finally, we define the tension between nodes x and y as tns(x, y) = &Sigma;<sub>C&isin;S<sub>x,y</sub></sub>sgn(C). Therefore, the tension between nodes x and y equals the sum of signs of all ordered arrays that start in x and end in y.</p>

<p>An integer K is given. Your task is to construct a directed acyclic graph with at most 1000 vertices and at most 1000 edges for which tns(1, N) = K holds. Number N in the previous expression denotes the number of vertices in a graph. Vertices of a graph should be indexed using positive integers from 1 to N.</p>

### 입력

<p>The first line contains an integer K (|K| &le; 10<sup>18</sup>) from the task description.</p>

### 출력

<p>In the first line you should output the number of vertices and the number of edges of the constructed graph. Let&rsquo;s denote the number of vertices of that graph with N (1 &le; N &le; 1000), and the number of edges with M (0 &le; M &le; 1000).</p>

<p>In the i-th of the next M lines you should output two distinct integers X<sub>i</sub> and Y<sub>i</sub> (1 &le; X<sub>i</sub>, Y<sub>i</sub> &le; N), which represent the i-th edge which is directed from vertex with index X<sub>i</sub> towards vertex with index Y<sub>i</sub>. Each edge must appear only once in the output.</p>

<p>Also, the absolute value of tension between each two nodes in the graph must be less or equal to 2<sup>80</sup>.</p>

<p>If there are multiple solutions, output any of them.</p>