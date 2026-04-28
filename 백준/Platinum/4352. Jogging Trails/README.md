# [Platinum IV] Jogging Trails - 4352

[문제 링크](https://www.acmicpc.net/problem/4352)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 24, 정답: 8, 맞힌 사람: 6, 정답 비율: 30.000%

### 분류

비트마스킹, 다이나믹 프로그래밍, 비트필드를 이용한 다이나믹 프로그래밍, 오일러 경로, 그래프 이론

### 문제 설명

<p>Gord is training for a marathon. Behind his house is a park with a large network of jogging trails connecting water stations. Gord wants to find the shortest jogging route that travels along every trail at least once.</p>

### 입력

<p>Input consists of several test cases. The first line of input for each case contains two positive integers: n &lt;= 15, the number of water stations, and m &lt; 1000, the number of trails. For each trail, there is one subsequent line of input containing three positive integers: the first two, between 1 and n, indicating the water stations at the end points of the trail; the third indicates the length of the trail, in cubits. There may be more than one trail between any two stations; each different trail is given only once in the input; each trail can be travelled in either direction. It is possible to reach any trail from any other trail by visiting a sequence of water stations connected by trails. Gord&#39;s route may start at any water station, and must end at the same station. A single line containing 0 follows the last test case.</p>

### 출력

<p>For each case, there should be one line of output giving the length of Gord&#39;s jogging route.</p>