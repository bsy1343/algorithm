# [Platinum I] Polygon - 3379

[문제 링크](https://www.acmicpc.net/problem/3379)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 52, 정답: 16, 맞힌 사람: 9, 정답 비율: 20.930%

### 분류

이분 탐색, 해 구성하기, 기하학, 수학

### 문제 설명

<p>Write a program to find a convex polygon whose sides have the given lengths.</p>

<p>In this task, we consider a polygon to be convex if all its inner angles are strictly greater than 0 degrees and strictly less than 180 degrees.</p>

### 입력

<p>The first line of the file contains an integer N, the number of vertices of the polygon (3 &le; N &le; 1000). Each of the following N lines contains an integer a<sub>i</sub>, the length of one side of the polygon (1 &le; a<sub>i</sub> &le; 10,000).</p>

### 출력

<p>If the desired polygon can be constructed, the output should contain exactly N lines. Each line should contain two real numbers x<sub>i</sub> and y<sub>i</sub> (|x<sub>i</sub>| &le; 10,000,000, |y<sub>i</sub>| &le; 10,000,000) such that by connecting the points (x<sub>i</sub>, y<sub>i</sub>) and (x<sub>i+1</sub>, y<sub>i+1</sub>) for all 1 &le; i &lt; N and additionally the points (x<sub>N</sub>, y<sub>N</sub>) and (x<sub>1</sub>, y<sub>1</sub>) with line segments, we obtain a convex polygon. The lengths of the line segments must be equal to the numbers given in the input, but not necessarily in the same order.</p>

<p>The vertices of the constructed polygon can be listed either clockwise or counterclockwise.</p>

<p>If the polygon cannot be constructed, print <code>NO SOLUTION</code> on the single line of the output.</p>

<p>The grading program considers two lengths equal if they differ by less than 0.001. Any standard floating point format is acceptable.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/3379.%E2%80%85Polygon/7a21bdee.png" data-original-src="https://upload.acmicpc.net/975f0630-58e8-45dd-86b3-1b51e39da5c4/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 225px; height: 198px;" /></p>