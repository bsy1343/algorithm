# [Platinum IV] Breadth-First Search by Foxpower - 10623

[문제 링크](https://www.acmicpc.net/problem/10623)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 157, 정답: 82, 맞힌 사람: 72, 정답 비율: 52.555%

### 분류

너비 우선 탐색, 그래프 이론, 그래프 탐색, 최소 공통 조상, 트리

### 문제 설명

<p>Fox Ciel went to JAG Kingdom by bicycle, but she forgot a place where she parked her bicycle. So she needs to search it from a bicycle-parking area before returning home.</p>

<p>The parking area is formed as a unweighted rooted tree \(T\) with \(n\) vertices, numbered \(1\) through \(n\). Each vertex has a space for parking one or more bicycles. Ciel thought that she parked her bicycle near the vertex \(1\), so she decided to search it from there by the breadth-first search. That is, she searches it at the vertices in the increasing order of their distances from the vertex \(1\). If multiple vertices have the same distance, she gives priority to the vertices in the order of searching at their parents. If multiple vertices have the same parent, she searches at the vertex with minimum number at first.</p>

<p>Unlike a computer, she can&#39;t go to a next vertex by random access. Thus, if she goes to the vertex \(j\) after the vertex \(i\), she needs to walk the distance between the vertices \(i\) and \(j\). BFS by fox power perhaps takes a long time, so she asks you to calculate the total moving distance in the worst case starting from the vertex \(1\).</p>

### 입력

<p>The input is formatted as follows.</p>

<pre>
n
p<sub>2</sub> p<sub>3</sub> p<sub>4</sub> ... p<sub>n</sub></pre>

<p>The first line contains an integer \(n\) (\(1 \le n \le 10^5\)), which is the number of vertices on the unweighted rooted tree \(T\). The second line contains \(n-1\) integers \(p_i\) (\(1 \le p_i &lt; i\)), which are the parent of the vertex \(i\). The vertex \(1\) is a root node, so \(p_1\) does not exist.</p>

### 출력

<p>Print the total moving distance in the worst case in one line.</p>