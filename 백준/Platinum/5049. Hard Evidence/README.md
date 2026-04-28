# [Platinum III] Hard Evidence - 5049

[문제 링크](https://www.acmicpc.net/problem/5049)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 47, 정답: 4, 맞힌 사람: 4, 정답 비율: 12.500%

### 분류

브루트포스 알고리즘, 기하학, 삼분 탐색

### 문제 설명

<p>The young reporter Janne is planning to take a photo of a secret government installation. He needs to obtain evidence of the many serious crimes against good sense that are being committed there, so as to create a scandal and possibly win a Pulitzer. Unfortunately, the base is surrounded by a high fence with high voltage wires running around. Janne does not want to risk being electrocuted, so he wants to take a photo from outside the fence. He can bring a tripod as high as the fence to take a photo, so if he wants he can stand right beside the fence and take his picture. The secret installation is a convex polygon. The fence has a form of a circle. Of course Janne wants to make a photo with maximal possible detail level. The detail level of the photo depends on the view angle of the base at the point from which the photo is taken. Therefore he wants to find a point to maximize this angle.</p>

<p>&nbsp;</p>

### 입력

<p>The first line of the input file contains two integer numbers: n and r &mdash; the number of vertices of the polygon and the radius of the fence (3 &le; n &le; 200, 1 &le; r &le; 1000). The following n lines contain two real numbers each &mdash; the coordinates of the vertices of the polygon listed in counterclockwise order. It is guaranteed that all vertices of the polygon are strictly inside the fence circle, and that the polygon is convex. The center of the fence circle is located at the origin, (0, 0).</p>

### 출력

<p>Output the maximal view angle a for the photo (0 &le; a &lt; 2&pi;). Any answer with either absolute or relative error smaller than 10<sup>&minus;6</sup> is acceptable.</p>