# [Silver II] Bingo - 21763

[문제 링크](https://www.acmicpc.net/problem/21763)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 691, 정답: 206, 맞힌 사람: 192, 정답 비율: 30.918%

### 분류

애드 혹, 해 구성하기, 많은 조건 분기

### 문제 설명

<p><strong>Bingo</strong> is a game on a square grid. Each player gets an $n \times n$ grid and writes a unique number in each cell. The game host then draws a random number, and each player looks for that number on their grid and, if the number is present on their grid, fills in the corresponding cell. This repeats until someone finds $n$ filled cells on a single line, which we will call a <strong>bingo line</strong>.</p>

<p>There are $2n + 2$ possible bingo lines: $n$ horizontal lines, $n$ vertical lines, and $2$ diagonal lines.</p>

<pre>
---  ...  ...  |..  .|.  ..|  \..  ../
...  ---  ...  |..  .|.  ..|  .\.  ./.
...  ...  ---  |..  .|.  ..|  ..\  /..</pre>

<p>For example, the following grid has four bingo lines: two horizontal lines, one vertical line, and one diagonal line.</p>

<pre>
#..#.
#####
..###
#####
..###</pre>

<p>Exactly when is a bingo line formed? That is completely random: you can get a line quite early if you are lucky, but on the other hand, you can fill most of the grid without getting any bingo lines. In this problem, we investigate the unfortunate case of filling $k$ cells without making any bingo lines.</p>

<p>Given two integers $n$ and $k$, determine whether it is possible to fill exactly $k$ cells in an $n \times n$ grid, without making any bingo lines. If it&#39;s possible, demonstrate how to do it.</p>

### 입력

<p>The first and only line of input contains two integers, $n$ and $k$.</p>

### 출력

<p>On the first line, output <code>YES</code> if it&#39;s possible to fill exactly $k$ cells of an $n \times n$ grid without making any bingo lines. Otherwise, output <code>NO</code>.</p>

<p>If the answer is <code>YES</code>, then output each row of the grid starting from the next line. Each row should be represented by a string of $n$ characters. The $i$-th character is <code>#</code> (ASCII 35) if the $i$-th cell of the row is filled, and <code>.</code> (ASCII 46) if it&#39;s not filled. Exactly $k$ cells must be filled, and there cannot be any bingo lines.</p>

<p>If there are multiple ways to fill the grid, then output any one of them.</p>

### 제한

<ul>
	<li>$1 \leq n \leq 100$</li>
	<li>$0 \leq k \leq n^2$</li>
</ul>

### 힌트

<p>Note that the second example is only valid for subtasks 2 and 3.</p>