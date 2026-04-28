# [Platinum V] Emperor's Palace - 31101

[문제 링크](https://www.acmicpc.net/problem/31101)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 18, 정답: 3, 맞힌 사람: 3, 정답 비율: 37.500%

### 분류

자료 구조, 브루트포스 알고리즘, 세그먼트 트리, 누적 합, 스위핑, 값 / 좌표 압축

### 문제 설명

<p>The great Emperor Emelyan I is building a palace for himself. To emphasize the greatness of the Emperor, the palace must be huge --- it must be visible from space. In addition, the palace must be in the shape of the letter E.</p>

<p>More formally, the palace should be a union of four rectangles: the main building of size $a \times 1$ and three wings of size $1 \times b$, adjacent to the main building from the east, where $a$ and $b$ are positive integers numbers and $a \ge 5$. The north wing should be adjacent to the upper right corner of the main building, and the south wing should be adjacent to the lower right. The middle wing should not adjoin either the north or south wing, but should adjoin with its upper left corner to the main building at an integer distance from the upper right corner of the main building.</p>

<p>In other words, the palace must completely occupy the following squares $1 \times 1$ of some rectangle of size $a \times (b+1)$: all squares adjacent to the left, upper or lower side of the rectangle, plus some line inside the rectangle, which is not adjacent to the top and bottom line.</p>

<p>The palace covers an area of $a+3b$.</p>

<p>The area for the construction of the future palace is a rectangle of size $h \times w$, divided into cells of size $1 \times 1$. Some cells are occupied by the Emperor&#39;s gardens, which cannot be built on. The rest of the cells are free and you can build on them.</p>

<p>Determine the largest area of the palace that can be built on empty spaces.</p>

### 입력

<p>The first line contains two integers $h$ and $w$ ($5 \le h,w \le 10^6$, $h \times w \le 5 \times 10^6$).</p>

<p>Each of the following $h$ lines contains $w$ characters. The $j$-th character in the $i$-th of these lines is equal to &quot;<code>#</code>&quot; if the cell with coordinates $(i,j)$ is occupied and &quot;<code>.</code>&quot; --- if this cell is free.</p>

### 출력

<p>Print one integer --- the largest possible area of the palace. If it is impossible to build a palace, print &quot;\texttt {-1}&quot;.</p>