# [Platinum III] Lazy Fox - 10108

[문제 링크](https://www.acmicpc.net/problem/10108)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 104, 정답: 30, 맞힌 사람: 28, 정답 비율: 36.842%

### 분류

다이나믹 프로그래밍, 정렬

### 문제 설명

<p>You have a pet Fox who loves treats. You have N neighbours at distinct locations (described as points on the Cartesian plane) which hand out treats to your pet Fox, and each neighbour has an unlimited number of treats to give out. The origin (which is where the Fox starts) will not be one of these N locations.</p>

<p>What does the Fox say, in order to get these treats? That is a good question, but not our concern.</p>

<p>The Fox moves from location to location to gather exactly one treat from each location on each visit. He can revisit any previous location, but cannot visit the same location on two consecutive visits.</p>

<p>Your Fox is very lazy. The distance your Fox is willing to travel after each treat will strictly decrease. Specifically, the distance from the origin to his first treat location must be larger than the distance from his first treat location to his second treat location, which in turn is larger than the distance between his second treat location and his third treat location, and so on.</p>

<p>What is the largest number of treats your Fox gathers?</p>

### 입력

<p>The first line contains the integer N (1 &le; N &le; 2000). The next N lines each contain X<sub>i</sub>, followed by a space, followed by Y<sub>i</sub>, for i = 1..N (&minus;10 000 &le; X<sub>i</sub>, Yi &le; 10 000) representing the coordinates of the ith location.</p>

### 출력

<p>The output is one integer, the largest number of treats your Fox can gather.</p>