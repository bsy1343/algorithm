# [Gold III] Volcanoes - 26054

[문제 링크](https://www.acmicpc.net/problem/26054)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 36, 정답: 20, 맞힌 사람: 19, 정답 비율: 57.576%

### 분류

값 / 좌표 압축, 다이나믹 프로그래밍, 그리디 알고리즘, 수학, 정렬

### 문제 설명

<p>Cimrman is going to visit all his artificial prairie volcanoes he has built in the previous few years. He is going to travel in his one-of-a-kind volcanology terrain vehicle.</p>

<p>Unfortunately, the vehicle has been currently damaged by an accidental meteorite strike. It can travel in only three possible directions, directly north, south or east. Cimrman decided this should not be a major problem, he is planning to organise his journey in such a way that the vehicle always travels in one of these three directions. Another peculiarity of the vehicle is that it can change its direction immediately.</p>

<p>Cimrman can start his journey at any point on the prairie. He wants the journey to be as short as possible.</p>

### 입력

<p>The first line of input contains one integer N (0 &lt; N &le; 10<sup>5</sup>), the number of volcanoes. Each of the next N lines contains coordinates of one volcano. A volcano is represented as a point on a plane, first its x coordinate is given, then follows the y coordinate.</p>

<p>The point coordinates are two integer values in the range between &minus;10<sup>6</sup> and 10<sup>6</sup> inclusive. Direction of positive x-coordinate corresponds to the eastward direction in the terrain.</p>

### 출력

<p>Print the length of a shortest journey which visits all the volcanoes. Assume the journey starts at the first volcano visit and ends at the last volcano visit.</p>