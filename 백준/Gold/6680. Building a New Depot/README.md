# [Gold III] Building a New Depot - 6680

[문제 링크](https://www.acmicpc.net/problem/6680)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 35, 정답: 19, 맞힌 사람: 18, 정답 비율: 64.286%

### 분류

정렬, 애드 혹, 기하학, 집합과 맵, 스위핑

### 문제 설명

<p>Advanced Cargo Movement, Ltd. is successfully expanding. In order to meet new demands on truck maintenance, the management of the company decided to build a new truck depot. A suitable lot for building a depot was purchased and a construction company ``Masonry and Fences for Future, Ltd.&#39;&#39; was hired to build a depot.</p>

<p>The area of the depot will be enclosed by a fence. The fence is supposed to enclose a connected area of a lot and each part of the fence follows North-South or East-West direction. At each place where the fence changes its direction, there is a single post. The posts are only at points where the fence changes the direction, i.e., there are no unnecessary posts. When MFF workers have built all of the posts, they lost the plan of a depot being built. At this moment, they asked you for a help.</p>

<p>Given the coordinates of all the posts, your task is to compute the length of the fence.</p>

### 입력

<p>The input consists of several blocks. The first line of each block contains a single number P, 1 &lt;= P &lt;= 100 000. P is the number of posts which have been built. Each of the following P lines contains two integers X and Y, 0 &lt;= X, Y &lt;= 10 000, which represent coordinates of the posts in MFF internal units (which no one else is able to understand). No two posts have the same coordinates.</p>

<p>Each block is followed by a single empty line and the input is terminated by a line containing a single number 0.</p>

### 출력

<p>Output contains a single line for each block. The line should contain the text &quot;The length of the fence will be L units.&quot;, where L is replaced by an actual length of the fence. You can assume that the fence can always be built.</p>