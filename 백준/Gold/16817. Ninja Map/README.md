# [Gold III] Ninja Map - 16817

[문제 링크](https://www.acmicpc.net/problem/16817)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 31, 정답: 25, 맞힌 사람: 23, 정답 비율: 79.310%

### 분류

그래프 이론, 그래프 탐색, 애드 혹, 해 구성하기, 깊이 우선 탐색

### 문제 설명

<p>Intersections of Crossing Path City are aligned to a grid. There are $N$ east-west streets which are numbered from 1 to $N$, from north to south. There are also $N$ north-south streets which are numbered from 1 to $N$, from west to east. Every pair of east-west and north-south streets has an intersection; therefore there are $N^2$ intersections which are numbered from 1 to $N^2$.</p>

<p>Surprisingly, all of the residents in the city are Ninja. To prevent outsiders from knowing their locations, the numbering of intersections is shuffled.</p>

<p>You know the connections between the intersections and try to deduce their positions from the information. If there are more than one possible set of positions, you can output any of them.</p>

### 입력

<p>The input consists of a single test case formatted as follows.</p>

<pre class="mathjax">$N$ $a_1 \ b_1$ $\cdots$ $a_{2N^2-2N} \ b_{2N^2-2N}$</pre>

<p>The first line consists of an integer $N \ (2 \le N \le 100)$. The following $2N^2-2N$ lines represent connections between intersections. The $(i+1)$-th line consists of two integers $a_i$ and $b_i$ ($1 \le a_i, b_i \le N^2$, $a_i \ne b_i$), which represent that the $a_i$-th and $b_i$-th intersections are adjacent. More precisely, let&#39;s denote by $(r, c)$ the intersection of the $r$-th east-west street and the $c$-th north-south street. If the intersection number of $(r, c)$ is $a_i$ for some $r$ and $c$, then the intersection number of either $(r - 1, c)$, $(r + 1, c)$, $(r, c - 1)$ or $(r, c + 1)$ must be $b_i$. All inputs of adjacencies are different, i.e., $(a_i,b_i)\ne(a_j,b_j)$ and $(a_i,b_i)\ne(b_j,a_j)$ for all $1 \le i &lt; j \le 2N^2-2N$. This means that you are given information of all adjacencies on the grid.</p>

<p>The input is guaranteed to describe a valid map.</p>

### 출력

<p>Print a possible set of positions of the intersections. More precisely, the output consists of $N$ lines each of which has space-separated $N$ integers. The $c$-th integer of the $r$-th line should be the intersection number of $(r, c)$.</p>

<p>If there are more than one possible set of positions, you can output any of them.</p>