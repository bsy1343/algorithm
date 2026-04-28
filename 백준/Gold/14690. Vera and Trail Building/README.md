# [Gold II] Vera and Trail Building - 14690

[문제 링크](https://www.acmicpc.net/problem/14690)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 65, 정답: 34, 맞힌 사람: 29, 정답 비율: 59.184%

### 분류

애드 혹, 해 구성하기

### 문제 설명

<p>Vera loves hiking and is going to build her own trail network. It will consist of V places numbered from 1 to V, and E bidirectional trails where the i-th trail directly joins two distinct places a<sub>i</sub> and b<sub>i</sub>. Vera would like her network to be connected so it should be possible to hike between any two places using the trails. It is possible that there could be more than one trail directly joining the same pair of places.</p>

<p>Vera considers two places a, b with a &lt; b to form a beautifully connected pair if it is possible to hike using the trails from a to b then back to a without hiking on the same trail more than once. She thinks her trail network would be beautiful if it had exactly K beautifully connected pairs.</p>

<p>Vera does not want her network to be too large, so the network should satisfy 1 &le; V, E &le; 5000.</p>

<p>Given K, help Vera find any beautiful trail network.</p>

### 입력

<p>There is one line of input, which contains the integer K (0 &lt; K &le; 107</p>

<p>For 3 of the 25 available marks, K &le; 1000.</p>

<p>For an additional 6 of the 25 available marks, K &le; 10<sup>5</sup>.</p>

### 출력

<p>Print a beautiful network in the following format:</p>

<ul>
	<li>the first line should contain the number of vertices, V, followed by one space, followed by the number of edges, E;</li>
	<li>each of the next E lines should contain two integers, a<sub>i</sub> and b<sub>i</sub>, separated by one space, indicating a trail between places a<sub>i</sub> and b<sub>i</sub> (1 &le; i &le; E).</li>
</ul>

<p>The trails can be printed in any order. The two places of any trail can be printed in any order. If there are multiple beautiful trail networks, print any of them. It is guaranteed that a solution always exists.</p>

### 힌트

<p>Explanation for Output for Sample Input 1</p>

<p>The two beautifully connected pairs are 1, 2 and 3, 4.</p>

<p>Explanation for Output for Sample Input 2</p>

<p>All pairs of places form a beautifully connected pair.</p>