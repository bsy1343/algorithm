# [Platinum II] Trokut - 31687

[문제 링크](https://www.acmicpc.net/problem/31687)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 40, 정답: 20, 맞힌 사람: 18, 정답 비율: 47.368%

### 분류

게임 이론, 스프라그–그런디 정리

### 문제 설명

<p>Ivan and Lucija are on a journey to a place far... far away. They know that the journey will last a long time and that they will be bored at some point. While they were thinking about what to do, Lucija came up with a game.</p>

<p>She drew $N$ points on paper so that they form the vertices of a regular $N$-gon and labeled them sequentially from $1$ to $N$. The player whose turn it is selects two of the drawn $N$ points such that the line segment connecting those two points does not intersect any of the previously drawn line segments and connects those two points. Line segments are <strong>allowed</strong> to touch at vertices. A player wins if after their move there exist three connected line segments forming a triangle, i.e., if there exist three points such that they are all connected by the drawn line segments. Of course, players are allowed to connect adjacent vertices, and those line segments are considered for triangle formation. Players take turns, and Lucija is the first to play.</p>

<p>Both are extremely skilled players, and we know they will play optimally. Your task is to determine, for a given $N$, who will be the winner of the game. It can be shown that the game will always end after a finite number of moves and that there will always be a winner.</p>

### 입력

<p>In the first row there is an integer $T$ ($1 &le; T &le; 10\, 000$), number of scenarios. In the next $T$ rows there is an integer $N$ ($3 &le; N &le; 10^9$), number of points Lucija drew on a piece of paper.</p>

### 출력

<p>In $T$ rows, for every scenario in given order, output &quot;<code>Ivan</code>&quot; or &quot;<code>Lucija</code>&quot; (without quotes), winner in a given scenario.</p>