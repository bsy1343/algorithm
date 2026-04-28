# [Gold IV] Transmitters - 4651

[문제 링크](https://www.acmicpc.net/problem/4651)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 13, 정답: 13, 맞힌 사람: 12, 정답 비율: 100.000%

### 분류

브루트포스 알고리즘, 정렬, 기하학, 두 포인터

### 문제 설명

<p>In a wireless network with multiple transmitters sending on the same frequencies, it is often a requirement that signals don&#39;t overlap, or at least that they don&#39;t conflict. One way of accomplishing this is to restrict a transmitter&#39;s coverage area. This problem uses a shielded transmitter that only broadcasts in a semicircle.</p>

<p>A transmitter&nbsp;<em>T</em>&nbsp;is located somewhere on a 1,000 square meter grid. It broadcasts in a semicircular area of radius&nbsp;<em>r</em>. The transmitter may be rotated any amount, but not moved. Given&nbsp;<em>N</em>&nbsp;points anywhere on the grid, compute the maximum number of points that can be simultaneously reached by the transmitter&#39;s signal. Figure 1 shows the same data points with two different transmitter rotations.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/4651.%E2%80%85Transmitters/f75f73f7.gif" data-original-src="%EB%B0%B1%EC%A4%80/Gold/4651.%E2%80%85Transmitters/f75f73f7.gif" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/4651/2.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:175px; width:464px" /></p>

### 입력

<p>All input coordinates are integers (0-1000). The radius is a positive real number greater than 0. Points on the boundary of a semicircle are considered within that semicircle. There are 1-150 unique points to examine per transmitter. No points are at the same location as the transmitter.</p>

<p>Input consists of information for one or more independent transmitter problems. Each problem begins with one line containing the (x,y) coordinates of the transmitter followed by the broadcast radius, r. The next line contains the number of points N on the grid, followed by N sets of (x,y) coordinates, one set per line. The end of the input is signalled by a line with a negative radius; the (x,y) values will be present but indeterminate. Figures 1 and 2 represent the data in the first two example data sets below, though they are on different scales. Figures 1a and 2 show transmitter rotations that result in maximal coverage.</p>

### 출력

<p>For each transmitter, the output contains a single line with the maximum number of points that can be contained in some semicircle.</p>