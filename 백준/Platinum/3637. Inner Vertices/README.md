# [Platinum IV] Inner Vertices - 3637

[문제 링크](https://www.acmicpc.net/problem/3637)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 64 MB

### 통계

제출: 28, 정답: 9, 맞힌 사람: 9, 정답 비율: 60.000%

### 분류

값 / 좌표 압축, 자료 구조, 세그먼트 트리, 스위핑

### 문제 설명

<p>There is an infinite square grid. Some vertices of the grid are black and other vertices are white.</p>

<p>A vertex $V$ is called <em>inner</em>&nbsp;if it is both vertical-inner and horizontal-inner. A vertex $V$ is called <em>horizontal-inner</em>&nbsp;if there are two such black vertices in the same row that $V$ is located between them. A vertex $V$ is called <em>vertical-inner</em>&nbsp;if there are two such black vertices in the same column that $V$ is located between them.</p>

<p>On each step all white inner vertices became black while the other vertices preserve their colors. The process stops when all the inner vertices are black.</p>

<p>Write a program that calculates a number of black vertices after the process stops.</p>

### 입력

<p>The first line of the input file contains one integer number $n$ ($0 \le n \le 100\,000$) --- number of black vertices at the beginning.</p>

<p>The following $n$ lines contain two integer numbers each --- the coordinates of different black vertices. The coordinates do not exceed $10^9$ by their absolute values.</p>

### 출력

<p>Output the number of black vertices when the process stops. If the process does not stop, output <code>-1</code>.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/3637.%E2%80%85Inner%E2%80%85Vertices/f8d6e33d.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/3637.%E2%80%85Inner%E2%80%85Vertices/f8d6e33d.png" data-original-src="https://upload.acmicpc.net/ddaab621-9851-4bcb-a3d8-f91ba203d75d/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 392px; height: 158px;" /></p>