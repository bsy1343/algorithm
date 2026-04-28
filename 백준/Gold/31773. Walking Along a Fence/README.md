# [Gold IV] Walking Along a Fence - 31773

[문제 링크](https://www.acmicpc.net/problem/31773)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 174, 정답: 81, 맞힌 사람: 63, 정답 비율: 55.752%

### 분류

구현, 누적 합

### 문제 설명

<p>Farmer John&#39;s $N$ cows ($1 \leq N \leq 10^5$) each like to take a daily walk around the fence enclosing his pasture.</p>

<p>The fence consists of $P$ posts ($4 \leq P \leq 2\cdot 10^5$, $P$ even), the location of each being a different 2D point $(x,y)$ on a map of FJ&#39;s farm ($0 \leq x, y \leq 1000$). Each post is connected to the two adjacent posts by fences that are either vertical or horizontal line segments, so the entire fence can be considered a polygon whose sides are parallel to the x or y axes (the last post connects back to the first post, ensuring the fence forms a closed loop that encloses the pasture). The fence polygon is &quot;well-behaved&quot; in that fence segments only potentially overlap at their endpoints, each post aligns with exactly two fence segment endpoints, and every two fence segments that meet at an endpoint are perpendicular.</p>

<p>Each cow has a preferred starting and ending position for her daily walk, each being points somewhere along the fence (possibly at posts, possibly not). Each cow walks along the fence for her daily walks, starting from her starting position and ending at her ending position. There are two routes that the cow could take, given that the fence forms a closed loop. Since cows are somewhat lazy creatures, each cow will walk in the direction around the fence that is shorter (if there is a tie, the cow may choose either direction).</p>

<p>Determine the distance that each cow walks.</p>

### 입력

<p>The first line of input contains $N$ and $P$. Each of the next $P$ lines contains two integers representing the positions of the fence posts in clockwise or counterclockwise order. Each of the next $N$ lines contains four integers $x_1$ $y_1$ $x_2$ $y_2$ representing the starting position $(x_1, y_1)$ and ending position $(x_2, y_2)$ of a cow.</p>

### 출력

<p>Write $N$ integers as output, giving the distance that each cow walks.</p>