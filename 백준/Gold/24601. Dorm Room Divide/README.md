# [Gold I] Dorm Room Divide - 24601

[문제 링크](https://www.acmicpc.net/problem/24601)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 400, 정답: 110, 맞힌 사람: 81, 정답 비율: 26.471%

### 분류

기하학, 다각형의 넓이

### 문제 설명

<p>Bob and Alice are roommates at the International College of Polygonal Chambers (ICPC). To avoid conflict, they&#39;ve agreed to divide their dorm room in half---as closely as possible. However, the room is shaped so irregularly that they need your help!</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/7bcb1da1-e49c-497f-89d9-41a9ea3317d6/-/preview/" style="width: 500px; height: 338px;" /></p>

<p>Each dorm room is a convex polygon, with a single entrance. You need to figure out how to divide this room in half (by area) using a single straight line starting at the door, and terminating on a wall or corner of the room.</p>

### 입력

<p>The first line of input contains a single integer $n$ ($3 \leq n \leq 2 \cdot 10^5$), which is the number of vertices describing the convex polygon.</p>

<p>Each of the next $n$ lines contains two space-separated integers $x$ and $y$ ($-10^7 \le x,y \le 10^7$). These are the coordinates of the vertices of the convex polygon, in counterclockwise order. All points will be distinct.</p>

<p>The door is considered to be a single point located at the first vertex given in the input.</p>

### 출력

<p>Output two space-separated real numbers, which are the $x$ and $y$ coordinates of the other endpoint of the dividing line, such that the area of the room is divided in half. Each coordinate value must be accurate to within an absolute or relative error of $10^{-6}$. Output $x$ first, then $y$.</p>

<p>Note that Sample 1 corresponds to the example in the problem description.</p>