# [Silver V] Safe Squares (Small) - 14308

[문제 링크](https://www.acmicpc.net/problem/14308)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 88, 정답: 77, 맞힌 사람: 68, 정답 비율: 86.076%

### 분류

구현, 브루트포스 알고리즘

### 문제 설명

<p>Codejamon trainers are actively looking for monsters, but if you are not a trainer, these monsters could be really dangerous for you. You might want to find safe places that do not have any monsters!</p>

<p>Consider our world as a grid, and some of the cells have been occupied by monsters. We define a&nbsp;safe square&nbsp;as a grid-aligned&nbsp;D&nbsp;&times;&nbsp;D&nbsp;square of grid cells (with&nbsp;D&nbsp;&ge; 1) that does not contain any monsters. Your task is to find out how many safe squares (of any size) we have in the entire world.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;T.&nbsp;T&nbsp;test cases follow. Each test case starts with a line with three integers,&nbsp;R,&nbsp;C, and&nbsp;K. The grid has&nbsp;R&nbsp;rows and&nbsp;C&nbsp;columns, and contains&nbsp;K&nbsp;monsters.&nbsp;K&nbsp;more lines follow; each contains two integers&nbsp;R<sub>i</sub>&nbsp;and&nbsp;C<sub>i</sub>, indicating the row and column that the i-th monster is in. (Rows are numbered from top to bottom, starting from 0; columns are numbered from left to right, starting from 0.)</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the the total number of safe zones for this test case.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;T&nbsp;&le; 20.</li>
	<li>(R<sub>i</sub>,&nbsp;C<sub>i</sub>) &ne; (R<sub>j</sub>,&nbsp;C<sub>j</sub>) for i &ne; j. (No two monsters are in the same grid cell.)</li>
	<li>0 &le;&nbsp;R<sub>i</sub>&nbsp;&lt;&nbsp;R, i from 1 to&nbsp;K</li>
	<li>0 &le;&nbsp;C<sub>i</sub>&nbsp;&lt;&nbsp;C, i from 1 to&nbsp;K</li>
	<li>1 &le;&nbsp;R&nbsp;&le; 10.</li>
	<li>1 &le;&nbsp;C&nbsp;&le; 10.</li>
	<li>0 &le;&nbsp;K&nbsp;&le; 10.</li>
</ul>

### 힌트

<p>The grid of sample case #1 is:</p>

<pre>
<code>0 0 0
0 0 0
0 1 0</code></pre>

<p>Here, 0 represents a cell with no monster, and 1 represents a cell with a monster. It has 10 safe squares: 8 1x1 and 2 2x2.</p>

<p>The grid of sample case #2 is:</p>

<pre>
<code>0 1 0 1 1 0 0 0 0 0 1
1 0 0 0 0 0 0 0 0 1 0
1 0 0 0 1 0 0 0 0 1 1
0 0 0 0 1 0 0 0 0 0 1</code></pre>

<p>Note that sample case #2 will only appear in the Large dataset. It has 51 safe squares: 32 1x1, 13 2x2, 5 3x3, and 1 4x4.</p>