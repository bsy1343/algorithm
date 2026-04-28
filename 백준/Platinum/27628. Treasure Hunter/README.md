# [Platinum I] Treasure Hunter - 27628

[문제 링크](https://www.acmicpc.net/problem/27628)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 10, 정답: 4, 맞힌 사람: 4, 정답 비율: 40.000%

### 분류

이분 탐색, 이분 매칭, 최대 유량, 그래프 이론, 그래프 탐색, 최소 비용 최대 유량, 강한 연결 요소

### 문제 설명

<p>Sckerin is a dungeon with N junctions (numbered from 1 to N) that are connected by M directed roads. A directed road (u, v) can be used to travel from junction u to junction v. To travel in its reverse direction (from v to u), you need to use the road (v, u) if there is one. There are no roads that start and end at the same junction. For each pair of junctions (u, v), there is at most one road from u to v.</p>

<p>There are T treasure chests scattered across Sckerin, and the i<sup>th</sup> treasure chest is uniquely located at junction L<sub>i</sub>. Collecting a treasure chest is easy as in a video game. You only need to visit the junction in which the treasure chest is located and the respective treasure chest is automatically collected.</p>

<p>Emma, a young treasure hunter, is set to collect all the treasure chests in Sckerin. She has a special device that allows her to teleport from any junction to another junction of her choice. However, using such a device too often might come with an unknown bad effect on her. Therefore, she would like to minimize the usage of such a device while being able to collect all the treasure chests.</p>

<p>Sckerin is protected by a guardian. Due to Emma&rsquo;s charm, the guardian allows her to start her journey from any junction of her choice. From there, she might need to use the roads or her special device to collect all the treasure chests.</p>

<p>Help Emma to determine the minimum number of times she needs to use her special device to collect all the treasure chests.</p>

### 입력

<p>The first line contains three integers N M T (2 &le; N &le; 500; 1 &le; M &le; N ˙ (N &minus; 1); 1 &le; T &le; N) representing the number of junctions, the number of roads, and the number of treasure chests, respectively. The second line contains T integers L<sub>i</sub> (1 &le; L<sub>i</sub> &le; N) representing the junction in which the i<sup>th</sup> treasure chest is located. It is guaranteed that there are no two treasure chests located at the same junction. The next M lines, each contains two integers u<sub>i</sub> v<sub>i</sub> (1 &le; u<sub>i</sub>, v<sub>i</sub> &le; N; u<sub>i</sub> &ne; v<sub>i</sub>) representing a directed road from junction u<sub>i</sub> to junction v<sub>i</sub>. It is guaranteed that the directed road (u<sub>i</sub>, v<sub>i</sub>) appears at most once.</p>

### 출력

<p>Output in a line an integer representing the minimum number of times Emma needs to use her special device to collect all the treasure chests.</p>