# [Platinum I] Flow Finder - 18023

[문제 링크](https://www.acmicpc.net/problem/18023)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 512 MB

### 통계

제출: 150, 정답: 20, 맞힌 사람: 20, 정답 비율: 25.000%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘, 트리, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>Last summer, Carla the Cartographer went on an expedition on behalf of the National Center for Positioning and Charting (the NCPC). The goal was to measure water flows of a river system far away in the north. However, the area is quite remote and Carla is not the adventurous type, so she was only able to measure the water flows in some of the locations. Carla is now worried that the NCPC will send her back to this wilderness next summer, so she consulted some algorithm experts (you) to see if it is possible to reconstruct the missing data.</p>

<p>The river system is represented by a rooted tree with n vertices numbered from 1 to n. The leaves of this tree are the sources, and the other vertices correspond to confluences (places where multiple rivers join together). Water flows from higher-numbered vertices to lower-numbered vertices. Vertex 1, the root of the tree, is the mouth of the river system, where it flows into the ocean. The water flow of a source can be any positive integer, while the water flow of a confluence is the sum of the water flows of its children. You will be given this tree along with the water flows at some of its vertices, and your task is to find the water flows at all the vertices or determine that this is impossible</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/18023.%E2%80%85Flow%E2%80%85Finder/9c11e45d.png" data-original-src="https://upload.acmicpc.net/b77e5526-28f6-4f4f-8735-da10f436b3dc/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 277px; height: 181px;" /></p>

<p>Figure F.1: Illustration of Sample Input 1 and its solution. Water flows from left to right. The flows shown in red, from vertices 1, 5, 7 and 9, are not given but can be deduced to be 9, 2, 3 and 1 respectively</p>

### 입력

<p>The first line of input contains an integer n (2 &le; n &le; 3 &middot; 10<sup>5</sup>), the number of vertices in the tree. Then follows a line containing n &minus; 1 integers p<sub>2</sub>, . . . , p<sub>n</sub> (1 &le; p<sub>i</sub> &lt; i), where p<sub>i</sub> is the number of the parent of vertex i.</p>

<p>Finally there is a line containing n integers a<sub>1</sub>, . . . , a<sub>n</sub> (0 &le; a<sub>i</sub> &le; 10<sup>9</sup>), where a<sub>i</sub> represents the water flow at vertex i. If a<sub>i</sub> is equal to 0, then the water flow at that vertex is unknown. Otherwise, a<sub>i</sub> is equal to the water flow at vertex i. Note that the upper bound 10<sup>9</sup> on a<sub>i</sub> does not apply to the unknown values, they can be any positive integer.</p>

### 출력

<p>If all the n water flows can be reconstructed uniquely, then output them in increasing order of vertex number. Otherwise, output &ldquo;impossible&rdquo;. Note that it is possible that there is no way of reconstructing the water flows (if the data provided by Carla is inconsistent somehow). In that case you should also output &ldquo;impossible&rdquo;.</p>