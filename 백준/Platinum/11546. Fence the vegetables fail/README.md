# [Platinum III] Fence the vegetables fail - 11546

[문제 링크](https://www.acmicpc.net/problem/11546)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 103, 정답: 46, 맞힌 사람: 42, 정답 비율: 42.424%

### 분류

자료 구조, 기하학, 세그먼트 트리, 스위핑

### 문제 설명

<p>At the early age of 40, Alice and Bob decided to retire. After more than two decades working as examples for networking protocols, game theoretical books and several other texts, they were tired. To remain active, they decided to get into gardening.</p>

<p>Alice and Bob planted several vegetable plants in a huge field. After finishing, they realized that their plants needed protection from wild animals, so they decided to build a fence around them. The field is represented as the XY plane, and each vegetable plant as a different point in it. A fence is represented as a polygon in the plane. However, not every polygon is a valid fence. The fence needs to be a single simple polygon with each of its sides parallel to one of the axes. Of course, the polygon should contain all the points representing vegetable plants. A fence too close to the plants or to itself could make it difficult to walk around, so each side of the polygon needs to be away from all plants and all non-adjacent sides.</p>

<p>Unfortunately, Alice and Bob subcontracted the construction of the fence to a nasty multinational. The company had a lot of lawyers on payroll, but no good fence designers, so they failed to comply to all requirements. They built a fence which is a simple polygon with sides parallel to the axes and whose sides are away from plants and itself. However, they forgot to make the fence contain all the plants!</p>

<p>Alice and Bob want to assess the extent of the problem. Since not all plants are equally valuable to them, they want to know the total value of the plants that were left outside the fence.</p>

### 입력

<p>The first line contains two integers P and V , representing respectively the number of plants and the number of vertices of the polygonal fence (1 &le; P, V &le; 10<sup>5</sup>). Each of the next P lines describes a different plant with two integers X<sub>p</sub> and Y<sub>p</sub>, indicating the coordinates of the plant (&minus;10<sup>9</sup> &le; X<sub>p</sub>, Y<sub>p</sub> &le; 10<sup>9</sup>). The value of the p-th plant in the input is p, for p = 1, 2, . . . , P. Each of the next V lines describes a vertex of the fence with two integers X<sub>v</sub> and Y<sub>v</sub>, indicating the coordinates of the vertex (&minus;10<sup>9</sup> &le; X<sub>v</sub>, Y<sub>v</sub> &le; 10<sup>9</sup>). Vertices are given in counter clockwise order. Each of these points is an actual vertex of the polygon, that is, it is not collinear with its two adjacent vertices. The represented polygon is a simple polygon with each side parallel to an axis. No two plants are in the same position, and no plant lies on a fence&rsquo;s side.</p>

### 출력

<p>Output a line with an integer representing the sum of the values of all the plants that lie outside the fence.</p>