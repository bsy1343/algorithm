# [Gold III] TOYS - 4874

[문제 링크](https://www.acmicpc.net/problem/4874)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 43, 정답: 15, 맞힌 사람: 8, 정답 비율: 36.364%

### 분류

이분 탐색

### 문제 설명

<p>Calculate the number of toys that land in each bin of a partitioned toy box.</p>

<p>Mom and dad have a problem - their child John never puts his toys away when he is finished playing with them. They gave John a rectangular box to put his toys in, but John is rebellious and obeys his parents by simply throwing his toys into the box. All the toys get mixed up, and it is impossible for John to find his favorite toys.</p>

<p>John&#39;s parents came up with the following idea. They put cardboard partitions into the box. Even if John keeps throwing his toys into the box, at least toys that get thrown into different bins stay separated. The following diagram shows a top view of an example toy box.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/4874.%E2%80%85TOYS/e9aa7cc2.png" data-original-src="https://upload.acmicpc.net/0978ec51-7427-424e-8566-db50de730453/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>For this problem, you are asked to determine how many toys fall into each partition as John throws them into the toy box.</p>

### 입력

<p>The input file contains one or more problems. The first line of a problem consists of six integers,&nbsp;<b><i>n m x1 y1 x2 y2</i></b>. The number of cardboard partitions is&nbsp;<b><i>n</i></b>&nbsp;(0 &lt;&nbsp;<b><i>n</i></b>&nbsp;&lt;= 5000) and the number of toys is&nbsp;<i><b>m</b>&nbsp;</i>(0 &lt;&nbsp;<b><i>m</i></b>&nbsp;&lt;= 5000). The coordinates of the upper-left corner and the lower-right corner of the box are (<i><b>x1</b>,<b>y1</b></i>) and (<i><b>x2</b>,<b>y2</b></i>), respectively. The following&nbsp;<b><i>n</i></b>&nbsp;lines contain two integers per line,&nbsp;<b><i>U<sub>i</sub>&nbsp;L<sub>i</sub></i></b>, indicating that the ends of the&nbsp;<i>i</i>-th cardboard partition is at the coordinates (<i><b>U<sub>i</sub></b>,<b>y1</b></i>) and (<i><b>L<sub>i</sub></b>,<b>y2</b></i>). You may assume that the cardboard partitions do not intersect each other and that they are specified in sorted order from left to right. The next&nbsp;<b><i>m</i></b>&nbsp;lines contain two integers per line,&nbsp;<b><i>X<sub>j</sub>&nbsp;Y<sub>j</sub></i></b>&nbsp;specifying where the&nbsp;<i>j</i>-th toy has landed in the box. The order of the toy locations is random. You may assume that no toy will land exactly on a cardboard partition or outside the boundary of the box. The input is terminated by a line consisting of a single 0.</p>

### 출력

<p>Other than the standard header and trailer messages, the output for each problem will be one line for each separate bin in the toy box. For each bin, print its bin number, followed by a colon and one space, followed by the number of toys thrown into that bin. Bins are numbered from&nbsp;<b><i>0</i></b>&nbsp;(the leftmost bin) to&nbsp;<b><i>n</i></b>&nbsp;(the rightmost bin). Separate the output of different problems by a single blank line.</p>