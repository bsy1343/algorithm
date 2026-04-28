# [Platinum I] Windy Path - 13740

[문제 링크](https://www.acmicpc.net/problem/13740)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 81, 정답: 53, 맞힌 사람: 49, 정답 비율: 69.014%

### 분류

애드 혹, 해 구성하기, 기하학, 그리디 알고리즘

### 문제 설명

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/13740/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-12-06%20%EC%98%A4%ED%9B%84%208.44.05.png" style="height:292px; width:236px" /></p>

<p>Consider following along the path in the figure above, starting from (4, 4) and moving to (2, 5). Then the path turns rightward toward (1, 6), then sharp left to (5, 0) and finally sharp left again to (4, 2). If we use &lsquo;L&rsquo; for left and &lsquo;R&rsquo; for right, we see that the sequence of turn directions is given by &lsquo;RLL&rsquo;. Notice that the path does not cross itself: the only intersections of segments are the connection points along the path.</p>

<p>Consider the reverse problem: Given points in an arbitrary order, say (2, 5),(1, 6),(4, 4),(5, 0),(4, 2), could you find an ordering of the points so the turn directions along the path are given by &lsquo;RLL&rsquo;? Of course to follow the path in the figure, you would start with the third point in the list (4, 4), then the first (2, 5), second (1, 6), fourth (5, 0), and fifth (4, 2), so the permutation of the points relative to the given initial order would be: 3 1 2 4 5.</p>

### 입력

<p>The first line of the input contains an integer N, specifying the number of points such that 3 &le; N &le; 50. The following N lines each describe a point using two integers x<sub>i</sub> and y<sub>i</sub> such that 0 &le; x<sub>i</sub> , y<sub>i</sub> &le; 1000. The points are distinct and no three are collinear (i.e., on the same line). The last line contains a string of N &minus; 2 characters, each of which is either &lsquo;L&rsquo; or &lsquo;R&rsquo;.</p>

### 출력

<p>A permutation of {1, . . . , N} that corresponds to a nonintersecting path satisfying the turn conditions. The numbers are to be displayed with separating spaces. (There are always one or more possible solutions, and any one may be used.)</p>