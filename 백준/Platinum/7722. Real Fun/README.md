# [Platinum II] Real Fun - 7722

[문제 링크](https://www.acmicpc.net/problem/7722)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 64 MB

### 통계

제출: 11, 정답: 5, 맞힌 사람: 5, 정답 비율: 62.500%

### 분류

(분류 없음)

### 문제 설명

<p>Yesterday it was real fun.</p>

<p>Today you wake up and notice that something is just not right. Not just headache, but something else is constantly annoying you. But you just can&rsquo;t get what exactly. You walk around your room, enjoying the sunlight coming through the open window, through the holes in the roof. . . Stop. There were no holes in the roof until today. Definitely.</p>

<p>Suppressing the urge to call your friends and find out something about the origin of the holes, you decide to fix the roof first. In a modern way.</p>

<p>You&rsquo;ve decided to nail 3 equal square boards with sides parallel to the sides of the (of course, square) roof to close all the holes, and were just wondering what is the minimal required size for these boards.</p>

<p>You are given N different points on a Cartesian plane and need to find minimal d such that three possibly overlapping d &times; d squares with sides parallel to coordinate axes can cover all the points (possibly just by the border).</p>

### 입력

<p>The first line of the input file contains N, 4 &le; N &le; 200, 000. Each of the next N lines contain two integers x<sub>i</sub> and y<sub>i</sub> &ndash; the coordinates of i-th hole (&minus;10<sup>9</sup> &le; x<sub>i</sub>, y<sub>i</sub> &le; 10<sup>9</sup>). No two points coincide.</p>

### 출력

<p>Output the minimal possible d.</p>