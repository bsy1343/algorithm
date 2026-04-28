# [Gold IV] Traveling Salesman - 1828

[문제 링크](https://www.acmicpc.net/problem/1828)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 98, 정답: 34, 맞힌 사람: 27, 정답 비율: 37.500%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색

### 문제 설명

<p>Long before the days of international trade treaties, a salesman would need to pay taxes at every border crossed. So your task is to ﬁnd the minimum number of borders that need to be crossed when traveling between two countries. We model the surface of Earth as a set of polygons in three dimensions forming a closed convex 3D shape, where each polygon corresponds to one country. You are not allowed to cross at points where more than two countries meet.</p>

### 입력

<p>The input consists of a line containing c, the number of countries (4 &le; c &le; 6000), followed by c lines containing the integers n x<sub>1</sub> y<sub>1</sub> z<sub>1</sub> . . . x<sub>n</sub> y<sub>n</sub> z<sub>n</sub>, describing (in order) the n corners of a closed polygon (3 &le; n &le; 20). Then follows a line with one integer m (0 &lt; m &le; 50), and then m lines with queries c<sub>a</sub> c<sub>b</sub> , where c<sub>a</sub> and c<sub>b</sub> are country numbers (starting with 1). No point will be on the line between two connected points, and &minus;10<sup>6</sup> &le; x, y, z &le; 10<sup>6</sup> for all points. No two non-adjacent edges of a country share a common point.</p>

### 출력

<p>For each query, output the number of borders you must cross to go from c<sub>a</sub> to c<sub>b</sub>.<span style="display: none;">&nbsp;</span></p>