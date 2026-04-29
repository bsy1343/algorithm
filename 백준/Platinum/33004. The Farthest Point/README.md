# [Platinum I] The Farthest Point - 33004

[문제 링크](https://www.acmicpc.net/problem/33004)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 54, 정답: 31, 맞힌 사람: 23, 정답 비율: 71.875%

### 분류

3차원 기하학, 기하학, 삼분 탐색

### 문제 설명

<p>An ant is on one of the vertices, say the <em>starting</em> vertex, of a rectangular cuboid (a hexahedron with all of its faces being rectangular). The surface of the cuboid constitutes the entire world of the ant.</p>

<p>We’d like to know which point on the surface of the cuboid is the farthest for the ant from the starting vertex. You may think that the <em>opposite</em> vertex, that is, the opposite end of the interior diagonal from the starting vertex, is the farthest. The opposite vertex is, however, not necessarily the farthest.</p>

<p>For example, on the surface of a cuboid of size $1 \times 1 \times 2$, the distance from a vertex to the opposite vertex is the square root of $8$. The distance to the farthest point is, however, the square root of $65/8$ (Figure F.1).</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/33004.%E2%80%85The%E2%80%85Farthest%E2%80%85Point/dfb1d814.png" data-original-src="https://boja.mercury.kr/assets/problem/33004-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 572px; height: 250px;"></p>

<p style="text-align: center;">Figure F.1. Rectangular cuboid of size $1 \times 1 \times 2$, and its net</p>

<p>You are given the size of the rectangular cuboid. Write a program which calculates the distance from the starting vertex to the farthest point.</p>

### 입력

<p>The input consists of a single test case of the following format.</p>

<blockquote>
<p>$a$ $b$ $c$</p>
</blockquote>

<p>The three integers $a$, $b$, and $c$ mean that the size of the rectangular cuboid is $a \times b \times c$. All of them are between $1$ and $100$, inclusive.</p>

### 출력

<p>Output a line containing the distance from the starting vertex to the farthest point. The relative error of the output must be less than or equal to $10^{-9}$.</p>