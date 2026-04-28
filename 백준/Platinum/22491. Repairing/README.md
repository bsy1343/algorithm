# [Platinum III] Repairing - 22491

[문제 링크](https://www.acmicpc.net/problem/22491)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 9, 정답: 1, 맞힌 사람: 1, 정답 비율: 14.286%

### 분류

그래프 이론, 그리디 알고리즘, 그래프 탐색, 기하학, 깊이 우선 탐색, 선분 교차 판정

### 문제 설명

<p>In the International City of Pipe Construction, it is planned to repair the water pipe at a certain point in the water pipe network. The network consists of water pipe segments, stop valves and source point. A water pipe is represented by a segment on a 2D-plane and intersected pair of water pipe segments are connected at the intersection point. A stop valve, which prevents from water flowing into the repairing point while repairing, is represented by a point on some water pipe segment. In the network, just one source point exists and water is supplied to the network from this point.</p>

<p>Of course, while repairing, we have to stop water supply in some areas, but, in order to reduce the risk of riots, the length of water pipes stopping water supply must be minimized. What you have to do is to write a program to minimize the length of water pipes needed to stop water supply when the coordinates of end points of water pipe segments, stop valves, source point and repairing point are given.</p>

### 입력

<p>A data set has the following format:</p>

<pre>
<var>N</var> <var>M</var>
<var>x<sub>s1</sub></var> <var>y<sub>s1</sub></var> <var>x<sub>d1</sub></var> <var>y<sub>d1</sub></var>
...
<var>x<sub>sN</sub></var> <var>y<sub>sN</sub></var> <var>x<sub>dN</sub></var> <var>y<sub>dN</sub></var>
<var>x<sub>v1</sub></var> <var>y<sub>v1</sub></var>
...
<var>x<sub>vM</sub></var> <var>y<sub>vM</sub></var>
<var>x<sub>b</sub></var> <var>y<sub>b</sub></var>
<var>x<sub>c</sub></var> <var>y<sub>c</sub></var>
</pre>

<p>The first line of the input contains two integers, <var>N</var> (<var>1 &le; N &le; 300</var>) and <var>M</var> (<var>0 &le; M &le; 1,000</var>) that indicate the number of water pipe segments and stop valves. The following <var>N</var> lines describe the end points of water pipe segments. The <var>i</var>-th line contains four integers, <var>x<sub>si</sub></var>, <var>y<sub>si</sub></var>, <var>x<sub>di</sub></var> and <var>y<sub>di</sub></var> that indicate the pair of coordinates of end points of <var>i</var>-th water pipe segment. The following <var>M</var> lines describe the points of stop valves. The <var>i</var>-th line contains two integers, <var>x<sub>vi</sub></var> and <var>y<sub>vi</sub></var> that indicate the coordinate of end points of <var>i</var>-th stop valve. The following line contains two integers, <var>x<sub>b</sub></var> and <var>y<sub>b</sub></var> that indicate the coordinate of the source point. The last line contains two integers, <var>x<sub>c</sub></var> and <var>y<sub>c</sub></var> that indicate the coordinate of the repairing point.</p>

<p>You may assume that any absolute values of coordinate integers are less than 1,000 (inclusive.) You may also assume each of the stop valves, the source point and the repairing point is always on one of water pipe segments and that that each pair among the stop valves, the source point and the repairing point are different. And, there is not more than one intersection between each pair of water pipe segments. Finally, the water pipe network is connected, that is, all the water pipes are received water supply initially.</p>

### 출력

<p>Print the minimal length of water pipes needed to stop water supply in a line. The absolute or relative error should be less than or <var>10<sup>-6</sup></var>. When you cannot stop water supply to the repairing point even though you close all stop valves, print &quot;<code>-1</code>&quot; in a line.</p>