# [Silver V] Demand for Cycling - 35087

[문제 링크](https://www.acmicpc.net/problem/35087)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 43, 정답: 39, 맞힌 사람: 33, 정답 비율: 89.189%

### 분류

기하학, 애드 혹

### 문제 설명

<p>In the Grid City of Perpendicular Cycling (GCPC for short), cars have never been popular. Instead, everyone uses various kinds of bicycles to make their way around the city. This is not the only feature of GCPC. Following an ancient city design used in different places since <a href="https://en.wikipedia.org/wiki/Grid_plan">at least 2600 BC</a>, all streets are going in one of the cardinal directions (i.e. either north/south or east/west) and therefore only meet at right angles.</p>

<p>The city council is planning on adding a new bike path surrounding the entire city to accommodate the strong demand for good cycling infrastructure. This new bike path should respect the historic grid system and should therefore only consist of segments parallel to one of the cardinal directions.</p>

<p>In order to minimize the construction cost and also the travel time for cyclists, the council wants this new bike path to be as short as possible. The council already prepared the outline of the city but now needs help in finding such a shortest bike path. For simplicity, you may assume that the bike path has width zero and may have distance zero to any point on the outline of the city.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/35087.%E2%80%85Demand%E2%80%85for%E2%80%85Cycling/0314cf20.png" data-original-src="https://boja.mercury.kr/assets/problem/35087-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 300px; height: 223px;"></p>

<p style="text-align: center;">Figure D.1: Illustration of the first sample. The gray area represents the city and the black contour an optimal bike path. The given bike path has length $20$. It can be shown that there is no shorter one that satisfies the requirements.</p>

### 입력

<p>The input consists of:</p>

<ul>
<li>One line with an integer $n$ ($4 \leq n \leq 10^5$), the number of points of the outline of the city.</li>
<li>$n$ lines, each with two integers $x$ and $y$ ($1 \leq x,y \leq 10^9$), the coordinates of the points.</li>
</ul>

<p>Additionally, the following is guaranteed:</p>

<ul>
<li>The points of the city's outline are given in counterclockwise order.</li>
<li>Two consecutive points have either the same x-coordinate or the same y-coordinate.</li>
<li>No three consecutive points are collinear.</li>
<li>The outline of the city does not intersect itself.</li>
</ul>

### 출력

<p>Output an integer $m$ ($m\leq n$), the number of points of the bike path, followed by $m$ lines containing the coordinates of the bike path in counterclockwise order. Note that two consecutive points must have either the same x-coordinate or the same y-coordinate, and that no three consecutive points may be collinear.</p>

<p>If there are multiple valid solutions, you may output any one of them.</p>