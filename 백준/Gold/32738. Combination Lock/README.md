# [Gold IV] Combination Lock - 32738

[문제 링크](https://www.acmicpc.net/problem/32738)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 24, 정답: 17, 맞힌 사람: 13, 정답 비율: 72.222%

### 분류

수학, 애드 혹, 정수론, 해 구성하기

### 문제 설명

<p>You are faced with a combination lock that consists of an $n$ by $m$ grid of dials. A $k$-dial is a dial that can display values $0, 1, \cdots k-1$. A $k$-dial currently displaying value $v$ can be <em>incremented</em> to make it display value $(v + 1)\mod k$.</p>

<p>This particular lock consists of $3$-dials and $5$-dials in a checkerboard arrangement, with the top left dial being a $3$-dial. In a single move, you can increment a dial and all of its horizontal and vertical neighbors.</p>

<p>For example, here is one possible sequence of moves on a grid with $n=3$, $m=4$ (where $3$-dials are gray and $5$-dials are white):</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/32738.%E2%80%85Combination%E2%80%85Lock/66e7c870.jpg" data-original-src="https://boja.mercury.kr/assets/problem/32738-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 768px; height: 103px;"></p>

<p>Initially, all of the dials are displaying $0$. You remember what positions the dials must be in for the lock to open, but you forgot the combination of moves to reach it. Find a sequence of moves that sets all dials to the correct positions. You do <strong>not</strong> need to minimize the number of moves, but you can use no more than $20nm$ moves.</p>

<p>It can be shown that such a solution always exists.</p>

### 입력

<p>The first line of the input contains a single integer $t$ ($1 \le t \le 1000$) --- the number of test cases. The description of the test cases follows.</p>

<p>The first line of each test case contains two integers $n$ and $m$ ($1 \le n, m \le 100$) --- the number of rows and columns in the grid, respectively.</p>

<p>The $i$-th of the next $n$ lines contains $m$ integers describing the $i$-th row of the combination. The $j$-th of these is $a_{ij}$, the desired position of the dial at position $(i, j)$. If $i+j$ is even, $0 \le a_{ij} &lt; 3$. Otherwise, $0 \le a_{ij} &lt; 5$. </p>

<p>It is guaranteed that the sum of $n\cdot m$ over all test cases does not exceed $10^4$.</p>

### 출력

<p>The first line of output for each test case should contain a single integer $k$ ($0 \le k \le 20nm$) --- the number of moves you will perform.</p>

<p>The next $k$ lines of output should each contain integers $i$ and $j$, indicating that the next move will be performed at position $(i, j)$.</p>

<p>If there are multiple solutions, print any.</p>

### 힌트

<p>Here is the move used in the first sample case:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/32738.%E2%80%85Combination%E2%80%85Lock/4f8c9bc3.png" data-original-src="https://boja.mercury.kr/assets/problem/32738-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 494px; height: 152px;"></p>

<p>In the second sample case, the lock is already in the target position, so no moves are needed.</p>