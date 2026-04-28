# [Platinum I] Sprinklers - 15585

[문제 링크](https://www.acmicpc.net/problem/15585)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 60, 정답: 36, 맞힌 사람: 30, 정답 비율: 58.824%

### 분류

수학, 자료 구조, 세그먼트 트리, 조합론, 스위핑

### 문제 설명

<p>Farmer John has a large field, and he is thinking of planting sweet corn in some part of it. After surveying his field, FJ found that it forms an $(N-1) \times (N-1)$ square. The southwest corner is at coordinates $(0,0)$, and the northeast corner is at $(N-1,N-1)$.</p>

<p>At some integer coordinates there are double-headed sprinklers, each one sprinkling both water and fertilizer. A double-heading sprinkler at coordinates $(i,j)$ sprinkles water on the part of the field north and east of it, and sprinkles fertilizer on the part of the field south and west of it. Formally, it waters all real coordinates $(x,y)$ for which $N \geq x \geq i$ and $N \geq y \geq j$, and it fertilizes all real coordinates $(x,y)$ for which $0 \leq x \leq i$ and $0 \leq y \leq j$.</p>

<p>Farmer John wants to plant sweet corn in some axis-aligned rectangle in his field with integer-valued corner coordinates. However, for the sweet corn to grow, all points in the rectangle must be both watered and fertilized by the double-headed sprinklers. And of course the rectangle must have positive area, or Farmer John wouldn&#39;t be able to grow any corn in it!</p>

<p>Help Farmer John determine the number of rectangles of positive area in which he could grow sweet corn. Since this number may be large, output the remainder of this number modulo $10^9 + 7$.</p>

### 입력

<p>The first line of the input consists of a single integer $N$, the size of the field ($1 \leq N \leq 10^5$).</p>

<p>The next $N$ lines each contain two space-separated integers. If these integers are $i$ and $j$, where $0 \leq i,j \leq N-1$, they denote a sprinkler located at $(i,j)$.</p>

<p>It is guaranteed that there is exactly one sprinkler in each column and exactly one sprinkler in each row. That is, no two sprinklers have the same $x$-coordinate, and no two sprinklers have the same $y$-coordinate.</p>

### 출력

<p>The output should consist of a single integer: the number of rectangles of positive area which are fully watered and fully fertilized, modulo $10^9 + 7$.</p>