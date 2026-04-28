# [Gold II] Run Run Run - 28331

[문제 링크](https://www.acmicpc.net/problem/28331)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 58, 정답: 12, 맞힌 사람: 9, 정답 비율: 30.000%

### 분류

데이크스트라, 그래프 이론, 최단 경로

### 문제 설명

<p>In the world of Altertania, there is a large chessboard with $N^2$ cells. The board has $N$ rows and $N$ columns; rows are numbered from $1$ to $N$ starting from the top, and columns are numbered from $1$ to $N$ starting from the left. Each cell $(r, c)$ are located by its row number r and column number $c$.</p>

<p>With this ample real estate, chess pieces do not fight anymore and live peacefully together.</p>

<p>A knight wants to visit his friend rook for his birthday. He still has his horse with him, so he can jump around like he used to. See the following diagram for the jumps he can make.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/e9c14a75-e48d-4565-b3fc-cf543b0ab0fb/-/preview/" style="width: 318px; height: 320px;" /></p>

<p>However, he has a problem: his horse is old and lazy, so it will refuse to make more than a single move each day. Alas! At this rate, he cannot make it before rook&rsquo;s birthday.</p>

<p>Don&rsquo;t despair, all is not lost. Some cells in this chessboard are converted to vegetable patches. At the start of each day, the knight steps into a cell by a single move. If that cell has vegetable patch, he can feed his horse some carrots and the horse will agree to make a few more moves that day. The number of additional moves the horse can make is equal to the nutrition value of the carrot, which is an integer between $1$ and $5$ (inclusive). The horse will not eat carrots twice in a single day.</p>

<p>Write a program to calculate the minimal days the knight can reach his friend.</p>

### 입력

<p>The input consists of $T$ test cases. The number of test cases $T$ is given in the first line of the input.</p>

<p>The first line of each test case contains two integers $N$ ($4 &le; N &le; 1\,000$) and $V$ ($0 &le; V &le; 10\,000$). The second line contains four integers $R_K$, $C_K$, $R_R$, $C_R$ ($1 &le; R_K, C_K, R_R, C_R &le; N$). The knight is currently at $(R_K, C_K)$, and the rook lives at $(R_R, C_R)$. $V$ lines will follow: each line will contain three integers $R_i$, $C_i$ and $V_i$ ($1 &le; R_i, C_i &le; N$, $1 &le; V_i &le; 5$). $V_i$ is the nutrition value of carrots from vegetable patch at $(R_i , C_i)$.</p>

<p>There will be at most one vegetable patch in a single cell. The knight&rsquo;s starting position will not be a vegetable patch nor the rook&rsquo;s position.</p>

### 출력

<p>Print exactly one line for each test case. The line should contain an integer indicating the number of days the knight needs to reach his friend.</p>