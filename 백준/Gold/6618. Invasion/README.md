# [Gold I] Invasion - 6618

[문제 링크](https://www.acmicpc.net/problem/6618)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 91, 정답: 17, 맞힌 사람: 16, 정답 비율: 20.253%

### 분류

그래프 이론, 최단 경로, 데이크스트라

### 문제 설명

<p>Alien invasion began, and scary man-eating aliens are establishing their bases all over the country. You are only safe on the places that are sufficiently far away from all current alien bases. You need to quickly write a program to help you determine where to move.</p>

### 입력

<p>The input contains several instances, each of them consisting of several lines. The first line of each instance contains integers N (1 &le; N &le; 10 000), M (0 &le; M &le; 100 000), A (0 &le; A &le; N) and K (1 &le; K &le; 100) separated by spaces, giving the number of towns in the country, the number of roads between them, the number of bases that the aliens are going to build, and the minimum safe distance from alien bases, respectively. The towns are assigned numbers 1, . . . , N.</p>

<p>The following M lines describe the roads; each of them contains integers T<sub>1</sub>, T<sub>2</sub> (1 &le; T<sub>1</sub> &lt; T<sub>2</sub> &le; N) and D (1 &le; D &le; 100) separated by spaces, where D is the length of the road between towns T<sub>1</sub> and T<sub>2</sub>. There is at most one direct road between any two towns. All roads can be used in both directions.</p>

<p>The following A lines describe the positions of alien bases; the i-th of them contains the number B<sub>i</sub> (1 &le; B<sub>i</sub> &le; N) of the town where the aliens build their i-th base.</p>

<p>Each instance is followed by one empty line. The empty line after the last instance is followed by a line containing four zeros.</p>

### 출력

<p>The output for each input instance consists of A lines. On i-th line, write the number of towns that are safe after the aliens build their i-th base. The town is safe if its distance from any of the towns B<sub>1</sub>, B<sub>2</sub>, . . . , B<sub>i</sub> is at least K.</p>

<p>Print one empty line after each instance.</p>