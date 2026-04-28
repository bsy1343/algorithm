# [Platinum I] Skyline - 5030

[문제 링크](https://www.acmicpc.net/problem/5030)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 14, 정답: 8, 맞힌 사람: 8, 정답 비율: 61.538%

### 분류

기하학, 선분 교차 판정, 도형에서의 불 연산

### 문제 설명

<p>Last time I visited Shanghai I admired its beautiful skyline. It also got me thinking, &rdquo;Hmm, how much of the buildings do I actually see?&rdquo; since the buildings wholly or partially cover each other when viewed from a distance.</p>

<p>In this problem, we assume that all buildings have a trapezoid shape when viewed from a distance. That is, vertical walls but a roof that may slope. Given the coordinates of the buildings, calculate how large part of each building that is visible to you (i.e. not covered by other buildings).</p>

### 입력

<p>The first line contains an integer, N (2 &le; N &le; 100), the number of buildings in the city. Then follows N lines each describing a building. Each such line contains 4 integers, x1, y1, x2, and y2 (0 &le; x1 &lt; x2 &le; 10000, 0 &lt; y1, y2 &le; 10000). The buildings are given in distance order, the first building being the one closest to you, and so on.</p>

### 출력

<p>For each building, output a line containing a floating point number between 0 and 1, the relative visible part of the building. The absolute error for each building must be &lt; 10<sup>&minus;6</sup>.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/5030.%E2%80%85Skyline/b50e17e2.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/5030/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:212px; width:240px" /></p>

<p style="text-align: center;">Figure 1: Figure of the first sample case</p>