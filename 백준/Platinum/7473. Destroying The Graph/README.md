# [Platinum I] Destroying The Graph - 7473

[문제 링크](https://www.acmicpc.net/problem/7473)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 34, 정답: 11, 맞힌 사람: 10, 정답 비율: 55.556%

### 분류

최대 유량, 최대 유량 최소 컷 정리, 그래프 이론

### 문제 설명

<p>Alice and Bob play the following game. First, Alice draws some directed graph with <em>N</em> vertices and <em>M</em> arcs. After that Bob tries to destroy it. In a move he may take any vertex of the graph and remove either all arcs incoming into this vertex, or all arcs outgoing from this vertex.</p>

<p>Alice assigns two costs to each vertex: W<sub>i</sub><sup>+</sup> and W<sub>i</sub><sup>-</sup>. If Bob removes all arcs incoming into the <em>i</em>-th vertex he pays W<sub>i</sub><sup>+</sup> dollars to Alice, and if he removes outgoing arcs he pays W<sub>i</sub><sup>-</sup> dollars. Find out what minimal sum Bob needs to remove all arcs from the graph.</p>

### 입력

<p>Input file describes the graph Alice has drawn. The first line of the input file contains <em>N</em> and <em>M</em> (1 &le; <em>N</em> &le; 100, 1 &le; <em>M</em> &le; 5000). The second line contains <em>N</em> integer numbers specifying W<sub>i</sub><sup>+</sup> . The third line defines W<sub>i</sub><sup>-</sup> in a similar way. All costs are positive and do not exceed 10<sup>6</sup> . Each of the following <em>M</em> lines contains two integers describing the corresponding arc of the graph. Graph may contain loops and parallel arcs.</p>

### 출력

<p>On the first line of the output file print <em>W</em> - the minimal sum Bob must have to remove all arcs from the graph. On the second line print <em>K</em> - the number of moves Bob needs to do it. After that print <em>K</em> lines that describe Bob&rsquo;s moves. Each line must first contain the number of the vertex and then <code>+</code> or <code>-</code> character, separated by one space. Character <code>+</code> means that Bob removes all arcs incoming into the specified vertex and <code>-</code> that Bob removes all arcs outgoing from the specified vertex.</p>