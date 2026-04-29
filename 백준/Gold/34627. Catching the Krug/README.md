# [Gold IV] Catching the Krug - 34627

[문제 링크](https://www.acmicpc.net/problem/34627)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 103, 정답: 88, 맞힌 사람: 78, 정답 비율: 86.667%

### 분류

게임 이론, 그리디 알고리즘, 수학

### 문제 설명

<p>Doran and the Krug are playing a game on a grid consisting of $(n + 1) \times (n + 1)$ cells whose coordinates are pairs of integers from $0$ to $n$, inclusive. The Krug's goal is not to be <em>caught</em> by Doran for as long as possible, while Doran's goal is to <em>catch</em> the Krug as early as possible. We say Doran <em>caught</em> the Krug if they stand on the same grid cell.</p>

<p>To play the game, the Krug and Doran take turns alternately, starting from the Krug:</p>

<ul>
<li>The Krug can either stay in the same cell or move to a cell vertically or horizontally (but <strong>not</strong> diagonally) adjacent. Formally, if the Krug is currently at the cell $(a, b)$, she can stay at $(a, b)$ or move to either $(a-1, b), (a, b-1), (a, b+1), (a+1, b)$.</li>
<li>Doran can either stay in the same cell or move to a cell vertically, horizontally, or diagonally adjacent. Formally, if Doran is currently at the cell $(c, d)$, he can stay at $(c, d)$ or move to either $(c-1, d-1), (c-1, d), (c-1, d+1), (c, d-1), (c, d+1), (c+1, d-1), (c+1, d), (c+1, d+1)$.</li>
<li>Both players cannot go outside of the grid.</li>
</ul>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/34627.%E2%80%85Catching%E2%80%85the%E2%80%85Krug/9910083e.png" data-original-src="https://boja.mercury.kr/assets/problem/34627-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 434px; height: 187px;"></p>

<p style="text-align: center;">Figures showing possible movements of the Krug and Doran. Letters 'K' and 'D' represent the current position of the Krug and Doran, and the colored cells represent possible positions each player can move to in their respective turn.</p>

<p>The Krug's <em>survival time</em> is defined as the number of Doran's turns until Doran <em>catches</em> the Krug for the given starting cells of the players. Assuming that both players play optimally, find the Krug's <em>survival time</em> or report that the Krug can survive for infinite turns.</p>

### 입력

<p>Each test contains multiple test cases. The first line contains the number of test cases $t$ ($1 \le t \le 10^4$). The description of the test cases follows.</p>

<p>Each test case consists of a single line containing five integers $n$, $r_K$, $c_K$, $r_D$, and $c_D$ ($1 \le n \le 10^9$, $0 \le r_K, c_K, r_D, c_D \le n$, $(r_K, c_K) \ne (r_D, c_D)$) --- $n$ is the size of the grid, $(r_K, c_K)$ represents the Krug's starting cell, and $(r_D, c_D)$ represents Doran's starting cell.</p>

### 출력

<p>For each test case, output the Krug's <em>survival time</em> when both players play optimally. If the Krug can survive for infinite turns, print $-1$.</p>

### 힌트

<p><strong>Explanation of the first test case:</strong></p>

<p>The Krug starts at $(0,0)$ and Doran starts at $(1,1)$. On the Krug's turn, she can only move to $(0,0)$, $(0,1)$, or $(1,0)$.</p>

<p>Doran, starting at $(1,1)$, can reach any cell on the $3 \times 3$ grid in a single move. Therefore, no matter where the Krug moves, Doran can always move to her cell on his first turn. The Krug's survival time is $1$.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/34627.%E2%80%85Catching%E2%80%85the%E2%80%85Krug/146110ee.png" data-original-src="https://boja.mercury.kr/assets/problem/34627-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 206px; height: 209px;"></p>

<p><strong>Explanation of the second test case:</strong></p>

<p>The Krug starts at $(1,1)$ and Doran at $(0,1)$. To survive Doran's first turn, the Krug must move to a cell that Doran cannot reach. The only such cell is $(2,1)$.</p>

<p>After the Krug moves to $(2,1)$, Doran moves to $(1,1)$ to get closer.</p>

<p>Now, for her second move, the Krug must again move to a cell Doran can't reach, which is $(3,1)$. Doran then moves to $(2,1)$.</p>

<p>At this point, no matter where the Krug moves for her third turn, Doran can always reach her cell. It can be shown that this is an optimal strategy for both, and therefore the Krug's survival time is $3$.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/34627.%E2%80%85Catching%E2%80%85the%E2%80%85Krug/6e19ff01.png" data-original-src="https://boja.mercury.kr/assets/problem/34627-3.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 268px; height: 271px;"></p>