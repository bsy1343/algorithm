# [Gold IV] Food Cubes - 7299

[문제 링크](https://www.acmicpc.net/problem/7299)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 99, 정답: 39, 맞힌 사람: 31, 정답 비율: 39.241%

### 분류

너비 우선 탐색, 깊이 우선 탐색, 플러드 필, 그래프 이론, 그래프 탐색

### 문제 설명

<p>The spacemen in the space shuttle are waiting for the next escape window to return to the mother land Earth, where they are expected to fall somewhere in the deep blue waters of the Persian Gulf. Bored of waiting with nothing to do, they decide to play a game with their unit size food cubes. In the zero gravity environment of their spaceship, anything can stay motionless where it is placed. One spaceman places several food cubes in space such that there may be holes between cubes. Others, given the coordinates of the food cubes, should find the number of holes. A hole is a continuous empty space surrounded by food cubes in all six directions. You are to write a program to read the coordinates of each food cube and compute the number of holes.</p>

### 입력

<p>The first line of the input contains a single integer t (1 &le; t &le; 20) which is the number of test cases in the input. Each test case starts with an integer M, the number of food cubes. Each line i (1 &le; i &le; M) of the M following lines contains integers x<sub>i</sub>&nbsp;, y<sub>i</sub> and z<sub>i</sub> , all between 1 and 100 inclusive, indicating the three coordinates of a food cube in the 3D space.</p>

### 출력

<p>For each test case, there is one line containing the number of holes.</p>