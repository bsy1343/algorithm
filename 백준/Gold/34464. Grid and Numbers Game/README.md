# [Gold I] Grid and Numbers Game - 34464

[문제 링크](https://www.acmicpc.net/problem/34464)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 12, 정답: 8, 맞힌 사람: 7, 정답 비율: 63.636%

### 분류

게임 이론, 그래프 이론, 다이나믹 프로그래밍, 방향 비순환 그래프, 애드 혹, 우선순위 큐, 자료 구조, 정렬, 홀짝성

### 문제 설명

<p>Busy Beaver and Calico Bear are playing a game with an $N$ by $M$ grid of nonnegative integers $a_{i,j}$, where initially no two edge-adjacent numbers are equal.</p>

<p>In a move, a player chooses a positive integer in the grid and decreases it by $1$, subject to the constraint that after the move, it still holds that no two edge-adjacent numbers are equal and that all numbers are non-negative. If a player has no legal moves on their turn, they lose, and the other player wins.</p>

<p>Busy Beaver moves first, and then the players alternate. Assuming both players play optimally, determine whether or not Busy Beaver has a winning strategy.</p>

### 입력

<p>Each test contains multiple test cases. The first line of input contains a single integer $T$ ($1 \leq T \leq 10^4$) --- the number of test cases. The description of each test case follows.</p>

<p>The first line of each test case contains two positive integers $N$ and $M$ ($1 \leq N, M, N \cdot M \leq 2.5 \cdot 10^5$) --- the dimensions of the grid.</p>

<p>The $i$-th of the next $N$ lines contains $M$ space-separated nonnegative integers $a_{i,1}, \dots, a_{i,M}$ ($0 \leq a_{i,j} \leq 10^9$), where $a_{i,j}$ represents the integer in the grid in row $i$ and column $j$.</p>

<p>The sum of $N \cdot M$ over all test cases does not exceed $2.5 \cdot 10^5$.</p>

### 출력

<p>For each test case, output "<code>Yes</code>" (without quotes) if Busy Beaver wins, and "<code>No</code>" (without quotes) if Calico Bear wins.</p>

### 힌트

<p>In the first test case, Busy Beaver can decrease the $1$ to a $0$. Then, Calico Bear has no moves, so Busy Beaver has a winning strategy.</p>

<p>In the second test case, Busy Beaver has no legal moves. Therefore, Calico Bear has a winning strategy.</p>

<p>In the third test case, Busy Beaver first decreases the central $3$ to a $2$. Then, regardless of which $10$ Calico Bear decreases, Busy Beaver can decrease the other one. Therefore, Calico Bear runs out of moves before Busy Beaver does, giving Busy Beaver a winning strategy.</p>