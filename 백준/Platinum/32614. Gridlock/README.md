# [Platinum III] Gridlock - 32614

[문제 링크](https://www.acmicpc.net/problem/32614)

### 성능 요약

시간 제한: 6 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 11, 정답: 4, 맞힌 사람: 4, 정답 비율: 57.143%

### 분류

그래프 이론, 방향 비순환 그래프, 분리 집합, 연결 리스트, 위상 정렬, 자료 구조

### 문제 설명

<p>The Foolish Puzzle Company posted an advertisement showcasing a new puzzle along with a very inefficient gameplay. Being taunted by the "99.99% cant solve these puzle" caption, you decided to download this puzzle. After wasting a good amount of time, you notice that the puzzles become larger and you are not having any kind of fun. You then decide to write a program to automatically solve the levels of this puzzle and skip the levels that are impossible.</p>

<p>A level of the puzzle gives you a rectangular grid with blocks. Each block contains an arrow that points in one of the cardinal directions (up, down, left, right). You can take out a block by sliding it in the direction that it points to. When sliding a block, you must slide it all the way out of the grid. You cannot slide it partially, slide another block, and go back to the same block to slide it out.</p>

<p>Given a grid, find a way to remove all the blocks, or state that it is impossible to take out all blocks.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with two integers $h$ and $w$ ($1\leq h, w\leq 2000$), the number of rows and the number of columns of the grid.</li>
	<li>$h$ lines that contain strings of length $w$ consisting of the characters "<code>&lt;</code>", "<code>^</code>", "<code>&gt;</code>", and "<code>v</code>", each character representing the direction written on the block.</li>
</ul>

### 출력

<p>If it is possible to solve the grid, print $h \cdot w$ pairs of numbers $y$ and $x$ ($1 \leq y,x \leq n$), each pair representing a block that you take out from the grid, ordered from the first one to the last one. The two numbers in each pair represent the <em>row</em> and the <em>column</em> of the corresponding block, respectively.</p>

<p>If it is impossible to solve the grid, output "<code>impossible</code>".</p>

<p>If there are multiple valid solutions, you may output any one of them.</p>