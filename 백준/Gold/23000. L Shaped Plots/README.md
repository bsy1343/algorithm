# [Gold II] L Shaped Plots - 23000

[문제 링크](https://www.acmicpc.net/problem/23000)

### 성능 요약

시간 제한: 60 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 50, 정답: 41, 맞힌 사람: 37, 정답 비율: 80.435%

### 분류

구현, 수학, 누적 합, 스위핑

### 문제 설명

<p>Given a grid of R rows and C columns each cell in the grid is either 0 or 1.</p>

<p>A segment is a nonempty sequence of consecutive cells such that all cells are in the same row or the same column. We define the length of a segment as number of cells in the sequence.</p>

<p>A segment is called &quot;good&quot; if all the cells in the segment contain only 1s.</p>

<p>An &quot;L-shape&quot; is defined as an unordered pair of segments, which has all the following properties:</p>

<ul>
	<li>Each of the segments must be a &quot;good&quot; segment.</li>
	<li>The two segments must be perpendicular to each other.</li>
	<li>The segments must share one cell that is an endpoint of both segments.</li>
	<li>Segments must have length at least 2.</li>
	<li>The length of the longer segment is twice the length of the shorter segment.</li>
</ul>

<p>We need to count the number of L-shapes in the grid.</p>

<p>Below you can find two examples of correct L-shapes,</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/4b1c0223-24c6-4d09-8eef-2d1758d31dc1/-/preview/" /></p>

<p>and three examples of&nbsp;<strong>invalid</strong>&nbsp;L-shapes.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/993aeea2-f671-47f8-95f8-729c28476ee6/-/preview/" /></p>

<p>Note that in the shape on the left, two segments do not share a common endpoint. The next two shapes do not meet the last requirement, as in the middle shape both segments have the same length, and in the last shape the longer segment is longer than twice the length of the shorter one.</p>

### 입력

<p>The first line of the input contains the number of test cases, T. T test cases follow.</p>

<p>The first line of each testcase contains two integers R and C.</p>

<p>Then, R lines follow, each line with C integers representing the cells of the grid.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x:&nbsp;y</code>, where x&nbsp;is the test case number (starting from 1) and&nbsp;y&nbsp;is the number of L-shapes.</p>

### 제한

<ul>
	<li>1 &le; T &le; 100.</li>
	<li>Grid consists of 0s and 1s only.</li>
</ul>

### 힌트

<p>In Sample Case #1, there is one L-shape.</p>

<ul>
	<li>The first one is formed by using cells: (1,1), (2,1), (3,1), (4,1), (4,2)</li>
</ul>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/c5a83c0b-c0d8-4cdd-a1b2-df6da9e1f8d6/-/preview/" /></p>

<p>In Sample Case #2, there are nine L-shapes.</p>

<ul>
	<li>The first one is formed by using cells: (1,1), (2,1), (3,1), (4,1), (5,1), (6,1), (6,2), (6,3)</li>
	<li>The second one is formed by using cells: (3,1), (4,1), (5,1), (6,1), (6,2)</li>
	<li>The third one is formed by using cells: (6,1), (5,1), (4,1), (3,1), (3,2)</li>
	<li>The fourth one is formed by using cells: (3,3), (4,3), (5,3), (6,3), (6,2)</li>
	<li>The fifth one is formed by using cells: (6,3), (5,3), (4,3), (3,3), (3,2)</li>
	<li>The sixth one is formed by using cells: (3,1), (3,2), (3,3), (3,4), (2,4)</li>
	<li>The seventh one is formed by using cells: (3,4), (3,3), (3,2), (3,1), (2,1)</li>
	<li>The eighth one is formed by using cells: (3,4), (3,3), (3,2), (3,1), (4,1)</li>
	<li>The ninth one is formed by using cells: (6,3), (5,3), (4,3), (3,3), (3,4)</li>
</ul>

<p>The first three L-shapes are shown on the picture below.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/1aa9212a-622f-4267-91c9-3627f3bdda46/-/preview/" /></p>