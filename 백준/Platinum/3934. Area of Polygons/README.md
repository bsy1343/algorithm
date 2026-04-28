# [Platinum IV] Area of Polygons - 3934

[문제 링크](https://www.acmicpc.net/problem/3934)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 20, 정답: 14, 맞힌 사람: 10, 정답 비율: 66.667%

### 분류

브루트포스 알고리즘, 기하학, 정렬, 스위핑

### 문제 설명

<p>Yoko&rsquo;s math homework today was to calculate areas of polygons in the xy-plane. Vertices are all aligned to grid points (i.e. they have integer coordinates).</p>

<p>Your job is to help Yoko, not good either at math or at computer programming, get her homework done. A polygon is given by listing the coordinates of its vertices. Your program should approximate its area by counting the number of unit squares (whose vertices are also grid points) intersecting the polygon. Precisely, a unit square &ldquo;intersects the polygon&rdquo; if and only if the intersection of the two has non-zero area. In the figure below, dashed horizontal and vertical lines are grid lines, and solid lines are edges of the polygon. Shaded unit squares are considered intersecting the polygon. Your program should output 55 for this polygon (as you see, the number of shaded unit squares is 55).</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/3934.%E2%80%85Area%E2%80%85of%E2%80%85Polygons/770fafff.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/3934.%E2%80%85Area%E2%80%85of%E2%80%85Polygons/770fafff.png" data-original-src="https://www.acmicpc.net/upload/images2/area.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:291px; width:332px" /></p>

<p>Figure 1: A polygon and unit squares intersecting it</p>

### 입력

<p>The input file describes polygons one after another, followed by a terminating line that only contains a single zero.</p>

<p>A description of a polygon begins with a line containing a single integer, m (&ge; 3), that gives the number of its vertices. It is followed by m lines, each containing two integers x and y, the coordinates of a vertex. The x and y are separated by a single space. The i-th of these m lines gives the coordinates of the i-th vertex (i = 1, &middot;&middot;&middot; , m). For each i = 1, &middot;&middot;&middot; , m &minus;1, the i-th vertex and the (i + 1)-th vertex are connected by an edge. The m-th vertex and the first vertex are also connected by an edge (i.e., the curve is closed). Edges intersect only at vertices. No three edges share a single vertex (i.e., the curve is simple). The number of polygons is no more than 100. For each polygon, the number of vertices (m) is no more than 100. All coordinates x and y satisfy &minus;2000 &le; x &le; 2000 and &minus;2000 &le; y &le; 2000.</p>

### 출력

<p>The output should consist of as many lines as the number of polygons. The k-th output line should print an integer which is the area of the k-th polygon, approximated in the way described above. No other characters, including whitespaces, should be printed.</p>