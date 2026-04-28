# [Platinum II] Mission - 12829

[문제 링크](https://www.acmicpc.net/problem/12829)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 71, 정답: 22, 맞힌 사람: 17, 정답 비율: 30.909%

### 분류

그래프 이론, 최대 유량, 최소 비용 최대 유량

### 문제 설명

<p>Attention soldier!</p>

<p>I have a special task for you. We have detected an enemy base and it needs to be destroyed. You will be given a map and enough bombs to blow it up. After the action a helicopter will be waiting for you in the forest nearby.</p>

<p>Sounds easy, doesn&rsquo;t it? Find the fastest way to achieve the goal and make sure you don&rsquo;t visit any place twice, otherwise you will be detected.</p>

<p>Is everything clear? Very well... get ready, because you are leaving in 10 minutes!</p>

<p>I wish you good luck, don&rsquo;t get killed and see you at the dinner.</p>

<p>You are given an undirected graph and its three different vertices: your base, enemy base and the place where helicopter is waiting. Find the shortest path in the graph from your base to the helicopter&rsquo;s place. The path must go through the enemy base and can&rsquo;t visit any vertex twice.</p>

### 입력

<p>First line of the input contains five space separated integers N, M, B, E, H (1 &le; B, E, H &le; N, B &ne; E &ne; H &ne; B).</p>

<p>The graph contains N vertices numbered 1 to N, your home base is at vertex B, enemy base at vertex E and the helicopter is waiting at vertex H.</p>

<p>Following M lines describe the edges of the graph. Each line contains three space separated integers v, w and t (1 &le; v, w &le; N, v &ne; w, 1 &le; t &le; 1 000 000). It means there is an undirected edge connecting vertices v and w and it costs t units of time to traverse the edge.</p>

<p>No two vertices are connected by more than one edge.</p>

<p>It holds 3 &le; N &le; 1 000 and 0 &le; M &le; 1 000. In at least 30% testcases N &le; 20.</p>

### 출력

<p>Output a single line with a single integer, the least amount of time needed to complete the mission. If it is impossible to complete the mission, output &minus;1 instead.</p>