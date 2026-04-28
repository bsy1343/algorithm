# [Gold III] Oblongs and Right Triangles - 16547

[문제 링크](https://www.acmicpc.net/problem/16547)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 13, 정답: 7, 맞힌 사람: 7, 정답 비율: 53.846%

### 분류

브루트포스 알고리즘, 기하학, 백트래킹

### 문제 설명

<p>There are N points on the plane; the i-th point is at (X<sub>i</sub>, Y<sub>i</sub>). There may be multiple points at the same location. Four of the points will be coloured black and three other points will be coloured white. The remaining N &minus; 7 points will be uncoloured.</p>

<p>An <em>oblong</em> is a rectangle that is not a square.</p>

<p>An <em>right triangle</em> is a triangle where one of the interior angles is exactly ninety degrees.</p>

<p>Determine the number of ways to colour the points such that the four black points are the vertices of an oblong and the three white points are the vertices of a right triangle. Note that both shapes should have positive area.</p>

### 입력

<p>Line 1 contains one integer N (7 &le; N &le; 2<sup>4</sup>).</p>

<p>Line 2 contains N integers X<sub>1</sub>, . . . , X<sub>N</sub> (&minus;2<sup>29</sup> &le; X<sub>i</sub> &le; 2<sup>29</sup>).</p>

<p>Line 3 contains N integers Y<sub>1</sub>, . . . , Y<sub>N</sub> (&minus;2<sup>29</sup> &le; Y<sub>i</sub> &le; 2<sup>29</sup>).</p>

### 출력

<p>Print one line with one integer, the number of ways to choose an oblong and a right triangle.</p>

### 힌트

<p>The only way to form an oblong is with points 1,2,7,8. Of the remaining four points there are two ways to form a right triangle from them.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/16547.%E2%80%85Oblongs%E2%80%85and%E2%80%85Right%E2%80%85Triangles/b62bd861.png" data-original-src="https://upload.acmicpc.net/b8900cee-db65-4463-b03e-2f7d2555d8fa/-/crop/632x598/12,9/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 316px; height: 299px;" /></p>