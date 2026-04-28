# [Gold II] Wireing Assistant - 22763

[문제 링크](https://www.acmicpc.net/problem/22763)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 11, 정답: 3, 맞힌 사람: 2, 정답 비율: 33.333%

### 분류

그래프 이론, 그래프 탐색, 최단 경로, 데이크스트라, 값 / 좌표 압축, 격자 그래프, 0-1 너비 우선 탐색

### 문제 설명

<p>A printed circuit board has a number of horizontal and vertical tracks that may be used to connect electronic components. The example below demonstrates a square board with ten vertical tracks that we shall assign labels from 0 to 9 starting from the left end, ten horizontal tracks that we shall assign labels from 0 to 9 starting from the bottom end, and eight laid-down wires (shown in black). Each wire occupies a single horizontal or a single vertical track, and is described by its lower left coordinate followed by its upper right coordinate. In the example below, the eight wires are described by:</p>

<pre style="text-align: center;">
0 0 1 0  4 0 4 6  0 5 5 5  8 2 8 6  6 4 6 7  7 6 7 8  2 6 5 6  7 8 9 8</pre>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/22763.%E2%80%85Wireing%E2%80%85Assistant/8e7b66fb.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/22763.%E2%80%85Wireing%E2%80%85Assistant/8e7b66fb.png" data-original-src="https://upload.acmicpc.net/17998ece-e354-48f2-8e39-3b3ddc377a60/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 441px; height: 226px;" /></p>

<p style="text-align: center;">Figure 3: An Example Situation</p>

<p>A horizontal wire may overlap with a vertical wire in a single grid point.</p>

<p>A horizontal wire may not overlap with another horizontal wire, except at their endpoints. Similarly a vertical wire may not overlap with another vertical wire, except at their endpoints. Your task is to write a program to identify a path on a printed circuit board to connect two given points on the grid, which adheres to the above rules, such that the number of points your path has in common with the existing wires is minimised. The four dark gray wires, in the above example, connect the points (6, 8) and (5, 1) with minimum number of one overlap. The light gray wires connect the same two points with two overlaps.</p>

<p>In some cases a path may not exist, but your program will only be used to connect a pair of points in printed circuit boards where such a path is known to exist. Those cases will be identified and removed by a sophisticated imaging system, but that is another story</p>

### 입력

<p>Input to this problem consists of a sequence of one or more design situations. Several lines describe each design situation as follows:</p>

<ul>
	<li>The first line consists of two integers: the number of existing wires, M (0 &lt; M &lt; 100); the number of horizontal tracks (and also the number of vertical tracks) on a square printed circuit board S (0 &lt; S &lt; 10<sup>9</sup>). The integers are separated by spaces.</li>
	<li>The second line consists of 4&times; M integers (i.e. M pairs of 2-dimensional coordinates), separated by spaces, that describe the exact positions of the existing wires in the design.</li>
	<li>The third line consists of four integers (i.e. a pair of 2-dimensional coordinates), separated by spaces, that describe the exact positions of the two points to be connected.</li>
</ul>

<p>The input will be terminated by a line that consists of two zeros. This line should not be processed.</p>

### 출력

<p>For each design situation, the output is a single line that contains the minimum number of overlaps.</p>