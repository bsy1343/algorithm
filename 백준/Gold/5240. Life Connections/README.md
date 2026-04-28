# [Gold III] Life Connections - 5240

[문제 링크](https://www.acmicpc.net/problem/5240)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 40, 정답: 4, 맞힌 사람: 4, 정답 비율: 18.182%

### 분류

너비 우선 탐색, 다이나믹 프로그래밍, 그래프 이론, 그래프 탐색

### 문제 설명

<p>On Pandora all Navi are connected by friendships. After carefully mapping friendships between different Navi, Grace wants to measure the strength of the connection between pairs of Navi. She decides the way to calculate this is to treat Navi as nodes in a graph, and friendships between Navi as edges. Then the connection strength between two Navi can be defined as the number different shortest paths each could take to visit the other. Your goal is to help her calculate these values.</p>

<p>Given a list of connections between Navi and two Navi u and v, you must compute the number of different shortest paths between u and v. The length of the path is the number of Navi on the path. Two paths are different if they pass through at least one different Navi.</p>

### 입력

<p>Connections between Navi are described beginning with the line &ldquo;GRAPH BEGIN&rdquo;. Additional lines lists individual Navi (nodes), followed (on the same line) by their friends (edges). The line &ldquo;GRAPH END&rdquo; ends the list of connection descriptions. The next lines describe pairs of Navi for which answers need to be calculated, each on a single line. Following these lines, a new instance of the problem can be given, starting from scratch.</p>

<p>You may assume all Navi are connected (i.e., any Navi can reach another Navi by some path). Not all Navi will have their connections listed on a separate line: the friendships of some Navi may only be implied by the friendships given on other lines.</p>

### 출력

<p>Your output should consist of pairs of Navi in the same order as in the input, followed by the number of shortest paths between them, both on a single line.</p>

<p>For instance, in the following example the strength of the connection between Navi a and e is 2, since there are 2 paths of length 3 (the shortest possible) from a to e (a &rarr; b &rarr; d &rarr; e and a &rarr; c &rarr; d &rarr; e).</p>

### 힌트

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/ca618c6c-1aad-411a-aac6-174f4c91bc11/-/preview/" style="width: 213px; height: 264px;" /></p>