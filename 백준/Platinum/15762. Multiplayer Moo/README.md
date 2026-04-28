# [Platinum II] Multiplayer Moo - 15762

[문제 링크](https://www.acmicpc.net/problem/15762)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 261, 정답: 75, 맞힌 사람: 61, 정답 비율: 32.620%

### 분류

그래프 이론, 자료 구조, 그래프 탐색, 너비 우선 탐색, 트리를 사용한 집합과 맵

### 문제 설명

<p>The cows have come up with a creative new game, surprisingly giving it the least creative name possible: &quot;Moo&quot;.</p>

<p>The game of Moo is played on an $N \times N$ grid of square cells, where a cow claims a grid cell by yelling &quot;moo!&quot; and writing her numeric ID number in the cell.</p>

<p>At the end of the game, every cell contains a number. At this point, a cow wins the game if she has created a region of connected cells as least as large as any other region. A &quot;region&quot; is defined as a group of cells all with the same ID number, where every cell in the region is directly adjacent to some other cell in the same region either above, below, left, or to the right (diagonals don&#39;t count).</p>

<p>Since it is a bit boring to play as individuals, the cows are also interested in pairing up to play as teams. A team of two cows can create a region as before, but now the cells in the region can belong to either of the two cows on the team.</p>

<p>Given the final state of the game board, please help the cows compute the number of cells belonging to the largest region that any one cow owns, and the number of cells belonging to the largest region that can be claimed by a two-cow team. A region claimed by a two-cow team only counts if it contains the ID numbers of both cows on the team, not just one of the cows.</p>

### 입력

<p>The first line of input contains $N$ ($1 \leq N \leq 250$). The next $N$ lines each contain $N$ integers (each in the range $0 \ldots 10^6$), describing the final state of the game board. At least two distinct ID numbers will be present in the board.</p>

### 출력

<p>The first line of output should describe the largest region size claimed by any single cow, and the second line of output should describe the largest region size claimed by any team of two cows.</p>

### 힌트

<p>In this example, the largest region for a single cow consists of five 9s. If cows with IDs 1 and 9 team up, they can form a region of size 10.</p>