# [Gold I] Walk in the Park - 4835

[문제 링크](https://www.acmicpc.net/problem/4835)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 14, 정답: 6, 맞힌 사람: 6, 정답 비율: 42.857%

### 분류

자료 구조, 런타임 전의 전처리, 정렬, 스위핑

### 문제 설명

<p>You are responsible for inspecting trees located in a park, to make sure they remain healthy. The location of each tree is given to you as a point in the two-dimensional plane. Due to recently-replanted grass, you are only allowed to walk through the park along a collection of paths. Each path is described by an infinite-length horizontal or vertical line in the two-dimensional plane.</p>

<p>You are concerned that it may not be possible to view all the trees in the park from some vantage point on a path. In particular, a tree is visible only if you can view it by standing on some path while facing perpendicular to the path. There must be no intervening tree that obstructs your view.</p>

### 입력

<p>The input file contains a single park configuration in the form:</p>

<pre>
NTREES NPATHS
X(1) Y(1)
.
.
.
X(NTREES) Y(NTREES)
PATH(1)
.
.
.
PATH(NPATHS)</pre>

<p>NTREES and NPATHS are integers in the range [1,100000]. The integer coordinates of the trees are given on the next NTREES lines. This is followed by NPATHS lines, each of the form x=C or y=C defining a vertical or horizontal path, where C is an integer in the range [-1000000,1000000].</p>

<p>All coordinates are in the range -1000000 &le; x,y &le; 1000000. All trees are distinct and do not lie on any path, and all paths are distinct.</p>

### 출력

<p>The number of trees visible from some path.</p>