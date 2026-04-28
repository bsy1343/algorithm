# [Gold III] Maze - 3376

[문제 링크](https://www.acmicpc.net/problem/3376)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 40, 정답: 24, 맞힌 사람: 19, 정답 비율: 57.576%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색

### 문제 설명

<p>Consider the following maze made of equilateral triangles:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/3376.%E2%80%85Maze/a1c12066.png" data-original-src="https://upload.acmicpc.net/d5e65b55-d79b-4eaf-b16c-b6d03566ed3f/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 381px; height: 169px;" /></p>

<p>Each vertex is described by two coordinates x and y as in the picture. Some of the edges have a white or a black circle on them. There are two major rules that control movement within the maze:</p>

<ul>
	<li>it is only allowed to pass edges with circles on them.</li>
	<li>while walking through the maze it is obligatory to alternate white and black circles; i.e. it is only allowed to pass an edge with white circle if the last circle passed was black and vice versa. It is allowed to pass an edge with either black or white circle on it during the first move.</li>
</ul>

<p>Write a program to find the length of the shortest path from the entrance point to the exit in the maze. The length of the path is defined as the number of edges (or circles) passed. You may assume that such path always exists.</p>

### 입력

<p>The first line contains two integers W and H which are the width and the height of the maze respectively (1 &le; W, H &le; 500). The second line consists of four integer values: X<sub>1</sub> Y<sub>1</sub> X<sub>2</sub> Y<sub>2</sub> (0 &le; X<sub>1</sub>, X<sub>2</sub> &le; W; 0 &le; Y<sub>1</sub>, Y<sub>2</sub> &le; H). (X<sub>1</sub>, Y<sub>1</sub>) are the coordinates of the entry point in the maze and (X<sub>2</sub>, Y<sub>2</sub>) are the exit coordinates.</p>

<p>The next 2H+1 lines provide the description of the edges: odd lines (3rd, 5th, etc) describe horizontal edges, and even lines (4th, 6th, etc) describe non-horizontal ones. Each line consists of a string of characters <code>n</code>, <code>w</code> and <code>b</code>, where <code>n</code> means, that there is no circle on the edge, and <code>w</code> or <code>b</code> means that there is white or black circle on the edge respectively. There are no spaces between these characters. Naturally, odd lines consist of exactly W characters, and even lines consist of exactly 2W+1 characters.</p>

### 출력

<p>Your program should output a single integer (the length of the shortest path from entrance point to the exit in the maze) in the first (and the only) line.</p>