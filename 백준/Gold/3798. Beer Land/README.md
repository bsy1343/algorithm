# [Gold IV] Beer Land - 3798

[문제 링크](https://www.acmicpc.net/problem/3798)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 76, 정답: 16, 맞힌 사람: 16, 정답 비율: 41.026%

### 분류

다이나믹 프로그래밍, 수학

### 문제 설명

<p>King ACM 2002 received some clear ground and some money through inheritance. Terms of the will and testament require the heir to build n towns. He was also required to build the least quantity of two-way roads between the towns such that one could travel from any town to any other town even if one road was closed under repair. Carefully, all such roads must be constructed as geometrically straight lines. Further, the condition that a traveller be able to get from one town to another (even with one road closed) needs to be satisfied by traversing the roads as straight lines in their entirety --- not stopping partway along one road to switch to another.</p>

<p>Because of rich soil in those lands, the future inhabitants of the place have decided to produce beer. On the crossroads (a crossroad is merey the intersection of two or more roads) the king plans to build beer stands (one stand per a crossroad). So, if three or four (or twenty) roads intersect in a single point, there&rsquo;s still only one appropriate place for a beer stand. The King must choose locations for the towns and the roads. You need to advise him so that he builds as many beer stands as possible.</p>

### 입력

<p>The first line of input contains the number of test cases. For each case there is a line containing a single integer n (1 &le; n &le; 32767). This represents the number of towns to be built.</p>

### 출력

<p>For each n, print a line containing the maximum number of beer stands possible to build.</p>