# [Platinum III] Ants - 11842

[문제 링크](https://www.acmicpc.net/problem/11842)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 61, 정답: 23, 맞힌 사람: 15, 정답 비율: 34.091%

### 분류

애드 혹, 구현, 수학, 정렬

### 문제 설명

<p>There are K ants running along coordinate grid lines inside the field. A field of size W &times; H centimeters has one corner at (0,0) and another one at (W, H). Each ant can run in one of 4 directions with speed 1 centimeter per second.</p>

<p>Since ants are very proude creatures, they never give way. Thus, if several ants face head-on, they immediately turn around and run in the opposite direction. When two ants run perpendicular they will not pay attention to each other. If an ant reaches the boundary of the field it also turns around and runs back.</p>

<p>You are given positions and directions of movement of all the ants in initial moment of time. Find their positions and directions of movement after T seconds.</p>

### 입력

<p>The first line of input contains 4 integers: W, H, K, T (1 &le; W, H, K &le; 100, 1 &le; T &le; 10<sup>9</sup>).</p>

<p>Each of the following K lines contains 3 integers: X<sub>i</sub>, Y<sub>i</sub>, D<sub>i</sub>, where (X<sub>i</sub>, Y<sub>i</sub>) - coordinates the i-th ant, D<sub>i</sub> - direction of his movement (0 &lt; X<sub>i</sub> &lt; W, 0 &lt; Y<sub>i</sub> &lt; H, 1 &le; D<sub>i</sub> &le; 4). D<sub>i</sub> = 1 if ant moves in direction of increasing X, D<sub>i</sub> = 2 - in direction of increasing Y, D<sub>i</sub> = 3 - in direction of decreasing X, D<sub>i</sub> = 4 - in direction of decreasing Y .</p>

<p>All of the numbers in lines are separated by single spaces. All ants are located in different points.</p>

### 출력

<p>Output file consists of exactly K lines - one line for each ant in the same order as they are given in the input. Each line contains 3 integers separated by single spaces - coordinates of the ant and direction of his movement.</p>