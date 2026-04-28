# [Platinum IV] Another Brick in the Wall - 4533

[문제 링크](https://www.acmicpc.net/problem/4533)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 12, 정답: 7, 맞힌 사람: 7, 정답 비율: 77.778%

### 분류

구현, 그래프 이론, 자료 구조, 그래프 탐색, 너비 우선 탐색, 최단 경로, 데이크스트라, 평면 그래프

### 문제 설명

<p>After years as a brick-layer, you&#39;ve been called upon to analyze the structural integrity of various brick walls built by the Tetrad Corporation. Instead of using regular-sized bricks, the Tetrad Corporation seems overly fond of bricks made out of strange shapes. The structural integrity of a wall can be approximated by the fewest number of bricks that could be removed to create a gap from the top to the bottom. Can you determine that number for various odd walls created by Tetrad?</p>

### 입력

<p>Input to this problem will begin with a line containing a single integer X (1 &le; X &le; 100) indicating the number of data sets. Each data set consists of two components:</p>

<ul>
	<li>A single line, &quot;M N&quot; (1 &le; M,N &le; 20) where M and N indicate the height and width (in units), respectively, of a brick wall;</li>
	<li>A series of M lines, each N alphabetic characters in length. Each character will indicate to which brick that unit of the wall belongs to. Note that bricks will be contiguous; each unit of a brick will be adjacent (diagonals do not count as adjacent) to another unit of that brick. Multiple bricks may use the same characters for their representation, but any bricks that use identical characters will not be adjacent to each other. All letters will be uppercase.</li>
</ul>

### 출력

<p>For each data set, output the fewest number of bricks to remove to create a gap that leads from some point at the top of the wall, to some point at the bottom of the wall. Assume that bricks are in fixed locations and do not &quot;fall&quot; if bricks are removed from beneath them. A gap consists of contiguous units of removed bricks; each unit of a gap must be adjacent (diagonals do not count) to another unit of the gap.&nbsp;</p>