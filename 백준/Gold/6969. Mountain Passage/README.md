# [Gold III] Mountain Passage - 6969

[문제 링크](https://www.acmicpc.net/problem/6969)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 12, 정답: 9, 맞힌 사람: 9, 정답 비율: 81.818%

### 분류

그래프 이론, 최단 경로, 데이크스트라, 0-1 너비 우선 탐색

### 문제 설명

<p>Alp the mountain climber is on the northwest corner of a square area of a mountainous terrain and wishes to find a passage to the opposite (southeast) corner. Alp is currently at an elevation at which oxygen is not needed, but at any higher elevation oxygen is required. Oxygen, when required, is used at the rate of one unit per horizontal step.</p>

<p>The northwest corner of the terrain is at position $(1, 1)$ and the southeast corner is at position $(n, n)$, where $n$ is a positive integer read from the input file. The elevation of each point $(x, y)$, $(1 \le x, y \le n)$, is an integer read from the input; each elevation occupies a single line in the input file.</p>

<p>Alp moves in a series of horizontal steps, where each step moves Alp a unit north, a unit south, a unit east, or a unit west. Alp must remain in the square region and cannot climb or descend more than 2 units of elevation in a single step. If the elevation at either the beginning or the end of the step requires oxygen, a unit of oxygen is consumed by Alp during the step.</p>

### 입력

<p>The first line of input is a positive integer indicating the number of trips that Alp must make. For each trip, there is a number of input lines. The first line for each trip contains an integer $n \le 25$, indicating the size of the square area of terrain. The next $n^2$ lines each contain a single integer indicating the elevation of a particular point of terrain. The elevations are given for the points in the following order: $(1, 1), (1, 2), (1, 3), \dots (1, n), (2, 1), (2, 2), \dots (n, 1), (n, 2), \dots (n, n)$.</p>

### 출력

<p>For each trip, if a passage exists, the output is a single line containing an integer indicating the number of units of oxygen consumed. If a passage does not exist, the output is a single line containing the message <code>CANNOT MAKE THE TRIP</code>. Output lines for the trips should be separated by a single blank line.</p>