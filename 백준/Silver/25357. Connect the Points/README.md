# [Silver I] Connect the Points - 25357

[문제 링크](https://www.acmicpc.net/problem/25357)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 131, 정답: 48, 맞힌 사람: 46, 정답 비율: 41.441%

### 분류

기하학, 많은 조건 분기

### 문제 설명

<p>You are given three points on a plane. You should choose some segments on the plane that are parallel to coordinate axes, so that all three points become connected. The total length of the chosen segments should be the minimal possible.</p>

<p>Two points $a$ and $b$ are considered connected if there is a sequence of points $p_0 = a, p_1, \ldots, p_k = b$ such that points $p_i$ and $p_{i+1}$ lie on the same segment.</p>

### 입력

<p>The input consists of three lines describing three points. Each line contains two integers $x$ and $y$ separated by a space --- the coordinates of the point ($-10^9 \le x, y \le 10^9$). The points are pairwise distinct.</p>

### 출력

<p>On the first line output $n$ --- the number of segments, at most 100.</p>

<p>The next $n$ lines should contain descriptions of segments. Output four integers $x_1$, $y_1$, $x_2$, $y_2$ on a line --- the coordinates of the endpoints of the corresponding segment ($-10^9 \le x_1, y_1, x_2, y_2 \le 10^9$). Each segment should be either horizontal or vertical.</p>

<p>It is guaranteed that the solution with the given constraints exists.</p>

### 힌트

<p>The points and the segments from the example are shown below.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/34ef2e80-2570-404f-b863-cb8cc99df9c2/-/preview/" style="width: 512px; height: 406px;" /></p>