# [Platinum II] Brocard Point of a Triangle - 11529

[문제 링크](https://www.acmicpc.net/problem/11529)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 34, 정답: 22, 맞힌 사람: 22, 정답 비율: 64.706%

### 분류

이분 탐색, 기하학

### 문제 설명

<p>The Brocard point of a triangle ABC is a point P in the triangle chosen so that: &ang;PAB = &ang;PBC = &ang;PCA (see figure below).</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/11529.%E2%80%85Brocard%E2%80%85Point%E2%80%85of%E2%80%85a%E2%80%85Triangle/b47c2830.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11529/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:204px; width:582px" /></p>

<p>The common angle is called the Brocard angle. The largest Brocard angle is &pi;/6 which is the Brocard angle for an equilateral triangle (the Brocard point is the centroid of the triangle).</p>

<p>Write a program to compute the coordinates of the Brocard point of a triangle given the coordinates of the vertices.</p>

### 입력

<p>The first line of input contains a single integer P, (1 &le; P &le; 10000), which is the number of data sets that follow. Each data set should be processed identically and independently.</p>

<p>Each data set consists of a single line of input. It contains the data set number, K, followed by the six space separated coordinate values Ax, Ay, Bx, By, Cx, Cy of the vertices of the triangle. The vertices will always be specified so going from A to B to C and back to A circles the triangle counter-clockwise. Input coordinates are floating point values.</p>

### 출력

<p>For each data set there is a single line of output. The single output line consists of the data set number, K, followed by a single space followed by the x coordinate of the Brocard point, followed by a single space followed by the y coordinate of the Brocard point. Coordinates should be rounded to five decimal places.</p>