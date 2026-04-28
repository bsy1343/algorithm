# [Platinum I] Thwack! - 30555

[문제 링크](https://www.acmicpc.net/problem/30555)

### 성능 요약

시간 제한: 5 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 11, 정답: 10, 맞힌 사람: 10, 정답 비율: 90.909%

### 분류

게임 이론, 스프라그–그런디 정리

### 문제 설명

<p>The game <em>Thwack</em> is played on a 1-dimensional grid of cells: the <em>game board</em>. Each grid cell contains either a black stone, a white stone, or is empty.</p>

<p>Two players alternate taking turns. A turn consists of choosing two adjacent stones of opposite colours and then choosing one of these stones to <em>capture</em> the other. That is, one stone eliminates the other stone by moving to its position. A player loses when it is their turn to play but there are no available moves, i.e. there is no pair of adjacent stones of different colours.</p>

<p>The interesting thing about Thwack is that there is no default &quot;initial setup&quot; of the game board. Any game can be made by simply placing stones randomly on the grid.</p>

<p>Given the initial configuration of a game, your job is to list all the opening moves that would be winning moves for the first player assuming both players play optimally.</p>

### 입력

<p>The first line of input contains a single integer $N$ $(1 \leq N \leq 100)$ indicating the number of cells on the game board.</p>

<p>The second line contains a single string of length $N$ consisting only of characters <code>B</code>, <code>W</code>, or <code>.</code> which indicate the initial contents of the cells on the game board at the start of the game.</p>

### 출력

<p>The first line of output displays the number $W$ of possible opening moves for the first player that would result in them winning, assuming both players play perfectly. Then $W$ lines follow, the $i$th of which contains two integers $A_i, D_i$ ($1 \leq A_i, D_i \leq N, |A_i - D_i| = 1$) indicating that moving the stone at $A_i$ to capture the stone at position $D_i$ is one possible opening move that would result in the first player winning. These lines should be presented in lexicographical ordering, i.e. for $1 \leq i &lt; N$ we have either a) $A_i &lt; A_{i+1}$ or b) $A_i = A_{i+1}$ and $D_i &lt; D_{i+1}$.</p>