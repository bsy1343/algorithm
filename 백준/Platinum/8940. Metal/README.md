# [Platinum IV] Metal - 8940

[문제 링크](https://www.acmicpc.net/problem/8940)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 1, 정답: 1, 맞힌 사람: 1, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍, 기하학

### 문제 설명

<p>You, a promising metal-artist, try to make a metalwork, a piece of steel. You first mark n points on a big steel board, and cut a polygon connecting those n points from the board. For this cutting, you melt the board along the boundary of the polygon with two lasers hanging down from a long bar over the board as shown in Figure 1. The bar is vertical, i.e., parallel to the y-axis, and moves continuously (without stopping) only in the positive x-direction, i.e., from the left side to the right side of the board. The lasers can move only along the bar and can never meet on the bar. Furthermore, the bar moves monotonously from left to right, it can never move to a position left of its current position. These conditions imply that the polygons you can obtain must be simple and monotone. A polygon P is simple if any two edges of P do not intersect except for the endpoints of adjacent edges, and there are no holes inside P . A polygon P is monotone if any intersection of P with a vertical line is either a point or a line segment. To choose a proper shape for your metalwork, you want to know how many different simple and monotone polygons of the n points exist.&nbsp;</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/8940.%E2%80%85Metal/da9ad522.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/8940.%E2%80%85Metal/da9ad522.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/8940/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-11-17%20%EC%98%A4%ED%9B%84%205.34.37.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:309px; width:382px" /></p>

<p style="text-align: center;">Figure 1.</p>

<p>A cutting tool with two lasers hanging from a vertical bar. For example, see Figure 2, where seven points are given as an input. There are four different simple and monotone polygons for this input. Your task is to compute the number of different simple and monotone polygons of n given points.&nbsp;</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/8940.%E2%80%85Metal/65498f72.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/8940.%E2%80%85Metal/65498f72.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/8940/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-11-17%20%EC%98%A4%ED%9B%84%205.35.57.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:214px; width:476px" /></p>

<p style="text-align: center;">Figure 2. There are four different simple and monotone polygons for seven input points.&nbsp;</p>

### 입력

<p>Your program is to read the input from standard input. The input consists of T test cases. The number of test cases T is given in the first line of the input. Each test case starts with a line containing an integer n (3 &le; n &le; 50), the number of points of S = {s<sub>0</sub>, s<sub>1</sub>, ..., s<sub>n-1</sub>}&nbsp;. Each of the next n lines contains two nonnegative integers x<sub>i</sub> and y<sub>i</sub> (0 &le; x<sub>i</sub>, y<sub>i</sub> &le; 200,000), where point s<sub>i</sub> has coordinates (x<sub>i</sub>, y<sub>i</sub>). No two points of S have the same x-coordinate.&nbsp;</p>

### 출력

<p>Your program is to write to standard output. For each test case, print the number of different simple and monotone polygons which connect n points of S.</p>

<p>The following shows sample input and output for two test cases.&nbsp;</p>