# [Gold I] Cube Stacking - 27014

[문제 링크](https://www.acmicpc.net/problem/27014)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 30, 정답: 17, 맞힌 사람: 15, 정답 비율: 55.556%

### 분류

자료 구조, 분리 집합

### 문제 설명

<p>Farmer John and Betsy are playing a game with N (1 &le; N &le; 30,000)identical cubes labeled 1 through N. They start with N stacks, each containing a single cube. Farmer John asks Betsy to perform P (1&le; P &le; 100,000) operation. There are two types of operations: moves and counts.</p>

<ul>
	<li>In a move operation, Farmer John asks Bessie to move the stack containing cube X on top of the stack containing cube Y.</li>
	<li>In a count operation, Farmer John asks Bessie to count the number of cubes on the stack with cube X that are under the cube X and report that value.</li>
</ul>

<p>Write a program that can verify the results of the game.</p>

### 입력

<ul>
	<li>Line 1: A single integer, P</li>
	<li>Lines 2..P+1: Each of these lines describes a legal operation. Line 2 describes the first operation, etc. Each line begins with a &#39;M&#39; for a move operation or a &#39;C&#39; for a count operation. For move operations, the line also contains two integers: X and Y.For count operations, the line also contains a single integer: X.</li>
</ul>

<p>Note that the value for N does not appear in the input file. No move operation will request a move a stack onto itself.</p>

### 출력

<p>Print the output from each of the count operations in the same order as the input file.</p>