# [Bronze II] Exploring Caves - 22815

[문제 링크](https://www.acmicpc.net/problem/22815)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 104, 정답: 78, 맞힌 사람: 74, 정답 비율: 77.083%

### 분류

수학, 구현, 사칙연산

### 문제 설명

<p>There are many caves deep in mountains found in the countryside. In legend, each cave has a treasure hidden within the farthest room from the cave&#39;s entrance. The Shogun has ordered his Samurais to explore these caves with Karakuri dolls (robots) and to find all treasures. These robots move in the caves and log relative distances and directions between rooms.</p>

<p>Each room in a cave is mapped to a point on an integer grid (x, y &ge; 0). For each cave, the robot always starts from its entrance, runs along the grid and returns to the entrance (which also serves as the exit). The treasure in each cave is hidden in the farthest room from the entrance, using Euclid distance for measurement, i.e. the distance of the room at point (x, y) from the entrance (0, 0) is defined as the square root of (x*x+y*y). If more than one room has the same farthest distance from the entrance, the treasure is hidden in the room having the greatest value of x. While the robot explores a cave, it records how it has moved. Each time it takes a new direction at a room, it notes the difference (dx, dy) from the last time it changed its direction. For example, suppose the robot is currently in the room at point (2, 4). If it moves to room (6, 4), the robot records (4, 0), i.e. dx=6-2 and dy=4-4. The first data is defined as the difference from the entrance. The following figure shows rooms in the first cave of the Sample Input. In the figure, the farthest room is the square root of 61 distant from the entrance.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/22815.%E2%80%85Exploring%E2%80%85Caves/290f8ac4.png" data-original-src="%EB%B0%B1%EC%A4%80/Bronze/22815.%E2%80%85Exploring%E2%80%85Caves/290f8ac4.png" data-original-src="https://upload.acmicpc.net/794f204b-1647-49da-8d87-95e42b85561c/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>Based on the records that the robots bring back, your job is to determine the rooms where treasures are hidden.</p>

### 입력

<p>In the first line of the input, an integer&nbsp;<i>N</i>&nbsp;showing the number of caves in the input is given. Integers&nbsp;<i>dx<sub>i</sub></i>&nbsp;and&nbsp;<i>dy<sub>i</sub></i>&nbsp;are&nbsp;<i>i</i>-th data showing the differences between rooms. Note that since the robot moves along the grid, either&nbsp;<i>dx<sub>i</sub></i>&nbsp;or&nbsp;<i>dy<sub>i</sub></i>&nbsp;is zero. An integer pair&nbsp;<i>dx<sub>i</sub></i>&nbsp;=&nbsp;<i>dy<sub>i</sub></i>&nbsp;= 0 signals the end of one cave&#39;s data which means the robot finished the exploration for the cave and returned back to the entrance. The coordinates are limited to (0,0)-(1000,1000).</p>

### 출력

<p>Print the position (x, y) of the treasure room on a line for each cave.</p>