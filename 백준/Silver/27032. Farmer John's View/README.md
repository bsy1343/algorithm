# [Silver II] Farmer John's View - 27032

[문제 링크](https://www.acmicpc.net/problem/27032)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 18, 정답: 14, 맞힌 사람: 8, 정답 비율: 80.000%

### 분류

수학, 구현, 브루트포스 알고리즘, 스위핑

### 문제 설명

<p>In order to escape the boring scenery next to his old farm, Farmer John has decided to move away from the Wisconsin plains to a new location near the mountains.  From this new location, if he looks around at the view in all 360 degrees around him, he sees mountains in some directions and no mountains in other directions.  He wants to know what fraction of his view is made up of mountains.</p>

<p>A total of N (1 &le; N &le; 1000) mountain ranges surround FJ&#39;s new location. When he looks at any one of them, it appears as a contiguous range.  Think of the view as a circle divided up into 360 little arcs, each of them corresponding to 1 degree.  Each of these little arcs is subdivided into 60 arc-minutes and each of these is further divided into 60 arc-seconds.  In order to precisely record the range of his view occupied by each mountain range, FJ writes down the starting and ending angle of each range.  For example:</p>

<p>Range #34 starts at 45 degrees, 2 minutes, 59 seconds, and ends at 120 degrees, 10 minutes, and 0 seconds.</p>

<p>Of course, this description is somewhat ambiguous since it does not specify whether the range curves clockwise or counterclockwise around his field of view.  However, FJ notices that no mountain range occupies 180 degrees or more of his field of view, thereby removing any ambiguity.  The sample range above therefore occupies a total of 270,421 arc seconds.  The angles occupied by different mountain ranges may overlap, and FJ wishes to compute the total number of arc seconds in his field of view that are occupied by mountains.</p>

### 입력

<ul>
	<li>Line 1: A single integer, N</li>
	<li>Lines 2..N+1: Each line describes a mountain range&#39;s arc and contains 6 space-separated integers.  The first three integers correspond to the (degree, minute, second) of the starting angle of the range and the last three correspond to the (degree, minute, second) of the ending angle of the range.</li>
</ul>

### 출력

<ul>
	<li>Line 1: A single integer giving the total number of arc seconds in FJ&#39;s view that  are occupied by mountains.</li>
</ul>

### 힌트

<p>The first two ranges overlap slightly and cover a combined angle of 270421 arc seconds.  The third range covers 3600 arc seconds.</p>