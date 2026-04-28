# [Platinum II] Trobojnica - 17820

[문제 링크](https://www.acmicpc.net/problem/17820)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 60, 정답: 13, 맞힌 사람: 13, 정답 비율: 26.531%

### 분류

자료 구조, 그리디 알고리즘, 집합과 맵, 연결 리스트, 불변량 찾기

### 문제 설명

<blockquote>
<p>&bdquo;Everything will be in flames once red, white and blue start running through your veins&rdquo; &ndash; Slaven Bilić</p>
</blockquote>

<p>In this task, we will observe regular polygons that have each of their N sides colored in one of three colors and whose vertices are denoted from 1 to N in a clockwise order. A triangulaton of a polygon is a decomposition of its area into a set of non-overlapping triangles whose sides either lie on the sides of the polygon or its internal diagonals. Of course, in this task, each of the diagonals used for polygon triangulation is also colored in one of three colors.</p>

<p>The triangulation is said to be patriotic if each of its N &minus; 2 triangles has all three sides of different colors. Your task is to determine a patriotic triangulation of a given polygon.</p>

### 입력

<p>The first line contains an integer N from the task description.</p>

<p>The second line contains an integer consisting of N digits which represent the colors of polygon sides. More precisely, the first digit represents the color of side (1, 2), the second digit represents the color of side (2, 3), and so on until the N-th digit which represents the color of side (N, 1). The colors will always be denoted with digits 1, 2 and 3.</p>

### 출력

<p>If there is no patriotic triangulation of the given polygon, output NE and terminate the program. Otherwise, in the first line output DA and in the next N &minus;3 lines output each diagonal used in the patriotic triangulation. Each diagonal should be specified as X Y C where X and Y are the endpoints of a diagonal and C is its color (1 &le; X, Y &le; N, 1 &le; C &le; 3). The order of diagonals in the output is not important. If there are multiple correct solutions, output any of them.</p>