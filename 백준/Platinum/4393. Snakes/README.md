# [Platinum V] Snakes - 4393

[문제 링크](https://www.acmicpc.net/problem/4393)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 9, 정답: 5, 맞힌 사람: 5, 정답 비율: 62.500%

### 분류

수학, 그래프 이론, 그래프 탐색, 애드 혹, 너비 우선 탐색, 깊이 우선 탐색

### 문제 설명

<p>Buffalo Bill wishes to cross a 1000x1000 square field. A number of snakes are on the field at various positions, and each snake can strike a particular distance in any direction. Can Bill make the trip without being bitten?</p>

### 입력

<p>Assume that the southwest corner of the field is at (0,0) and the northwest corner at (0,1000). The input consists of a line containing n &lt;= 1000, the number of snakes. A line follows for each snake, containing three real numbers: the (x,y) location of the snake and its strike distance. The snake will bite anything that passes closer than this distance from its location.</p>

<p>Bill must enter the field somewhere between the southwest and northwest corner and must leave somewhere between the southeast and northeast corners.</p>

### 출력

<p>If Bill can complete the trip, give coordinates at which he may enter and leave the field. If Bill may enter and leave at several places, give the most northerly. If there is no such pair of positions, print &quot;Bill will be bitten.&quot;</p>