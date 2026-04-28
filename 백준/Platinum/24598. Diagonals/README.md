# [Platinum III] Diagonals - 24598

[문제 링크](https://www.acmicpc.net/problem/24598)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 44, 정답: 17, 맞힌 사람: 8, 정답 비율: 53.333%

### 분류

백트래킹, 다이나믹 프로그래밍, 커넥션 프로파일을 이용한 다이나믹 프로그래밍

### 문제 설명

<p>Diagonals is a pencil puzzle which is played on a square grid. The player must draw a diagonal line corner to corner in every cell in the grid, either top left to bottom right, or bottom left to top right. There are two constraints:</p>

<ul>
	<li>Some intersections of gridlines have a number from $0$ to $4$ inclusive on them, which is the exact number of diagonals that must touch that point.</li>
	<li>No set of diagonals may form a loop of any size or shape.</li>
</ul>

<p>The following is a $5\!\times\!5$ example, with its unique solution:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/24598.%E2%80%85Diagonals/e7579d72.png" data-original-src="https://upload.acmicpc.net/ca784d9f-b183-4d88-8e7c-463e9deb324c/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 500px; height: 245px;" /></p>

<p>Given the numbers at the intersections of a grid, solve the puzzle.</p>

### 입력

<p>The first line of input contains an integer $n$ ($1 \le n \le 8$), which is the size of the grid.</p>

<p>Each of the next $n+1$ lines contains a string $s$ ($|s|=n+1, s \in \{\texttt{0},\texttt{1},\texttt{2},\texttt{3},\texttt{4},\texttt{+}\}^*$). These are the intersections of the grid, with <code>&#39;+&#39;</code>&nbsp;indicating that there is no number at that intersection.</p>

<p>The input data will be such that the puzzle has exactly one solution.</p>

### 출력

<p>Output exactly $n$ lines, each with exactly $n$ characters, representing the solution to the puzzle. Each character must be either <code>&#39;/&#39;</code>&nbsp;or <code>&#39;\&#39;</code>.</p>

<p>Note that Sample 1 corresponds to the example in the problem description.</p>