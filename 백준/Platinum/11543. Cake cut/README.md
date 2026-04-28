# [Platinum II] Cake cut - 11543

[문제 링크](https://www.acmicpc.net/problem/11543)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 54, 정답: 36, 맞힌 사람: 31, 정답 비율: 65.957%

### 분류

기하학, 두 포인터, 다각형의 넓이

### 문제 설명

<p>Carol and Carla are roommates. Yesterday they threw a big party and today they have a partially eaten cake that they want to divide. Since people were careless when cutting themselves a slice, the cake is now shaped as a prism with its top and bottom faces being the same simple convex polygon.</p>

<p>To add some fun to the process of dividing the cake, the girls came up with the following game. Carol chooses a vertex v of the top face of the cake. Carla chooses another vertex w of the top face that is not adjacent to v. Then, they cut the cake into two pieces by extending downwards the segment vw, so as to obtain two separate pieces of cake, each in the shape of a prism. Finally, Carol chooses the piece that she prefers, and Carla gets the other one. Carla immediately saw that this system gives Carol an advantage. Carla wants to know exactly how much of an advantage Carol has.</p>

<p>You are given a polygon that represents both the top and bottom faces of the cake. The height of the cake is 2, so the volume of a piece of cake is 2 times the area of its top face. Assuming the cake is divided as explained, and that both girls make their decisions to maximize the volume of the piece they have at the end, compute the volume of the piece each girl will get.</p>

### 입력

<p>The first line contains an integer N representing the number of vertices of the polygonal top face of the cake (4 &le; N &le; 10<sup>5</sup>). Each of the next N lines describes a vertex of the polygon with two integers X and Y, indicating the coordinates of the vertex in the XY plane (&minus;10<sup>8</sup> &le; X, Y &le; 10<sup>8</sup>). Vertices are given in counter clockwise order and define a simple convex polygon. No three points in the input are collinear.</p>

### 출력

<p>Output a line with two integers representing the volume of the piece Carol and Carla will get, in that order, if both make their decisions optimally.</p>