# [Gold V] Pingvin - 30940

[문제 링크](https://www.acmicpc.net/problem/30940)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 142, 정답: 79, 맞힌 사람: 36, 정답 비율: 45.570%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 격자 그래프

### 문제 설명

<p>Zrakoplović the penguin wants to learn how to fly!</p>

<p>The space in which he will learn to fly can be imagined as a cube of dimensions $n \times n \times n$, divided into $n^3$ unit cubes. Each unit cube can be described with three coordinates $(x, y, z)$, where $x$, $y$ and $z$ are integers between $1$ and $n$. The coordinate $x$ denotes the distance from the left edge of the space, the coordinate $y$ denotes the distance from the front edge of the space, and the coordinate $z$ denotes the height.</p>

<p>Some of these unit cubes contain clouds, and some do not.</p>

<p>Zrakoplović is afraid of clouds, so he will learn to fly only where there are no clouds. He initially finds himself at a position $(x_s, y_s, z_s)$, such that $z_s = 1$ (i.e. at height $1$), and wants to get to position $(x_e, y_e, z_e)$.</p>

<p>At the moment, he is perfecting the skill of flying in directions that are parallel to one of the axes of space (i.e. in the direction of the $x$-axis, $y$-axis or $z$-axis), and in one wing flap he can cross at most one unit cube.</p>

<p>Before he decides to fly, Zrakoplović wants to know how many wing flaps he needs to get to the desired position. While he is preparing for the flight, help him answer that question.</p>

### 입력

<p>The first line contains an integer $n$ ($1 &le; n &le; 100$), the dimension of the space in which Zrakoplović learns to fly.</p>

<p>The second line contains three integers $x_s$, $y_s$ and $z_s$ ($1 &le; x_s, y_s &le; n$, $z_s = 1$), the start position of Zrakoplović.</p>

<p>The third line contains three integers $x_e$, $y_e$ and $z_e$ ($1 &le; x_e, y_e, z_e &le; n$), the end position of Zrakoplović.</p>

<p>This is followed by $n$ binary matrices of dimensions $n \times n$ that describe the space, where the $i$-th matrix describes the space at height $i$. The upper-left corner has the coordinates $(1, 1, i)$. The row and column of the matrix correspond to the $x$ and $y$ coordinates, respectively.</p>

<p>&#39;<code>0</code>&#39; denotes a unit cube in which there are no clouds, and &#39;<code>1</code>&#39; denotes a unit cube in which there are clouds.</p>

<p>The start and end position of Zrakoplović will not be a cloud.</p>

### 출력

<p>In the first and only line, print the smallest number of wing flaps that Zrakoplović must make to reach the desired position. If Zrakoplović cannot reach the desired position, print &#39;<code>-1</code>&#39;.</p>

### 힌트

<p>Clarification of the first example:</p>

<p>Zrakoplović can reach the desired position in one wing flap by moving in the direction of the $z$-axis for one unit cube.</p>

<p>Clarification of the third example: Zrakoplović can reach the desired position in three wing flaps by first moving to position $(2, 1, 2)$, then to $(2, 2, 2)$ and finally to $(3, 2, 2)$.</p>