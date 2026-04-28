# [Gold III] A Walk in the Park - 4120

[문제 링크](https://www.acmicpc.net/problem/4120)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 19, 정답: 7, 맞힌 사람: 7, 정답 비율: 36.842%

### 분류

자료 구조, 정렬, 트리를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>You are responsible for inspecting the trees located in a park, to make sure they remain healthy. The location of each tree is given to you as a point in the two-dimensional plane, distinct from that of every other tree. Due to recently replanted grass, you are only allowed to walk through the park along a collection of paths. Each path is described by an infinite-length horizontal or vertical line in the two-dimensional plane. No tree lies on any path.</p>

<p>You are concerned that it may not be possible to view all the trees in the park from the paths. In particular, a tree is visible only if you can view it by standing on some path while facing in a direction perpendicular to that path; there must be no intervening tree that obstructs your view. Given the geometrical configuration of the park, please report the number of visible trees.&nbsp;</p>

### 입력

<p>There will be multiple input sets. For each input set, the first line will contain two integers, N and M, (0 &lt; N,M &lt;= 100000), separated by a space. N is the number of trees, and M is the number of paths.</p>

<p>The next N lines each contain two space-separated integers, X and Y, specifying the coordinates of a tree. X and Y may be any 32-bit integers.</p>

<p>The next M lines each describe a path (a vertical or horizontal line). They have the form x=K or y=K, with no spaces. K may be any 32-bit integer. x and y will be lower case.</p>

<p>End of the input is signified by a line with two space-separated 0&rsquo;s.&nbsp;</p>

### 출력

<p>For each input set, print a single line containing one integer, specifying the number of visible trees. There should be no blank lines between outputs.&nbsp;</p>