# [Gold II] Parallel Lines - 15330

[문제 링크](https://www.acmicpc.net/problem/15330)

### 성능 요약

시간 제한: 10 초, 메모리 제한: 512 MB

### 통계

제출: 150, 정답: 87, 맞힌 사람: 79, 정답 비율: 63.710%

### 분류

수학, 브루트포스 알고리즘, 기하학, 백트래킹

### 문제 설명

<p>Given an even number of distinct planar points, consider coupling all of the points into pairs. All the possible couplings are to be considered as long as all the given points are coupled to one and only one other point.</p>

<p>When lines are drawn connecting the two points of all the coupled point pairs, some of the drawn lines can be parallel to some others. Your task is to find the maximum number of parallel line pairs considering all the possible couplings of the points.</p>

<p>For the case given in the first sample input with four points, there are three patterns of point couplings as shown in Figure B.1. The numbers of parallel line pairs are 0, 0, and 1, from the left. So the maximum is 1.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/15330.%E2%80%85Parallel%E2%80%85Lines/4d437fe9.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15330/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:193px; width:396px" /></p>

<p style="text-align:center">Figure B.1. All three possible couplings for Sample Input 1</p>

<p>For the case given in the second sample input with eight points, the points can be coupled as shown in Figure B.2. With such a point pairing, all four lines are parallel to one another. In other words, the six line pairs (L<sub>1</sub>, L<sub>2</sub>), (L<sub>1</sub>, L<sub>3</sub>), (L<sub>1</sub>, L<sub>4</sub>), (L<sub>2</sub>, L<sub>3</sub>), (L<sub>2</sub>, L<sub>4</sub>) and (L<sub>3</sub>, L<sub>4</sub>) are parallel. So the maximum number of parallel line pairs, in this case, is 6.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/15330.%E2%80%85Parallel%E2%80%85Lines/8bb3b0a2.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15330/2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:343px; width:304px" /></p>

<p style="text-align:center">Figure B.2. Maximizing the number of parallel line pairs for Sample Input 2</p>

### 입력

<p>The input consists of a single test case of the following format.</p>

<pre>
m
x<sub>1</sub> y<sub>1</sub>
.
.
.
x<sub>m</sub> y<sub>m</sub></pre>

<p>The first line contains an even integer m, which is the number of points (2 &le; m &le; 16). Each of the following m lines gives the coordinates of a point. Integers x<sub>i</sub> and y<sub>i</sub> (&minus;1000 &le; x<sub>i</sub> &le; 1000, &minus;1000 &le; y<sub>i</sub> &le; 1000) in the i-th line of them give the x- and y-coordinates, respectively, of the i-th point.</p>

<p>The positions of points are all different, that is, xi &ne; x<sub>j</sub> or y<sub>i</sub> &ne; y<sub>j</sub> holds for all i &ne; j. Furthermore, No three points lie on a single line.</p>

### 출력

<p>Output the maximum possible number of parallel line pairs stated above, in one line.</p>