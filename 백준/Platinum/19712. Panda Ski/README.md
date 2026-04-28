# [Platinum III] Panda Ski - 19712

[문제 링크](https://www.acmicpc.net/problem/19712)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 19, 정답: 1, 맞힌 사람: 1, 정답 비율: 10.000%

### 분류

자료 구조, 세그먼트 트리, 스위핑

### 문제 설명

<p>The Winter Olympics is coming and Mr. Panda has been training very hard to take part in the skiing event. This event takes place on the mountain Mt. Rar which is of height H. Everyone can ski down from the peak to the base using the centroid path. To increase the difficulties, N gates, each associated with a score, are placed at various heights and either to the left or to the right of the centroid path. The objective is to ski down from the peak to the base and achieve score by passing through some subset of gates.</p>

<p>The i-th gate is located at height Y<sub>i</sub> and X<sub>i</sub> units to the right of the centroid path. If X<sub>i</sub> is negative then it is to the left of the centroid path. Passing through the i-th gate gives S<sub>i</sub> points and you can pass through the same gate multiple times but you only get points for the first time you pass through a gate. No gate is at the same point.</p>

<p>Mr. Panda wants to maximize his score. Moreover, Mr. Panda understands he is not a good skier and he will fail to visit some gates. To avoid embarrassing himself, Mr. Panda analyses the gates and gives each gate an easiness score E<sub>i</sub> (high score is easier) based on the angle of the slope, the amount of snow, etc.</p>

<p>Precisely, Mr. Panda calculated that he can move from the i-th gate to the j-th gate if max(|X<sub>j</sub>&minus; X<sub>i</sub>|, Y<sub>i</sub> &minus; Y<sub>j</sub>) &le; E<sub>i</sub> and Y<sub>i</sub> &ge; Y<sub>j</sub>. Also, it is possible to get from the peak to any gate and from any gate to the base of the mountain.</p>

<p>Mr. Panda is overwhelmed by the number of possible paths moving down the mountain and he needs your help to find the path that will give him the maximum score.</p>

### 입력

<p>Your program must read from standard input. The first line of input contains two positive integers N and H. The next N lines contain 4 integers each. The (i + 1)-th line represents X<sub>i</sub>, Y<sub>i</sub>, S<sub>i</sub>, E<sub>i</sub>.</p>

### 출력

<p>You program must output one line with a single integer to the standard output, which is the maximum score Mr. Panda can attain.</p>