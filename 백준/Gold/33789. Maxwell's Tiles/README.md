# [Gold II] Maxwell's Tiles - 33789

[문제 링크](https://www.acmicpc.net/problem/33789)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 2048 MB

### 통계

제출: 37, 정답: 22, 맞힌 사람: 18, 정답 비율: 54.545%

### 분류

수학, 조합론

### 문제 설명

<p>Maxwell is renovating his bathroom and wants to redo the tiling on his wall. His wall is a $2m \times 2n$ rectangle. To describe the placement of tiles on the wall, we will use a coordinate system placing the center at the origin, so that the wall is described by the rectangle with vertices $(m, n)$, $(m, -n)$, $(-m, -n)$, and $(-m, n)$. For example, for $m=3$, $n=2$, his wall would look like this:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/33789.%E2%80%85Maxwell's%E2%80%85Tiles/21a12d8a.png" data-original-src="https://boja.mercury.kr/assets/problem/33789-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 200px; height: 161px;"></p>

<p>Maxwell wishes to tile his wall using tiles shaped like connected <a href="https://en.wikipedia.org/wiki/Polyomino">polyominoes</a> formed from $1 \times 1$ squares, but he has special conditions on how he wants them to be placed. A tile is <em>well-placed</em> if the value of $\max(|x|, |y|)$ is constant across all the centers of the squares making up that tile. These tiles are allowed to have "holes" in the middle, as long as the tile itself is one connected group.</p>

<p>For example, one possible <em>well-placed</em> tiling of the above wall would be:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/33789.%E2%80%85Maxwell's%E2%80%85Tiles/2d2ffd75.png" data-original-src="https://boja.mercury.kr/assets/problem/33789-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 200px; height: 156px;"></p>

<p>How many ways can Maxwell tile his bathroom wall with well-placed tiles? Two configurations of tiles are considered different if two squares are part of the same tile in one configuration but are part of different tiles in the other.</p>

<p>Since the answer may be very large, print it modulo $10^9 + 7$.</p>

### 입력

<p>The first line of the input contains a single integer $t$ ($1 \le t \le 10^4$) --- the number of test cases. The description of the test cases follows.</p>

<p>Each test case consists of a single line containing two integers $m$ and $n$ ($1 \le m, n \le 10^6$) --- the parameters above, describing the dimensions of Maxwell's wall.</p>

<p>Note that there is no additional constraint on the sum of $n$ or $m$ across all test cases.</p>

### 출력

<p>For each test case, output a single integer --- the number of ways Maxwell can tile his wall with well-placed tiles, modulo $10^9 + 7$.</p>

### 힌트

<p>Here are the 12 possible tilings for the first sample case:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/33789.%E2%80%85Maxwell's%E2%80%85Tiles/17b8c51c.png" data-original-src="https://boja.mercury.kr/assets/problem/33789-3.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 500px; height: 169px;"></p>