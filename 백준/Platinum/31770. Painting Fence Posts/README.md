# [Platinum I] Painting Fence Posts - 31770

[문제 링크](https://www.acmicpc.net/problem/31770)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 39, 정답: 13, 맞힌 사람: 13, 정답 비율: 46.429%

### 분류

구현, 자료 구조, 기하학, 누적 합, 트리를 사용한 집합과 맵, 차분 배열 트릭

### 문제 설명

<p>Farmer John's $N$ cows ($1 \leq N \leq 10^5$) each like to take a daily walk
around the fence enclosing his pasture.  Unfortunately, whenever a cow walks
past a fence post, she brushes up against it, requiring Farmer John to need to
repaint the fence posts regularly.

<p>The fence consists of $P$ posts ($4 \leq P \leq 2\cdot 10^5$, $P$ even), the
location of each being a different 2D point $(x,y)$ on a map of FJ's farm
($0 \leq x, y \leq 10^9$).  Each post is connected to the two adjacent posts by
fences that are either vertical  or horizontal line segments, so the entire
fence can be considered a polygon whose sides are parallel to the x or y axes
(the last post connects back to the first post, ensuring the fence forms a
closed loop that encloses the pasture).  The fence polygon is "well-behaved" in
that fence segments only potentially overlap at their endpoints, each post
aligns with exactly  two fence segment endpoints, and every two fence segments
that meet at an endpoint are perpendicular. 

<p>Each cow has a preferred starting and ending position for her daily walk, each
being points somewhere along the fence (possibly at posts, possibly not).  Each
cow walks along the fence for her daily walks, starting from her starting
position and ending at her ending position.  There are two routes that the cow
could take, given that the fence forms a closed loop.  Since cows are somewhat
lazy creatures, each cow will walk in the direction around the fence that is
shorter. Remarkably, this choice is always clear -- there are no ties!

<p>A cow touches a fence post if she walks past it, or if the fence post is the
starting or ending point of her walk.  Please help FJ calculate the number of
daily touches experienced by each fence post, so he knows which post to repaint
next.

<p>It can be shown that there is exactly one possibility for the fences given the
locations of all of the posts.

### 입력

<p>The first line of input contains $N$ and $P$. Each of the next $P$ lines contains two integers representing the positions of the fence posts in no particular order. Each of the next $N$ lines contains four integers $x_1$ $y_1$ $x_2$ $y_2$ representing the starting position $(x_1, y_1)$ and ending position $(x_2, y_2)$ of a cow.</p>

### 출력

<p>Write $P$ integers as output, giving the number of touches experienced by each fence post.</p>