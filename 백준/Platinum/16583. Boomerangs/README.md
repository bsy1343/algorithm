# [Platinum I] Boomerangs - 16583

[문제 링크](https://www.acmicpc.net/problem/16583)

### 성능 요약

시간 제한: 0.5 초, 메모리 제한: 512 MB

### 통계

제출: 696, 정답: 321, 맞힌 사람: 264, 정답 비율: 44.898%

### 분류

그래프 이론, 그리디 알고리즘, 그래프 탐색, 트리, 깊이 우선 탐색

### 문제 설명

<p>Let G = (V, E) be a simple undirected graph with N vertices and M edges, where V = {1, . . . , N}. A tuple &lt;u, v, w&gt; is called as boomerang in G if and only if {(u, v),(v, w)} &sube; E and u &ne;&nbsp;w; in other words, a boomerang consists of two edges which share a common vertex.</p>

<p>Given G, your task is to find as many disjoint boomerangs as possible in G. A set S contains disjoint boomerangs if and only if each edge in G only appears at most once (in one boomerang) in S. You may output any valid disjoint boomerangs, but the number of disjoint boomerangs should be maximum.</p>

<p>For example, consider a graph G = (V, E) of N = 5 vertices and M = 7 edges where E = {(1, 2), (1, 4), (2, 3), (2, 4), (2, 5), (3, 4), (3, 5)}.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/706dbf55-f81f-4463-aa4e-030c5a3bf4e4/-/preview/" style="width: 242px; height: 167px;" /></p>

<p>The maximum number of disjoint boomerangs in this example graph is 3. One example set containing the 3 disjoint boomerangs is {&lt;4, 1, 2&gt;,&lt;4, 3, 2&gt;,&lt;2, 5, 3&gt;}; no set can contain more than 3 disjoint boomerangs in this example.</p>

### 입력

<p>Input begins with a line containing two integers: N M (1 &le; N, M &le; 100000), representing the number of vertices and the number edges in G, respectively. The next M lines, each contains two integers: u<sub>i</sub> v<sub>i</sub> (1 &le; u<sub>i</sub> &lt; v<sub>i</sub> &le; N), representing the edge (u<sub>i</sub>, v<sub>i</sub>) in G. You may safely assume that each edge appears at most once in the given list.</p>

### 출력

<p>The first line of output contains an integer: K, representing the maximum number of disjoint boomerangs in G. The next K lines, each contains three integers: u v w (each separated by a single space), representing a boomerang &lt;u, v, w&gt;. All boomerangs in the output should be disjoint. If there is more than one valid solution, you can output any of them.</p>