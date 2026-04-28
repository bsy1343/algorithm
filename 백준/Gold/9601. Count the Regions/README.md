# [Gold I] Count the Regions - 9601

[문제 링크](https://www.acmicpc.net/problem/9601)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 128 MB

### 통계

제출: 48, 정답: 29, 맞힌 사람: 24, 정답 비율: 64.865%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 깊이 우선 탐색, 값 / 좌표 압축, 격자 그래프

### 문제 설명

<p>There are a number of rectangles on the x-y plane. The four sides of the rectangles are parallel to either the x-axis or the y-axis, and all of the rectangles reside within a range specified later. There are no other constraints on the coordinates of the rectangles.</p>

<p>The plane is partitioned into regions surrounded by the sides of one or more rectangles. In an example shown in Figure C.1, three rectangles overlap one another, and the plane is partitioned into eight regions.</p>

<p>Rectangles may overlap in more complex ways. For example, two rectangles may have overlapped sides, they may share their corner points, and/or they may be nested. Figure C.2 illustrates such cases.</p>

<p>Your job is to write a program that counts the number of the regions on the plane partitioned by the rectangles.</p>

### 입력

<p>The input consists of multiple datasets. Each dataset is formatted as follows.</p>

<pre>
n
l<sub>1</sub> t<sub>1</sub> r<sub>1</sub> b<sub>1</sub>
l<sub>2</sub> t<sub>2</sub> r<sub>2</sub> b<sub>2</sub>
.
.
.
l<sub>n</sub> t<sub>n</sub> r<sub>n</sub> b<sub>n</sub></pre>

<p>A dataset starts with n (1 &le; n &le; 50), the number of rectangles on the plane. Each of the following n lines describes a rectangle. The i-th line contains four integers, l<sub>i</sub>, t<sub>i</sub>, r<sub>i</sub>, and b<sub>i</sub>, which are the coordinates of the i-th rectangle; (l<sub>i</sub>, t<sub>i</sub>) gives the x-y coordinates of the top left corner, and (r<sub>i</sub>, b<sub>i</sub>) gives that of the bottom right corner of the rectangle (0 &le; l<sub>i</sub> &lt; r<sub>i</sub> &le; 10<sup>6</sup>, 0 &le; b<sub>i</sub> &lt; t<sub>i</sub> &le; 10<sup>6</sup>, for 1 &le; i &le; n). The four integers are separated by a space.</p>

<p>The input is terminated by a single zero.</p>

### 출력

<p>For each dataset, output a line containing the number of regions on the plane partitioned by the sides of the rectangles.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/9601.%E2%80%85Count%E2%80%85the%E2%80%85Regions/976de174.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/9601.%E2%80%85Count%E2%80%85the%E2%80%85Regions/976de174.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/9601/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:204px; width:250px" /></p>

<p style="text-align: center;">Figure C.1. Three rectangles partition the plane into eight regions. This corresponds to the first dataset of the sample input. The x- and y-axes are shown for illustration purposes only, and therefore they do not partition the plane.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/9601.%E2%80%85Count%E2%80%85the%E2%80%85Regions/30c96a23.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/9601.%E2%80%85Count%E2%80%85the%E2%80%85Regions/30c96a23.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/9601/2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:202px; width:215px" /></p>

<p style="text-align: center;">Figure C.2. Rectangles overlapping in more complex ways. This corresponds to the second dataset.</p>