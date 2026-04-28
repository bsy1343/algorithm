# [Silver I] Intelligence in Perpendicularia - 15139

[문제 링크](https://www.acmicpc.net/problem/15139)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 55, 정답: 47, 맞힌 사람: 45, 정답 비율: 86.538%

### 분류

기하학

### 문제 설명

<p>There are only two directions in Perpendicularia: vertical and horizontal. Perpendicularia government are going to build a new secret service facility. They have some proposed facility plans and want to calculate total secured perimeter for each of them.</p>

<p>The total secured perimeter is calculated as the total length of the facility walls invisible for the perpendicularly-looking outside observer. The figure below shows one of the proposed plans and corresponding secured perimeter.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/15139.%E2%80%85Intelligence%E2%80%85in%E2%80%85Perpendicularia/224cb7fb.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15139/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:181px; width:238px" /></p>

<p>Write a program that calculates the total secured perimeter for the given plan of the secret service facility.</p>

### 입력

<p>The plan of the secret service facility is specified as a polygon.</p>

<p>The first line of the input contains one integer n &mdash; the number of vertices of the polygon (4 &le; n &le; 1000). Each of the following n lines contains two integers x<sub>i</sub> and y<sub>i</sub> &ndash; the coordinates of the i-th vertex (&minus;10<sup>6</sup> &le; x<sub>i</sub>, y<sub>i</sub> &le; 10<sup>6</sup>). Vertices are listed in the consecutive order.</p>

<p>All polygon vertices are distinct and none of them lie at the polygon&rsquo;s edge. All polygon edges are either vertical (x<sub>i</sub> = x<sub>i+1</sub>&nbsp;or horizontal (y<sub>i</sub> = y<sub>i+1</sub>) and none of them intersect each other.</p>

### 출력

<p>Output a single integer &mdash; the total secured perimeter of the secret service facility.</p>