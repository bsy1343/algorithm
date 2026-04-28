# [Platinum II] Piece of Cake - 16995

[문제 링크](https://www.acmicpc.net/problem/16995)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 48, 정답: 37, 맞힌 사람: 31, 정답 비율: 77.500%

### 분류

수학, 기하학, 조합론

### 문제 설명

<p>Alice received a cake for her birthday! Her cake can be described by a convex polygon with n vertices. No three vertices are collinear.</p>

<p>Alice will now choose exactly k random vertices (k&ge;3) from her cake and cut a piece, the shape of which is the convex polygon defined by those vertices. Compute the expected area of this piece of cake.</p>

### 입력

<p>Each test case will begin with a line with two space-separated integers n and k (3 &le; k &le; n &le; 2,500), where n is the number of vertices of the cake, and k is the number of vertices of the piece that Alice cuts.</p>

<p>Each of the next n lines will contain two space-separated real numbers x and y (&minus;10.0 &le; x, y &le; 10.0), where (x, y) is a vertex of the cake. The vertices will be listed in clockwise order. No three vertices will be collinear. All real numbers have at most 6 digits after the decimal point.</p>

### 출력

<p>Output a single real number, which is the expected area of the piece of cake that Alice cuts out. Your answer will be accepted if it is within an absolute error of 10<sup>&minus;6</sup>.</p>