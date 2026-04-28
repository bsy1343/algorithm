# [Silver I] Tetris - 8414

[문제 링크](https://www.acmicpc.net/problem/8414)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 30, 정답: 16, 맞힌 사람: 7, 정답 비율: 53.846%

### 분류

자료 구조, 정렬, 우선순위 큐

### 문제 설명

<p>You have probably had an opportunity to play Tetris. In this game, there are two-dimensional blocks falling vertically onto the platform. A block is falling down, till it reaches a barrier - another block or the platform. Once stopped, the block does not move anymore.</p>

<p>In the original game of Tetris, fully filled lines of blocks disappear, but for the sake of simplicity, we do not consider disappearing in this task. Additionally, let us assume that all blocks are horizontal stripes of height 1. Furthermore, it is not allowed to rotate or move blocks. The only thing which can be changed, is the order in which the blocks are going to fall. Given the sizes and the horizontal offsets of all blocks, find such an order of blocks, that the height of the figure obtained if they are dropped in this order will be as small as possible.</p>

<p>Write a program, which:</p>

<ul>
	<li>reads the description of blocks,</li>
	<li>finds such an order of blocks, that the height of a figure obtained from them is minimized,</li>
	<li>writes the answer to the standard output.</li>
</ul>

### 입력

<p>In the first line of the standard input there is one integer <em>n</em>&nbsp;(1 &le; <em>n</em> &le; 100 000), denoting the number of blocks, which are about to fall onto the platform. Each of the following&nbsp;<em>n</em>&nbsp;lines contains two integers <em>l<sub>i</sub></em>&nbsp;and <em>p<sub>i</sub></em>&nbsp;(1 &le; <em>l<sub>i</sub></em>, <em>p<sub>i</sub></em> &le; 1 000 000 000), separated with a single space and denoting adequately the length of <em>i</em>-th block and the horizontal offset of the left side of the block.</p>

### 출력

<p>The first line of the standard output should contain one integer, denoting the smallest possible height of the figure obtained from the given blocks. Following <em>n</em>&nbsp;lines should contain the description of the order of the blocks, for which the height of the obtained figure is minimized. In the (<em>i</em> + 1)-th line of the output there should be one integer, denoting the sequence number of the block, which should fall as the <em>i</em>-th. The blocks are numbered from 1 to <em>n</em>&nbsp;in the same sequence as they appear in the input.</p>

<p>If more than one correct solution exists, your program should output any of them.</p>