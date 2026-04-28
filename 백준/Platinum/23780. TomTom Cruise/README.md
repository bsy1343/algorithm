# [Platinum IV] TomTom Cruise - 23780

[문제 링크](https://www.acmicpc.net/problem/23780)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 41, 정답: 8, 맞힌 사람: 8, 정답 비율: 80.000%

### 분류

데이크스트라, 그래프 이론, 최단 경로

### 문제 설명

<p>You intend to take a trip from your base to Ganymede. You have a spaceship which you will use for the whole trip. It will take some fuel to get there, some fuel to traverse part of the moon, and some fuel to get back to the base.</p>

<p>There are some points on Ganymede you can visit. The map of Ganymede is given as a graph where the weight of each vertex is equal to the amount of fuel it will take to traverse between the corresponding point and your base. The weight of each edge equals to the amount of fuel it will take to traverse between vertices which are connected by the edge, in either direction. In order for your trip to be reasonable, you do not want to visit any edge or any vertex twice. However, you have to traverse at least one edge.</p>

<p>What is the least amount of fuel you will need to accomplish such a trip?</p>

### 입력

<p>First line of the input contains two integers N and M, the number of vertices and edges, respectively (1 &le; N &le; 10<sup>4</sup>, 0 &le; M &le; min(N(N-1)/2, 2 &middot; 10<sup>4</sup>)). Next line contains N integers v<sub>0</sub>, v<sub>1</sub>, . . . , v<sub>N&minus;1</sub> (1 &le; v<sub>i</sub> &le; 10<sup>6</sup>), weights of respective vertices 0, 1, . . . , N &minus; 1. Each of the next M lines contains three integers f<sub>i</sub>, t<sub>i</sub>, and w<sub>i</sub> (0 &le; f<sub>i</sub>, t<sub>i</sub> &lt; N, 1 &le; w<sub>i</sub> &le; 10<sup>6</sup>), the two vertices connected by the edge and the edge weight, respectively</p>

### 출력

<p>Output the minimum amount of fuel you have to spend on your trip.</p>