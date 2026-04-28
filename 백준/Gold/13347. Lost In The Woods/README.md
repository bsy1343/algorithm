# [Gold I] Lost In The Woods - 13347

[문제 링크](https://www.acmicpc.net/problem/13347)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 155, 정답: 79, 맞힌 사람: 51, 정답 비율: 53.684%

### 분류

다이나믹 프로그래밍, 수학, 확률론

### 문제 설명

<p>Your friend has gotten lost in the woods. He has called and asked for you to come get him, but&nbsp;you are very busy and would rather just stay home. You quickly look up a map of the woods.&nbsp;It appears that the woods consist of a small number of clearings, with paths connecting them.&nbsp;You hope that the woods are sufficiently small and simple that your friend can get out easily,&nbsp;even if he is just randomly running around.</p>

<p>From your friend&rsquo;s description, you can figure out at which clearing he is. Assuming that&nbsp;every time he reaches a clearing, he runs in a uniformly random direction (including back the&nbsp;way he came), and that it takes him exactly one minute to get from clearing to clearing, can&nbsp;you predict how long it will take him to get out on average?</p>

### 입력

<p>The first line contains two integers N and M, where N is the number of clearings in the&nbsp;woods (2 &le; N &le; 20), and M is the total number of paths between clearings. The clearings&nbsp;are numbered 0 through N &minus; 1, such that clearing 0 is the one where your friend is right now&nbsp;and clearing N &minus; 1 is the exit of the woods.</p>

<p>The next M lines each contain two integers K and L, indicating a path between clearing K&nbsp;and clearing L (0 &le; K, L &lt; M).</p>

<p>You may assume that it is possible for your friend to reach the exit by following paths, that&nbsp;paths do not cross, and that there is at most one path between any two clearings.</p>

### 출력

<p>Output a single line containing a single number: the expected value of the number of minutes&nbsp;it will take your friend to get out of the woods.</p>

<p>Your answer may have an absolute error of at most 10<sup>&minus;5</sup>.</p>