# [Gold II] Coverage - 4827

[문제 링크](https://www.acmicpc.net/problem/4827)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 10, 정답: 2, 맞힌 사람: 2, 정답 비율: 40.000%

### 분류

정렬, 기하학, 스위핑, 피타고라스 정리

### 문제 설명

<p>A cell phone user is travelling along a line segment with end points having integer coordinates. In order for the user to have cell phone coverage, it must be within the transmission radius of some transmission tower. As the user travels along the path, cell phone coverage may be gained (or lost) as the user moves inside the radius of some tower (or outside of the radii of all towers). Given the location of up to 100 towers and their transmission radii, you are to compute the percentage of cell phone coverage the user has along the specified path. The (x,y) coordinates are integers between -100 and 100, inclusive, and the tower radii are integers between 1 and 100, inclusive.</p>

### 입력

<p>Your program will be given a sequence of configurations, one per line, of the form:</p>

<pre>
N C0X C0Y C1X C1Y T1X T1Y T1R T2X T2Y T2R ...</pre>

<p>Here, N is the number of towers, (C0X,C0Y) is the start of path of the cell phone user, (C1X,C1Y) is the end of the path, (TkX,TkY) is the position of the kth tower, and TkR is its transmission radius. The start and end points of the paths are distinct.</p>

<p>The last problem is terminated by the line</p>

<pre>
0</pre>

### 출력

<p>For each configuration, output one line containing the percentage of coverage the cell phone has, rounded to two decimal places.</p>