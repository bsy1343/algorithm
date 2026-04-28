# [Gold III] Manhattan Power Failure - 11450

[문제 링크](https://www.acmicpc.net/problem/11450)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 40, 정답: 28, 맞힌 사람: 28, 정답 비율: 71.795%

### 분류

그래프 이론, 자료 구조, 그래프 탐색, 분리 집합, 격자 그래프, 플러드 필

### 문제 설명

<p>There has been a huge storm ravaging through Manhattan destroying many power-lines and leaving entire blocks without power. The first damage assessment came up with a report showing which blocks are still connected by power lines and which are not. When a block is connected to another block with power lines, this means that if one block has power, then the other will also have power. Only blocks that are adjacent (either horizontally, or vertically) may be connected by a power line. Also, there is a quickly made list with all blocks that have power generators, or that are connected to external power sources.</p>

<p>Your task is to quickly identify where to put up emergency power lines, so that all block of this grid-like city have power again.</p>

### 입력

<p>The input starts with a line containing an integer T, the number of test cases. Then for each test case:</p>

<ul>
	<li>One line with four integers, n, m, p, c, where n, m (1 &le; n, m &le; 100) are the number of blocks that the city is wide respectively long (the city has n x m blocks), p (1 &le; p &le; n &middot; m) is the number of power generators, and c (1 &le; c &le; 2n &middot; m, or in fact: 1 &le; c &le; 2n &middot; m &minus; n &minus; m) is the number of intact power lines between adjacent city blocks.</li>
	<li>p lines, each with two integers x (0 &le; x &lt; n), y (0 &le; y &lt; m) indicating that the block with coordinates (x, y) in the grid has its own power source or is connected to an external power source.</li>
	<li>c lines, each with two integers x (0 &le; x &lt; n), y (0 &le; y &lt; m), and a character d (d = &rsquo;R&rsquo; or d = &rsquo;U&rsquo;) indicating that there is an intact power line either between block (x, y) and block (x + 1, y) if d = &rsquo;R&rsquo;, or between block (x, y) and block (x, y + 1) if d = &rsquo;U&rsquo;. Of course, if x = n &minus; 1, then d cannot be &rsquo;R&rsquo;. Likewise, if y = m &minus; 1, then d cannot be &rsquo;U&rsquo;.</li>
</ul>

### 출력

<p>Per test case, output one line with one integer indicating the number of emergency power lines needed to connect all blocks to a power source.</p>