# [Platinum IV] Problematic Polygons - 24932

[문제 링크](https://www.acmicpc.net/problem/24932)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 33, 정답: 14, 맞힌 사람: 10, 정답 비율: 58.824%

### 분류

브루트포스 알고리즘, 기하학, 선분 교차 판정, 오목 다각형 내부의 점 판정

### 문제 설명

<p>You are an employee at the Polygon Packing Plant, where your job is to pack objects with simple polygon shapes into containers with simple polygon shapes. However, the object and containers are often misaligned, so the object may need to be rotated before it can fit inside.</p>

<p>You want to automate the packing process by utilizing the Polygon-Rotating Robot, which has an arm capable of rotating objects with simple polygon shapes before placing them into the container. Unfortunately, the robot lacks some crucial programming: it cannot determine the angle needed to rotate the object by to fit into the container. Write a program to determine the minimum integer angle&nbsp;$&theta;&isin;[0,359]$&nbsp;such that the robot can rotate the object counter-clockwise $&theta;$&nbsp;degrees around the origin so that it will fit inside the box.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/24932.%E2%80%85Problematic%E2%80%85Polygons/c29ffb9f.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/24932.%E2%80%85Problematic%E2%80%85Polygons/c29ffb9f.png" data-original-src="https://upload.acmicpc.net/a61ed43c-1223-4bc6-a7de-3554fad72b4c/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 600px; height: 250px;" /></p>

<center>
<p><b>Figure 1</b>: The left image depicts Sample Input $2$&nbsp;where the goal is to rotate the blue object to fit within the orange container. The right image depicts the minimum integer rotation of&nbsp;$&theta;=113$&nbsp;degrees counter-clockwise around the origin&nbsp;$(0,0)$.</p>
</center>

### 입력

<p>The first line of input contains two integers&nbsp;$N,M$&nbsp;($3&le;N,M&le;100$), the number of points for the polygon representing the object and the number of points for the polygon representing the container, respectively.</p>

<p>The next&nbsp;$N$&nbsp;lines describe the points for the polygon representing the object. Each line contains a pair of real-valued coordinates&nbsp;$x,y$&nbsp;($-10^3&le;x,y&le;10^3$), a point on the cartesian plane. Similarly the next&nbsp;$M$&nbsp;lines describe the points for the polygon representing the container following the same format.</p>

<p>It is guaranteed that the points of these polygons will be given in counter-clockwise order. It is also guarantee that for any rotation in integer increments, between&nbsp;$[0,359]$&nbsp;degrees, that the distance between any point of a polygon and any edge of the other polygon is at least&nbsp;$10^{-6}$.</p>

### 출력

<p>Display the smallest integer rotation&nbsp;$&theta;&isin;[0,359]$&nbsp;such that rotating the object&nbsp;$&theta;$&nbsp;degrees around the origin causes it to fit inside the container. If no such&nbsp;$&theta;$&nbsp;exists, display&nbsp;<code>impossible</code>&nbsp;instead.</p>