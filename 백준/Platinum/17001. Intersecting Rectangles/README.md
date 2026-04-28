# [Platinum III] Intersecting Rectangles - 17001

[문제 링크](https://www.acmicpc.net/problem/17001)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 70, 정답: 51, 맞힌 사람: 39, 정답 비율: 72.222%

### 분류

자료 구조, 집합과 맵, 스위핑

### 문제 설명

<p>You are given a set of n axis-aligned rectangles in a 2D plane. For this problem, two rectangles are considered to intersect if their boundaries contain any common points (in particular, two nesting rectangles don&rsquo;t count as intersecting). Determine if some pair of rectangles intersect.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/823afaac-4953-4aff-addd-564bbaf984cd/-/preview/" style="width: 639px; height: 172px;" /></p>

<p>In this example, only rectangles A and B intersect.</p>

### 입력

<p>Each test case will begin with a line with a single integer n (1 &le; n &le; 10<sup>5</sup>), which is the number of rectangles.</p>

<p>Each of the next n lines will contain four space-separated integers:</p>

<p style="text-align: center;">x<sub>1</sub> y<sub>1</sub> x<sub>2</sub> y<sub>2</sub></p>

<p>(&minus;10<sup>9</sup> &le; x<sub>1</sub>, y<sub>1</sub>, x<sub>2</sub>, y<sub>2</sub> &le; 10<sup>9</sup>, x<sub>1</sub> &lt; x<sub>2</sub>, y<sub>1</sub> &lt; y<sub>2</sub>), which describe a rectangle, where (x<sub>1</sub>, y<sub>1</sub>) is the lower left corner and (x<sub>2</sub>, y<sub>2</sub>) is the upper right corner. All x values will be distinct. All y values will be distinct.</p>

### 출력

<p>Output a single integer, which is 1 if some pair of rectangles intersect, 0 if no pair of rectangles intersect.</p>