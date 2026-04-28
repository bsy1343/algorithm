# [Silver III] Sudoku Checker - 7844

[문제 링크](https://www.acmicpc.net/problem/7844)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 76, 정답: 44, 맞힌 사람: 38, 정답 비율: 55.072%

### 분류

구현

### 문제 설명

<p>The puzzle game of <i>Sudoku</i> is played on a board of $N^2 \times N^2$ cells. The cells are grouped in $N \times N$ squares of $N \times N$ cells each. Each cell is either empty or contains a number between $1$ and $N^2$.</p>

<p>The sudoku position is <i>correct</i> when numbers in each row, each column and each square are different. The goal of the game is, starting from some correct position, fill all empty cells so that the final position is still correct.</p>

<p>This game is fairly popular in the Internet, and there are many sites which allow visitors to solve puzzles online. Such sites always have a subroutine to determine a correctness of a given position.</p>

<p>You are to write such a routine.</p>

### 입력

<p>Input file contains integer $N$, followed by $N^4$ integers -- sudoku position. Empty cells are denoted by zeroes.&nbsp;</p>

### 출력

<p>Output file must contain a single string &#39;CORRECT&#39; or &#39;INCORRECT&#39;.</p>

### 제한

<ul>
	<li>$1 \le N \le 10$.</li>
</ul>