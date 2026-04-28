# [Gold IV] Cookie Cutters - 24788

[문제 링크](https://www.acmicpc.net/problem/24788)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 22, 정답: 20, 맞힌 사람: 20, 정답 비율: 90.909%

### 분류

기하학, 다각형의 넓이

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/24788.%E2%80%85Cookie%E2%80%85Cutters/4db2db41.png" data-original-src="https://upload.acmicpc.net/2875eb51-275a-4ebe-9109-33e7568c24d8/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 150px; height: 200px; float: right;" />Theta likes to bake cookies for the upcoming holidays. &nbsp;She has a selection of cookie cutters of different shapes and sizes. &nbsp;She thinks it&#39;s unfair that some shapes are larger than others - because even if everyone gets the same number of cookies, some will end up with more dough!</p>

<p>She comes up with a plan to enlarge (or shrink) the cookie cutters&#39; shapes --- while retaining their proportions --- so that all cookies will have the same weight. &nbsp;</p>

<p>Your task in this problem is to help her draw the plans the new cookie cutters will be based on!</p>

### 입력

<p>The input is a single test case, consisting of one cookie cutter outline. Cookie cutters are modeled as simple polygons. &nbsp;(Simple polygons do not self-intersect.) The first line of input contains a number $N$ ($3 \le N \le 50$) denoting the number of corners of the polygon. &nbsp;This is followed by $N$ lines containing two floating point numbers $X$ and $Y$ ($-500 \le X, Y \le 500$), each describing a set of coordinates of a polygon point. &nbsp;The coordinates are given in counter-clockwise order.</p>

<p>The next line will contain an integer number $A$ ($0 &lt; A \le 10000000$) denoting the size of the desired area to which the polygon should be grown or shrunk. &nbsp;(Since the dough is rolled out precisely to an even height everywhere, we can use area to represent weight.) The resized polygon must be similar to the original polygon, that is, all interior angles must be congruent and all corresponding sides must have the same ratio.</p>

### 출력

<p>Output $N$ lines with the $X$, $Y$ coordinates of the expanded/shrunk polygon. Because these coordinates will be used to draw a new cookie cutter, your new polygon should lie in the north-east quadrant ($x, y \ge 0$) and it should touch the x- and y-axes in at least one point. &nbsp;More precisely, you must move the resized polygon horizontally and/or vertically so that $\min x_i = \min y_j = 0$. You may not, however, rotate or skew the polygon in any way.&nbsp;</p>

<p>Provide your answers as floating point numbers. Your answer will be considered correct if none of the $x, y$ coordinates have an absolute or relative error larger than $10^{-4}$.</p>