# [Platinum I] Grid Game 2×2 - 35172

[문제 링크](https://www.acmicpc.net/problem/35172)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 3, 정답: 3, 맞힌 사람: 3, 정답 비율: 100.000%

### 분류

게임 이론, 스프라그–그런디 정리

### 문제 설명

<p>There is a $10^9 \times 10^9$ grid, with rows numbered from $1$ to $10^9$ and columns numbered from $1$ to $10^9$. Denote $(r, c)$ as the cell at row $r$ and column $c$.</p>

<p>Initially, exactly $N$ of the cells are black, and the rest are white. The $i$-th black cell is located at $(R_i, C_i)$.</p>

<p>Your childhood friends, Kita and Kami, will alternately take turns playing on this grid, with Kita moving first. A turn in the game proceeds as follows.</p>

<ol>
<li>Pick a black cell $(r, c)$.</li>
<li>Pick a subset $K \subseteq \{1, 2, \ldots, t\}$ where $t$ is the largest integer such that $2^t \leq \min(r, c)$. The set $K$ may be empty.</li>
<li>For each $k \in K$, toggle the colour of <strong>all</strong> cells $(r-i, c-j)$ satisfying $0 \leq i &lt; 2^k$, $0 \leq j &lt; 2^k$, and $(i, j) \neq (0, 0)$. Toggling a colour means changing black colour to white and vice versa.</li>
<li>Toggle the colour of cell $(r, c)$. Note that the colour of cell $(r, c)$ becomes white after the toggle.</li>
</ol>

<p>A player who is unable to play on their turn, i.e., there are no black cells anymore, loses the game, and the opposing player wins the game. If both players play optimally, determine who will win the game.</p>

### 입력

<p>The first line contains an integer $N$ ($1 \leq N \leq 200\,000$) representing the number of black cells. Each of the next $N$ lines contains two integers $R_i$ and $C_i$ ($1 \leq R_i, C_i \leq 10^9$) representing the location of the $i$-th black cell. All the given black cells are different.</p>

### 출력

<p>Output one line, containing either <code>Kita</code> if the first player will win the game, or <code>Kami</code> otherwise.</p>