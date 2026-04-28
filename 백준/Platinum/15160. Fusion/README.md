# [Platinum V] Fusion - 15160

[문제 링크](https://www.acmicpc.net/problem/15160)

### 성능 요약

시간 제한: 15 초, 메모리 제한: 512 MB

### 통계

제출: 260, 정답: 41, 맞힌 사람: 28, 정답 비율: 13.930%

### 분류

그래프 이론, 최단 경로, 데이크스트라, 0-1 너비 우선 탐색

### 문제 설명

<p>What a time to be alive! Today, the very first cold fusion reactor has just been built and cleared for operation. Of course, when the reactor is started for the first time, nothing happens.</p>

<p>Bewildered physicists pore over their calculations looking for errors. Countless double-checks and triple-checks are made before a trio of engineers discover the problem: two atoms in the reactor have become &alpha;-stuck!</p>

<p>The reactor can be thought of as a grid of cells with R rows and C columns. Each cell is either empty, contains a deuterium atom (two of which are &alpha;-stuck) or is blocked off by a control rod to prevent runaway reactions. Each cell is adjacent to the four cells to its left, right, top and bottom (cells on the edge of the reactor are adjacent to fewer than four cells).</p>

<p>You can issue fusion instructions to the reactor by specifying two atoms to be fused. Be wary; two atoms can be fused only if they are in adjacent cells or there is a path of adjacent empty cells from one atom to the other. When two atoms are fused, they will produce helium which floats away, effectively removing the two original atoms from the reactor (leaving the cells empty).</p>

<p>In order to fix the problem in the reactor, you will need to fuse the &alpha;-stuck atoms with each other. What is the fewest number of instructions you need to give to the reactor in order to fuse the &alpha;-stuck atoms?</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15160.%E2%80%85Fusion/a72c0e2f.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15160.%E2%80%85Fusion/a72c0e2f.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15160/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:107px; width:611px" /></p>

<p style="text-align:center">Figure F.1: This is the reactor for Sample Input 1. Black squares denote blocked off cells, blue circles denote deuterium atoms and the yellow circles denote the two &alpha;-stuck atoms. One optimal sequence of fusions is shown.</p>

<p>Will you and your fellow engineers overcome the final barrier to cold fusion?</p>

### 입력

<p>The first line of input contains two integers R (1 &le; R &le; 1000), which is the number of rows in the reactor, and C (1 &le; C &le; 1000), which is the number of columns in the reactor. The next R lines describe the reactor. Each of these lines is a string with exactly C characters.</p>

<ul>
	<li>&lsquo;.&rsquo; denotes an empty cell.</li>
	<li>&lsquo;#&rsquo; denotes a blocked cell.</li>
	<li>&lsquo;O&rsquo; denotes a cell containing a deuterium atom.</li>
	<li>&lsquo;A&rsquo; denotes a cell containing an &alpha;-stuck atom.</li>
</ul>

<p>There are exactly two &lsquo;A&rsquo;s in the input.</p>

### 출력

<p>Display the minimum number of fusion instructions needed to fuse the &alpha;-stuck atoms. If it is not possible to fuse the &alpha;-stuck atoms together, display -1 instead.</p>